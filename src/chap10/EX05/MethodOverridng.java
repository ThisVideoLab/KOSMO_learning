package chap10.EX05;
class A {
	
	// 인스턴스 메소드: 상속관계에서 메소드 오버라이딩은 인스턴스 메소드만 오버라이딩 됨. (필드는 안됨)
	// 상속 관계에서 인스턴스 필드, 스태틱 필드, static keyword가 들어간 필드. static이 들어간 메소드는 오버라딩이 되지 아니함.
	// 오버라이딩 할때는 시그니쳐가 같아야 함. 리턴타입, 메소드명, 매개변수 타입, 매개변수 갯수가 같아야 성공적으로 불러짐.
	
	void print() {
		System.out.println("Class A 출력");
	}
}
class B extends A{

	@Override
	void print() {
		System.out.println("Class B 출력");
	}
}

class C extends A{

	@Override
	void print() {
		System.out.println("Class C 출력");
	}
}


public class MethodOverridng {

	public static void main(String[] args) {
		//1. A 타입, A 생성자
		A a = new A();
		a.print();
		
		//2. B 타입, B 생성자
		B b = new B();
		b.print();
		
		//3. C 타입, C 생성자
		C c = new C();
		c.print();
		
		//4. A 타입, B 생성자 (오버라이딩 되어 A의 print() 호출시, B의 print() 출력됨.
		A ab = new B();
		ab.print(); // A의 print() 메소드 호출 ==> B의 print() 메서드가 출력됨.
		
		A ac = new C();
		ac.print(); // A의 print() 호출 ==> B의 print() 출력됨.
		
		A[] arr = {ab, ac}; // 배열에 A 타입의 객체를 저장함
		
		for (int i = 0; i <arr.length; i++) {
			arr[i].print();
			}
		for (A k: arr) {
			k.print();
		}
	}

}
