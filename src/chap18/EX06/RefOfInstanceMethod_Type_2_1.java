package chap18.EX06;

interface A{
	void abc(B b, int k);
}

class  B{
	void bcd (int k) {
		System.out.println("클래스 B에 정수 "+ k +" 입력");
	}
}

public class RefOfInstanceMethod_Type_2_1 {
	public static void main(String[] args) {
		
		//인스턴스 메서드 참조  Type 2
		// 익명 이너클래스
		
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		// 람다식 표혐
		
		A a2 = (B b, int k)-> {b.bcd(k);};
		
		A a3 = B::bcd; // 인스턴스 메서드나 B 객체를 인풋 받아서 bcd 메서드 호출
					   // 객체명::메서드명;  으로 간단하게 구성됨
					   // B 정적 메서드를 호출할 때, 인스턴스 메서드를 호출하지만 매개변수로 객체가 입력값으로 들어감
		
		B b = new B();
		
		a1.abc(b, 7);
		a1.abc(b, 8);
		a1.abc(b, 9);
		

	//문서의끝
	}
}
