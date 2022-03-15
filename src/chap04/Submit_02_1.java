package chap04;
import java.util.Scanner;
public class Submit_02_1{

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
			break;
			case '-':
				result = num1 - num2;
			break;
			case '/':
				result = num1 / num2;
			break;
			case '*':
				result = num1 * num2;
					
			break; //중간의 중복된 브레이크를 없애고 result 값이 나온 뒤에만 넣어 default와 분리했습니다.
			
			default:
				System.out.println("연산자 오류입니다"); 
		}
		System.out.println("결과 값은 :" + result + "입니다."); //연산자 오류일때도 값이 0이라고 나오는 것을 없애기 위해 print 를 위로 올렸습니다.
		scn.close();
		
	}

}

