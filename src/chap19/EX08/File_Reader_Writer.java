package chap19.EX08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
	Reader / Writer " char ������ �������. ���ڸ� ó���ϵ��� Ưȭ�� �߻� Ŭ����
	// byte: 1-byteT�� �����
	// char: 2-byte �� �����, UTF-16(�����ڵ�)�� ���ڸ� ó����. ���� 2-byte, �ѱ۵� 2-byte, ��������, ������ ��� �� ó����.
	
	FileReader: charset ���� �ɼ��� ����. default charset�� �����.
	FileWriter: charset ���� �ɼ��� ����. default charset�� �����.
	
 */

public class File_Reader_Writer {
	public static void main(String[] args) {
		
		//1. ���� ��ü ����
		File rwFile = new File("src/chap19/EX08/rwFile.txt");
		
		try {Writer writer1 = new FileWriter(rwFile);
		// Writer: char ������ ���, FileWriter�� ������. ���ڸ� Ưȭ�ؼ� ó����.
		// OutputStream: byte ���� ���, �߻� Ŭ����, FileOutputStream���� ������. ����, ������, MP3, JPGM AVG ���� ��� ó���� ������.
		
		writer1.write("�ȳ��ϼ���\n".toCharArray()); // 
		writer1.write("Hello\n");
		writer1.write('A');
		writer1.write('\r');
		writer1.write('\n');
		writer1.write("�ݰ����ϴ�",2,3);
		writer1.flush();
		
		} catch (IOException e) {} // Writer : �߻� Ŭ����, FileWriter: Writer�� ������ �ڽ� Ŭ����
		
		//2. FileReader�� �̿��� ���� �б� (Default Charset : MS949) < == ������ Charset ���� �ɼ��� ��� ����Ʈ�� ����
		
		try (Reader reader1 = new FileReader(rwFile);){
			int data;
			while ((data = reader1.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {}
		
		
	// ������ ��
	}
}
