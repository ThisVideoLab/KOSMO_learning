package chap13.EX09;

//1. 인터페이스를 구현한 구현한 클래스가 없는 경우, 메서드의 매개변수로 받는 방법

interface A{
	void abc(); //# public abstract가 생략되어 있는 상태
}

class C{
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_4 {
	public static void main(String[] args) {
		
		//2. 인터페이스를 구현한 클래스가 없이 참조변수를 생성하여 호출
		
		C c= new C(); //  C() 기본 대상자 인스턴스 형태의 클래스 C 타입인 참조변수 c를 새로이 생성함
		
		c.cde(new A(){ // 사실상 이 뒤로 들어가는 긴 구문이 매개변수 a에 대응되는 것이기에 매우 번거로움
			public void abc() {
				System.out.println("클래스 없이 참조 변수 없이 일회용으로 임시 생성한 객체");
			}
		}); // 임시 객체 이므로 메서드 마지막에 세미 콜론
		
		
		
		//4. 인터페이스를 구현한 클래스가 없이 참조 변수도 없이 호출하는 법 // 임시로 한번만 사용하지만 제일 많이 사용함
		
		A a = new A() { //3. 인터페이스를 구현한 자식 익명 객체를 생성한 후에 타입을 A로 지정한 참조 변수를 생성해 입력
						// 허나 A는 인터페이스이기 때문에 마땅한 실행부 구현이 없음.
			@Override   // 그래서 클래스 A의 abc()에 직접 실행부를 오버라이딩함. 
			public void abc() {
			System.out.println("클래스 없이 참조 변수를 생성하여 호출한 구문");	
			}
		}; // 임시 객체 이므로 메서드 마지막에 세미 콜론
		a.abc();
		
		// 문서의 끝
	}

}
