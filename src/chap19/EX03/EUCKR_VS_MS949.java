package chap19.EX03;

import java.io.UnsupportedEncodingException;

// EUCKR = �ѱ� ǥ�� .�ѱ� ǥ������ ��ü �� ǥ�� ������ �͸� �����Ǿ� ���� .�� 11000�� �߿��� 2200���� ǥ�� �����ϰ� 8000�ڴ� ǥ�� ����.
//         ����: 1byte
//         �ѱ�: 2byte

// MS-949 = Microsoft�翡�� ������ �ѱ� ǥ�� ���. 11000 ��� ǥ�� ������.
//          ����: 1byte
//          �ѱ�: 2byte

//UTF-8: ��� ���� (Web, FTP, Mail, ...) git, MAC, < ��������>
//����: 1byte
//�ѱ�: 3byte

//UTF-16: <��������>
//        ����, �ѱ� ��� 2byte�� ó����
//        BOM 2byte: ��� ������ �ĺ� �ڵ�

// ���ڸ� �ش� ���ڵ� Ÿ������ ����Ʈ ��Ʈ������ ������ ���, �ش� ���ڵ� Ÿ������ ������ �ؾ� �������� �ʴ´�.

// ��Ŭ�������� ���ڵ� Ÿ�� ���� 3����.
//1. ���� ����:
//2. ������Ʈ���� ����:
//3. ���Ͽ��� ����:


public class EUCKR_VS_MS949 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		// EUCKR VS MS-949 
		
		//1. �����ڸ� byte�� �������� String���� ��ȯ�� : 
		byte[] b1 = "a".getBytes("EUC-KR");  // ���ڸ� byte�� ��ȯ ==> ��Ʈ��ũ ���ڸ� byte ��Ʈ������ ��ȯ�ؼ� ������
		// ���ܰ� �߻���. (UnsupportedEncodingException) < -- ��Ÿ�� �߻��� ��� ���ڵ� �� �� ���� ���ܰ� �߻��� ��.
		
		byte[] b2 = "a".getBytes("MS949");
		
		System.out.println(b1.length); // 1���� ����� 1byte�� ���
		System.out.println(b2.length); // 1���� ����� 1byte�� ���
		System.out.println("===============================");
		
		System.out.println(new String(b1,"EUC-KR")); // byte[] ==> ���ڿ��� ��ȯ��
		System.out.println(new String(b2,"EUC-KR"));
		System.out.println("===============================");
		
		//2. �ѱ��� byte�� �������� String���� ��������
		
		byte[] b3 = "��".getBytes("EUC-KR");
		byte[] b4 = "��".getBytes("MS949");
		
		System.out.println(b3.length); // 1���� �ѱ���� 2byte�� ���
		System.out.println(b4.length); // 1���� �ѱ���� 2byte�� ���
		
		System.out.println(new String(b3,"EUC-KR")); // byte[] ==> ���ڿ��� ��ȯ��
		System.out.println(new String(b4,"MS949"));
		
		//3. ĳ���ͼ� �� ���� ǥ�� �ɷ�
		
		byte[] b5 = "��".getBytes("EUC-KR"); // 11,000�� �߿��� 2,000�ڸ� ǥ���ϰ� 8,000�ڴ� ǥ�� ����, �ٸ� �� 8000�ڴ� �s �� ���� �Ⱦ��� ���ڵ�
		byte[] b6 = "��".getBytes("MS949"); // 11,000�� ��� ó�� ������
		
		System.out.println(b5.length); // 1
		System.out.println(b6.length); // 2?
		
		System.out.println(new String(b5,"EUC-KR")); // byte[] ==> ���ڿ��� ��ȯ��
		System.out.println(new String(b6,"MS949"));
		
		
	// �����ǳ�
	}
}
