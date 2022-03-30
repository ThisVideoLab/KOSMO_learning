package chap16.EX12;

// 제네릭 메서드의 상속: 일반 클래스의 제너릭 메서드

class Parent{ // 일반 클래스
	//Number : Boolean, Charactor를 제외한 Wrapper(기본 데이터 타입을 객체형으로 변환한 것) 타입의 클래스가 올 수 있음.
				//Byte, Short, Integer, Long, Float, Double
	
	<T extends Number> void print(T t) { // 제네릭 메서드
		System.out.println(t);
	}
}

class Child extends Parent{ // 일반 클래스를 상속 받아서 제네릭 메서드 사용
	
}

public class InheritanceGenericMethod {
	public static void main(String[] args) {
		//1. 부모 클래스의 제네럭 메서드 사용
		Parent p = new Parent();
		p.<Integer>print(100);
		p.<Double>print(100.00);
		//p.<String>print("안녕"); // 넘버 타입만 들어갈 수 있음.
		p.print(300); // 매개변수의 자료형이 확연히 구분 가능한 경우라면, 생략해도 컴파일 과정에서 자동으로 넣어줌
		p.print(3000.333);
		
		//2. 자식 클래스에서 제너릭 메서드 사용
		Child c = new Child();
		c.<Integer>print(200);
		c.<Double>print(2000.12345);
	}
}
