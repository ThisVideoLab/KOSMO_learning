package chap13.EX10;

//1. 이너 인터페이스 (InnerInterface) : 외부 클래스에서 간단하게 사용할 목적으로 클래스 내부의 인터페이스를 선언함.
//                                  왜 내부 클래스에서 간단하게 사용가능하느냐, 그것은 이너 인터페이스에는 자동으로
// 	     							static이 붙어서 컴파일되기 때문임. 이에따라 static이 붙는 것에 주의를 요하기도 함.

class A{
	interface B{ //2. 인터페이스 앞에 static이 컴파일러에 의해 자동으로 추가됨.
		void bcd(); //3. public abstract가 생략되었음에 주의할 것
	}
}

//4. 이너 인터페이스를 구현한 클래스 C

class C implements A.B { //5. 여기서 A.B는 A클래스 내의 이너인터페이스 B를 뜻하는 직렬구조 
						 //    A,B의 경우는 A 인터페이스와 B 인터페이스를 의미하는 병렬구조임.
	@Override
	public void bcd() {
		System.out.println("이너 인터페이스를 구현한 클래스 C");
	}
}

public class InnerInterface_1 {
	public static void main(String[] args) {

	//6. 자식 객체를 직접 생성 후 출력함 (자식 클래스가 구현된 경우)
	
	A.B ab1 = new C(); // 부모타입으로 업캐스팅 후 오버라이딩을 통해 출력함
	ab1.bcd();
	
	C c = new C(); // C 자신의 메소드를 직접 출력함
	c.bcd();
	
	//7. 익명 이너 클래스로 출력 (자식 클래스 없이 출력)
	A.B ab2 = new A.B() {
		@Override
		public void bcd() {
			System.out.println("익명 이너 클래스로 객체 생성 후 출력한 구문");
		}
		
	}; // A.B : A 클래스 내부의 인터페이스 (이너 인터페이스) 
	ab2.bcd();
	// 문서의 끝	
	}

}
