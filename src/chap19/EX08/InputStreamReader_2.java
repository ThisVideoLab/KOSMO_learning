package chap19.EX08;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReader_2 {
	public static void main(String[] args) {

	//1. �ܼ� �Է� (MS949): default charset, byte ��Ʈ��.
	System.out.println("=========================================");
	System.out.println("1. �ܼ� �Է� (MS949): default charset, byte ��Ʈ��");System.out.println();

	System.out.println("<<�ѱ��� �Է��ϼ���>>");
	
	try  {
		InputStreamReader isr1 = new InputStreamReader(System.in, "MS949");
		//InputStreamReader: �ֿܼ��� input�޴� ���ڴ� byte�� ����. �̰��� MS949�� �о� ���̸�, char�� ��ȯ�ؼ� ����� ��������.
		//System.in : �ܼ� �Է��� byte ���·� �Էµ�.
		//isr1�� ��ȯ�� char Ÿ���� ������ ��.
		int data1;
		while((data1 = isr1.read()) != '\r') {
			System.out.print((char)data1);
		}
	System.out.println();
	System.out.print("�� ������ "+  isr1.getEncoding() + " �������� ��µǾ����ϴ�.");
	} catch (IOException e) {}
	System.out.println();System.out.println();
	
	//2. �ܼ� �Է� (UTF-8)
	System.out.println("=========================================");
	System.out.println("2. �ܼ� �Է� (UTF-8)");System.out.println();

	System.out.println("<<�ѱ��� �Է��ϼ���>>");
	
	try {
		InputStreamReader isr2 = new InputStreamReader(System.in, "UTF-8");
		//InputStreamReader: �ֿܼ��� input�޴� ���ڴ� byte�� ����. �̰��� MS949�� �о� ���̸�, char�� ��ȯ�ؼ� ����� ��������.
		//System.in : �ܼ� �Է��� byte ���·� �Էµ�.
		//isr1�� ��ȯ�� char Ÿ���� ������ ��.
		int data2;
		while((data2 = isr2.read()) != '\r') {
			System.out.print((char)data2);
		}
	System.out.println();
	System.out.print("�� ������ "+  isr2.getEncoding() + " �������� ��µǾ����ϴ�.");
	} catch (IOException e) {}
	
		
	//�����ǳ�
	}
}
