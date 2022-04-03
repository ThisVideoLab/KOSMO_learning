package chap14.EX03;

import java.util.Scanner;

//여러개의 Exception이 동시에 발생될 경우에 처리하는 것을 multiCatch라고 부름


public class MultiCatch_1 {
	public static void main(String[] args) {

		//1. 단일 Exception의 처리 try catch 처리는 예전 학습 파일 참조
		
		System.out.println("========================");

		//2. ArithmaticException 으로 처리 -> 트라이 블럭으로 처리, 캐치 블럭 생성
		
		System.out.println("0을 입력해 보세요");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = 10;
		try {
			System.out.println(10/0);
		}catch (ArithmeticException e){
			//catch 블락에 아무 내용이 없어도 예외처리는 이루어짐.
		System.out.println("오류가 발생했습니다. 0으로 나눌 수 없습니다.");
		System.out.println("예외 처리 후에 연산을 계속합니다.");
		}finally { // finally 구문은 없어도 무방함.
		}
		
		System.out.println("========================");
		
		//3. NumberFormatException
		try {
			int num =Integer.parseInt("10A");	
		}catch (NumberFormatException e){
			System.out.println("정상 출력 (NumberFormatException)");
		}
		
		System.out.println("========================");
		
		//4. 다중 Exception 처리 - 가장 기초적이고 정직한 형태의 다중 catch문
		
		try { //try 블럭에서 여러 예외가 발생될 수 있으므로 예측 가능한 예외처리 구문을 미리 작성해서 처리함
			System.out.println(10/0);
			int num2 = Integer.parseInt("10A");
		}catch (ArithmeticException e){
			System.out.println("0 ArithmeticExcept 출력");
		}catch (NumberFormatException  e){
			System.out.println("1 NumberFormatExcept 출력");
		}
		
		System.out.println("프로그램 종료");
		
		//5. 다중 Exception 처리 2 - 보통 여러 구문을 이 방식으로 많이 처리함.
		try {
			System.out.println(10/0);
			int num3 = Integer.parseInt("10A");	
		}catch (ArithmeticException | NumberFormatException e){ // 이와 같이 연산자를 활용해서 ~중 하나라면의 방식으로 처리도 가능함.
			System.out.println("다중 예외 처리");
		}
		
		//문서의 끝
	}
}
