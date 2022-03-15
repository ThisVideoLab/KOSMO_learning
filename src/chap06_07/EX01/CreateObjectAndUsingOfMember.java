package chap06_07.EX01;

/* 클래스(class): 건축에 있어서 모듈화된 집을 찍어내는데 필요한 거푸집
   객체(object): 다른 말로 인스턴스라고 부름. 거푸집인 클래스를 가지고 찍어낸 건축자재들, RAM에서 작동되는 실행코드. 석고보드도 되고 망치도 되고 못도 되고.
                여러 건축자재들을 조립해서 집을 만들듯이 이 오브젝트를 조립해서 프로그램을 만들어냄. 
   객체화(인스턴스화): 객체화시킨다. 클래스로 객체를 생성시켜 메모리에 로드시킨다. 틀로 자재를 찍어서 미리 창고에 저장해둔다.
   				ex) A a = new A();

*/


class A{ // 외부 클래스 // 외부 클래스는 여러개의 클래스를 둘 수 있음. 그러나 퍼블릭 클래스는 오직 하나만 둘 수 있음.
	int m = 3; // 여기서 m은 익히 알고 있는 변수인데, 다만 메써드 블럭이 아닌 클래스 블락에서 선언됨. 이를 따로 빼서
	          //  필드라고 칭함. 필드는 메모리의 힙 영역에 생성되며, 인스턴스화 시켜야 사용이 가능하다.
	void print() { // 메소드 : 절차지향언언의 함수, 객체지향언어에서 함수를 메소드라고 호칭함
		System.out.println("객체 생성 및 활용"); // 앞이 
	}
}

class B{ // 외부클래스
	String name = "홍길동";
	int age = 24;
	String phone = "010-1111-1111";
	
	void printName () {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
	
}

public class CreateObjectAndUsingOfMember { // 

	public static void main(String[] args) {
		A a = new A(); // Class A를 객체화(인스턴스화)시킨다. (RAM에 로드시킨다)
		System.out.println(a.m);
		a.print();
		
		System.out.println("====================");
		
		A b = new A(); // Class A를 객체화 (인스턴스화)시켜서 메모리에 로드시켜놓음.
		System.out.println(b.m);
		b.print();
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("====================");
		
		B bb = new B(); // B Class를 bb라는 이름으로 객체화시킨다.
		bb.printName();
		bb.printAge();
		bb.printPhone();
		
		System.out.println("====================");
		
		B cc = new B();
		cc.printName();
		cc.printAge();
		cc.printPhone();
	}

}
