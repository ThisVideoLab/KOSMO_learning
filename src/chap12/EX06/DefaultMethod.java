package chap12.EX06;

//1. interface의 default 메소드 : 인터페이스 내에서 구현부가 있는 메서드를 정의할 때 사용함.
//2. default 키를 넣어줘야 함. default는 접근 지정자가 아니란 점에 주의할 것.
//3. java 1.8 이상에서 새롭게 추가된 기능
//4. public default void bcd() {} 와 같은 모양으로 사용함. 보면 앞에 public이 붙은것처럼 접근 지정자는 따로 붙음.

interface A{
	void abc(); //4. 2005년 생성 메서드, public abstract가 생략됨. 구현부가 없는 추상 메소드
				//   일단 이걸로 클래스를 만들어서 개시를 한거라고 생각해보자.
	default void bcd() { //5. 그 다음에 2020년에 default를 추가했음. 기능을 추가할 필요가 있었던거지.
		System.out.println("A 인터페이스의 bdc()");
	}
	// void ttt(); //6. 부모 클래스 interface A에다 자식 클래스들에게는 구현할 수 없는 메서드를 넣어서 상속시켜버리면
				   //   하위에 있는 모든 자식 클래스들에서 오류가 뿌부붐 뜸
}
class B implements A{ //7. 이 녀석도 2005년에 생성된 클래스라고 했을때 위에 5번을 끼워 넣으면, 새로운 기능을 추가하기가 편함
					  // 이유인즉슨 추상 메서드로 갑자기 바꾸면 다 오류가 나버린다는거지. 근데 default 메서드는 탈 없이 작동한다는거고.
					  // 재정의 필요없이 바로 뽑아쓰는게 바로 default 메서드의 장점이라는거지
	public void abc() {
		System.out.println("B 클래스의 abc()");
	}
}
class C implements A{
	public void abc() {
		System.out.println("C 클래스의 abc()");
	}
	public void bcd() { //6. default 메서드도 오버라이딩이 가능함.
		System.out.println("C 클래스의 bcd()");
	}
}
public class DefaultMethod {
	public static void main(String[] args) {
		//8. 객체 생성
		A a1 = new B();
		A a2 = new C();
		
		//9. 메서드 호출
		a1.abc();// 
		a1.bcd();
		
		a2.abc();
		a2.bcd();
		
		
		//문서의 끝
	}

}
