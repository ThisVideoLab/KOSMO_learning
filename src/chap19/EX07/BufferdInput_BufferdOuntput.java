package chap19.EX07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// BufferdInputStream : InputStream�� ���͸� �����ؼ� �б� ������ ���� ������ �� ��Ʈ��. �ܵ����� ����� �Ұ����� ��� ��Ʈ���� �߰��ؼ� �����.
// BufferdOuntputStream : OutputStream�� ���͸� �����ؼ� �б� ������ ���� ������ �� ��Ʈ��. �ܵ����� ����� �Ұ����� ��� ��Ʈ���� �߰��ؼ� �����.

public class BufferdInput_BufferdOuntput {
	public static void main(String[] args) {
		
		//1. �� ������ �����ؼ� Bufferd�� ������� �ʰ� ó���ϴ� ���, Bufferd�� ����� ��츦 ���غ���
		
		
		File orgfile1 = new File ("src/chap19/EX07/mycat_origin.jpg"); // ��������
		File copyfile1 = new File ("src/chap19/EX07/mycat_copy1.jpg"); // Bufferd�� ������� �ʰ� ó���ϴ� ���
		File copyfile2 = new File ("src/chap19/EX07/mycat_copy2.jpg"); //Bufferd�� ����� ���

		// ���� ������ �ϱ� ���� ���� ����
		long start, end, time1, time2; // time1: Buffered ���� / time2 : Buffered ������
		
		
		//2. Bufferd�� ������� �ʰ� ó���ϴ� ���
		System.out.println("====================================");
		System.out.println("2. Bufferd�� ������� �ʰ� ó���ϴ� ���");System.out.println();
		
		start = System.nanoTime(); // ���۽ð�
		
		try (InputStream is = new FileInputStream(orgfile1);
			OutputStream os = new FileOutputStream(copyfile1);
				) {
			//����Ÿ ���� �ڵ� ����
			
			int data;
			while ((data = is.read()) != -1) { // is���� 1-byte�� �о �ҷ����� �� 
				os.write(data);  // os�� 1-byte�� �� �ִ´�. �ٸ� �̴� buffer ���� (RAM) ��.
			}
		} catch (IOException e) {}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without Buffered Input & Output Stream : " + time1); // ���۸� ������� �ʰ� ���� -> �� ��� copy1.jpg ������ �������.
		
		
		//3. Bufferd�� ����ؼ� ó���ϴ� ���
		System.out.println("====================================");
		System.out.println("3. Bufferd�� ����ؼ� ó���ϴ� ���");System.out.println();
		
		
		start = System.nanoTime(); // ���۽ð�
		
		try (InputStream is = new FileInputStream(orgfile1);
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream(copyfile2);
			BufferedOutputStream bos = new BufferedOutputStream(os);
				){ 
			// ������ �ڵ� ����
			int data;
			while ((data = bis.read()) != -1) { // is���� 1-byte�� �о �ҷ����� �� 
				bos.write(data);  // bos�� 1-byte�� �� �ִ´�. �ٸ� �̴� buffer ���� (RAM) ��.
			}
		} catch (IOException e) {}
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With Buffered Input & Output Stream : " + time2); // ���۸� ������� �ʰ� ���� -> �� ��� copy1.jpg ������ �������.
		
		//4. Buffered ����� ��� (time2), ������� �ʴ� ��� (time1)�� ��
		System.out.println("====================================");
		System.out.println("4. Buffered ����� ��� (time2), ������� �ʴ� ��� (time1)�� ��");System.out.println();
		
		System.out.println("buffer ��� ȿ�� : " + (time1/time2) +"�� �ӵ� ���");
		
		
		
		
		
		
		
		System.out.println("===================================================");
		
		//5. �� ������ �����ؼ� Bufferd�� ������� �ʰ� ó���ϴ� ���, Bufferd�� ����� ��츦 ���غ���
		
		
		File orgfile2 = new File ("src/chap19/EX07/������1.mp4"); // ��������
		File copyfile3 = new File ("src/chap19/EX07/������1copy1.mp4"); // Bufferd�� ������� �ʰ� ó���ϴ� ���
		File copyfile4 = new File ("src/chap19/EX07/������1copy2.mp4"); //Bufferd�� ����� ���

		// ���� ������ �ϱ� ���� ���� ����
		
		//6. Bufferd�� ������� �ʰ� ó���ϴ� ���
		System.out.println("====================================");
		System.out.println("6. Bufferd�� ������� �ʰ� ó���ϴ� ���");System.out.println();
		
		start = System.nanoTime(); // ���۽ð�
		
		try (InputStream is = new FileInputStream(orgfile2);
			OutputStream os = new FileOutputStream(copyfile3);
				) {
			//����Ÿ ���� �ڵ� ����
			
			int data;
			while ((data = is.read()) != -1) { // is���� 1-byte�� �о �ҷ����� �� 
				os.write(data);  // os�� 1-byte�� �� �ִ´�. �ٸ� �̴� buffer ���� (RAM) ��.
			}
		} catch (IOException e) {}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without Buffered Input & Output Stream : " + time1); // ���۸� ������� �ʰ� ���� -> �� ��� copy1.jpg ������ �������.
		
		
		//7. Bufferd�� ����ؼ� ó���ϴ� ���
		System.out.println("====================================");
		System.out.println("7. Bufferd�� ����ؼ� ó���ϴ� ���");System.out.println();
		
		
		start = System.nanoTime(); // ���۽ð�
		
		try (InputStream is = new FileInputStream(orgfile2);
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream(copyfile4);
			BufferedOutputStream bos = new BufferedOutputStream(os);
				){ 
			// ������ �ڵ� ����
			int data;
			while ((data = bis.read()) != -1) { // is���� 1-byte�� �о �ҷ����� �� 
				bos.write(data);  // bos�� 1-byte�� �� �ִ´�. �ٸ� �̴� buffer ���� (RAM) ��.
			}
		} catch (IOException e) {}
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With Buffered Input & Output Stream : " + time2); // ���۸� ������� �ʰ� ���� -> �� ��� copy1.jpg ������ �������.
		
		//8. Buffered ����� ��� (time2), ������� �ʴ� ��� (time1)�� ��
		System.out.println("====================================");
		System.out.println("8. Buffered ����� ��� (time2), ������� �ʴ� ��� (time1)�� ��");System.out.println();
		
		System.out.println("buffer ��� ȿ�� : " + (time1/time2) +"�� �ӵ� ���");
		
	//�����ǳ�
	}
}
