package chap16.EX09;

// 제너릭 메소드의 범위 지정:

interface MyInterface{
	void print(); // public abstract가 생략됨.
}

class A {
	//Number : Boolean, Charactor를 제외한 6개 타입(Byte,Short,Integer,Long,Float,Double)
	public <T extends Number> void method1 (T t) {
		System.out.println(t.intValue()); // Number 타입의 메서드 . t.intValue()
	}
}

class B{ // 제너릭 타입 내부에서 인터페이스를 적용할 때는 extends 키를 사옹합니다.
	public <T extends MyInterface> void method2 (T t) {
		t.print();
	}
}

class C implements MyInterface { // 인터페이스를 구현한 클래스
	@Override
	public void print() { 
		System.out.println("인터페이스를 구현한 클래스 - 출력");
	}
}

class D{
	public <T extends String> void abc(T t) {
		System.out.println(t);
		System.out.println(t.toString());
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		
		// 여러 자료형으로 구현해보기
		A a = new A(); // 일반 클래스 객체 생성 후 제너릭 메서드 호출
		a.<Double>method1(5.8);
		a.method1(22.5);
		a.<Long>method1(100000L);
		a.<Float>method1(100.5555F);
		//a.<Boolen>method1(true); // Charactor, Boolean은 오류 발생함.
		
		B b = new B(); //
		
		System.out.println("============================");
		// 인터페이스를 구현한 내부 익명 클래스
		// Method2에 매개변수로 올 수 있는 것은 인터페이스 타입, 인터페이스를 구현한 자식 클래스
		b.<MyInterface>method2(new MyInterface() {
			public void print(){
				System.out.println("print() 구현");// 
			};
		});

		b.<MyInterface> method2(new C()); // 매개변수로 인터페이스를 구현한 자식 객체
		
		System.out.println("============================");
		// 익명클래스로 제너릭 메서드 호출 후 매개변수로 던져주기
		
		b.method2 (new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명으로 구현한 제네릭 메서드");
			}
		});
		
		System.out.println("============================");
		
		D d = new D();
		d.<String> abc("안녕");
		d.abc("하세요");
		d.toString();
		
	// 문서의 끝
	}
}
