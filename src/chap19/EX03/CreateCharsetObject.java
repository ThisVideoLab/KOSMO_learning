package chap19.EX03;

import java.nio.charset.Charset;

public class CreateCharsetObject {
	public static void main(String[] args) {
		
	// ���� ���ڵ��� �����ϴ� ���
    //1. ch

	Charset cs1 = Charset.defaultCharset(); // ���� �޼���, �ý����� �⺻ �������� charset�� �ε���
	System.out.println("1. " + cs1); // MS949 ->> X-Windows 949 (ms 949�� Ȯ��)
							// UTF-8
	
	//2. Charset.forName("MS949"); < == ���� �Ҵ��ؼ� ���
	Charset cs2 = Charset.forName("MS949");
	System.out.println("2. " + cs2);
	
	//3. Charset.forName("UTF-8"); < == ���� �Ҵ��ؼ� ���
	Charset cs3 = Charset.forName("UTF-8");
	System.out.println("3. " + cs3);
	
	//4. Charset.forName("EUK-KR"); < == ���� �Ҵ��ؼ� ��� // �������� �ʴ� ���ڵ��� ������ ���ܰ� �߻��� ���ɼ��� ����.
	Charset cs4 = Charset.forName("EUC-KR");
	System.out.println("4. " + cs4);
	
	System.out.println();
	
	System.out.println(Charset.isSupported("MS949"));
	System.out.println(Charset.isSupported("UTF-8"));
	System.out.println(Charset.isSupported("EUC-KR"));
	
	// �����ǳ�
	}
}
