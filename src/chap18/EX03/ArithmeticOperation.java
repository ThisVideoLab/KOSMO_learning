package chap18.EX03;

import java.util.Scanner;

//1. 스캐너를 사용해서 double의 두 수를 인풋 받는다
//2. 방법1) 람다식을 사용해서 인풋받은 두 값을 사칙연산을 구현해서 출력 할 것
//   방법2) 인터페이스를 구현한 자식 객체 사용해서 인풋받은 두 값을 사칙연산을 구현해서 출력 할 것
//   방법3) 익명 이너 클래스안에 구현 한 다음에 구현해볼 것
//   ArithmeticExceptin처리 : 0 으로 나누면 예외처리


interface Arithmetic{
	void arthimeticOpr(double a, double b);
}

class Arithmetic_1 implements Arithmetic{

	@Override
	public void arthimeticOpr(double a, double b) {
		System.out.println("arthimeticOpr입니다");

	}
}


public class ArithmeticOperation {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("계산에 사용할 첫번째 수를 입력하시오");
	Double firstInput = scan.nextDouble();
	System.out.println("계산에 사용할 두번째 수를 입력하시오");
	Double SecondInput = scan.nextDouble();
	scan.close();
	
		
	// 1. 람다식을 사용해서 인풋받은 두 값을 사칙연산을 구현해서 출력 할 것
	//    인터페이스의 추상메서드를 익명 이너 클래스로 생성한 것의 약식 표현임.
	System.out.println("1. 람다식을 사용해서 인풋받은 두 값을 사칙연산을 구현해서 출력 할 것");
	System.out.println();
			
	Arithmetic a1 = (a,b) -> {		
		try {
		System.out.println("더하기: " + (a + b));
		System.out.println("빼　기: " + (a - b));
		System.out.println("곱하기: " + (a * b));
		System.out.println("나누기: " + (a / b));
		} catch (ArithmeticException e) {System.out.println("0으로 나눌 수 없습니다");}
	};
	
	a1.arthimeticOpr(firstInput, SecondInput);
	System.out.println();
	
	// 2. 인터페이스를 구현한 자식 객체 사용
	System.out.println("2. 인터페이스를 구현한 자식 객체 사용");
	System.out.println();
	
	Arithmetic_1 a2 = new Arithmetic_1() {
		public void arthimeticOpr(double a, double b) {
			try {
			System.out.println("더하기: " + (a + b));
			System.out.println("빼　기: " + (a - b));
			System.out.println("곱하기: " + (a * b));
			System.out.println("나누기: " + (a / b));
			} catch (ArithmeticException e) {System.out.println("0으로 나눌 수 없습니다");}
		}
	};
	a2.arthimeticOpr(firstInput, SecondInput);
	System.out.println();
	
	// 3. 익명 내부 클래스를 이용한 람다식의 처리
	System.out.println("3. 익명 내부 클래스를 이용한 람다식의 처리");
	System.out.println();
	
	Arithmetic a3 = new Arithmetic_1(){
		@Override
		public void arthimeticOpr(double a, double b) {
			try {
			System.out.println("더하기: " + (a + b));
			System.out.println("빼　기: " + (a - b));
			System.out.println("곱하기: " + (a * b));
			System.out.println("나누기: " + (a / b));
			} catch (ArithmeticException e) {System.out.println("0으로 나눌 수 없습니다");}
			
		}
	};
	a3.arthimeticOpr(firstInput, SecondInput);
		
		
	//문서의끝
	}
}
