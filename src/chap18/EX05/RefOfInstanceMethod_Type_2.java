package chap18.EX05;

// 메서드 참조의 정적 메서드 표현 : 
	//내가 구현하지 않고, 구현되어 있는 메소드를 참조해서 사용함.
	// 이를 정적 메서드 참조라고 함

interface A{
	void abc();
}

class B{
	static void bcd() { // static이라서 클래스 이름으로 호출이 가능함.
		System.out.println("class B의 메서드");
	}
}

public class RefOfInstanceMethod_Type_2 {
	public static void main(String[] args) {

	//1. 정적 메서드 참조 : 이너 클래스로 처리함
		
	A a1 = new A() {
		@Override
		public void abc() { 
			B.bcd(); // static이 적용된 정적 메서드이기 때문에 객체 생성 없이 클래스 명으로 직접 호출
		}
	};
	
	//2. 람다식 표현
	
	A a2 = () -> {B.bcd();}; //람다식 표현
	
	//3. 정적 메서드 참조 
	// B b = new B(); //원래는 인스턴스 객체를 생성 한 다음에 객체명 :: 메서드 으로 불러야 하지만
	A a3 = B::bcd; // 구현되서 정적으로 선언된 메서드는 바로 끌어오면 됨.
	
	a1.abc();
	a2.abc();
	a3.abc();
	

	//문서의끝
	}
}
