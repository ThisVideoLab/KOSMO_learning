package chap10;

// this: �ڽ��� ��ü
// �������̵�: �θ��� ���� �޼���� ������ ���� �Ǵ� �������� �ƴ���.

class A{
	void abc() {
		System.out.println("A Ŭ������ abc �޼����Դϴ�.");
	}
	
}
class B extends A{
	void abc() {
		System.out.println("B Ŭ������ abc �޼����Դϴ�.");
	}
	void bcd(){
		abc(); //  this.abc �� ������. �� �� this�� �ڽ��� ��ü
		super.abc();
	}
}

public class SuperKeyword_1 {

	public static void main(String[] args) {
		
		//1. ��ü ����
		B bb = new B();
		
		//2. �޼��� ȣ��
		bb.bcd(); // BŬ������ �޼��� ȣ��
	}

}
