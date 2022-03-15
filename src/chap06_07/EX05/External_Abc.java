package chap06_07.EX05;

import chap06_07.EX06.Bcd;

public class External_Abc extends Bcd {    //  External_Abc클래스는 Bcd 클래스를 상속 결정
					// 부모 클래스 : Bcd , 자식 클래스 : External_Abc

	public static void main(String[] args) {
		
		// Abc abc2 = new Abc();    // class 접근 제어자가 default 여서 접근 불가
		
		Bcd bcd1 = new Bcd();
		External_Abc ext = new External_Abc();
		
		// 다른 패키지에서 필드 호출 : 1. import  
								// 2. 객체 생성 , 3. 접근지정자 확인 후 접근
		bcd1.a = 1000;
		
		ext.b = 2000;    // 자식 클래스에서 부모 클래스의 protected 를  다른 패키지에서 접근 ( 상속 관계 ) 

	}

}
