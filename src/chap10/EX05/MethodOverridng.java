package chap10.EX05;
class A {
	
	// �ν��Ͻ� �޼ҵ�: ��Ӱ��迡�� �޼ҵ� �������̵��� �ν��Ͻ� �޼ҵ常 �������̵� ��. (�ʵ�� �ȵ�)
	// ��� ���迡�� �ν��Ͻ� �ʵ�, ����ƽ �ʵ�, static keyword�� �� �ʵ�. static�� �� �޼ҵ�� ��������� ���� �ƴ���.
	// �������̵� �Ҷ��� �ñ״��İ� ���ƾ� ��. ����Ÿ��, �޼ҵ��, �Ű����� Ÿ��, �Ű����� ������ ���ƾ� ���������� �ҷ���.
	
	void print() {
		System.out.println("Class A ���");
	}
}
class B extends A{

	@Override
	void print() {
		System.out.println("Class B ���");
	}
}

class C extends A{

	@Override
	void print() {
		System.out.println("Class C ���");
	}
}


public class MethodOverridng {

	public static void main(String[] args) {
		//1. A Ÿ��, A ������
		A a = new A();
		a.print();
		
		//2. B Ÿ��, B ������
		B b = new B();
		b.print();
		
		//3. C Ÿ��, C ������
		C c = new C();
		c.print();
		
		//4. A Ÿ��, B ������ (�������̵� �Ǿ� A�� print() ȣ���, B�� print() ��µ�.
		A ab = new B();
		ab.print(); // A�� print() �޼ҵ� ȣ�� ==> B�� print() �޼��尡 ��µ�.
		
		A ac = new C();
		ac.print(); // A�� print() ȣ�� ==> B�� print() ��µ�.
		
		A[] arr = {ab, ac}; // �迭�� A Ÿ���� ��ü�� ������
		
		for (int i = 0; i <arr.length; i++) {
			arr[i].print();
			}
		for (A k: arr) {
			k.print();
		}
	}

}
