package chap13.EX05;


// ���� Inner Ŭ������ ������ ���� �����Ǵ� Ŭ���� ���Ͽ� ���� �˾ƺ���
// ���� Inner Ŭ������ �޼��� ���ο� ����� Ŭ������ �ǹ���. 

class A{
	void abc() {
		class B{}      // A$1B.class // A Ŭ���� ������ ù��° B
		class C{}      // A$1C.class // A Ŭ���� ������ ù��° C
	}
	
	void bcd(){
		class C{}      //  A$2C.class // A Ŭ���� ������ �ι�° C
		class D{}		// A$1D.class // A Ŭ���� ������ ù��° C 
	}
	
	void cde() {
		class B{}      //  A$2B.class // A Ŭ���� ������ �ι�° B
		class C{}		// A$3C.class // A Ŭ���� ������ ����° C
	}
}


public class InnerClass_5 {

	public static void main(String[] args) {

	}

}
