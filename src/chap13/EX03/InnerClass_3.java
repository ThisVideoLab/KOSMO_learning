package chap13.EX03;

//static 이너 클래스 : 외부클래스의 인스턴스 필드 , 인스턴스 메소드는 접근이 불가
					// 외부클래스의 static 필드나 static메소드는 접근가능

class A{
	int a = 3; // 인스턴스 필드 -> 객채화해야 외부에서 접근이 가능함
	static int b =4; // static 필드 -> 객체 생성 없이 외부에서 클래스 이름으로 호출해서 바로 접근이 가능함.
	void method1() { // 인스턴스 메소드 -> 객체 생성 후에 접근이 가능함
		System.out.println("instance field");
	}
	static void method2() { // static 필드 -> 객체 생성 없이 외부에서 클래스 이름으로 호출해서 바로 접근이 가능함.
		System.out.println("static method");
	}
	static class B{    // static 이너 클래스 : 외부객체를 생성하지 않고 객체생성가능
		void bcd() {
			// 1. static 클래스에서 외부 클래스의 인스턴스 필드 접근 (접근 불가)
		//	System.out.println(a);      // 인스턴스 필드 호출 불가 
			System.out.println(b);      // static 이너클래스에서 외부클래스의 static필드나 메소드 접근 가능
			
			// 2. 메소드 호출
		//	method1();	// 인스턴스메소드 호출불가
			method2();	// static 메소드는 호출가능
		}
		
	}
}

public class InnerClass_3 {

	public static void main(String[] args) {
		
		// 1. static이 붙은 이너클래스 객체생성
		A.B b = new A.B();      // static 이너 클래스는 외부 객체 생성없이 객체 생성
		b.bcd();
		
		

	}

}
