package chap13.EX09.EX1;

interface A{
	void cry();
	void fly();
}

class C{
	void abc(A a) {
		a.cry();
		a.fly();
	}
}

public class AnonymousClass_4_1 {
	public static void main(String[] args) {

		C c= new C();
		
		//1. Ŭ������ �������� ������, ���������� �����Ͽ� ȣ����.
		
		A a = new A() { //3. �������̽��� ������ �ڽ� �͸� ��ü�� ������ �Ŀ� Ÿ���� A�� ������ ���� ������ ������ �Է�
			@Override
			public void cry() {
				System.out.println("�۸�");	
			}
			public void fly() {
				System.out.println("���� �����ƿ�");	
			}
		};
		c.abc(a);

		//2. Ŭ������ �������� �ʰ�, ���������� ���� ȣ����.
		
		c.abc(new A(){
			@Override
			public void cry() {
				System.out.println("�۸�");
			}
			public void fly() {
				System.out.println("���� �����ٴϱ��");	
			}
		});

	}

}
