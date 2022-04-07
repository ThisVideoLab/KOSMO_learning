package chap18.EX09;

interface A{
	B abc();
}
class B{
	B(){
		System.out.println("첫번째 생성자");
	}
	B(int k){
		System.out.println("두번째 생성자");
	}
}

public class RefOfClassConstructor_1 {
	public static void main(String[] args) {

		//1. 클래스 생성자 참조하기 - 익명 이너 클래스
		//   자신의 메서드 내에 고유의 실현부 없이 다른 객체의 실현부를 참조해서 호출함
		A a1 = new A(){
			@Override 
			public B abc() { // abc() 메서드를 호출하면 class B의 기본 생성자 호출
				return new B();
			}
		};
		
		//2. 람다식 표현
		A a2 = () -> new B();
		
		//3. 클래스 생성자 참조
		A a3 = B::new;
		
		a1.abc();
		a2.abc();
		a3.abc();
		
	//문서의끝
	}
}
