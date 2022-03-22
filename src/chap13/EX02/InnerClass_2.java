package chap13.EX02;

// 이너클래스에서 외부클래스의 필드와 메소드 접근 방법



class A{
	int a = 3;
	int b = 4;
	int c = 33; 
	int d = 44;
	void abc() {         // 주의 : 오버라이딩이 아님 , 외부 내부 클래스의 동일한 메소드는 별개의 공간에 위치
		System.out.println("A클래스의 메소드 abc()");
	}
	
	class B{   // 이너클래스에서 외부 클래스의 중복된 필드나 메소드 호출 할 경우 : A.this.        
				// super는 사용 불가능 
		int a = 5;
		int b = 6;
		void abc() {     // 오버라이딩이 아님, 별개의 메소드
			System.out.println("B클래스의 메소드 abc()");
		}
		void bcd() {
			// 1. 자신의 필드와 메소드 호출 ( 이너클래스 )
			System.out.println(a);    // this.a
			System.out.println(b);
			abc();
			// 2 . 외부클래스의 필드와 메소드 호출
			System.out.println(A.this.a);    // 외부클래스의 필드값 호출   !주의: super는 사용안됨 
			System.out.println(A.this.b);
			A.this.abc();
			System.out.println(c);
			System.out.println(d);
			
		}
		
	}
}


public class InnerClass_2 {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.bcd();
		
		System.out.println(b.a);
		System.out.println(b.b);
		b.abc();
				
		
		

	}

}
