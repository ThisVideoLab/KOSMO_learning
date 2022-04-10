package chap16;

// 제너릭 메소드 내부에 사용가능한 메서드 : Object  클래스의 메소드만 사용 가능함.

class A{
	public <T> void method(T t) {
		// System.out.println(t.length()); // t.length() : String 클래스에서 글자수를 리턴해줌 // 사용불가
		System.out.println(t.equals("안녕")); // t.equals는 Object 클래스의 메소드는 사용이 가능함 
	}
	public <T extends Object> void method2 (T t) { // <T extends Object> 
		System.out.println(t.equals("반갑습니다")); // Object 클래스의 메소드만 사용가능하다.
	}
	public <T extends String> void method3 (T t) { // <T extends String> 스트링 타입의 값을 가지는 매개변수만 온다
		System.out.println(t.equals(t.length())); // 
	}
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method("안녕");
	}
}