package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
   1. is1 <== InputStream ��ü (�����η� ����) (�Ϲ� try catch ����)
   2. is2 <== InputStream ��ü (����η� ����) (try with resource �������� ó��)
   �ѱ��� ����. �׳� Exception���� ó���϶�� �Ͻ�.
 */

public class EX3_Exception1  {
	public static void main(String[] args)  {

		File inFileAbsolute = new File("C:\\Users\\WEICHANG-PC45\\Desktop\\SI\\eclipse\\ThisVideoLab\\src\\chap19\\EX04\\exception-ms949.txt");
		File inFileRelative = new File("src\\chap19\\EX04\\exception-utf8.txt");
		
		
		// 12. is1�� ���� ��η� �����ؼ� ó���ϱ�
		System.out.println("==========================================================");
		System.out.println("is2�� ��� ��η� �����ؼ� try ~ with resource �������� ó���ϱ�");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		InputStream is1 = null;
		
		try {
			is1 = new FileInputStream(inFileAbsolute);
			byte[] arr1 = new byte[is1.available()];
			
			while((is1.read(arr1))!=-1) {
			System.out.println(new String(arr1,Charset.forName("MS949")));
			}
		}
			catch(IOException E) { 
				System.out.println("���ܻ�Ȳ �߻�, ������ ���� �� �����ϴ�");
		}
		
		try {
			if(is1 != null) {
				is1.close();	
			}
		} catch (IOException e) {}
		
		// 2. is2�� ��� ��η� �����ؼ� try ~ with resource �������� ó���ϱ�
		System.out.println("==========================================================");
		System.out.println("is2�� ��� ��η� �����ؼ� try ~ with resource �������� ó���ϱ�");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		InputStream is2 = null ;
		
		try {
			is2 = new FileInputStream(inFileRelative);
			byte[] arr2 = new byte[is2.available()];
			while((is2.read(arr2))!=-1) {
			System.out.println(new String(arr2,Charset.forName("UTF-8")));
			}
        } catch (IOException e) {}
		
	//�����ǳ�
	}
}
