package chap10.EX04;

// �޼ҵ� �����ε� (Method Overloading) vs �޼ҵ� �������̵� (Method Overriding)

	// �޼ҵ� �����ε�: ������ �޼ҵ� �̸����� (�ŰԺ��� Ÿ��, �Ű����� ��)�� ���� �ش� �޼ҵ尡 ȣ���
	// -- ��Ӱ��� ������ ����, �����ڿ��� ���� �����

	// �޼ҵ� �������̵�: �ݵ�� ��� ���迡�� �����.
	// �θ��� �޼ҵ带 �ڽĿ��� ���Ӱ� �����ؼ� �����.
	//		1. ��Ӱ����� ���� ���� �־�� ��
	//		2. �޼ҵ��� �ñ״��� (�޼ҵ��, �Ű����� ���� ,�Ű����� Ÿ��) �� ��ġ�ؾ� ��.
	//		3. �ڽĿ��� �θ��� ���������ڿ� ���ų� �� ���� ������� �Ѵ�.
	
class Ab{
	
	void print1(){
		System.out.println("Ab Ŭ������ print1()");
	}

	void print2(){
		System.out.println("Ab Ŭ������ print2()");
	}
}

class Bc extends Ab{
	@Override
	void print1() { // �������̵�
		System.out.println("Bc Ŭ������ print1()");
	}
	
	void print2(int a) { // �����ε�
		System.out.println("Bc Ŭ������ print2()");
	}
}

class Aaa1{
	protected void abc() {
		
	}
	
}

class B11 extends Aaa1 {
	@Override
	public void abc() {}
}
class B21 extends Aaa1 {
	@Override
	protected void abc() {}
}

/*
class B3 extends Aaa {
	@Override
	default void abc() {} // ���� �߻� : �������̵� �� �� �޼ҵ��� ���� ������ ������ ���� �� ����
}

class B4 extends Aaa {
	@Override
	private void abc() {} // ���� �߻� : �������̵� �� �� �޼ҵ��� ���� ������ ������ ���� �� ����
}
*/



public class Overloading_vs_Overriding {

	public static void main(String[] args) {

		// 1. A Ÿ�� ����
		
		Ab ab1 = new Ab();
		ab1.print1(); // A Ŭ������ print1 ȣ��
		ab1.print2(); // A Ŭ������ print2 ȣ��
		
		// 2. Bc Ÿ�� ����, ������ ȣ�� Bc
		
		Bc bc1 = new Bc();
		bc1.print1(); // Bc Ŭ������ print1()�� ȣ��
		bc1.print2(); // Ab Ŭ������ print2()�� ȣ�� : �θ� Ŭ������ �޼ҵ� ȣ��
		bc1.print2(3); // Bc Ŭ������ print3()�� ȣ�� : �ڽ� Ŭ������ �޼ҵ� ȣ��
		
		System.out.println("==============================");
		
		// 3. Ab Ÿ������ ���� �� �Ŀ� Bc Ÿ�� ������ ȣ��
		
		Ab cc = new Bc();
		cc.print1(); // Bc Ŭ������ print1() ��� -> �������̵� �Ǿ� �־ ���õ�
		cc.print2(); // Ab Ŭ������ print2() ��� -> �����ε��� �׷��� �����
		cc.print2(); //
		
		

		
		
		// ������ ��
	}

}
