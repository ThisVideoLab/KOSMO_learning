package chap10.EX04;

// 메소드 오버로딩 (Method Overloading) vs 메소드 오버라이딩 (Method Overriding)

	// 메소드 오버로딩: 동일한 메소드 이름으로 (매게변수 타입, 매개변수 수)에 따라 해당 메소드가 호출됨
	// -- 상속과는 관련이 없고, 생성자에서 많이 사용함

	// 메소드 오버라이딩: 반드시 상속 관계에서 사용함.
	// 부모의 메소드를 자식에서 새롭게 정의해서 사용함.
	//		1. 상속관계의 족보 내에 있어야 함
	//		2. 메소드의 시그니쳐 (메소드명, 매개변수 갯수 ,매개변수 타입) 이 일치해야 함.
	//		3. 자식에서 부모의 접근제한자와 같거나 더 넖은 범위어야 한다.
	
class Ab{
	
	void print1(){
		System.out.println("Ab 클래스의 print1()");
	}

	void print2(){
		System.out.println("Ab 클래스의 print2()");
	}
}

class Bc extends Ab{
	@Override
	void print1() { // 오버라이딩
		System.out.println("Bc 클래스의 print1()");
	}
	
	void print2(int a) { // 오버로딩
		System.out.println("Bc 클래스의 print2()");
	}
}

class Aaa1{
	protected void abc() {
		
	}
	
}

class B11 extends Aaa1 {
	@Override
	public void abc() {}
}
class B21 extends Aaa1 {
	@Override
	protected void abc() {}
}

/*
class B3 extends Aaa {
	@Override
	default void abc() {} // 오류 발생 : 오버라이딩 할 때 메소드의 접근 지정자 문제로 닿을 수 없음
}

class B4 extends Aaa {
	@Override
	private void abc() {} // 오류 발생 : 오버라이딩 할 때 메소드의 접근 지정자 문제로 닿을 수 없음
}
*/



public class Overloading_vs_Overriding {

	public static void main(String[] args) {

		// 1. A 타입 선언
		
		Ab ab1 = new Ab();
		ab1.print1(); // A 클래스의 print1 호출
		ab1.print2(); // A 클래스의 print2 호출
		
		// 2. Bc 타입 선언, 생성자 호출 Bc
		
		Bc bc1 = new Bc();
		bc1.print1(); // Bc 클래스의 print1()을 호출
		bc1.print2(); // Ab 클래스의 print2()을 호출 : 부모 클래스의 메소드 호출
		bc1.print2(3); // Bc 클래스의 print3()을 호출 : 자식 클래스의 메소드 호출
		
		System.out.println("==============================");
		
		// 3. Ab 타입으로 선언 한 후에 Bc 타입 생성자 호출
		
		Ab cc = new Bc();
		cc.print1(); // Bc 클래스의 print1() 출력 -> 오버라이딩 되어 있어서 끌올됨
		cc.print2(); // Ab 클래스의 print2() 출력 -> 오버로딩은 그런거 몰라요
		cc.print2(); //
		
		

		
		
		// 문서의 끝
	}

}
