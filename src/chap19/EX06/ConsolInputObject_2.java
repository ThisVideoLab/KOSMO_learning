package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

//Windows�� �ְܼ� �޸��忡�� enter�� ġ�� \r\n�� �ԷµǾ� �츮�� �ƴ� ������ ������ �ϰ� ��.
//�ٸ� \r�� ������ �� �־, \n�����ε� ������ ������. write('\n')

public class ConsolInputObject_2 {
	public static void main(String[] args) throws IOException {
		
		
		
		
		
		
		InputStream is = System.in; // System.in �� ������ ������ �� �ϳ��� ���� �� ����. �߰��� ������ �ٽô� �Է��� ���� �� ����.
		//InputStream is2 = System.in; // �̴�� �Է��ϸ� ������ �ȳ��µ� �ܼ�â�� ��ǲ ��Ʈ������ ��������.
		
		//1. 1-byte ���� �б�
		System.out.println("============================================================");
		System.out.println("1-byte ���� �б�");
		System.out.println();
		
		System.out.println("<<������ �Է��ϼ���>>");
		
		int data;
		while ((data = is.read()) != '\r') { //  �ֿܼ���  input�� ��ٸ��ٰ� is.read()�� ȣ�� �� �� ���ư�.  
			System.out.print((char)data);
		}
		is.read(); // 10�� ��µ�. �̴� '\n'�� �ش��� // �� �Ŀ��� ���ۿ� \n�� ���������Ƿ� �װ��� ó���ϴ� ����. �ȳ����� ���� read()���� �����ִ� \n�� ���� ��.
					// ������ ó������ �ʰ� 2��° is.read() �� �ҷ����� �����ִ� \n�� ���� ���忡 �ɷ��� ������ ���� ��µ�. �Ӹ� �ƴ϶� 2��° ���嵵 ��������.
		System.out.println();
		System.out.println();
		
		
		//2. a) n-byte ���� �б� (byte[]�� ó�� ��ġ���� ���� �����͸� ������)
		System.out.println("============================================================");
		System.out.println("2. a) n-byte ���� �б� (byte[]�� ó�� ��ġ���� ���� �����͸� ������)");
		System.out.println();
		
		byte[] byteArr1 = new byte [100]; // �ֿܼ��� �迭�� ����� ���� \r �� \n�� ��.
		int count1 = is.read(byteArr1); // couunt1 �� 100, 100, 30, -1 �̷� ������ ��.

		for (int i = 0; i < count1; i++) {
			 System.out.print((char)byteArr1[i]); // (char)�� ����� ���� ������ ����Ʈ �ڵ带 Ȯ�� ������.
			 System.out.println(" : count1 =  " + count1);
		}
		
		// 2. b) n-byte ���� �б� (byte[]�� ó�� ��ġ���� ���� �����͸� ������)
		System.out.println("============================================================");
		System.out.println("2. b) while������ new String ���� �ۼ��غ���");
		System.out.println();
		
		/*
		 
		 �� �κ��� �����Բ��� �ذ����� ����ä�� �ּ�ó���θ� ��������. ���߿� ¿����� �Ǿ� ����ŵ� ó���غ��ðԳ�
		
		int count2;
		
		while ((count2 = is.read(byteArr1)) != '\r') { // �ֿܼ����� -1�� ������� �ʰ� '\n'�̳� '\r'�� ����ϴ� ���� ������.
			System.out.println(new String (byteArr1));
		}
		is.read();
		
		*/
		
		// 3. n-byte ���� �б� (length��ŭ �о�ͼ� byte[] offset ��ġ�� ������) // offset ��ŭ ���� ������
		System.out.println("============================================================");
		System.out.println("3. n-byte ���� �б� (length��ŭ �о�ͼ� byte[] offset ��ġ�� ������)");
		System.out.println();
		
		byte[] byteArr2 = new byte[8];
		int offset = 3;
		int length = 5;
		int count3 = is.read(byteArr2, offset, length);
		
		for(int i = 0; i < offset + length; i++) {
		System.out.print((char)byteArr2[i]);
		}
		is.close();
		
	//�����ǳ�
	}
}

