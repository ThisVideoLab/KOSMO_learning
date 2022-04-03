package chap14.EX04;
// �ڵ� ���ҽ�(��ü) ����
//1. AutoClosable �������̽��� ����
//2.


import java.io.IOException;
import java.io.InputStreamReader;

import chap06_07.Ex02.A;

// �ʵ��� �� �Ҵ�. ������ ȣ�� �� �ʵ忡 ���� �ο���

class abc implements AutoCloseable{ //5. # �ʵ�, ������, �������̵� ������ ������ ��Ģ�� �θ� ����.

	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg; // ��� ��� 
	
	abc(String name, int studentID, int kor, int eng, int math, double avg){ //�������� �Ű������� String ���� �޾Ƽ� �޸𸮷� �ε���.
		this.name = name; this.studentID = studentID; this.kor =kor;
		this.eng = eng; this.math = math; this.avg = avg;
	}
	@Override
	public void close() throws Exception {
		
		System.out.println("========================");
		System.out.println("��   ��: " + name ); // �Է��� �� �Ǿ����� �ѹ� Ȯ���� ���
		System.out.println("��   ��: " + studentID );
		System.out.println("��������: " + kor );
		System.out.println("��������: " + eng );
		System.out.println("��������: " + math );
		System.out.println("��   ��: " + avg );
		System.out.println();
		System.out.println("========================");
		System.out.println("���ҽ� ������ �����մϴ�.");
		System.out.println("========================");
		System.out.println();
		
		if(name != null) {
			name = null; 
			System.out.println(" name�� ���ҽ��� ���� �Ǿ����ϴ�.");
		}
		if(eng != 0); {
			studentID = 0; 
			System.out.println(" eng�� ���ҽ��� ���� �Ǿ����ϴ�.");
		}
		if( kor != 0) {
			kor = 0; 
			System.out.println(" kor�� ���ҽ��� ���� �Ǿ����ϴ�.");
		}
		if( eng != 0) {
			eng = 0; 
			System.out.println(" eng�� ���ҽ��� ���� �Ǿ����ϴ�.");
		}
		if( math != 0) {
			math = 0; 
			System.out.println(" math�� ���ҽ��� ���� �Ǿ����ϴ�.");
		}
		if( avg != 0) {
			avg = 0; 
			System.out.println(" avg�� ���ҽ��� ���� �Ǿ����ϴ�.");
			
			// ������ ��� if (name !=null | studentID !=null | �̷������� or�� �����
			// name = null, studentID = 0; kor = 0; �̷������� ����.
			System.out.println("========================");
		}
	}
}

	


/*
class abc{
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg; // ��� ��� 

	abc(String name, int studentID, int kor, int eng, int math, double avg){ �������� �Ű������� String ���� �޾Ƽ� �޸𸮷� �ε���.
		this.name = name; this.studentID = studentID; this.kor =kor;
		this.eng = eng; this.math = math; this.avg = avg;
	}
	// Ŭ���� �޼ҵ� �ڸ�
}
*/

public class TrywithResource_3 {

	public static void main(String[] args) {
		
		//1. ��ü�� ��� �ʵ带 �ʱ�ȭ�ϰ� �ڵ����� close ();
		
		String name = "ö��";
		int studentID = 1111;
		int kor = 72;
		int eng = 83;
		int math = 99;
		double avg = (kor + eng + math)/3;
		
		try(abc abc1 = new abc(name, studentID, kor, eng, math, avg)){ // String name, int studentID, int kor, int eng, int math, double avg
		}catch (Exception e){
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}finally { // ����� a.close() �޼ҵ带 �ڵ����� ȣ���.
		}
		System.out.println("�ڵ� �ʱ�ȭ ����");
		
		
		System.out.println("========================");
		
		
		//2 ���� ���ҽ� ���� ���
		
		abc abc2 = new abc("����",1112,73,83,97,(kor+eng+math)); 
		// �ڵ� ���ҽ� ���� �����ʹ� �ٸ��� �Ű������� ������ ��ü ������ �ݵ�� �ʿ��� ������
		// try ���ο��� �� ��ü�� �����ϸ�, try���� ����� �Ŀ� �� ��ü�� try�� ����� �Բ�
		// �Ҹ�Ǳ� ������. ��� ������ finally���� abc2 ��ü�� ã�� �� ��� ������ �߻���
			
		try{abc2 = new abc(name, studentID, kor, eng, math, avg);
		}catch (Exception e){
		e.printStackTrace();
		System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}finally { // ���� ���ҽ� ���� ���� ����
			if( abc2.name != null|| abc2.studentID != 0|| abc2.kor != 0|| abc2.eng != 0 || abc2.math != 0||abc2.avg != 0.0) {
				
				try {
					System.out.println("���� �� �ϳ� �̻��� �ʱ�ȭ���� �ʾҽ��ϴ�.");
					abc2.close();
				}catch (Exception e) {
					e.printStackTrace();
				}finally {
					System.out.println("���� ���ҽ� ���������� �����մϴ�");
				}
			}
		}	
	// ������ ��
	}
}