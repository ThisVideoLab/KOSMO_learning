package chap13.EX07.EX1;

//1. �������̽��� �߻� �޼ҵ带 ������ (�͸� ���� Ŭ������ ���� ��*) ȣ���ϴ� �� : ��ȸ ��밡��
interface AA{ //2. ���� ���̽�, �߻� �޼ҵ带 ������
	public abstract void cry(); //3. �߻� �޼ҵ�, public abstract�� �پ�����.
	void fly();
}

class BB{
	AA aa= new AA(){//3. �������̽��� ��üȭ �� �� ����. �׷��� �͸� ���� Ŭ������ �����ؼ� ������ ������.
					//4. aa�� �������̽��� ������ �ڽ� Ŭ����. ����� Ŭ���� �̸� ��ü�� ����.
					//5. �����Ϸ��� ������ �̸����� �ڵ� �Ҵ��ϰ� ���ƹ���. ��ȸ���̴ϱ�
			public void cry(){System.out.println("�۸�");};
			public void fly(){System.out.println("���� ���� ���մϴ�");};
		};
		void abc() {
			aa.cry();
			aa.fly();
		}
	}	
	
	class CC implements AA { //6. class C�� A �������̽��� �޼��带 ������ Ŭ����.

		@Override
		public void cry() {
			System.out.println("�۸�");
		}

		@Override
		public void fly() {
			System.out.println("���� ���մϴ�");
		} // # class CC�� A �������̽��� �޼ҵ带 ������ Ŭ������ 
		
		
	}


public class AnonymousClass_2_1 {

	public static void main(String[] args) {

		BB bb = new BB();
		bb.abc();
	}

}
