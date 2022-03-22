package chap14;

import java.util.Scanner;

//1. Error : 프로그래머가 제어할 수 없는 부분, OS에서 발생하는 Error, Hardware에서 발생하는 Error
//2. Exception: 프로그래머가 제어할 수 있는 부분, 예외가 발생하면 프로그램이 종료되어버림.
//3. ArithmeticException : 어떤 수를 0으로 나누면 발생하는 예외. 우리는 관념적으로 알고 있지만, 컴퓨터는 0으로 나누는 것을 계산하지 못함.

public class CheckedException_1 {
	public static void main(String[] args) {
		
		System.out.println("정수 값 하나를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		int b = 10;
		
		try { // try 블럭: try 블럭에서 예외 (Exception)이 발생한 경우
			System.out.println((b/a));
		}catch (ArithmeticException e) { // catch 블럭: try 블럭에서 오류가 발생할 경우 catch {}블럭이 작동함
		System.out.println("오류가 발생했습니다. 0으로 나눌 수 없습니다. 다른 수를 넣어주세요");
		}finally {
			System.out.println("프로그램을 종료합니다");
		}
		
		
	}

}
