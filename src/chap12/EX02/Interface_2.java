package chap12.EX02;

//1. interface를 구현하는 클래스들
//2. Override: 완전한 메소드를 자식 클래스를 통해 새롭게 재정의하는 것
//3. Implements : 미완성 메소드를 완성시키는 것.
//4. 부모클래스의 기능을 상속받아서 자신의 기능을 확장하는 것

interface AA{
	public abstract void cry(); //5. 이게 interface 메서드의 원본 형태
	void run(); //6. 이렇게 생략된 체로도 인식이 됨.
	
class BB implements AA {
	@Override
	public void cry() {
		System.out.println("야옹");
	}
	@Override
	public void run() {
		System.out.println("야옹이 달려요");
	} //7. 클래스 BB는 A 인터페이스의 미완성된 메소드를 구현해 완성시킨다.
	
}
	
}

public class Interface_2 {

	public static void main(String[] args) {

	}

}
