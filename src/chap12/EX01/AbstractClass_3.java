package chap12.EX01;

abstract class D{ // 클래스 내부에 추상 메소드가 올 경우 abstract 클래스가 되어야 한다.
	
	abstract void print(); // 자식 클래스에서 반드시 오류 없이 메서드를 재정의하는 것을 보장받을 수 있게 됨.
	
}

class E extends D {
	@Override
	void print() {
		System.out.println("E 클래스의 print()");
	} // 자식 클래스는 추상 클래스의 메서드를 재정의해야 함
}

public class AbstractClass_3 {

	public static void main(String[] args) {

		//1. 객채화해서 출력 (객체 3개 생성후 print() 메서드 출력
		
		D dd1 = new E();
		D dd2 = new E();
		D dd3 = new E();
		
		dd1.print();
		dd2.print();
		dd3.print();
		
		
		
		System.out.println("==========================");
		//2. 익명클래스를 생성해서 출력 ( print() 메서드 3번 출력)
		
		D dd4 = new E() {
			void print() {
				System.out.println("E 클래스의 print()");
			}
		};
		dd4.print();
		
		D dd5 = new E() {
			void print() {
				System.out.println("E 클래스의 print()");
			}
		};
		dd5.print();
		
		D dd6 = new E() {
			void print() {
				System.out.println("E 클래스의 print()");
			}
		};
		dd6.print();
		
		// 문서의 끝
	}
}
