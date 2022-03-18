package chap12.EX04;

//1. 인터페이스 상속 시 자식 클래스 접근 지정자 오류 ★매★우★중★요 ★

interface A{
	public abstract void abc();
}
interface B{
	void abc(); // 이때 interface의 메서드에는 public abstract가 생략되어있다는 점을 상기하면서
}

class C implements A {
	// void abc() {} //3. interface A의 abc()를 Override 해서 구현한 method인데 오류가 발생함.
			     //4. 이유인즉슨 자식은 부모보다 정근 지정자가 같거나 더 넓어야 하는데 앞에 abc() 앞에는 public이 붙어 있다는 점.
	public void abc() { //4. 그래서 같은 범위인 public을 붙여줘서 짜세를 맞춰줌 
	}
}

class D implements B{
	public void abc() { // 5. interface의 method를 구현할 때는 반드시 public 접근 지정자를 붙여줘야 함을 잊지 말자.
	}
}

class E implements B{
	public void abc() {
	}
}

class F implements A{
	
	@Override
	public void abc() { //6. 오버라이드도 마찬가지루다가 퍼블릭을 붙여줘야 함.
	}
}
	
public class Interface_4 {

	public static void main(String[] args) {

	}

}
