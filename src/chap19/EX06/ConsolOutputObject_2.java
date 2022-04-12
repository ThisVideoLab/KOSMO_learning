package chap19.EX06;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

// �ѱ��� �ֿܼ� ����غ��� 2��
// 1-byte�� ����ϸ� �ѱ��� ������ ����� �Ǿ����. n-byte�� ����ؾ� ��.

public class ConsolOutputObject_2 {
	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;
		
		//1. n-byte ��� (byte[] �迭�� ó������ ������ �����͸� ����)
		System.out.println("============================================================");
		System.out.println("1. n-byte ��� (byte[] �迭�� ó������ ������ �����͸� ����)");System.out.println();
		
		byte[] byteArr1 = "�ȳ��ϼ���".getBytes();
		
		os.write(byteArr1); 
		os.write('\n'); // ���ۿ� ����
		os.flush(); // ������ ������ �ܼ�â�� �����.
		
		System.out.println();

		//2. n-byte ��� (byte[] offset���� length���� byte ������ ����)
		System.out.println("============================================================");
		System.out.println("2. n-byte ��� (byte[] offset���� length���� byte ������ ����)");System.out.println();
		
		byte[] byteArr2 = "�ݰ����ϴ�.".getBytes(Charset.defaultCharset());
		
		os.write(byteArr2,6,4); // ������ 6: �ݰ��� / ���� 4: �ϴ�
		os.flush();
		os.close();

	//�����ǳ�
	}
}
