package chap13.EX07.EX1;

//1. 인터페이스의 추상 메소드를 구현한 (익명 내부 클래스를 생성 후*) 호출하는 법 : 일회 사용가능
interface AA{ //2. 인터 페이스, 추상 메소드를 정의함
	public abstract void cry(); //3. 추상 메소드, public abstract가 붙어있음.
	void fly();
}

class BB{
	AA aa= new AA(){//3. 인터페이스는 객체화 할 수 없음. 그러나 익명 내부 클래스를 생성해서 구현은 가능함.
					//4. aa는 인터페이스를 구현한 자식 클래스. 블락은 클래스 이름 자체는 없음.
					//5. 컴파일러가 랜덤한 이름으로 자동 할당하고 말아버림. 일회용이니까
			public void cry(){System.out.println("멍멍");};
			public void fly(){System.out.println("개는 날지 못합니다");};
		};
		void abc() {
			aa.cry();
			aa.fly();
		}
	}	
	
	class CC implements AA { //6. class C는 A 인터페이스의 메서드를 구현한 클래스.

		@Override
		public void cry() {
			System.out.println("멍멍");
		}

		@Override
		public void fly() {
			System.out.println("날지 못합니다");
		} // # class CC는 A 인터페이스의 메소드를 구현한 클래스임 
		
		
	}


public class AnonymousClass_2_1 {

	public static void main(String[] args) {

		BB bb = new BB();
		bb.abc();
	}

}
