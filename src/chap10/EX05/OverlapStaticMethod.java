package chap10.EX05;

class AAAA{
	static void print() {
		System.out.println("AAAA class");
	}
}

class BBBB extends AAAA{
	static void print() {
		System.out.println("BBBB class");
	}
}

public class OverlapStaticMethod {

	public static void main(String[] args) {
		
		//1. 객체 생성 없이 호출: 권장사항
		AAAA.print();
		BBBB.print();
		System.out.println("==========");
		
		//2. 객체 생성 후 호출
		AAAA aaaa = new AAAA(); // A 클래스 호출
		aaaa.print();
		BBBB bbbb = new BBBB(); // B 클래스 호출
		bbbb.print();
		AAAA aabb = new BBBB(); // 원래는 B 클래스가 찍혀야 하는데, static은 override가 안되서 A가 찍힘.
		aabb.print();
	}

}
