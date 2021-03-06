package chap12.EX01;





class AA{ // 3 .일반 클래스: 객체 생성시 필드와 메서드는 heap 메모리 영역에 저장됨
		  // 4 . 이때 heap 영역은 반드시 초기화 된 값을 가지게 됨.
		  // 5. 필드는: heap에 필드명과 값을 함께 지니고 있음
		  // 6. 인스턴스 메소드는 클래스 영역의 인스턴스에 메소드의 구현코드까지 저장됨.
	      // 7. 이때 인스턴스 메소드는 heap 영역에 포인터 정보만을 지님.
	int a;
	double b;
	char c;
	boolean d;
	byte e;
	float f;
	String g;
	void cry(){} // 8. 이 cry 메서드는 완전한 메소드임. 추상 메서드를 구체적으로 실현해주는 부분.
	@Override
	public String toString() {
		return a + ", " + b + ", " + c + ", " + d + ", " + e + ", " + f + ", " + g;
	}
}

abstract class A{		// 2. 이런 추상 메서드를 하나라도 포함한다면, 클래스는 추상 메서드가 되고 abstract를 붙여야 함.
	abstract void abc(); // 1. 추상 메서드 (미완성 메소드) : 구현부가 없는 메서드. 따라서 객체도 못만듦.
}

class B extends A {
	@Override
	void abc() {
		System.out.println("방법 1"); // 13. 번호 11에서 언급했던 자식 클래스를 통한 객체화 사용
	}
}

public class AbstractClass_1 {
	
	public static void main(String[] args) {
		
		// 9. AA 클래스는 객체화가 가능함.
		AA aa = new AA();
		System.out.println(aa);
		
		// 10. 추상 메소드는 객체 생성 불가: 메소드를 구체화하는 실행부가 없는 미완성 메소드이기 때문에 객체 생성이 불가능함.
		//     객체란 것은 실체인데, 실행부가 없는 메소드는 관념적으로만 존재하기 때문임. 고로 아래와 같은 코드는 에러가 남.
		//     A a = new A(); 내부에 추상 메서드를 포함하기 때문에, 추장 메서드를 포함했다면 그 클래스도 추상 클래스가 되기 때문에, 객체 생성 불가능
		
		// 11. 추상 클래스를 객채화해서 출력하는 방법1 - 재사용 가능
		//     추상 클래스를 상속하는 자식 클래스를 생성한 후에, 자식 클래스에서 오버라이딩을 통해 추상 메서드를 재정의하고, 자식 클래스를 통해 객체를 생성 후에 출력
		//     이렇게 하면 많은 객체를 생성해서 사용하거나, 자식 클래스에서 다변화해서 사용이 가능하다는 장점이 있음
		
		// 12. 추상 클래스를 객체화해서 출력하는 방법2 - 1회성 사용, 임시방편
		//     자식 클래스 생성  없이, main 메서드에서 익명 객체를 생성해서 출력하는 방법이 있음.
		//     이벤트 처리할 때 임시로 처리함 (설명이 조금 부족하게 넘어가심)
		
		// 14. 추상 클래스가 구현된 자식 클래스 생성함으로써 객체를 여러개 생성해보기
		A a1 = new B(); // 자식 클래스 생성, 부모타입
		A a2 = new B();
		A a3 = new B();
		
		// 15. 객체 메서드 호출
		a1.abc(); // 추상 클래스이자 부모 클래스인 A의 abc() 메서드를 호출 => 클래스 B의 abc() 메서드가 오버라이딩으로 출력
		a2.abc();
		a3.abc();
		
		// 문서의 끝
	}
}
