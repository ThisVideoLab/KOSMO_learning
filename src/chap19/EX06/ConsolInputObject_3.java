package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// �ֿܼ� ��ǲ�Ǵ� �ѱ��� ó���غ���
// 1-byte�� ������ �ѱ��� ó���� �� ����. ��� �迭�� �д� ���� ������.
// InputStream System.in

public class ConsolInputObject_3 {
	public static void main(String[] args) throws IOException {

		InputStream is =  System.in;  // �ѹ��� ���� ������. ���� 2��°�� �Ǳ� �ϴµ� �Է��� ��û ��������.
									  // is.close()�� ������ ���̻� ��ǲ���� ���� ���ϴ�, �������� ó���� ��
		
		
		
		//1. n-byte �迭 ���� (byte[] ó�� ��ġ���� ���� �����͸� ������)
		System.out.println("============================================================");
		System.out.println("1. n-byte �迭 ���� (byte[] ó�� ��ġ���� ���� �����͸� ������)");System.out.println();
		
		System.out.println("<< �ѱ��� �Է��ϼ��� >>");
		
		byte[] byteArr1 = new byte[100];
		int count1 = is.read(byteArr1); // count1 : byteArr1�� ����� ���� ���� 
										// 			\n \r�� �� ���Ե�. ��? �������� enter ġ�ϱ�.
		
		String str1 = new String(byteArr1, 0, count1, Charset.defaultCharset());
								// (���� ������, offset, length, ���� Ÿ��)
		System.out.println(str1);
		System.out.println("\\r\\n�� ������ �迭 ���� �� ����: " + count1); // \r\n�� ������ ��
		System.out.println();
		
		//2. n-byte ���� ���� (length��ŭ �о�ͼ� byte[] �迭�� offset[index]��ġ�� �����϶�)
		System.out.println("============================================================");
		System.out.println("2. n-byte ���� ���� (length��ŭ �о�ͼ� byte[] �迭�� offset[index]��ġ�� �����϶�)");System.out.println();
		
		byte[] byteArr2 = new byte[9];
		int offset = 3;
		int length = 6;
		int count2 = is.read(byteArr2,offset,length);
		
		String str2 =new String(byteArr2,0,offset + count2, Charset.defaultCharset());
		System.out.println(str2); // ������ 3�̹Ƿ�, �պ��� 3������ ��� �Ŀ�, 6byte�� �о����. �ѱ� �ϳ��� 2byte�̹Ƿ�, 3���ڸ� ������.
								  // �� �� ���� 1-byte�� �о���̴� ��쿡�� ���ڰ� ������ ��.
		
		
		
	// ������ ��
	}
}
