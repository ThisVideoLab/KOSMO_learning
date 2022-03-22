package chap14;

import java.util.Scanner;

//1. Error : 프로그래머가 제어할 수 없는 부분, OS에서 발생하는 Error, Hardware에서 발생하는 Error
//2. Exception: 프로그래머가 제어할 수 있는 부분, 예외가 발생하면 프로그램이 종료되어버림.
//3. ArithmeticException : 어떤 수를 0으로 나누면 발생하는 예외. 우리는 관념적으로 알고 있지만, 컴퓨터는 0으로 나누는 것을 계산하지 못함.

public class CheckedException_1_1 {
	public static void main(String[] args) {
		
		System.out.println("정수 값 하나를 입력하세요");
		Scanner scan = new Scanner(System.in); 
		
		int a = scan.nextInt();
		int b = 20;
		
		try {
			System.out.println(b/a); 	
		}catch (ArithmeticException e){ // try 블럭에서 오류가 발생시에 작동하는 부분// 이상없으면 스킵함.
			System.out.println("올바른 입력값이 아닙니다.");
			// e.printStackTrace(); // 오류를 추적해서 알려주는 코드
			
		}finally { // 오류에 상관 없이 항상 작동하는 부분 // 양쪽에 어울리는 멘트를 출력해줘야겠군
			System.out.println("프로그램을 종료합니다.");
		}
	}
}
