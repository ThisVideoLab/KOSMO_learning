package chap12.EX07;

interface A{ //1. parent interface class 생성
	default void abc() { //2. interface가 구변부가 있는 method를 정의: default로 정의됨
		System.out.println("A interface의 abc()");
	}
}
class B implements A{ //5. 사실은 여기에 extends Object가 생략된 것이었음
	public void abc() { // 3. 오버라이딩으로 abc() 메서드를 출력
		A.super.abc(); //4. 근데 그냥 super.abc() 는 오류가 생성됨. 이유인즉슨 object 클래스의 abc()를 호출하기 때문임.
					   //6. 고로 A.super.abc() 라고 써줘서 class A의 abc()를 특정해줘야 함. 
		System.out.println("B 클래스의 abc()");
	}
}

public class DefaultMethod2 {

	public static void main(String[] args) {

		//7. 객체 생성
		B b = new B();
		b.abc(); //8. 이렇게 호출하면 첫줄에는 default method의 출력부를 먼저 호출한 뒤에 내려가서 두번째 줄에 클래스 B의 출력부를 호출함.
		
		System.out.println("====================");
		
		A a1 = new B(); //9. 객체 생성은 불가능하지만 타입 변환(캐스팅)은 가능함
	}

}
