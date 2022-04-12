package chap19.EX05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// InputStream�� �߻� Ŭ������. �̰��� ��üȭ ��Ų Ŭ������ FileInputStream
// InputStream�� �߻� Ŭ������. �̰��� ��üȭ ��Ų Ŭ������ FileOutputStream
// FileInputStream : byte() ������ ������ �б�
// FileOutputStream : byte() ������ ������ ����

// window���� �ܼ��̳� �޸��忡�� enter Ű�� ������ \r\n

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {
		
		//1. �Է� ���� ���� (�������� ����)
		File outfile = new File ("src/chap19/EX05/FileOutputStream_1.txt");

		//2. 1 -byte �б�
		OutputStream os1 = new FileOutputStream(outfile);
			// FileOutputStream�� �������� �ʴ� ������ ������ ����� ������.
			// FileOutputStream ��ο� �����ؾ� �ϰ�, �ƴϸ� ���ܰ� �߻���.
		
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r'); // 13 ���� // ��������
		os1.write('\n'); // 10 ����
		
		// �߿� : write() �޼���� ����(RAM)�� ����,
		//       flush() �޼���� ���ۿ� ����� ������ ���Ͽ� ������ ��.
		os1.flush(); // ���۰� ������ �ʴ��� ������ ���Ͽ� ���⸦ �� <= ���� ������ write()�� flush() �Բ� ����� ���� ������.
		os1.close(); // close() ȣ��� flush()�� ���� �۵���.
		
		//2. n- byte ���� ���� (byte []�� offset���� length���� byte ������ ����
		
		OutputStream os2 = new FileOutputStream(outfile); // ������ ���� ȿ���� �߻���.
							// FileOutputStream(file o, Boolean append); // append = true : �̾��, append = false(�⺻��) : ����� 
		byte [] byeArr1 = "Hello!".getBytes(); // String => byte �� ��ȯ�ϴ� ���� getByte()
		
		os2.write(byeArr1);
		os2.write('\n'); // \r�� ���� ���� \n�� �־ windows���� enter�� ó����.
		
		os2.flush(); // ���۰� ������ �ʴ��� ������ ���Ͽ� ���⸦ �� <= ���� ������ write()�� flush() �Բ� ����� ���� ������.
		os2.close(); // close() ȣ��� flush()�� ���� �۵���.
		
		//3. n- byte ���� ���� (byte []�� offset���� length���� byte ������ ����
		
		OutputStream os3 = new FileOutputStream(outfile, true); // ������ ���� ȿ���� �߻���. // �̾��
		byte[] byteArr2 = "Better the last smile than the first laughter".getBytes();
		os3.write(byteArr2,3,8); // write�϶��� 3����Ʈ �ڿ��� 8byte�� �о ���� 
								 // read�϶��� �ݴ�� ó����.
		os3.flush();
		os3.close();
		
	// ������ ��
	}
}
