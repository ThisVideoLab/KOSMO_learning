package chap18.EX05;

// �޼��� ������ ���� �޼��� ǥ�� : 
	//���� �������� �ʰ�, �����Ǿ� �ִ� �޼ҵ带 �����ؼ� �����.
	// �̸� ���� �޼��� ������� ��

interface A{
	void abc();
}

class B{
	static void bcd() { // static�̶� Ŭ���� �̸����� ȣ���� ������.
		System.out.println("class B�� �޼���");
	}
}

public class RefOfInstanceMethod_Type_2 {
	public static void main(String[] args) {

	//1. ���� �޼��� ���� : �̳� Ŭ������ ó����
		
	A a1 = new A() {
		@Override
		public void abc() { 
			B.bcd(); // static�� ����� ���� �޼����̱� ������ ��ü ���� ���� Ŭ���� ������ ���� ȣ��
		}
	};
	
	//2. ���ٽ� ǥ��
	
	A a2 = () -> {B.bcd();}; //���ٽ� ǥ��
	
	//3. ���� �޼��� ���� 
	// B b = new B(); //������ �ν��Ͻ� ��ü�� ���� �� ������ ��ü�� :: �޼��� ���� �ҷ��� ������
	A a3 = B::bcd; // �����Ǽ� �������� ����� �޼���� �ٷ� ������� ��.
	
	a1.abc();
	a2.abc();
	a3.abc();
	

	//�����ǳ�
	}
}
