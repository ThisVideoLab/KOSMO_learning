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

// 12:34�� ���� 01:04�б��� ������ ��
// 12:43�п� �Ϸ���

public class EX06_ConsolInputOutPutObject {
	public static void main(String[] args) throws IOException { // 6�� ���� ����
		
		
		
		System.out.println("<<�ѱ��� �Է��Ͻÿ�>>");
		InputStream is =  System.in; // 1�� ���� ����
		
		byte[] byteArr1 = new byte[100]; // 5�� ���� ����
		int count = is.read(byteArr1);
		
		String str1 = new String(byteArr1, 0, count, Charset.defaultCharset()); 
		
		File outFile = new File("src/chap19/EX06/input.txt"); // 3�� ���� ���� 
		OutputStream os = new FileOutputStream(outFile); 
		
		byteArr1= str1.getBytes(Charset.defaultCharset()); // 4�� ���� ����
		
		os.write(byteArr1);  
		os.flush(); // 2�� ���� ����
		os.close();
		
		File inFile = new File("src/chap19/EX06/input.txt");
		InputStream fis = new FileInputStream(inFile);
		
		int data;
		
		byte[] byteArr2= new byte[100]; 
		while((data = fis.read(byteArr2)) != -1){ 
				System.out.print(new String(byteArr2,Charset.defaultCharset())); //7�� ����
		}
		
	// �����ǳ�
	}
}
