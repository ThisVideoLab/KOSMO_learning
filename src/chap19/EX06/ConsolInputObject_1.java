package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

// System.in : �ڹٿ��� �����ϴ� ��ü�� console���� ��ǲ�� �޾���, InputStream ������ ������.
               // windows: �ֿܼ��� enter: \n\r
          	   // windows: �ֿܼ��� enter: \r
// System.out : �ڹٿ��� �����ϴ� ��ü�� console�� �ƿ�ǲ�� �����, OutputStream ������ ������.

public class ConsolInputObject_1 {
	public static void main(String[] args) throws IOException {
		
		//1. console���� ��ǲ�ޱ� ���� ��ü ����.
		
		InputStream is1 = System.in; // is1�� �ֿܼ��� ��ǲ�� �޾� ó���ϴ� ��ü
		
		System.out.println("������ �Է��ϼ���. >>>");
		
		int data;
		
		while ((data = is1.read()) != '\r') { // 1byte�� �о int data ������ �Ҵ���. �� �� \r �� �ԷµǸ�, �� ���͸� ġ�� �������´ٴ� ��.
			System.out.println("���� ����Ÿ : " + (char)data + " ���� ����Ʈ ��: " + is1.available());
			// �ѱ��� �а�, ó���ϰ�, �����ϰ�, �ݺ���. ������ false�� �� ������
		}
		
		System.out.println(data); // ���� �Ŀ� �ܼ�â�� enter�� ġ�� // 13 �� ��µ�. �̴� \r�� �ش���
		System.out.println(is1.read()); // ���� �Ŀ� �ܼ�â�� enter�� ġ�� // 10�� ��µ�. �̴� \n�� �ش���
		
	// ������ ��
	}
}
