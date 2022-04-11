package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1_1 {
	public static void main(String[] args) {
		
		
		//1. ����ó�� a) ���ܿ� �ٸ� ���� ó��
		
		File inFile = new File("src\\chap19\\files\\FileInputStream1.txt"); // ���� ���Ϸ� �ҷ����� �Ŀ�
		
		InputStream is = null;
		try {is = new FileInputStream(inFile);} catch (FileNotFoundException e) {}  // try catch������ ó���ؼ� ������
			
		int data = 0;
		
		try {while ((data = is.read()) != -1) { //
			System.out.println(data);
			System.out.print((char)data);
		}} catch(IOException E) { 
			System.out.println("���ܻ�Ȳ �߻�, ������ ���� �� �����ϴ�");
		}
		
		try {
			if(is != null) {
				is.close();	
			}
		} catch (IOException e) {
		}
		
		System.out.println("=================================");
		
		//2. is2: (����η� ����: -utf-8.txt), ����ó��(try ~ with resource�� ����ó��)
		
		InputStream is2 = null;
		int data2 = 0;
		
		try { // with resource : ��ü ����, RAM�� ����K <== close()�� �ڵ����� ó����. 
			is2 = new FileInputStream(inFile);			
			while ((data2 = is2.read()) != -1) { // IOEception�� �ʿ���
				System.out.print((char)data2);
				}} catch(IOException E) {  // ���⼭�� FileNotFoundException�� �߻��ϴµ�, IOEception�� �� ���������̶� ����ó����   ������.
					System.out.println("���ܻ�Ȳ �߻�, ������ ���� �� �����ϴ�");
		}finally {
			if(is2 != null ) {
				try {is2.close();} catch (IOException e) {}
			}
				
		}
		

		
	// �����ǳ�
	}
}
