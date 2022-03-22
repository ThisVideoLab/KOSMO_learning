package chap13.EX04;

// 지역 이너클래스 : 클래스의 메소드 내부에 선언된 클래스
// 메소드 내부의 필드는 final키가 생략되어있음
// 지역이너클래스에서 사용되는 지역변수는 자동으로 final 키가 들어감

class A {
	int a = 3;
	void abc() {
	 int b = 5;    // 지역 변수 : 메소드 내부에 선언된 변수
					  // 지역 이너 클래스 내부에서 필드를 생성하면 자동으로 final 키가 컴파일러에 의해서 자동으로 할당
		class B {	  
			void bcd() {
				System.out.println(a);   // 필드
				System.out.println(b);	 // 지역변수: final이 생략됨, 값 수정이 불가능함.
				a=5;
		//		b=7;  //    final 키가 있어서 변경 불가능. 이때 이걸 풀려고 A 클래스에 final 말고 다른 걸 붙이면 에러가 남  
			}
		}
		B bb = new B();
		bb.bcd();
	}
}

public class InnerClass_4 {

	public static void main(String[] args) {
		
		// 1. 객체생성후 메소드 호출
		A a = new A();
		a.abc();
	}

}
