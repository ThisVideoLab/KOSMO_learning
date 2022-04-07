package chap18.EX04;

//���ٽ��� Ȱ��
//1. �͸� �̳� Ŭ������ Ȱ���ϴ� ���
//2. �޼��� ���� ���: a) �ν��Ͻ� �޼��带 ���� b) ���� �޼��带 ����

interface A{
	void abc();
}
class B{
	void bcd() { // �ν��Ͻ� �޼��� : ��üȭ�ؾ� ȣ���� ������ ������.
		System.out.println("�޼���");
	}
}

public class RefOfInstanceMethod_Type_1 {
	public static void main(String[] args) {

	//1. �ν��Ͻ� �޼��� ���� type 1 < == �͸� �̳� Ŭ����
		
	A a1 = new A(){
		@Override
		public void abc(){ // abc() �޼����� ȣ���ϸ�
			B b = new B(); // B ��ü�� �����ؼ�
			b.bcd(); // bcd()�� �ٽ� �ҷ���
		}
	};
	
	//2. ���� �ó������� ���ٽ����� ǥ����
	A a2 = () -> {
		B b = new B(); // ��ǻ� abc �޼��忡 �� ������ �״�� ������ ��
		b.bcd();
		};
		
	//.3 �ν��Ͻ� ���� ǥ���� type1
	B b = new B(); // �ν��Ͻ� ��ü�� ���� ��������, ��ü��:: �޼ҵ��
	A a3 = b::bcd; // �ν��Ͻ� ���� ǥ�� ..
				   // b ��ü�� ����� :: bcd��� �޼��带 �ٷ� ȣ���ع���
	
	a1.abc();
	a2.abc();
	a3.abc();
	
		
	// ������ ��
	}
}
