package chap10.EX06;;

class AA{
	int m;
	void abc() {
		System.out.println("AA Ŭ������ abc()");
		System.out.println(m);
	}
}
class BB extends AA {
	void abc() {
		System.out.println("BB Ŭ������ abc()");
	}
	void bcd () {
		super.abc(); 
		super.m = 300;
		super.abc(); // �θ��� abc ȣ��
	}
	
}

public class SuperKeyword_2 {

	public static void main(String[] args) {
		
		AA bb = new AA();
		bb.abc();
	}

}
