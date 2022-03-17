

package chap11.EX02;

// final 메서드와 final class의 특징
// final 메서드 : 오버라이딩이 불가능함. 고로 아주 중요한 메서드에 fnial을 달아 자식이 재정의 못하도록 설정함.
// final 클래스: 상속이 불가능한 클래스. 묶었네 묶었어

class A {
	void abc() {}
	final void bcd() {} // 황금방패 final 장착
}
class B extends A {
	void abc() {} // 메서드 오버라이딩: 부모의 메소드 기능을 자식에서 새롭게 기능 구현
	// void bcd() {} // final 때문에 메서드 오버라이딩 불가능
}

public class FinalModifier_2 {

	public static void main(String[] args) {

	}

}
