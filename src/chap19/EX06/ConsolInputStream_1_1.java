package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

public class ConsolInputStream_1_1 {

	public static void main(String[] args) throws IOException {
		//1. console���� ��ǲ�ޱ� ���� ��ü ����.
		
				InputStream is1 = System.in; // is1�� �ֿܼ��� ��ǲ�� �޾� ó���ϴ� ��ü
				
				System.out.println("������ �Է��ϼ���. >>>");
				
				int data;
				
				while ((data = is1.read()) != '\n') { // 1byte�� �о int data ������ �Ҵ���. �� �� \n �� �ԷµǸ�, �� ���̻� ���� ���� ���ٸ� �������´ٴ� ��.
					                         // ���ǹ� �ڸ��� '\n'�̳� '\r'�� ������ enter�� �Է��� �� ����, �� \r \n  �� �Էµ� ������ ���ư��ٴ� ��.
											 // �� �Ŀ� ������ ���� \n �̾����Ƿ�, is1.read()�� \n�� �ش��ϴ� 10�� ��µ�
											 // �׷��� read()���� -1�϶����� �д� ���ǿ�����, ���̻� ���� ���� �����Ƿ� �Ʒ� �࿡ is1.read()�� ����ص� ���� ���� ����.
					System.out.print((char)data);
					// �ѱ��� �а�, ó���ϰ�, �����ϰ�, �ݺ���. ������ false�� �� ������
				}
				
				System.out.println(data); // 10�� ���� \n
				System.out.println(is1.read()); // ���̻� read�� ����� ����

	// �����ǳ�
	}
}
