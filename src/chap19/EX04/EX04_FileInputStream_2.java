package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

//is1 :
//is2 : 

public class EX04_FileInputStream_2 {
	public static void main(String[] args) {

		File inFileRelative1 = new File("src\\chap19\\EX04\\exception-ms949.txt");
		File inFileRelative2 = new File("src\\chap19\\EX04\\exception-utf8.txt");
		
		
		//1. MS949 �ѱ۷� �б� ó��, try with resource �� ����� ����ó��
		System.out.println("==========================================================");
		System.out.println("1. MS949 �ѱ۷� �б� ó��, try with resource �� ����� ����ó��");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		try {
			InputStream is2 = new FileInputStream(inFileRelative2);
			byte[] arr2 = new byte[is2.available()];
			while((is2.read(arr2))!=-1) {
			System.out.println(new String(arr2,Charset.forName("UTF-8")));
			}
        } catch (IOException e) {}
		System.out.println();
		
		
		// 2. UTF-8 �ѱ� �б� ó��, try ����ó�� <�����>
		System.out.println("==========================================================");
		System.out.println("2. UTF-8 �ѱ� �б� ó��, try ����ó�� <�����>");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		InputStream is2 = null;
		
		try {
			is2 = new FileInputStream(inFileRelative1);
			byte[] arr1 = new byte[is2.available()];
			
			while((is2.read(arr1))!=-1) {
			System.out.println(new String(arr1,Charset.forName("MS949")));
			}
		}
			catch(IOException E) { 
				System.out.println("���ܻ�Ȳ �߻�, ������ ���� �� �����ϴ�");
		}
		try {
			if(is2 != null) {
				is2.close();	
			}
		} catch (IOException e) {}
		
	//�����ǳ�
	}
}