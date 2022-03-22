package chap13.EX05;


// 지역 Inner 클래스의 컴파일 이후 생성되는 클래스 파일에 대해 알아보자
// 지역 Inner 클래스는 메서드 내부에 선언된 클래스를 의미함. 

class A{
	void abc() {
		class B{}      // A$1B.class // A 클래스 내부의 첫번째 B
		class C{}      // A$1C.class // A 클래스 내부의 첫번째 C
	}
	
	void bcd(){
		class C{}      //  A$2C.class // A 클래스 내부의 두번째 C
		class D{}		// A$1D.class // A 클래스 내부의 첫번째 C 
	}
	
	void cde() {
		class B{}      //  A$2B.class // A 클래스 내부의 두번째 B
		class C{}		// A$3C.class // A 클래스 내부의 세번째 C
	}
}


public class InnerClass_5 {

	public static void main(String[] args) {

	}

}
