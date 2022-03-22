package chap14;

import java.util.Scanner;

//1. Error : ���α׷��Ӱ� ������ �� ���� �κ�, OS���� �߻��ϴ� Error, Hardware���� �߻��ϴ� Error
//2. Exception: ���α׷��Ӱ� ������ �� �ִ� �κ�, ���ܰ� �߻��ϸ� ���α׷��� ����Ǿ����.
//3. ArithmeticException : � ���� 0���� ������ �߻��ϴ� ����. �츮�� ���������� �˰� ������, ��ǻ�ʹ� 0���� ������ ���� ������� ����.

public class CheckedException_1_1 {
	public static void main(String[] args) {
		
		System.out.println("���� �� �ϳ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in); 
		
		int a = scan.nextInt();
		int b = 20;
		
		try {
			System.out.println(b/a); 	
		}catch (ArithmeticException e){ // try ������ ������ �߻��ÿ� �۵��ϴ� �κ�// �̻������ ��ŵ��.
			System.out.println("�ùٸ� �Է°��� �ƴմϴ�.");
			// e.printStackTrace(); // ������ �����ؼ� �˷��ִ� �ڵ�
			
		}finally { // ������ ��� ���� �׻� �۵��ϴ� �κ� // ���ʿ� ��︮�� ��Ʈ�� �������߰ڱ�
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
}
