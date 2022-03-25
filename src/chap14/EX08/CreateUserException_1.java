package chap14.EX08;

//사용자 정의 예외
//1. Exception을 상속하는 예외: Checked Exception - 컴파일 단계에서 예외처리 필요함.
//2. RuntimeException을 상속하는 예외 : Unckecked Exception - 실행시에 예외

class MyException  extends Exception{ // 일반예외
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}
	
}

class MyRTException extends RuntimeException{
	public MyRTException() {
		super();
	}
	public MyRTException(String message) {
		super(message);
	}
	
}

class A {
	//3. 사용자 정의 예외 객체 생성 (일반 예외 객체)
	
	MyException me1 = new MyException("me1 발동. 기본생성자 호출"); // 기본 생성자 호출
	MyException me2 = new MyException("me2 발동. 예외 메시지"); // 예외 발생시 예외 메시지를 출력하는 생성자. 
	
	//4. 런타임 예외 객체 
	MyRTException mre1 = new MyRTException("mre1 발동. 기본생성자 호출"); // 기본 생성자 호출
	MyRTException mre2 = new MyRTException("mre2 발동. 예외 메시지"); // 예외 발생시 예외 메시지를 출력하는 생성자.
	
	// 예외를 강제로 발생시키기 (throw):
	
	void abc_1(int num) {
		try {
			if (num > 70) { // abc_1()
				System.out.println("정상 작동");
			}else {
				throw me2; // 예외를 강제로 발생시킴
			}
		}catch (MyException e){ // me1에 강제로 Exception을 throw를 사용해서 강제로 예외를 발동시킴
			System.out.println("70이하의 값을 넣었습니다. 70 이상의 값을 넣으십시오 ");
			System.out.println(e.getMessage());
		}
	}
	//예외의 전가 (throws): abc_2() 메소드를 호출하는 곳에서 예외처리
	//					이때 throw와 throws는 다르다. throw는 강제로 던지기. throws는 그냥 던지기.
	void abc_2(int num) throws MyException{
			if(num > 70) {
				System.out.println("정상작동");
			}else {
				throw me2; // 강제로 예외처리를 발생시키는 구문
			}
		}
	
	void bcd_1() {
		abc_1(65);
	}
	void bcd_2() {
		try {
			abc_2(65);
		}catch (MyException e){
			System.out.println("70이하의 값을 넣었습니다. 70 이상의 값을 넣으십시오");
			System.out.println(e.getMessage());
		}
	}
}

public class CreateUserException_1 {

	public static void main(String[] args) {

		A a1 = new A();
		a1.bcd_1();
		
		A a2 = new A();
		a2.bcd_2();
		
	}

}
