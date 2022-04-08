package chap19.EX01;

import java.io.File;
import java.io.IOException;

// ���� : ��Ŭ�������� ������ ������ C:// �� ������ �� ���� ������ ���� ������ �߻��� �� ����.
// �ذ�å : a) ��Ŭ������ ������ �������� �����ϱ�
// ���� ���ο� ������ ������

// File ��ü ���� ���� �ĺ��ڸ� ������ ���
// C:\abc\abc.txt


//1. window�� ���: String path ="C:\\abc\\abc.txt"  "" ���� Ư�����ڸ� ó���ϱ� ���� ��ȣ. \
//2. MAC�� ��� : String path = "C:\abc\abc.txt"

// �ư� ������ ȣȯ�� ���� ���� ��� �ڵ��� �ۼ� 
// String path = "C:"+ File.seperator + "abc" + File.seperator + "abc.txt"


public class CreateFIleObject {
	public static void main(String[] args) throws IOException {
		
		//1. File ��ü�� ����ؼ� ���� ����
		System.out.println("=====================");
		System.out.println("1. File ��ü�� ����ؼ� ���� ����");System.out.println();
		
		File tempDir = new File("C:\\temp01");
		if (!tempDir.exists()) {
			tempDir.mkdir();}
		
		System.out.println(tempDir.exists());
		
		
		//2. File ��ü�� ����ؼ� ���� ����
		System.out.println("=====================");
		System.out.println("2. File ��ü�� ����ؼ� ���� ����");System.out.println();
		
		File tempTxt = new File("C:\\temp01\\tmepTxt.txt"); // 
		if (!tempTxt.exists()) {
			tempTxt.createNewFile();  // ������ ������ �� ���ܰ� �߻��� �� ����. ��� ����ó���� �ʿ���.
		}
		
		//3. ���� ������
		System.out.println("=====================");
		System.out.println("3. ���� ������");System.out.println();
		
		File newFile2 = new File ("C:\\temp01\\newfile01.txt");
		File newFile3 = new File ("C:/temp01/newfile02.txt");
		
		if(!newFile2.exists()) {newFile2.createNewFile();}
		if(!newFile3.exists()) {newFile3.createNewFile();}
		
		File newFile4 = new File("C:" + File.separator + "temp01" + File.separator + "newfile03.txt");
		if(!newFile4.exists()) {newFile4.createNewFile();}
		
		//4. ���� ��� ���� : �ٸ� �ý������� �̵��� ��� �� �ü�ƴ ȯ�濡 �µ��� ������ �ʿ���
		System.out.println("=====================");
		System.out.println("4. ���� ��� ����");System.out.println();
		
		File newFile5 = new File ("C:/temp01/newfile05.txt"); // �����η� ó��
		System.out.println(newFile5.getAbsolutePath()); // file ��ü�� ����� ������ �����θ� �����.
		
		//5. ��� ��η� ó�� : ���� ���� �۾��ϴ� ������ ��ġ�� �˾ƾ� ��.���� �̰� ������
		System.out.println("=====================");
		System.out.println("5. ��� ��η� ó��");System.out.println();
		
		File newFile6 = new File("newFile06.txt");
		if (!newFile6.exists()) {newFile6.createNewFile();}
		System.out.println(newFile6.getAbsolutePath()); // file ��ü�� ����� ������ �����θ� �����.
		
	// ������ ��
	} 
}
