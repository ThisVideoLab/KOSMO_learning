package chap13.EX06;

class A{
	C c = new B ();      // C타입 인스턴스 변수 c
	void abc() {
		c.bcd();
	}
}

class B implements C{
	
	@Override
	public void bcd() {
		System.out.println("인스턴스 이너 클래스");
	}
}
interface C{
	void bcd();
}

public class AnonymousClass_1 {
	public static void main(String[] args) {
		//객체 생성 및 메소드 호출
		A a =new A();
		a.abc();      // 인스턴스 이너 클래스
	}
}
