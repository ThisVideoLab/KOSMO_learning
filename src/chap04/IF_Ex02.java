package chap04;
import java.util.Scanner;
public class IF_Ex02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�����ڸ� �Է����ּ���");
		char operator = scn.next().charAt(0);
		
		int num1 = 10;
		int num2 = 2;
				
		int result = 0;
		
		if( operator == '+') {
			result = num1 +num2;
		}

		else if(operator == '-'){
			result = num1 - num2;
		}
		else if(operator == '*'){
			result = num1 * num2;
		}
		else if(operator == '/'){
			result = num1 / num2;
		} 

		else {
			System.out.println("������ �����Դϴ�.");
		}
		System.out.println("��� ���� :" + result + "�Դϴ�.");
		scn.close();
	}

}
