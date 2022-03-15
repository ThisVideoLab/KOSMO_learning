package chap06_07.EX06;


class Abc {      // 외부 클래스 : public  제어자를 사용 못한다 . default 기본으로 적용
				//  class : public , default
				// 접근제어자가 붙을수 있느 키워드 : class 앞 , 필드 , 메소드 , 생성자 
				// 반드시 접근제어자가 할당 되어 있다 . 생략 되어 있으면 default
				// 접근제어자 : 
					//  1. public : 다른패키지에서 접근이 가능
					//  2. protected : 다른 패키지에서 접근 가능 (상속구현 되있어야 함 )
					//  3. default : 같은 패키지에서 접근이 가능 , 같은 패키지에 존재하는 클래스는 import 없이 사용
					//  4. private : 같은 클래스 내부에서만 사용 가능 
	
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	public void print1() {
		System.out.println("다른 패키지에서 접근 가능 : public ");
	}
	protected void print2() {
		System.out.println("다른 패키지에서 접근 가능 (상속관계가 구성될떄) : protected ");
	}
	 void print3() {
		System.out.println("같은 패키지 에서만 접근 가능 : default ");
	}
	private void print4() {
		System.out.println("같은 크래스 내에서만 접근가능 : private ");
	}
	
	
}


public class Ex06_All {

	public static void main(String[] args) {
		
		Abc abc1 = new Abc();
		
		
		abc1.a = 100;
		abc1.b = 200;
		abc1.c = 300;
		// abc1.d = 400;    private 오류 
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
