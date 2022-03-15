package chap06_07.EX06;

import chap06_07.EX05.A;

public class EX_A {

	public static void main(String[] args) {
		
		// 다른 패키지의 객체를 사용하는 방법 : 

		// 1. 전체 클래스 이름을 사용하는 방법
		chap06_07.EX05.A a = new chap06_07.EX05.A();      // 클래스의 전체이름을 사용: 패키지명.클래스명
		
		//   a.m = 10;    default 는 다른 패키지의 클래스에서는 접근이 불가.
		
		a.k = 50;    // public 이라 접근가능 
		a.print1();
		
		
		//2. import 를 사용해서 접근하는 방법
		A aa = new A();     // import후 사용하는 방법
		aa.k = 100;
		aa.print1();
	}

}
