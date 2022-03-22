package chap12.EX01;

abstract class D{ // Ŭ���� ���ο� �߻� �޼ҵ尡 �� ��� abstract Ŭ������ �Ǿ�� �Ѵ�.
	
	abstract void print(); // �ڽ� Ŭ�������� �ݵ�� ���� ���� �޼��带 �������ϴ� ���� ������� �� �ְ� ��.
	
}

class E extends D {
	@Override
	void print() {
		System.out.println("E Ŭ������ print()");
	} // �ڽ� Ŭ������ �߻� Ŭ������ �޼��带 �������ؾ� ��
}

public class AbstractClass_3 {

	public static void main(String[] args) {

		//1. ��äȭ�ؼ� ��� (��ü 3�� ������ print() �޼��� ���
		
		D dd1 = new E();
		D dd2 = new E();
		D dd3 = new E();
		
		dd1.print();
		dd2.print();
		dd3.print();
		
		
		
		System.out.println("==========================");
		//2. �͸�Ŭ������ �����ؼ� ��� ( print() �޼��� 3�� ���)
		
		D dd4 = new E() {
			void print() {
				System.out.println("E Ŭ������ print()");
			}
		};
		dd4.print();
		
		D dd5 = new E() {
			void print() {
				System.out.println("E Ŭ������ print()");
			}
		};
		dd5.print();
		
		D dd6 = new E() {
			void print() {
				System.out.println("E Ŭ������ print()");
			}
		};
		dd6.print();
		
		// ������ ��
	}
}
