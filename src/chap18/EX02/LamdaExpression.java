package chap18.EX02;

// 람다식 문법의 형태에 대해 알아보자
// 아래 4개의 인터페이스는 함수가 1개뿐인 함수형 인터페이스기 때문에 람다식으로 처리가 가능함

@FunctionalInterface
interface A { //입력 X, 리턴 X
	void method1();
}

@FunctionalInterface
interface B { //입력 O, 리턴 X
	void method2(int a);
}

@FunctionalInterface
interface C { //입력 X, 리턴 O 
	int method3();
}

@FunctionalInterface
interface D { //입력 O, 리턴 O
	double method4(int a, int b);
}


public class LamdaExpression {
	public static void main(String[] args) {

		// 람다식으로 인터페이스의 구현되지 않은 함수를 구현하기
		
		//1-1. 입력 X, 리턴 X
		System.out.println("=====================");
		System.out.println("1-1. 입력 X, 리턴 X");System.out.println();
		
		A a1 = new A(){
			@Override
			public void method1() {
				System.out.println("메서드 1, a1");
			}
		};
		a1.method1();
		
		//1-2. 위 익명 클래스 람다식으로 처리하기: 람다식은 리턴 타입, 메서드 이름까지 생략하고 사용함. 
		//   형태는 (인풋) -> {구현부}; 형태로만 최대한 간결하게 표현됨
		System.out.println("=====================");
		System.out.println("1-2. 위 익명 클래스 람다식으로 처리하기");System.out.println();
		
		A a2 = () -> {System.out.println("메서드 1, a1");}; // 가장 충실하게 작성된 람다식의 기본형
		A a3 = () -> System.out.println("메서드 1, a3"); // 구현부에 한라인만 존재할 때는 { }; 까지 생략 가능함
		
		a2.method1();
		a3.method1();
		
		//2-1. 입력 O, 리턴 X
		System.out.println("=====================");
		System.out.println("2-1. 입력 O, 리턴 X");System.out.println();
				
				B b1 = new B(){
					@Override
					public void method2(int a) {
						System.out.println("메서드 2, b1");
					}
				};
				b1.method2(0);
		
		//2-2. 람다식 표현을 최대한 압축해보기
		System.out.println("=====================");
		System.out.println("2-2. 람다식 표현을 최대한 압축해보기");System.out.println();
		
		B b2 = (int a) -> {System.out.println("메서드 2, b2: " + a);}; // 전체 표현, 가장 충실하게 작성된 람다식의 기본형
		B b3 = (a) -> System.out.println("메서드 2, b3: " + a); // 구현부에 한라인만 존재할 때는 { }; 까지 생략 가능함
		B b4 = (a) -> {System.out.println("메서드 2, b4: " + a);}; // 입력 매개변수만 일치하게 넣으면 변수 타입도 생략가능.
		B b5 = a -> System.out.println("메서드 2, b5: " + a); // 입력 매개 변수가 하나면 소괄호도 날리기 가능함.
		
		b2.method2(0);
		b3.method2(0);
		b4.method2(0);
		b5.method2(0);
		
		//3-1. 입력 X, 리턴 O 
		System.out.println("=====================");
		System.out.println("3-1. 입력 X, 리턴 O");System.out.println();
		
		C c1 = new C() {
			@Override
			public int method3() {
				return 4;
			}
		};
		System.out.println("c1 리턴값: " + c1.method3());
		
		//3-2. 람다식 표현 
		System.out.println("=====================");
		System.out.println("3-2. 람다식 표현");System.out.println();
		
		C c2 = () -> {return 5;}; // 전체 표현
		C c3 = () -> 6; // 리턴이 한 라인으로 적용된 경우에 리턴을 생략 가능한데, 반드시 중괄호도 생략해줘야 함.
		
		{System.out.println("c2 리턴값: " + c2.method3());};
		{System.out.println("c3 리턴값: " + c3.method3());};
		
		//4-1. 입력 O, 리턴 O 
		System.out.println("=====================");
		System.out.println("3-1. 입력 X, 리턴 O");System.out.println();
		
		D d1 = new D() {
			@Override
			public double method4(int a, int b) {
				return a + b;
			}
		};
		System.out.println("d1 리턴값: " + d1.method4(1,2));
		
		//4-2. 람다식 표현
		D d2 = (int a, int b) -> {return a + b;}; // 전체 표현
		D d3 = (a, b) -> {return a + b;}; // 인풋타입의 매개변수 생략 가능
		D d4 = (a, b) -> a + b; // 리턴이 한 라인으로 적용된 경우에 리턴을 생략 가능한데, 반드시 중괄호도 생략해줘야 함.
		
		System.out.println("d2 리턴값: " + d2.method4(2,3));
		System.out.println("d3 리턴값: " + d3.method4(3,4));
		System.out.println("d4 리턴값: " + d4.method4(3,4));
		
	// 문서의 끝
	}
}
