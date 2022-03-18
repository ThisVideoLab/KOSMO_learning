package chap12.EX05;

interface A{
	double PI =3.14; //1. 잊지말자 public static final 붙은거
	void run();  //2. 잊지말자 public abstract 붙은거
}
class B implements A{
	@Override
	public void run() {
		System.out.println("달립니다");
	}
}

public class Interface_5 {

	public static void main(String[] args) {
		
		//3. 객체 생성 후 출력
		A a1 = new B();
		a1.run();
		
		A a2 = new A() {
			public void run() {
				System.out.println("훨훨 납니다");
			}
		};
		a2.run();
		
		/* API 문서란?
		
		하나의 접점이자 중추적인 회사 내의 기능들을 구현하기 위한 문서. 보통은 PM 급의 관리자들이 작성하고 관리함.
		보통은 interface로 작성된 API 문서를 두고, 각 상황에 맞춰서 팀원들이 implements를 통해 해당 기능을 구현함.
		그 뒤에 그 것을 하나의 생성자로 사용하여 값을 넣어서 객체를 출력하게 됨. 
		
		*/
	}
}
