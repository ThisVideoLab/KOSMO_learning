package chap04;
import java.util.Scanner;
public class Submit_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�����ڸ� �Է��Ͻñ� �ٶ��ϴ�");
		char operator = scn.next().charAt(0);
		
		
		int num1 = 10;
		int num2 = 2;
		int result = 0;
		
		switch (operator) {
		case '+':
			result = num1 +num2;
		case '-':
			result = num1 - num2;
		case '/':
			result = num1 / num2;
		case '*':
			result = num1 * num2;
			
		System.out.println("��� ���� :" + result + "�Դϴ�.");	
		break;
		
		default:
			System.out.println("������ �����Դϴ�");
	}
		
		scn.close();
		
	}

}
