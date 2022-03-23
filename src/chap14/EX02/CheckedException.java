package chap14.EX02;

import java.io.InputStreamReader;

// Checked Exception (일반 예외) 컴파일 단계에서 예외가 발생!
// 컴파일하기 (빌드), * Java => *.class 전에 예외처리

//unchecked Exception (실행 예외), Runtime Exception 실행시에 예외가 발생될 수 있음.
// 예외 필수는 아니지만 예외처리함

class A{
	
	B b;
	A(){} // 기본 생성자
	
	interface B{ // 인터페이스 선언
		void cry(); 
	}
	void abc() {
		b.cry();
	}
}

public class CheckedException {
	public static void main(String[] args) {
		
		//1. 일반 예외
		
		//InterruptedException: 스레드 중간에 끼어들기가 발생하면 예외가 발생함.
		// Thread.sleep(1000);
		
		// classNotFoundException : 클래스를 찾지 못하는 예외
		// class cls = Class.forName("java.lang.Object");
		
		//IOException : 네트워크에서 값을 (정보) 못 읽어 올 수 있는 예외
		//System.in 콘솔을 뜻함.
		InputStreamReader in = new InputStreamReader(System.in);
		//in.read();
			
		
		//FileNotFoundException : 파일을 찾지 못하는 예외가 발생 될 수 있음.
		// FileInputStream fits = new FileInputStream("txt.txt");
		
		// 실행예외 (unckecked Exception) : 실행시에 발생되는 예외
		
		//NullPointerException : 객체가 Null인 상태에서 객체의 필드나 메소드를 호출함.
		A a1 = new A();
		a1.abc(); // 컴파일 단계에서는 예외가 발생되지 않고 실행시에 발생함.
		
		
		
		
		
		// 문서의 끝
	}
}
