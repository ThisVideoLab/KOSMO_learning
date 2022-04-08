package chap19.EX03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArrayToString {
	public static void main(String[] args) throws UnsupportedEncodingException {

	//1. String getBytes(): String�� ����Ʈ�� �����ؼ� �迭�� �������. �� ���ڸ� ����Ʈ�� ��ȯ�ؼ� �迭�� ��� ��.
	//   �پ��� ������� �ɸ��� ���� ������ �� ����.	
	byte[] arr1 = "�ȳ�".getBytes(); // charset�� �������� ����. -> String.getBytes()�� ����
	byte[] arr2 = "��ť".getBytes(Charset.defaultCharset()); // charset�� �������� ����. -> String.getBytes()�� ����
	byte[] arr3 = "����".getBytes(Charset.forName("MS949"));  // ���� �߻� : ����� ����
	byte[] arr4 = "����".getBytes("UTF-8"); // ����ó�� �ʿ� // �Ϲݿ��� ->  UnsupportedEncodingException���ٰ� throws
		
	//2. �� ���ڵ��� ����Ʈ �� ���
	
	System.out.println(arr1.length);  // 4
	System.out.println(arr2.length);  // 4
	System.out.println(arr3.length);  // 4
	System.out.println(arr4.length);  // 6
	
	//3. new String() : byte[] => String���� ��ȯ , byte -> ���ڷ� ��ȯ
	System.out.println("======================");
	
	String str1 = new String(arr1);
	String str2 = new String(arr2, Charset.defaultCharset());
	String str3 = new String(arr3, Charset.forName("MS949")); // �̶� �ɸ��ͼ��� ���� �迭���� ������ �ɸ��ͼ°� ��ġ���Ѿ� ��. ���⿡ MS949�� ���
	String str4 = new String(arr4, Charset.forName("UTF-8")); // ������ ������ ���� �߻���. �����ÿ��� ��Ŭ������ �⺻ ���� �ɸ��ͼ��� �ݿ��Ǵµ�
															  // ���� ��Ŭ������ �⺻ ������ MS949�̱� ������.
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	
	//4. �ѱ��� ������ ���: �������� ���ڵ� Ÿ�԰� �������� ���ڵ� Ÿ���� ����ġ�� ���
	
	String str5 = new String(arr1, Charset.forName("UTF-8")); // arr1�� �������� Ÿ���� ������ ����. �̰� �޾Ƽ� UTF-8�� ������
	System.out.println(str5);                                 // ???�� ������ �߻���
	
	String str6 = new String(arr1, Charset.forName("MS949")); // arr1�� ������ �⺻ ������ ��Ŭ������ ������ ���� MS949 �ɸ��� ��
	System.out.println(str6);                                 // ��������� ��.
	
	String str7 = new String(arr3, Charset.forName("UTF-8")); // arr1�� ĳ���ͼ°� str7 �� ĳ���ͼ��� �޶� ���� �߻�
	System.out.println(str7);                               
	
	//�����ǳ�
	}
}
