package chap13.EX06;

//1. 인터페이스의 추상 메소드를 구현한 (클래스를 생성 후*) 호출하는 법 : 다회 사용 가능

interface AA{ //2. 인터 페이스, 추상 메소드를 정의함
	public abstract void cry(); //3. 추상 메소드, public abstract가 붙어있음.
	void fly();
}

class BB{
	AA a = new CC();
	void abc() {
		a.cry();
		a.fly();
	}
	
	
	class CC implements AA { // class C는 A 인터페이스의 메서드를 구현한 클래스.

		@Override
		public void cry() {
			System.out.println("멍멍");
		}

		@Override
		public void fly() {
			System.out.println("날지 못합니다");
			
		} // # class C는 A 인터페이스의 메소드를 구현한 클래스임 
		
		
	}
}

public class AnonymousClasss_1_1 {

	public static void main(String[] args) {
		BB bb = new BB(); // 
		bb.abc();
		

	}

}
