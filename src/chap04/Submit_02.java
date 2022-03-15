package chap04;
import java.util.Scanner;
public class Submit_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("연산자를 입력하시기 바랍니다");
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
			
		System.out.println("결과 값은 :" + result + "입니다.");	
		break;
		
		default:
			System.out.println("연산자 오류입니다");
	}
		
		scn.close();
		
	}

}
