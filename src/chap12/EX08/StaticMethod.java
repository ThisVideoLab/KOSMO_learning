package chap12.EX08;

//1. 정적 메서드에 알아보자. 정적 메서드란 인터페이스 내부에 static 키가 들어간 메서드로 하위 자식 클래스에서 구현 없이 바로 호출 가능함.
//2. Java 1.8 이상에서 새롭게 추가된 기능임.

interface A{
	static void abc() { //
		System.out.println("interface A의 정적 메소드 abc()");
	}
}


public class StaticMethod {

	public static void main(String[] args) {

		//3. 정적(static) 메서드 호출을 해보자
		
		A.abc(); //4. 구현하지 않고서도 바로 interface 이름을 앞에 넣어서 호출이 가능함.

		//5. 이쯤에서 인터페이스의 내부 구성요소를 알아보면 다음과 같다
		  // a) 필드 : public static final ==> 이 전체를 생략 가능함
		  // b) 메서드 : public abstract ==> 이 전체를 생략 가능함. 추상 메서드, 구현부가 없어서 자식 클래스에서 구현부를 넣어줘서 완성해야 함. 
	      //           public default ==> public만 생략 가능함. 구현부가 있는 메서드 (Java 1.8 버전 이상의 새로운 기능)
		  //		   public static ==> public만 생략 가능함. 구현부가 있고, 객체 생성 없이 호출 가능함 (Java 1.8 버전 이상의 새로운 기능)
		
	}

}
