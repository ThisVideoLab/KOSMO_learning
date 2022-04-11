package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {
	public static void main(String[] args) throws IOException { //// ������ �ƴ����� �ۼ��� ���Ǹ� ���ؼ� ����ó�� -> 3,4������ ��������	 
		

		//1. �Է����� ����
		File inFile = new File ("src\\chap19\\EX04\\FileInputStream1.txt");
		
		//1. ����ó��
		
		InputStream is1 = null;
		
		try  {
			is1 = new FileInputStream(inFile);
			// try( with resource : ��ü ���� ) < == close() �� �ڵ����� �̷����
			int data;
			while((data = is1.read() )!= -1) { //������ �����Ƿ� read() �޼��常 ���. �ѱ��� ��쿡�� read (byte �迭)
				System.out.print((char)data);
				try {Thread.sleep(0);} catch (InterruptedException e) {}
			}
			
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		} finally {
			if(is1 !=null) {
				try {
					is1.close();
				} catch (IOException E) {}
			}
		}
	
		// �ڵ� ó��
		System.out.println();
		
		try (InputStream is2 = new FileInputStream(inFile);) {
			// try( with resource : ��ü ���� ) < == close() �� �ڵ����� �̷����, FileInputStream�� Closeable �������̽��� ������.
			int data;
			while((data = is2.read() )!= -1) { //������ �����Ƿ� read() �޼��常 ���. �ѱ��� ��쿡�� read (byte �迭)
				System.out.print((char)data);
				try {Thread.sleep(0);} catch (InterruptedException e) {}
			}
			
		} catch (IOException e) {
			System.out.println("������ ã�� ���߽��ϴ�.");
		}
		
		//3. b) n-byte ������ �б� (byte[]�� ó�� ��ġ�������� ���� ����Ʈ�� ������) -> ���� ����Ʈ�� ���ÿ� �о ó�� �ӵ��� ����.
		//      �迭 ũ�⸸ŭ 
		System.out.println();
		System.out.println("=======================");
		System.out.println();
		
		InputStream is3 = new FileInputStream(inFile); // ������ �ƴ����� �ۼ��� ���Ǹ� ���ؼ� ����� ����ó��
		byte[] byteArr1= new byte[9]; // �迭�� 9��, 0~8���� ������
		int count1;
		while((count1 = is3.read(byteArr1)) !=-1){ // -1: ���̻� ���� ���� ���� ������
				      //is3.read(): 1byte �� ���� // �ѱ��� ó������ ����
					  //is3.read(byteArr1): 9byte(�迭�� ũ��) �� �о byteArr1�� ���� 
			
			
			for(int i = 0; i <count1 ; i++) {
				System.out.print((char)byteArr1[i]);
			}
			System.out.print(" : count1 = " + count1);
			
			System.out.println();
			System.out.println();
			System.out.println("=================");
			String str = new String(byteArr1,Charset.forName("MS949"));
			System.out.println(str);
		}
		
		// 4. b-1_ n-byte (�迭ũ��) ������ �о �ѱ� ó��. offset, length ���
		System.out.println("=================");
		
		InputStream is4 = new FileInputStream(inFile); // ������ �ƴ����� �ۼ��� ���Ǹ� ���ؼ� ����� ����ó��
		byte[] byteArr2= new byte[100];
		
		int count2;
		
		while ((count2 = is4.read(byteArr2)) != -1) { // count2 = 100, -1
			System.out.println(new String(byteArr2,Charset.forName("MS949")));
		}
		is4.close();
		
		// 4. c. n-byte (�迭ũ��) ������ �о ����.
		System.out.println("=================");
	
		InputStream is5 = new FileInputStream(inFile); // ������ �ƴ����� �ۼ��� ���Ǹ� ���ؼ� ����� ����ó��
		byte[] byteArr3= new byte[9];
		
		int offset = 3; // ������ �鿩����. ������ ��ŭ�� ���� ��� �ڿ� ���� �Է���.
		int length = 6; // �о���� ����Ʈ ��
		int count4 = is5.read(byteArr3, offset, length); // length��ŭ �տ��� �о�ͼ�
		
		for (int i =0; i < offset + count4; i++) {
			System.out.print((char) byteArr3[i]);
		}
		is5.close();
		
	//������ ��
	}
}
