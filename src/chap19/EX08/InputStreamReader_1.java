package chap19.EX08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStreamReader: byte �����͸� char �������� ��ȯ�ϴ� ��ü.
// byte ������ ���ڵ��� �� ��������� �ϳ�, char �������� �ٲٸ� ���ڵ� Ÿ���� �Ű� �� �ʿ䰡 ����.

public class InputStreamReader_1 {
	public static void main(String[] args) {

	//1. ���� ��ü ����
	File isr1 = new File("src/chap19/EX08/isr1.txt");
	
	//2. FileReader�� �б� (MS949 -> UTF8 �б� : ����)
	System.out.println("=========================================");
	System.out.println("2. FileReader�� �б� (MS949 -> UTF8 �б� : ����)");System.out.println();
	
	try (Reader reader1 = new FileReader(isr1);){ //FileReader�� ���ڵ��� �ȵ�. default Encording�� �����.
		int data;
		while((data = reader1.read()) != -1) {
			System.out.print((char)data);
		}
	} catch (Exception e) {} 
	System.out.println();System.out.println();
		
	//3. FileInputStream + InputStreamReader�� �̿��� ���� �б�
	//   InputStreamReader(is1, "UTF-8") => byte ������ is1 ��ü -> UTF8 ���·� ��ȯ�ϴ� ���� �ٽ�.
	System.out.println("=========================================");
	System.out.println("3. FileInputStream + InputStreamReader�� �̿��� ���� �б�");System.out.println();
	try(InputStream is1 = new FileInputStream(isr1);
			InputStreamReader isr2 = new InputStreamReader(is1, "UTF-8");){
		int data;
		while ((data = isr2.read()) != -1) {
			System.out.print((char)data);
		}
	}catch (Exception e) {}
	
	//�����ǳ�
	}
}
