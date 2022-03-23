package chap14.EX04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TrywithResource_1 {

	public static void main(String[] args) {
		//1. ���� ���ҽ� ����. (���� ���α׷� ���) -- �ڵ尡 ��� ��������.
		System.out.println("���ڸ� �Է��ϼ��� !");
		 InputStreamReader isr2 = null;
		
		 try {
			 isr2 = new InputStreamReader(System.in);
			 char input = (char)isr2.read(); // �Ϲ� ���� (checked ����) : IOException : �Է� ���
			 System.out.println("�Է±��� = " + input);
		 }catch (IOException e){
			 e.printStackTrace(); // try {} ������� ���ܰ� �߻��� ��쿡 �ڼ��� ������ �����
		 }finally { //��ü�� ��� �Ŀ� �޸� �������� �������� ��.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
			 // ���ҽ� ����: isr2.close(); �� �־���� ��. 
			 if (isr2 != null){
				try {
					isr2.close(); // �Ϲݿ��� : IOException	 
				}catch (IOException e){
					e.printStackTrace();                                                                                                                                                                                                                                    
				}
			 }
		 }
		 
		 
		 
		//2. �ڵ� ���ҽ� ���� (Java 1.7 �ڵ����� ���ҽ��� ����) -- �ڵ尡 ������. �׷��� �ʿ� ������ ����.
		 	//1. �ϴ� ��ü�� AutoCloseable �������̽��� ������ ��ü���� �Ѵ�.
		 	//2. �ݵ�� ��ü�� close()�� �ݵ�� �����ؾ� ��.
		 	// ���� 2���� ������ ������ �� �ڵ� ���ҽ� ����
		 	//try (�ڵ����� ���ҽ��� ������ ��ü ����( {} catch{} finally{}

		 //InputStreamReader�� AutoCloseable �������̽��� �����ϰ� ������, close()�� ������ �ִ�.
		 //Try with Resource: try ( with resource: ��ü �޸� �ε�) {}
		 
		 //�ڵ� �޸� ����: 
		 try(InputStreamReader isr1 = new InputStreamReader(System.in);) {
			 char input = (char) isr1.read();
			 System.out.println("�Է±��� = " + input);
		 }catch(IOException e){
			 e.printStackTrace();
		 } // finally ���� �����ϴ��� ��ü�� �ڵ����� isr1.close()
			 
		 		 
	// ������ ��
	}	
}
