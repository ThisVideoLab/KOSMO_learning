package chap13.EX06;

//1. �������̽��� �߻� �޼ҵ带 ������ (Ŭ������ ���� ��*) ȣ���ϴ� �� : ��ȸ ��� ����

interface AA{ //2. ���� ���̽�, �߻� �޼ҵ带 ������
	public abstract void cry(); //3. �߻� �޼ҵ�, public abstract�� �پ�����.
	void fly();
}

class BB{
	AA a = new CC();
	void abc() {
		a.cry();
		a.fly();
	}
	
	
	class CC implements AA { // class C�� A �������̽��� �޼��带 ������ Ŭ����.

		@Override
		public void cry() {
			System.out.println("�۸�");
		}

		@Override
		public void fly() {
			System.out.println("���� ���մϴ�");
			
		} // # class C�� A �������̽��� �޼ҵ带 ������ Ŭ������ 
		
		
	}
}

public class AnonymousClasss_1_1 {

	public static void main(String[] args) {
		BB bb = new BB(); // 
		bb.abc();
		

	}

}
