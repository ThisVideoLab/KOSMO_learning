package chap10;

// this: 자신의 객체
// 오버라이딩: 부모의 원래 메서드는 완저히 삭제 또는 갈음되지 아니함.

class A{
	void abc() {
		System.out.println("A 클래스의 abc 메서드입니다.");
	}
	
}
class B extends A{
	void abc() {
		System.out.println("B 클래스의 abc 메서드입니다.");
	}
	void bcd(){
		abc(); //  this.abc 가 생략됨. 이 때 this는 자신의 객체
		super.abc();
	}
}

public class SuperKeyword_1 {

	public static void main(String[] args) {
		
		//1. 객체 생성
		B bb = new B();
		
		//2. 메서드 호출
		bb.bcd(); // B클래스의 메서드 호출
	}

}
