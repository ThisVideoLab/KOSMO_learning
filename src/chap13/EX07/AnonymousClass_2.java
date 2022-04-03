package chap13.EX07;


// 익명 이너 클래스를 사용하여 인터페이스 객체 생성

class A{
	C c = new C() {
		public void bcd() {
			System.out.println("익명 이너 클래스" + m);
		}
	};      // C타입 인스턴스 변수 c
	void abc() {
		c.bcd();
	}
	
}

interface C{
	int m=0; // 인터페이스의 앞에는 final static이 붙게됨. 그래서 초기값 설정해줘야 함.
	void bcd();
}

public class AnonymousClass_2 {

	public static void main(String[] args) {
		//객체 생성 및 메소드 호출
		A a =new A();
		a.abc(); // 인스턴스 이너 클래스

		//문서의 끝
	}
}
