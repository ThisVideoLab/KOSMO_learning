package chap10.EX04;

// 메소드 오버라이딩 (MethodOverridng)
// 1. 반드시 상속 관계에서만 메서드 오버라이딩이 구현됨.
// 2. 부모 클래스에서 선언된 메서드를 자식 클래스에서 새롭게 정의해서 사용하는 것.
// 3. @override 라는 어노테이션ㄴ을 사용하면 메소드 재정의시 오류를 줄 일 수 있음.
// 4. 시그니쳐가 같아야 한다. (메소드명, 매개변수 타입, 매개변수 갯수)
// 5. 메서드의 전 전근 제어자가

class A{
	void print() {
		System.out.println("원산지: A 클래스");
	}
}

class B extends A{
	@Override 	// 메소드 오버라이드를 하면 반드시 부모의 메소드를 재정의하도록 설정. 
	void print(){  // @Ovrrid  라는 어노테이션을 사용하면 메소드 재정의시 오류를 줄일 수 있다.
					// 별개의 메소드로 정의됨
		System.out.println("원산지: B 클래스"); 
	}
}

public class MethodOverridng {

	public static void main(String[] args) {
		//1. A 타입
		System.out.println("1. A 타입");
		
		A aa = new A();
		aa.print(); // A 클래스의 print() 출력
		System.out.println();
		
		
		// 2. B 타입
		System.out.println("2. B 타입 ");
			
		B bb = new B();
		bb.print();		//  B 클래스의 print() 출력
		System.out.println();
		
		// 3. A 타입 업캐스팅 <==
		System.out.println("3. A 타입 업캐스팅");
		
		A ab =new B();
		ab.print();  // 클래스의 print 출력 동적 바인딩
		System.out.println();
		
		//ab.print() A 클래스의 print를 호출, 동적 바인딩에 의해 클래스 B를 print() 로 출력
		
	}

}
