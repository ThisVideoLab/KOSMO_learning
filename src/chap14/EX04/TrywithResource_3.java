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
	String age;
	
	abc(String name, int studentID, int kor, int eng, int math, double avg){ //�������� �Ű������� String ���� �޾Ƽ� �޸𸮷� �ε���.
		this.name = name; this.studentID = studentID; this.kor =kor;
		this.eng = eng; this.math = math; this.avg = avg;
	}
	
	@Override
	public void close() throws Exception { 
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
		
		try(abc abc1 = new abc("ö��", 1111, 72, 83, 99, (72+83+99)/3)){ // String name, int studentID, int kor, int eng, int math, double avg
		}catch (Exception e){
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}finally { // ����� a.close() �޼ҵ带 �ڵ����� ȣ���.
		}
		System.out.println("�ڵ� �ʱ�ȭ ����");
		
		
		System.out.println("===================");
		
		
		//2. ���� close (), finally ������ close() ���� ȣ��
		
		System.out.println("���ڸ� �Է��ϼ��� !");
	
		abc a2 = null;
		
		
		 try {
			 a2 = new abc ("ö��", 1111, 72, 83, 99, ((72+83+99)/3)){
		 }catch (IOException e){
			 e.printStackTrace(); // try {} ������� ���ܰ� �߻��� ��쿡 �ڼ��� ������ �����
		 }finally { //��ü�� ��� �Ŀ� �޸� �������� �������� ��.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
			 //              ���ҽ� ����: isr2.close(); �� �־���� ��. 
			 if (name != null){  	// ������ ��� if (name !=null | studentID !=null | �̷������� or�� �����
									// name = null, studentID = 0; kor = 0; �̷������� ����.
				try {
					a2.close(); // �Ϲݿ��� : IOException	 
				}catch (IOException e){
					e.printStackTrace();                                                                                                                                                                                                                                    
				}
			 }
		 }
		 

				
		
		
		
		
		
		// ������ ��
	}

}
