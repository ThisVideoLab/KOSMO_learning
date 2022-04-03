package chap14.EX03;

import java.util.Scanner;

//�������� Exception�� ���ÿ� �߻��� ��쿡 ó���ϴ� ���� multiCatch��� �θ�


public class MultiCatch_1 {
	public static void main(String[] args) {

		//1. ���� Exception�� ó�� try catch ó���� ���� �н� ���� ����
		
		System.out.println("========================");

		//2. ArithmaticException ���� ó�� -> Ʈ���� ������ ó��, ĳġ �� ����
		
		System.out.println("0�� �Է��� ������");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = 10;
		try {
			System.out.println(10/0);
		}catch (ArithmeticException e){
			//catch ����� �ƹ� ������ ��� ����ó���� �̷����.
		System.out.println("������ �߻��߽��ϴ�. 0���� ���� �� �����ϴ�.");
		System.out.println("���� ó�� �Ŀ� ������ ����մϴ�.");
		}finally { // finally ������ ��� ������.
		}
		
		System.out.println("========================");
		
		//3. NumberFormatException
		try {
			int num =Integer.parseInt("10A");	
		}catch (NumberFormatException e){
			System.out.println("���� ��� (NumberFormatException)");
		}
		
		System.out.println("========================");
		
		//4. ���� Exception ó�� - ���� �������̰� ������ ������ ���� catch��
		
		try { //try ������ ���� ���ܰ� �߻��� �� �����Ƿ� ���� ������ ����ó�� ������ �̸� �ۼ��ؼ� ó����
			System.out.println(10/0);
			int num2 = Integer.parseInt("10A");
		}catch (ArithmeticException e){
			System.out.println("0 ArithmeticExcept ���");
		}catch (NumberFormatException  e){
			System.out.println("1 NumberFormatExcept ���");
		}
		
		System.out.println("���α׷� ����");
		
		//5. ���� Exception ó�� 2 - ���� ���� ������ �� ������� ���� ó����.
		try {
			System.out.println(10/0);
			int num3 = Integer.parseInt("10A");	
		}catch (ArithmeticException | NumberFormatException e){ // �̿� ���� �����ڸ� Ȱ���ؼ� ~�� �ϳ������ ������� ó���� ������.
			System.out.println("���� ���� ó��");
		}
		
		//������ ��
	}
}
