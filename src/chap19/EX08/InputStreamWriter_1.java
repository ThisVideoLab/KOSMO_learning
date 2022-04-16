package chap19.EX08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//InputStreamReader: byte => char
//OutputStreamReader: byte => char (Charset�� �����ؼ� ������ ������ �� ����)

public class InputStreamWriter_1 {
	public static void main(String[] args) {
		
	//1. FileWriter�� ���ؼ� ������ ���� (Default: MS949)
	System.out.println("=========================================");
	System.out.println("1. FileWriter�� ���ؼ� ������ ���� (Default: MS949)");System.out.println();
	
	File osw1 = new File ("src/chap19/EX08/osw1.txt");
	File osw2 = new File ("src/chap19/EX08/odw2.txt");
	
	try (Writer writer1 = new FileWriter(osw1);){
		
		writer1.write("outputStreamWriter1 ���������Դϴ�. \n".toCharArray()); // String��  char �迭�� ������.
		writer1.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�.\n"); //String �״�� ǥ��
		writer1.write("Good Bye!!!\n\n");
		writer1.flush();
		
	} catch (IOException e) {}

	//2. FileWriter�� ���ؼ� ������ ���� (Default: MS949���� UTF8�� �ۼ�)
	System.out.println("=========================================");
	System.out.println("2. Fil��eWriter�� ���ؼ� ������ ���� (Default: MS949���� UTF8�� �ۼ�)");System.out.println();
	
	try (OutputStream os1 = new FileOutputStream(osw2);
		OutputStreamWriter osw3 = new OutputStreamWriter(os1, "UTF-8");){ 
		// OutputStreamWriter: byte Ÿ���� char Ÿ������ ������
		
		osw3.write("outputStreamWriter1 ���������Դϴ�. \n".toCharArray()); // String��  char �迭�� ������.
		osw3.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�.\n"); //String �״�� ǥ��
		osw3.write("Good Bye!!!\n\n");
		osw3.flush();
		
	} catch (IOException e) {}
	
	
		
	//�����ǳ�
	}
}
