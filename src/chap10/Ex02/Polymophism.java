package chap10.Ex02;

// 다형성 : 객체의 상속 관계에서 여러 데이터 타입으로 변환 가능한 속성

class A {}
class B extends A{}
class C extends B{}
class D extends B{}

public class Polymophism {

	public static void main(String[] args) {
		//1 업캐스팅 (자동으로 변환) " 생략시 컴파일러가 자동으로 추가해줌.
		A ac = new A(); // C -> A // A 는 곧 C이다. AC는 A, B, C 필드 모두 포함, A의 필드와 메소드만 접근
		A ab = new B(); // B -> A // B 는 곧 A이다. ab는 A, B의 필드와 메소드가 포함, A의 필드와 메소드만 접근
		B bd = new D(); // 
		C c = new C(); // 
		
		
		//객체를 생성할 수 없는 경우 (상속)
		
		// B b = new A(); // 생성 오류 왜냐면 부모가 자식이 된 경우라서. 고로 따로 다운 캐스팅 해줘야 함
		// c cc1 = new B(); //
		// D dd1 = new B();
		// C cd1 = new D(); // C와 D는 모두 B를 상속한다는 점 말고는 관계가 없어서 성립이 불가능 함.
		
		// 3. 다운캐스팅 부모를 자식으로 수동변환 함 > 캐스팅이 불가능하면 실행시 런타임 오류가 발생함
			// 다운 캐스팅이 불가능한 경우: 다운 캐스팅데이터 파일이 포함되어 있지 않은 경우
		A aa = new A();
		// B b1 = (b) a;
		// java.lang.ClassCastException: 다운 캐스팅 시 객체 내의 해당 타입이 존재하지 않는 경우
		// C cc2 = (C) aa; // aa는 c 타입을 내포하지 않았는데 다운캐스팅 할 경우에 실행시 오류가 발생함.
		
			// 컴파일 오류 : 프로그램을 실행전에 이클립스라 체크해서 빵꾸남
			// 런타임 오류 : 이클립스는 아임파인했는데 막상 굴려보니 빵꾸남
		
		//4. 다운 캐스팅이 가능한 한 경우 (수동변환 ) 객체 내부에 자식 데이터 타입을 가지고 있으면 캐스팅 가능
		A ac3 = new C(); // ac3는 A, B, C 포함. A, B,C 모두 사용 가능
		
		B ac5 = (B) ac3; // A타입으로 잘  살던 ac3을 다운캐스팅해서 B타입으로 만들어서 ac5 객체명으로 저장함
		C AC6 = (C) ac3; //  A타입으로 잘  살던 ac3을 다운캐스팅해서 c타입으로 만들어 놓음
		
		A ad2 = new D(); //
		B bd3 = (B) ad2;
		D dd4 = (D) ad2;
		
		
	}

}
