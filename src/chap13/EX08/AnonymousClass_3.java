package chap13.EX08;

//1. 클래스 정의 및 참조 변수를 사용 / 미사용인 경우 매개 변수로 객체를 전달

interface A{
	void abc();
}
class B implements A{
	@Override
	public void abc() {
		System.out.println("매개변수 전달");
	}
}
class C{		//2. 클래스 C를 인터페이스 A에 대한 익명 내부 개체로 만들어보자
	void cde( A a) {//3. Cde() 메소드를 호출하면서 매개변수 a를 클래스 A 타입으로 만들어서 입력
		a.abc(); //4. 이제 인터페이스 A의 abc() 메서드의 사용이 가능해짐.
	}
}

public class AnonymousClass_3 {
	public static void main(String[] args) {
		 
		C c = new C(); // C 클래스의 형태의 참조변수 c를 생성한 후에 기본 생성자 C() 인스턴스를 새로이 만들어줌.
		A a = new B(); // 그 후 c.cde()에 들어갈 매개변수용 인스턴스를 생성해줌. 기본적으로 cde() 매서드는 클래스 A 타입의 매개변수를
					   // 받으므로 클래스 A 타입, 또는 클래스 A를 상속받는 클래스의 타입을 선언해줘야 함. 이때 들어가는 클래스 타입은
		               // 출력 대상인 abc() 메서드에 직접 또는 상속을 통해 간접적으로 접근이 가능한 인터페이스 A와 클래스 B가 올 수 있음.
		
        //c.cde(); //클래스 C의 cde 메서드의 경우 클래스 A 타입의 매개변수 a를 입력받는 cde(A a)밖에 없기 때문에 오류가 남.
		           // 올바른 매개변수를 넣어주거나, 기본 생성자를 생성시켜주면 해결 할 수 있음.
		c.cde(a);

	}

}
