package chap14.EX01;

import java.util.Scanner;

//1. Error : 프로그래머가 제어할 수 없는 부분, OS에서 발생하는 Error, Hardware에서 발생하는 Error
//2. Exception: 프로그래머가 제어할 수 있는 부분, 예외가 발생하면 프로그램이 종료되어버림.
//3. 예외는 다시 cheked와 unchecked로 나뉨. 여기서 check를 하는 주체는 컴파일러로, 다시 말하자면 컴파일러가
//   예측 가능한 예외와 예측이 불가능해서 컴파일시에는 정상이나 실행 단계에서 발생하는 예외가 있음.
//   이를 두고 checked는 일반 예외, unchecked는 실행예외라고 부름. 		


public class CheckedException_1 {
	public static void main(String[] args) {
		
		//4. ArithmeticException : 어떤 수를 0으로 나누면 발생하는 예외. 우리는 관념적으로 알고 있지만, 컴퓨터는 0으로 나누는 것을 계산하지 못함.
		//5. 이 ArithmeticException 이 일어나는 과정을 try catch문을 통해 다루면서 예외처리에 대한 기본 개념을 익혀보자
		
		System.out.println("정수 값 하나를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		int b = 10;
		
		try { // try 블럭: try 블럭에서 예외 (Exception)이 발생한 경우
			System.out.println((b/a));
		}catch (ArithmeticException e) { // catch 블럭: try 블럭에서 오류가 발생할 경우 catch {}블럭이 작동함
										 // Arithmetic 예외는 수를 0으로 나눌 경우에 발생함.
		e.printStackTrace(); // 가끔 오류문구가 다 출력되기도 전에 다음 구문이 출력되어서 오류가 나뉘어서 나오기도 함.
		System.out.println("오류가 발생했습니다. 0으로 나눌 수 없습니다. 다른 수를 넣어주세요");
		}finally { //어찌 되었건 간에 출력되는 구문으로 반드시 작동해야할 구문을 주로 넣음. 물론 필요없다면 생략하기도 함.
			System.out.println("프로그램을 종료합니다");
		}
		
		
	}

}
