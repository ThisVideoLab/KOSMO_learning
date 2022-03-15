package chap06_07.EX05;

// 같은 패키지 내에서 class A 접근 

public class Ex_A {
	
	

	public static void main(String[] args) {
		// A 클래스는 같은 패키지 내부에 존재 하므로 import를 사용하지 않고 사용가능 
		
		A a = new A();
		
		a.m = 10 ;     // class A 의 접근 제어자가 default 로 되있어서 같은 패키지내에서 사용가능
		a.n = 20 ;
		
		a.print();
		
	}

}
