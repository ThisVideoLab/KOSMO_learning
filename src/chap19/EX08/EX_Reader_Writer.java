package chap19.EX08;
/*

����------------------------------
1. ���� ������ default charset�� MS949�ε�, Reader�� Writer�� ���
2. �ֿܼ��� �ѱ��� ������ �װ��� ����
3. ���� ������ C:\\Temp\a\aaa.txt (949);
			 C:\\Temp\b\bbb.txt (utf-8);
   �� �ΰ��� ������ ���� �ٸ� ���Ϸ� ������.
4. �� �� ���� ������ ��Ŭ�������� ������ ��
5. �� �� ������ �ٽ� ������ϴ� ����� �߰��� ��.
6. �ٽ� �� �� ������ �о���̱�
7. �ܼ�â���� ���� ������ �������� ����ϱ�.

���� �ð�: 
�Ϸ�ð�:

*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class EX_Reader_Writer {
	public static void main(String[] args) { 

		//1. ���� ����
		System.out.println("=========================================");
		System.out.println("1. ���� ����");System.out.println();
		
		System.out.println("������ ������ Ȯ���մϴ�.");
		File forder = new File("C:\\temp\\a");
		if (!forder.exists()) {
			forder.mkdir();
			System.out.println("���� ��ο� ���� a�� �����մϴ�.");
		}else {
			System.out.println("���� ��ο� �̹� ���� a�� �����մϴ�.");
		}System.out.println();
		
		//2. ���� ����
		System.out.println("=========================================");
		System.out.println("2. ���� ����");System.out.println();
				
		File exFile1 = new File("C:\\temp\\a\\aaa.txt");
		File exFile2 = new File("C:\\temp\\a\\bbb.txt");
		
		//3. Writer�� ����� �ܼ�â�� ������ ����
		
		System.out.println("<<�ѱ��� �Է��ϼ���>>");
		
		try {
	         OutputStream os1 = new FileOutputStream(exFile1);
	         OutputStream os2 = new FileOutputStream(exFile2);
	         OutputStreamWriter ms = new OutputStreamWriter(os1 , "MS949");
	         OutputStreamWriter ut = new OutputStreamWriter(os2 , "UTF-8");
	         InputStreamReader is = new InputStreamReader(System.in);
	         int data;
	         while((data = is.read()) != '\n') {
	            ms.write(data);
	            ut.write(data);
	            
	            ms.flush();
	            ut.flush();
	         }
	      }catch(Exception e) {}
		
		
		//4. FileReader�� �б�
		System.out.println("4. FileReader�� �б�");
		
		//a) aaa ���� �б�
		System.out.println("aaa ���� �б�");
		try (Reader reader1 = new FileReader(exFile1);){ //FileReader�� ���ڵ��� �ȵ�. default Encording�� �����.
			int data;
			while((data = reader1.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {}
		
		//b) bbb ���� �б�
		System.out.println("b) bbb ���� �б�");
		try(InputStream is1 = new FileInputStream(exFile2);
				InputStreamReader isr2 = new InputStreamReader(is1, "UTF-8");){
			int data;
			while ((data = isr2.read()) != -1) {
				System.out.print((char)data);
			}
		}catch (Exception e) {}
		
		
	//�����ǳ�
	}
}
