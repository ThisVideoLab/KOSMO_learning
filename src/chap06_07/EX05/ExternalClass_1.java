package chap06_07.EX05;


class B{    // 외부 클래스 : public 이 올수 없다    default 가 생략되어있음
			// 다른 패키지의 클래스에서는 접근이 불가 , 같은 패키지 내에서만 접근가능 
	
	private int a = 1;      // private : 같은 클래스내에서만 사용가능 
	int b = 2;				// default : 같은 패키지내에서만 사용가능
	protected int c = 3 ; 	// protected : default 포함 + 다른패키지에서 접근 가능 ( 상속된 경우만 가능) 
	public int d = 4 ;      // public : 다른 패키지에서 사용가능
	
		// private < default < protected < public 
	
	private void print1() {
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	void print2() {
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	protected void print3() {
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	public void print4() {
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
}





public class ExternalClass_1 {
	
	public static void main(String[] args) {
		
		B b = new B();    // 같은 클래스에 존재하므로 class B 를 사용가능
		
		Bb bb = new Bb();
		
		
		// bb.a = 10 ;  private 
		bb.b = 20 ;		// default
		bb.c = 30;      // protected
		bb.d = 40;      // public
		
		// bb.print1();    private
		bb.print2();       // default
		bb.print3();	   // protected
		bb.print4();       // public
		
		
		
	}
	
	

}
