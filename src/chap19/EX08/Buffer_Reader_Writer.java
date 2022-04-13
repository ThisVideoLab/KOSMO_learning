package chap19.EX08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Buffer_Reader_Writer {

	public static void main(String[] args) {

	//1. ���� ��ü ����
	File rwFile1 = new File("src/chap19/EX08/BufferedFile.txt");
	
	//2. FileWriter�� ����ؼ� ���� ���� (MS949 ���)
	
	try (Writer writer1 = new FileWriter (rwFile1);) {
		BufferedWriter bw1 = new BufferedWriter(writer1); // ������ ����ϱ� ���� Filter, ���������� �⺻ Writer�� �ʿ�� ��.
		
		bw1.write("�ȳ��ϼ���\n");
		bw1.write("Hello");
		bw1.write("\r");
		bw1.write("\n");
		bw1.write("�ݰ����ϴ�",2,3); // String, offset, length
		bw1.flush();
		
	} catch (IOException e) {}
	
	//3. FileReader�� �̿��� ���� �б� (Charset default: MS949 ���) 
	
	try(Reader reader1 = new FileReader(rwFile1);
		BufferedReader br1 = new BufferedReader(reader1);){
		// BufferedReader�� �߰��� �޼��� String readLine() : �� ���ξ� �о��. ���̻� ���� �� ���� ���¸� null�� ������.
		// read()�� ������ Ÿ���� int�� ���� �ٸ�. 1-byte �� �о��. ���̻� ���� �� ���� ���¸� -1�� ������.
		
		String data;
		
		while ((data = br1.readLine()) != null) {
			System.out.println(data);
		}
		
	}catch (IOException e) {}
	
	
		
	//�����ǳ�
	}
}
