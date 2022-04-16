package chap19.EX08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//PrintWriter : �ڵ� flush() ����� ������, Ȱ��ȭ�������.
//              close()�� ȣ��� �� flush�� ȣ�� �� �Ŀ� close()�� ���ư�.

public class PrintWriteExample {
	public static void main(String[] args) {
		
			
		//1. ���� ��ü ����
			
		File pw1 = new File("src/chap19/EX08/pw1.txt");
		File pw2 = new File("src/chap19/EX08/pw2.txt");
		File pw3 = new File("src/chap19/EX08/pw3.txt");
		
		//2. PrintWriter (File file)
		System.out.println("=========================================");
		System.out.println("2. PrintWriter (File file)");System.out.println();
		
		try (PrintWriter prw1 = new PrintWriter(pw1);){
			prw1.println("PrintWriter ���� #1");
			prw1.println(13);
			prw1.println(5.8);
			prw1.println("�ȳ��ϼ���");
			prw1.println("�ݰ����ϴ�. ");
			prw1.printf("%d, %s", 7, "�ȳ�").printf("%d, %s", "�ȳ�", 7);
			
		} catch (Exception e) {}
		
		//3. PrintWriter(OutputStream os)
		System.out.println("=========================================");
		System.out.println("3. PrintWriter(OutputStream os)");System.out.println();
		
		try (PrintWriter prw2 = new PrintWriter(new FileOutputStream(pw2));){
			prw2.println("PrintWriter ���� #2");
			prw2.println(13);
			prw2.println(5.8);
			prw2.println("�ȳ��ϼ���");
			prw2.println("�ݰ����ϴ�. ");
			prw2.printf("%d, %s", 7, "�ȳ�").printf("%d, %s", "�ȳ�", 7);
			
		} catch (Exception e) {}	
	
		//4. PrintWriter(System.out�� ���� �ܼ�â�� ���)
		System.out.println("=========================================");
		System.out.println("4. PrintWriter(System.out�� ���� �ܼ�â�� ���)");System.out.println();

		PrintWriter prw3 = new PrintWriter(System.out,true);
			prw3.println("PrintWriter ���� #3");
			prw3.println(13);
			prw3.println(5.8);
			prw3.print("�ȳ��ϼ���");
			prw3.println("�ݰ����ϴ�. ");
			prw3.printf("%d, %S", 7, "�ȳ�").printf("%s, %f", "����", 3.7);
			
			prw3.flush();
			prw3.close();
		
	//�����ǳ�
	}
}
