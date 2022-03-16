package chap10.EX05;

class AAA {	 // static 필드는 오버라이딩 되지 아니함. 메모리 저장 공간이 상이 하기 때문.
	static int m = 3;
}
class BBB extends AAA{
	static int m = 4;
}
class CCC extends AAA{
	static int m = 5;
}

public class OverlapStaticfield {

	public static void main(String[] args) {
		
		//1. 객체 생성 없이 호출 (클래스 명으로 호출함) < == 권장사항
		System.out.println(AAA.m);
		System.out.println(BBB.m);
		
		//2. 객체 생성 후 호출
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		AAA abb = new BBB();
		
		System.out.println(aaa.m); // 3
		System.out.println(bbb.m); // 4
		System.out.println(abb.m); // static이 없다면 오버라이딩이 되서 4가 찍혀야 하지만, 오버라이딩이 안되므로 3이 찍힘
	}
}
