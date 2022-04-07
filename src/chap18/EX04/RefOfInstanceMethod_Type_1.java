package chap18.EX04;

//람다식의 활용
//1. 익명 이너 클래스를 활용하는 방법
//2. 메서드 참조 방법: a) 인스턴스 메서드를 참조 b) 정적 메서드를 참조

interface A{
	void abc();
}
class B{
	void bcd() { // 인스턴스 메서드 : 객체화해야 호출이 가능한 상태임.
		System.out.println("메서드");
	}
}

public class RefOfInstanceMethod_Type_1 {
	public static void main(String[] args) {

	//1. 인스턴스 메서드 참조 type 1 < == 익명 이너 클래스
		
	A a1 = new A(){
		@Override
		public void abc(){ // abc() 메서르르 호출하면
			B b = new B(); // B 객체를 생성해서
			b.bcd(); // bcd()를 다시 불러옴
		}
	};
	
	//2. 위의 시나리오를 람다식으로 표현함
	A a2 = () -> {
		B b = new B(); // 사실상 abc 메서드에 들어갈 내용을 그대로 복사한 것
		b.bcd();
		};
		
	//.3 인스턴스 참조 표현식 type1
	B b = new B(); // 인스턴스 객체를 먼저 생성해줌, 객체명:: 메소드명
	A a3 = b::bcd; // 인스턴스 참조 표현 ..
				   // b 객체를 만들고 :: bcd라는 메서드를 바로 호출해버림
	
	a1.abc();
	a2.abc();
	a3.abc();
	
		
	// 문서의 끝
	}
}
