package chap18.EX03;

import java.util.Scanner;

//1. ��ĳ�ʸ� ����ؼ� double�� �� ���� ��ǲ �޴´�
//2. ���1) ���ٽ��� ����ؼ� ��ǲ���� �� ���� ��Ģ������ �����ؼ� ��� �� ��
//   ���2) �������̽��� ������ �ڽ� ��ü ����ؼ� ��ǲ���� �� ���� ��Ģ������ �����ؼ� ��� �� ��
//   ���3) �͸� �̳� Ŭ�����ȿ� ���� �� ������ �����غ� ��
//   ArithmeticExceptinó�� : 0 ���� ������ ����ó��


interface Arithmetic{
	void arthimeticOpr(double a, double b);
}

class Arithmetic_1 implements Arithmetic{

	@Override
	public void arthimeticOpr(double a, double b) {
		System.out.println("arthimeticOpr�Դϴ�");

	}
}


public class ArithmeticOperation {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("��꿡 ����� ù��° ���� �Է��Ͻÿ�");
	Double firstInput = scan.nextDouble();
	System.out.println("��꿡 ����� �ι�° ���� �Է��Ͻÿ�");
	Double SecondInput = scan.nextDouble();
	scan.close();
	
		
	// 1. ���ٽ��� ����ؼ� ��ǲ���� �� ���� ��Ģ������ �����ؼ� ��� �� ��
	//    �������̽��� �߻�޼��带 �͸� �̳� Ŭ������ ������ ���� ��� ǥ����.
	System.out.println("1. ���ٽ��� ����ؼ� ��ǲ���� �� ���� ��Ģ������ �����ؼ� ��� �� ��");
	System.out.println();
			
	Arithmetic a1 = (a,b) -> {		
		try {
		System.out.println("���ϱ�: " + (a + b));
		System.out.println("������: " + (a - b));
		System.out.println("���ϱ�: " + (a * b));
		System.out.println("������: " + (a / b));
		} catch (ArithmeticException e) {System.out.println("0���� ���� �� �����ϴ�");}
	};
	
	a1.arthimeticOpr(firstInput, SecondInput);
	System.out.println();
	
	// 2. �������̽��� ������ �ڽ� ��ü ���
	System.out.println("2. �������̽��� ������ �ڽ� ��ü ���");
	System.out.println();
	
	Arithmetic_1 a2 = new Arithmetic_1() {
		public void arthimeticOpr(double a, double b) {
			try {
			System.out.println("���ϱ�: " + (a + b));
			System.out.println("������: " + (a - b));
			System.out.println("���ϱ�: " + (a * b));
			System.out.println("������: " + (a / b));
			} catch (ArithmeticException e) {System.out.println("0���� ���� �� �����ϴ�");}
		}
	};
	a2.arthimeticOpr(firstInput, SecondInput);
	System.out.println();
	
	// 3. �͸� ���� Ŭ������ �̿��� ���ٽ��� ó��
	System.out.println("3. �͸� ���� Ŭ������ �̿��� ���ٽ��� ó��");
	System.out.println();
	
	Arithmetic a3 = new Arithmetic_1(){
		@Override
		public void arthimeticOpr(double a, double b) {
			try {
			System.out.println("���ϱ�: " + (a + b));
			System.out.println("������: " + (a - b));
			System.out.println("���ϱ�: " + (a * b));
			System.out.println("������: " + (a / b));
			} catch (ArithmeticException e) {System.out.println("0���� ���� �� �����ϴ�");}
			
		}
	};
	a3.arthimeticOpr(firstInput, SecondInput);
		
		
	//�����ǳ�
	}
}
