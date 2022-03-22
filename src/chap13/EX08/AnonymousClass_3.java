package chap13.EX08;

// 클래스 정의 및 참조 변수를 사용 / 미사용인 경우 매개 변수로 객체를 전달

interface A{
	void abc();
}

class B implements A{

	@Override
	public void abc() {
		System.out.println("매개변수 전달");
	}
	
}


class C{		// cde 메소드에 인풋값으로 A타입의 객체 a를 받습니다
	void cde( A a) {			// Cde 메소드를 호출하면서 매개변수로 A타입의 객체를 전송
		a.abc();
	}
}


public class AnonymousClass_3 {

	public static void main(String[] args) {
		 
		C c = new C();
		A a  = new B (); // 참조 변수 생성
		
		c.cde(a);

	}

}
