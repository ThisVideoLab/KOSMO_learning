package chap19.EX02;

import java.io.File;

public class FileMethod {
	public static void main(String[] args) {

		//1. C:\�� �۾� ���� ���� (temp)
		File tempDir = new File("C:/temp");
		if(!tempDir.exists()) {tempDir.mkdir();}
		
		//2. ���� ��ü ���� (C:\windows)
		File file = new File("C:/windows");
		
		//3. ���� ��ü�� ���� �޼��� ���
		System.out.println("���� ��� ���: " + file.getAbsolutePath());
		System.out.println("������ ���� ���� (?): " + file.isDirectory());
		System.out.println("������ ���� ���� (?): " + file.isFile());
		System.out.println("����/������ �̸� ���: " + file.getName()); // ����, ���� �̸� ���
		System.out.println("�θ� ���� ���: " + file.getParent()); // �θ� ������ ���
		System.out.println("=======================================");
		
		File newFile1 = new File("C:/temp01/abc");
		System.out.println(newFile1.mkdir()); // ������ �� ������ ���: true; ������ �����ؼ� �������� ���� ��� false
											  // ���� ������ ���� false: ������ ���ߴ�. (�ش� ������ �����ϴ� ���, ���� ������ ���� �� ���� ���)
		
		System.out.println(newFile1.exists());
		System.out.println("=======================================");
		
		File newFile2 = new File("C:/temp01/abc/bcd/cde"); // �̷��� ���� ������ �Ѳ����� �����ϴ� �͵� ������
		System.out.println(newFile2.mkdir()); // /false, ���� �������� �ѹ��� ������ �ȵ�.
		System.out.println(newFile2.mkdirs()); // true, ���� �������� �ѹ濡 ���� ������
		System.out.println("=======================================");
		
		File newFile3 = new File("C:/temp01/def/hjk/klm");
		System.out.println(newFile3.mkdirs());
		
		//4. file ��ü�� ����ؼ� ���� ������ ������ ������
		
		File[] fname = file.listFiles(); //file: "C:\windows" ������ ��� ������, ������ �̸��� file �迭�� ������
		
		for (File k: fname) {
			System.out.println(k.isDirectory() ? "����: " : "���� :" + k.getName());
		}
		
		
	//������ ��
	}
}
