package chap18.EX06;

interface A{
	void abc(B b, int k);
}

class  B{
	void bcd (int k) {
		System.out.println("Ŭ���� B�� ���� "+ k +" �Է�");
	}
}

public class RefOfInstanceMethod_Type_2_1 {
	public static void main(String[] args) {
		
		//�ν��Ͻ� �޼��� ����  Type 2
		// �͸� �̳�Ŭ����
		
		A a1 = new A() {
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		// ���ٽ� ǥ��
		
		A a2 = (B b, int k)-> {b.bcd(k);};
		
		A a3 = B::bcd; // �ν��Ͻ� �޼��峪 B ��ü�� ��ǲ �޾Ƽ� bcd �޼��� ȣ��
					   // ��ü��::�޼����;  ���� �����ϰ� ������
					   // B ���� �޼��带 ȣ���� ��, �ν��Ͻ� �޼��带 ȣ�������� �Ű������� ��ü�� �Է°����� ��
		
		B b = new B();
		
		a1.abc(b, 7);
		a1.abc(b, 8);
		a1.abc(b, 9);
		

	//�����ǳ�
	}
}
