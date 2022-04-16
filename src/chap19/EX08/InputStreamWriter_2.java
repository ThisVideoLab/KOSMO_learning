package chap19.EX08;

import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 Reader / Writer : �߻� Ŭ����, char�� ó����, ���� (0), �̹���(x), MP3(x)  ���
 FileReader  / FileWriter : �߻� Ŭ������ Reader�� Writer�� ��ӹ޾� �ϼ��� Ŭ����. default charset�� ���
 InputStreamReader / OutputStreamWriter : ���� �� ���ڵ� (MS949, UTF-8) �����ؼ� �б�, ���⵵ ���ڵ� (MS949,UTF-8) �����ؼ� ���� ������.
 
 ����: System.in & System.out : �ֿܼ��� ������� ����ϴ� �ڵ��ε�, �ѹ� close()�Ǹ� ���̻� ����� ���� ����. ����  close()�ȵ� ���¶�,
	  						   �������� System.in & System.out�� �ߺ��ǰ� ��Ƴ����� �Է� ������ ������ ���ϴ� �ٴ�� ���� ����� �� �� ���� ��.
 
 */

public class InputStreamWriter_2 {
	public static void main(String[] args) {
		
	//1. �ܼ� ��� (Default: MS949) (application Default : MS949 -> MS949)
	System.out.println("=========================================");
	System.out.println("1. �ܼ� ��� (Default: MS949) (application Default : MS949 -> MS949)");System.out.println();
		
	try (OutputStreamWriter osw1 = new OutputStreamWriter(System.out,"MS949");){

		osw1.write("outputStreamWriter1 ���������Դϴ�. \n".toCharArray()); // String��  char �迭�� ������.
		osw1.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�.\n"); //String �״�� ǥ��
		osw1.write("Good Bye!!!\n\n");
		osw1.flush();
		
	} catch (IOException e) {}
	
	//2. �ܼ� ��� (Default: MS949) (application Default : MS949 -> UTF-8)
	System.out.println("=========================================");
	System.out.println("2. �ܼ� ��� (Default: MS949) (application Default : MS949 -> UTF-8)");System.out.println();
	
	try (OutputStreamWriter osw2 = new OutputStreamWriter(System.out,"MS949");){

		osw2.write("outputStreamWriter1 ���������Դϴ�. \n".toCharArray()); // String��  char �迭�� ������.
		osw2.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�.\n"); //String �״�� ǥ��
		osw2.write("Good Bye!!!\n\n");
		osw2.flush();
		
	} catch (IOException e) {}
		
		
		
		
		
		
		
		
		
		
	//�����ǳ�
	}
}
