package chap19.EX06;

import java.io.IOException;
import java.io.OutputStream;

// �ѱ��� �ֿܼ� ����غ���2

public class ConsolOutputObject_1 {
	public static void main(String[] args) throws IOException {

		OutputStream os = System.out; // System.out �ܼ�â�� ����ϴ� �ڵ�. �⺻������ byte�� �����. 
		
		//1. 1-byte ���
		System.out.println("============================================================");
		System.out.println("1. 1-byte ���");System.out.println();
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n');
		
		os.flush(); // ������ ������ �ֿܼ� �����.
		System.out.println();
		
		//2. n-byte ��� // byte�� �ֿܼ� �����.
		System.out.println("============================================================");
		System.out.println("2. n-byte ���");System.out.println();
		
		byte[] byteArr1 = "hello!".getBytes(); // String�� byte�� ��ȯ�ؼ� �迭�� ����.
		
		os.write(byteArr1);
		os.write('\n');
		os.flush();
		System.out.println();
		
		//3. n-byte ���
		System.out.println("============================================================");
		System.out.println("3. n-byte ���");System.out.println();
		
		byte[] byteArr2 = "Better the last smile than the first laughter".getBytes();
		os.write(byteArr2,7,8); // (byte�迭,offset,length)
		os.flush();
		os.close();
		
		
		
	//������ ��
	}
}
