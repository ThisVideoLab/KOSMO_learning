package chap10.EX05;

class AA{
	int m = 3;
	void print() {
		System.out.println("AA Class");
	}
}
class BB extends AA{
	int m = 4;
	@Override
	void print() {
		System.out.println("BB Class");
	
	}
}
class CC extends AA{
	int m = 5;
	@Override
	void print() {
		System.out.println("BB Class");
	}
}



public class OverlapInstacefield {

	public static void main(String[] args) {
		
		//1. 객체 생성
		AA aa = new AA();
		BB bb = new BB();
		AA ab = new BB();
		
		CC cc = new CC();
		AA ac = new CC();
		
		//2. 인스턴스 필드 출력
		System.out.println(aa.m); // 3
		System.out.println(bb.m); // 4
		System.out.println(ab.m); // 3 // 인스턴스 필드는 오버라이딩 되지 않습니다.
									   // 인스턴스 메소드는 오버라이딩 된다. AA의 print() 호출시 BB의 프린트가 출력됨.
		
		System.out.println("==========");
		
		System.out.println(cc.m); //5
		System.out.println(ac.m); //3
		
	}

}
