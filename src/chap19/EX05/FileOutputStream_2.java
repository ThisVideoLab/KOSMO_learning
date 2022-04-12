package chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

//FileOutPutStream�� ����ؼ� �ѱ� ó��.

public class FileOutputStream_2 {
	public static void main(String[] args) throws IOException {
		
		//1. ������ ���� ����.
		File outFile = new File("src/chap19/EX05/FileOutPutStream_2.txt"); // �⺻���� ������ ��Ŭ������ default charactorSet���� ����.
		
		//2. n-byte ���� ���� ó�� (byte[] �迭�� ó������ ������ ����)
		OutputStream os2 = new FileOutputStream(outFile);
		byte[] byteArr1 = "�ȳ��ϼ���".getBytes(); // String�� byte �迭�� ������.
			  // �ѱ��ڿ� 2byte�� ó�� ��. �� 10byte
		os2.write(byteArr1);
		os2.write('\n');
		
		os2.flush();
		os2.close();
		
		//2. n-byte ���� ���� ó�� (byte[]�� offset���� length���� ����Ʈ ������ ����
		OutputStream os3 = new FileOutputStream(outFile,true);
		byte[] byteArr2 = "�ݰ����ϴ�.".getBytes(Charset.forName("MS949")); // MS949 �ɸ��ͼ����� ��������
		// byte[] byteArr2 = "�ݰ����ϴ�".getBytes(Charset.defaultCharset()); // �⺻ �ɸ��� ������ ��������
			//write(byte �迭, offset, length)
			//����, ����, Ư������ < == ASCII �ڵ�� 1byte
		
		os3.write(byteArr2,6,5); // 2byte��ŭ �ǳ� �� �Ŀ� 2byte�� �����
		os3.flush();
		os3.flush();
		

		
	//�����ǳ�
	}
}
