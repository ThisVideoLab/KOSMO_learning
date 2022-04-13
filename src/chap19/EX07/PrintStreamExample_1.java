package chap19.EX07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

//PrintStream : filterStream �� �ϳ���, �߰������ �����ϴ� stream���� ��� ��Ʈ���� �ʿ���.
//				�پ��� ��¿� Ưȭ�� ��Ʈ������, flush()�� ȣ������ �ʾƵ� �ڵ����� flush����
//              print(), println(), printf() ���� ������
//              ���� ��� , �ܼ� ��µ �̵���.

public class PrintStreamExample_1 {
	public static void main(String[] args) {
		
		//1. File ��ü ����.
		File outFile1 = new File("src/chap19/EX07/printstream1.txt");
		File outFile2 = new File("src/chap19/EX07/printstream2.txt");
		
		//2. PrintStream (FileOutputStream(File)) : ���� �ƿ� ��Ʈ���� ����ؼ� ���Ͽ� ���
		
		try (OutputStream os1 = new FileOutputStream(outFile1);
			PrintStream ps1 = new PrintStream(os1);){ // FilterStream���� �߰������ �����ϴ� ��Ʈ��, �ݵ�� ��� ��Ʈ���� �ʿ���
			ps1.println(7); // int ���
			ps1.println(5.8);  // double ���, println() <== ��� �� ���� ����
			ps1.print(3 + "�ȳ�" + 12345 + '\n'); // ���� ���, print() ��� �� ���� �̰��� => �׷��� '\n'�� �־ ���� ����ó��
			ps1.printf("%d �� ȣ��Ǿ����ϴ�.\n", 7 ); // "%d"�� ��ġ�� ���� ���� 7�� �����
			ps1.printf("%s %f", "�ȳ�", 5.8); // %s : ���� string ���� ȣ����. / %f ���� double���� ȣ����
		} catch (IOException e) {}
		
		//3. PrintStream(File) : ���Ͽ� ���� ���
		
		try (PrintStream ps2 = new PrintStream(outFile2);){ // FilterStream���� �߰������ �����ϴ� ��Ʈ��, �ݵ�� ��� ��Ʈ���� �ʿ���
			 ps2.println(7); // int ���
			 ps2.println(5.8);  // double ���, println() <== ��� �� ���� ����
			 ps2.print(3 + "�ȳ�" + 12345 + '\n'); // ���� ���, print() ��� �� ���� �̰��� => �׷��� '\n'�� �־ ���� ����ó��
			 ps2.printf("%d �� ȣ��Ǿ����ϴ�.\n", 7 ); // "%d"�� ��ġ�� ���� ���� 7�� �����
			 ps2.printf("%s %f", "�ȳ�", 5.8); // %s : ���� string ���� ȣ����. / %f ���� double���� ȣ����
		} catch (IOException e) {}
		
		//4. PrintStream ps = System.out < == �ֿܼ� ���
			 // 
		try(
		OutputStream os2 = System.out;
		PrintStream ps3 = new PrintStream(os2);){
			 ps3.println(7); // int ���
			 ps3.println(5.8);  // double ���, println() <== ��� �� ���� ����
			 ps3.print(3 + "�ȳ�" + 12345 + '\n'); // ���� ���, print() ��� �� ���� �̰��� => �׷��� '\n'�� �־ ���� ����ó��
			 ps3.printf("%d �� ȣ��Ǿ����ϴ�.\n", 7 ); // "%d"�� ��ġ�� ���� ���� 7�� �����
			 ps3.printf("%s %f", "�ȳ�", 5.8); // %s : ���� string ���� ȣ����. / %f ���� double���� ȣ����
		}catch (IOException e) {}
		
		//5. PrintStream ps = System.out < == �ֿܼ� ���
		
		try(
			PrintStream ps4 = System.out;){
			 ps4.println(7); // int ���
			 ps4.println(5.8);  // double ���, println() <== ��� �� ���� ����
			 ps4.print(3 + "�ȳ�" + 12345 + '\n'); // ���� ���, print() ��� �� ���� �̰��� => �׷��� '\n'�� �־ ���� ����ó��
			 ps4.printf("%d �� ȣ��Ǿ����ϴ�.\n", 7 ); // "%d"�� ��ġ�� ���� ���� 7�� �����
			 ps4.printf("%s %f", "�ȳ�", 5.8); // %s : ���� string ���� ȣ����. / %f ���� double���� ȣ����
		}catch (Exception e) {}
		
	//�����ǳ�
	}
}
