package chap13.EX03;

//static �̳� Ŭ���� : �ܺ�Ŭ������ �ν��Ͻ� �ʵ� , �ν��Ͻ� �޼ҵ�� ������ �Ұ�
					// �ܺ�Ŭ������ static �ʵ峪 static�޼ҵ�� ���ٰ���

class A{
	int a = 3; // �ν��Ͻ� �ʵ� -> ��äȭ�ؾ� �ܺο��� ������ ������
	static int b =4; // static �ʵ� -> ��ü ���� ���� �ܺο��� Ŭ���� �̸����� ȣ���ؼ� �ٷ� ������ ������.
	void method1() { // �ν��Ͻ� �޼ҵ� -> ��ü ���� �Ŀ� ������ ������
		System.out.println("instance field");
	}
	static void method2() { // static �ʵ� -> ��ü ���� ���� �ܺο��� Ŭ���� �̸����� ȣ���ؼ� �ٷ� ������ ������.
		System.out.println("static method");
	}
	static class B{    // static �̳� Ŭ���� : �ܺΰ�ü�� �������� �ʰ� ��ü��������
		void bcd() {
			// 1. static Ŭ�������� �ܺ� Ŭ������ �ν��Ͻ� �ʵ� ���� (���� �Ұ�)
		//	System.out.println(a);      // �ν��Ͻ� �ʵ� ȣ�� �Ұ� 
			System.out.println(b);      // static �̳�Ŭ�������� �ܺ�Ŭ������ static�ʵ峪 �޼ҵ� ���� ����
			
			// 2. �޼ҵ� ȣ��
		//	method1();	// �ν��Ͻ��޼ҵ� ȣ��Ұ�
			method2();	// static �޼ҵ�� ȣ�Ⱑ��
		}
		
	}
}

public class InnerClass_3 {

	public static void main(String[] args) {
		
		// 1. static�� ���� �̳�Ŭ���� ��ü����
		A.B b = new A.B();      // static �̳� Ŭ������ �ܺ� ��ü �������� ��ü ����
		b.bcd();
		
		

	}

}
