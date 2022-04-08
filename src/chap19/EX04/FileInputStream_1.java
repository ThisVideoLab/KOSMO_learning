package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {
	public static void main(String[] args) throws IOException{

	//���� �۾� ���丮 ��ġ Ȯ��
		
		System.out.println(System.getProperty("user.dir"));
		
		//1. �Է����� ����
		
		//���� ��� ���� : �ش� ������ ������ ��ġ�� ���� ��� - �׷��� ������Ʈ�� ���� �������� ��ġ�� �ٲ�� ������ �߻���
		File inFile1 = new File("C:\\Users\\kosmo\\git\\KOSMO_learning\\src\\chap19\\files\\FileInputStream1.txt");
		
		//����η� ���� : �ش� ������ ������Ʈ ���� �ȿ��� ������. �̴� ������Ʈ�� �Űܵ� ��������� �������� ��ġ����
		File inFile = new File("src\\chap19\\files\\FileInputStream1.txt");
		
		//2. InpoutStream ��ü�� �����ؾ� ������ ������ ���� �� ����.
		InputStream is = new FileInputStream(inFile); // InputStream�� �߻� Ŭ������ ��ü�� ���� ������ �Ұ����ϸ�, Ÿ�� ������ ������.
		
		
		 // ������ ������ ���.
	      
	      // UTF-8 : ���� : 1byte, �ѱ��� : 3byte
	      // MS949 : ���� : 1byte, �ѱ��� : 2 byte
	      // EUC-KR : ���� : 1byte, �ѱ��� : 2byte
	      // UTF-16 : ����, �ѱ� : 2byte , ù��° BOM 2byte <= �ĺ���
	      
	      
	      System.out.print(is.read());
	      System.out.print((char)is.read()); // read()�� �о�� ���� �ѱ��ھ� �ѹ���Ʈ�� �о����
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      
	      System.out.println();
	      System.out.println();
	      
	      // ��Ʈ���� ���� ������ �޸𸮿��� �����ȴ�. ������ ���� ���ؼ��� ���ο� ��Ʈ���� �ۼ��ؾ� �Ѵ�.
	      
	      //int read(): �� ����Ʈ�� �о ����Ÿ������ ����, ���� �����Ͱ� �������� ���� ��� -1�� �������� 
	      // while���� ����ؼ� �ѹ��� ���
	      
	      InputStream is1 = new FileInputStream(inFile);
	      
	      int data;
	      
	      while ((data = is1.read())!= -1) { // is1�� ���� read() �� ���� -1�� �ƴ϶�� ����ϴ� ����.
	    	  System.out.print((char) data);
	      }
	      
	      System.out.println();
	      System.out.println();
	      
	      InputStream is2 = new FileInputStream(inFile);
	      
	      while ((data = is2.read())!= -1) { // is1�� ���� read() �� ���� -1�� �ƴ϶�� ����ϴ� ����.
	    	  System.out.println("���� ������: " + (char) data + "  ���� ����Ʈ ��: " + is2.available());
	      }
	      
	      
	//�����ǳ�
	}
}
