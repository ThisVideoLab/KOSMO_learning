package chap10.EX04;

// �޼ҵ� �������̵� (MethodOverridng)
// 1. �ݵ�� ��� ���迡���� �޼��� �������̵��� ������.
// 2. �θ� Ŭ�������� ����� �޼��带 �ڽ� Ŭ�������� ���Ӱ� �����ؼ� ����ϴ� ��.
// 3. @override ��� ������̼Ǥ��� ����ϸ� �޼ҵ� �����ǽ� ������ �� �� �� ����.
// 4. �ñ״��İ� ���ƾ� �Ѵ�. (�޼ҵ��, �Ű����� Ÿ��, �Ű����� ����)
// 5. �޼����� �� ���� �����ڰ�

class A{
	void print() {
		System.out.println("������: A Ŭ����");
	}
}

class B extends A{
	@Override 	// �޼ҵ� �������̵带 �ϸ� �ݵ�� �θ��� �޼ҵ带 �������ϵ��� ����. 
	void print(){  // @Ovrrid  ��� ������̼��� ����ϸ� �޼ҵ� �����ǽ� ������ ���� �� �ִ�.
					// ������ �޼ҵ�� ���ǵ�
		System.out.println("������: B Ŭ����"); 
	}
}

public class MethodOverridng {

	public static void main(String[] args) {
		//1. A Ÿ��
		System.out.println("1. A Ÿ��");
		
		A aa = new A();
		aa.print(); // A Ŭ������ print() ���
		System.out.println();
		
		
		// 2. B Ÿ��
		System.out.println("2. B Ÿ�� ");
			
		B bb = new B();
		bb.print();		//  B Ŭ������ print() ���
		System.out.println();
		
		// 3. A Ÿ�� ��ĳ���� <==
		System.out.println("3. A Ÿ�� ��ĳ����");
		
		A ab =new B();
		ab.print();  // Ŭ������ print ��� ���� ���ε�
		System.out.println();
		
		//ab.print() A Ŭ������ print�� ȣ��, ���� ���ε��� ���� Ŭ���� B�� print() �� ���
		
	}

}
