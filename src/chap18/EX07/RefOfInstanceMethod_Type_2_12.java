package chap18.EX07;

interface A{
	int abc(String str);
}


public class RefOfInstanceMethod_Type_2_12 {
	public static void main(String[] args) {
		
		//�ν��Ͻ� �޼��� ���� Type2: ���� �޼��� ����
		//1. �͸� �̳� Ŭ����
		A a1 = new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		
		//2. ���� ǥ����
		A a2 = (String str) -> {return str.length();};
		
		//3. �ν��Ͻ� �޼��� ���� Type 2
		A a3 = String::length; // String::length ��ü��::�޼����
		
		System.out.println(a1.abc("�ȳ�"));  // �Ʒ� �Է¿� ���� ���ڼ����� ǥ����
		System.out.println(a1.abc("�ȳ��ϼ���"));
		System.out.println(a1.abc("�ȳ��ϼ��� �ݰ����ϴ�"));
		
		
	//�����ǳ�
	}
}
