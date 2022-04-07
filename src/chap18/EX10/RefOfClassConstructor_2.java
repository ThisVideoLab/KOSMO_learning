package chap18.EX10;

interface A{
	B abc(int k);
}
class B{
	B(){
		System.out.println("첫번째 생성자");
	}
	B(int k){
		System.out.println("두번째 생성자");
	}
}

public class RefOfClassConstructor_2 {
	public static void main(String[] args) {

		//1. 익명 이너 클래스
		
		A a1 = new A() { 
			@Override
			public B abc(int k) {
				return new B(3);
			}
		};
		
		//2. 람다식 표현
		
		A a2 = k ->new B(3);
		
		//3. 클래스 생성자 참조
		A a4 = B::new;
		
		a1.abc(3);
		a1.abc(3);
		a1.abc(3);
		
		
		
		
	//문서의끝
	}
}
