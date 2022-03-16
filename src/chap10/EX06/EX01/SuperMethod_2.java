package chap10.EX06.EX01;

// 자식 객체를 생성할 때 부모 클래스의 기본 생성자를 먼저 호출 한 뒤에 본인의 매개변수가 일치하는 녀석을 최종적으로 호출함. 특정 매개변수를 넣으려면 자식이 매개변수를 넣어 불러야 함.
// 모든 자식 객체의 생성자에는 super();가 생략되어 있음. 그래서 별도로 적지 않아도, ()값에 해당하는 부모 클래스의 기본 생성자가 출력되는 거임.
class A{
	A(){
		System.out.println("A클래스의 기본 생성자");
	}
	A(int a){
		System.out.println("A class의 매개변수 정수 1생성자 : " + a);
	}
	A(int a, int b){
		System.out.println("A class의 매개변수 정수 1생성자 : " + a + "," + b);
	}
}
class B extends A{
	B(){
		System.out.println("B클래스의 기본 생성자");
	}
	B(String a){
		super(3,5);
		System.out.println("B class의 문자열 1 입력 : "  + a);
	}
}
class C extends B{
	C(){
		// super(); 가 생략된 상태. 그래서 C 생성자를 호출하면 부모인 B의 기본 생성자를 호출, B생성자는 다시 A의 기본 생성자를 호출해서 위에서부터 내려옴.
		// 
		super("C에서 호출");
		System.out.println("C클래스의 기본 생성자");
	}
	C(int a){
		System.out.println("C class의 매개변수 정수 1생성자 : " + a);
	}
}	


public class SuperMethod_2 {

	public static void main(String[] args) {
		C c = new C(); //
		System.out.println("===================");
		C cc = new C(1);
		
		
	}

}
