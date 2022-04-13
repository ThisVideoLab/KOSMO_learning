package chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

//1. �ֿܼ��� �ѱ��� ��ǲ �ް�
//2. ��ǲ���� ���� ���Ͽ� �����غ���.
//3. ������ - EX06 ��Ű�� ���� input.txt�� �����ϵ���
//4. ����� ������ delimiter�� Charset.default 
//5. �迭�� ũ��� 100 byte ���Ϸ� ������ ��.
//6. ����ó���� ����� ����
//7. ������ �ҷ��ͼ� ����ϰ� ������

public class EX06_ConsolInputOutPutObject2_teacher {
	public static void main(String[] args) throws IOException { // 6�� ���� ����

		//1. �ֿܼ��� �ѱ��� ��ǲ �޴´� (System.in) < == byte[]�迭�� �����ؼ� ó��: �ѱ��� ó��
		InputStream is =  System.in; // new�� �������� �ʰ� ���Ḹ ������ �ֿܼ��� ��ǲ���� ����.
		System.out.println("<<�ѱ��� �Է��Ͻÿ�>>");
		
		byte[] byteArr1 = new byte[100]; // 5�� ���� ����
		//int data = is.read(); // ����� ���� ���� ���� �� ������, �ѱ��� ���� ���� => �ѱ��� �迭�� �־ �о�� ���� ó���� 
								// data�� 1-byte�� ���� ���� ����Ǳ� ������. �׷��� 2-byte �̻��� �ѱ��� ������ ����
		int count = is.read(byteArr1); // byteArr1�� byte�� \r\n, count1 �迭�� ���� ���� ����
		
		//2. ��ǲ���� �ѱ��� �����η� ���Ͽ� ������.
		File f1 = new File("src/chap19/EX06/input.txt");
		OutputStream os = new FileOutputStream(f1); 
		
		String str1 = new String(byteArr1, 0, count, Charset.defaultCharset()); 
		byteArr1= str1.getBytes(Charset.defaultCharset()); // 4�� ���� ����
		
		os.write(byteArr1); // ����(RAM)���� ������.  
		os.flush(); // 2�� ���� ����
		
		//3. ������ ���Ͽ��� ���� �о��.
		InputStream fis = new FileInputStream(f1);
		byte[] byteArr2= new byte[100];
		
		int count2 =fis.read(byteArr2);// read(byte[]) : �ѱ�ó��
		//int count2 = fis.read()'; // read() : 1-byte�� ó���ϹǷ� �ѱ��� ������ ��µ�.
		 
		System.out.println("�о���� ������ �ֿܼ� ����մϴ�.");
		System.out.println();
		
		//4. �о���� �迭�� �ֿܼ� ����Ѵ� (System.out)
		OutputStream fos = System.out;
		
		fos.write(byteArr2);
		fos.flush();
		
		fos.close();
		fis.close();
		is.close();
		os.close();
		
	// �����ǳ�
	}
}
