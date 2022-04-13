package chap19.EX07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


//�ϳ��� ��� ��Ʈ���� Filter ��Ʈ���� ������ ȥ���ؼ� ����� ������
//���� �������� ó���ϴ� ��Ʈ���� �޼��� ��뿩�ο� ���� ������ ���� �� ����.

//��ݽ�Ʈ�� 1: FileOutputStream : ��� ��Ʈ��, ���Ͽ� ���� ������ ���
//FilterStream 1: BufferedOutputStream : ���۸� ����� �ӵ� ���
//FilterStream 1: DataOutputStream : �پ��� ���� ������� ó��

public class combineFilterStream {
	public static void main(String[] args) {
		
		//1. ���� ����
		File dataFile = new File ("src/chap19/EX07/file2.data");
		
		//2. ������ ����
		try (OutputStream os = new FileOutputStream(dataFile);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			DataOutputStream dos = new DataOutputStream(bos);)
		{
			dos.write(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���");
			dos.flush();
			
		} catch (Exception e) {} // ��� ������ �ֻ��� Ŭ���� Exception : ���� ��� ���� ó�� ����
		
		//3. ������ �б�
		
		try (InputStream is = new FileInputStream(dataFile);
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);)
			{
			System.out.println(dis.read());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {}
		
	// �����ǳ�
	}
}
