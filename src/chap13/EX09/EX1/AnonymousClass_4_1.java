package chap13.EX09.EX1;

interface A{
	void cry();
	void fly();
}

class C{
	void abc(A a) {
		a.cry();
		a.fly();
	}
}

public class AnonymousClass_4_1 {
	public static void main(String[] args) {

		C c= new C();
		
		//1. 클래스는 존재하지 않으나, 참조변수를 생성하여 호출함.
		
		A a = new A() { //3. 인터페이스를 구현한 자식 익명 객체를 생성한 후에 타입을 A로 지정한 참조 변수를 생성해 입력
			@Override
			public void cry() { //오버라이딩 파트
				System.out.println("멍멍");	
			}
			public void fly() { //오버라이딩 파트
				System.out.println("개는 못날아요");	
			}
		};
		c.abc(a); // 위에 생성한 참조변수 a를 넣고 클래스 c의 메서드에 오버라이딩한 값들을 출력함

		//2. 클래스가 존재하지 않고, 참조변수도 없이 호출함.
		
		c.abc(new A(){ // 이부분 new 이하의 모든 부분이 사실상 참조변수의 역할을 함.
			@Override
			public void cry() {
				System.out.println("멍멍");
			}
			public void fly() {
				System.out.println("개는 못난다니까요");	
			}
		});

	}

}
