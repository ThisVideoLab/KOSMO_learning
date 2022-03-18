package chap10.EX06;;

class AA{
	int m;
	void abc() {
		System.out.println("AA 클래스의 abc()");
		System.out.println(m);
	}
}
class BB extends AA {
	void abc() {
		System.out.println("BB 클래스의 abc()");
	}
	void bcd () {
		super.abc(); 
		super.m = 300;
		super.abc(); // 부모의 abc 호출
	}
	
}

public class SuperKeyword_2 {

	public static void main(String[] args) {
		
		AA bb = new AA();
		bb.abc();
	}

}
