package chap19.EX07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
// InputStream: ��� ��Ʈ��
	// int 5555�� �Է��ϸ� �� byte ������ �о ����  �� �Ŀ� �װ� �ٽ� ������ �ڿ� int 5555�� �����
// DataInputStream: �߰������ �����ϴ� ��Ʈ��, ��� ��Ʈ���� �ݵ�� ����, �ܵ����� ����� �� ����.
   // �پ��� ������ �����͸� ������ ������ �� �����.
   // int  ==> int, double => double ������ �ٷιٷ� �������� ������.


public class DataInputStream_learing {
	public static void main(String[] args) {
		
		//1. ���� ����
		File dataFile = new File ("src/chap19/EX07/file1.data");
		
		//2. ������ ����
		
		try (OutputStream os = new FileOutputStream(dataFile);
			DataOutputStream dos = new DataOutputStream(os);) // �� DataOutputStream�� �߰��������, �ݵ�� OutputStream�� ���� ��� ��Ʈ���� �ʿ���.
		{
			dos.write(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���");
			dos.flush();
			dos.close();
			
		} catch (Exception e) {} // ��� ������ �ֻ��� Ŭ���� Exception : ���� ��� ���� ó�� ����
		
		
		//3. ������ �б�
		
		try (InputStream is = new FileInputStream(dataFile);
			DataInputStream dis = new DataInputStream(is);)
			{
			System.out.println(dis.read());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {

		}

	// �����ǳ�
	}
}
