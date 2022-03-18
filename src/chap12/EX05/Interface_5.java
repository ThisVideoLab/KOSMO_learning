package chap12.EX05;

interface A{
	double PI =3.14; //1. �������� public static final ������
	void run();  //2. �������� public abstract ������
}
class B implements A{
	@Override
	public void run() {
		System.out.println("�޸��ϴ�");
	}
}

public class Interface_5 {

	public static void main(String[] args) {
		
		//3. ��ü ���� �� ���
		A a1 = new B();
		a1.run();
		
		A a2 = new A() {
			public void run() {
				System.out.println("���� ���ϴ�");
			}
		};
		a2.run();
		
		/* API ������?
		
		�ϳ��� �������� �������� ȸ�� ���� ��ɵ��� �����ϱ� ���� ����. ������ PM ���� �����ڵ��� �ۼ��ϰ� ������.
		������ interface�� �ۼ��� API ������ �ΰ�, �� ��Ȳ�� ���缭 �������� implements�� ���� �ش� ����� ������.
		�� �ڿ� �� ���� �ϳ��� �����ڷ� ����Ͽ� ���� �־ ��ü�� ����ϰ� ��. 
		
		*/
	}
}
