package chap13.EX08.EX01;

//1. �ż����� �Ű� ������ �����ϱ�:

//2. a) ��ü ���� �� �Ű� ������ �����ϴ� ���
//3. b) 

interface AA{ //4. ���� ���̽�, �߻� �޼ҵ带 ������
	public abstract void cry(); //5. �߻� �޼ҵ�, public abstract�� �پ�����.
	void fly();
}

class BB implements AA{ //6. BB�� AA �������̽��� ������ Ŭ����

	public void cry() {
		System.out.println("�۸�: �Ű� ���� ���� �� ���");
	}

	public void fly() {
		System.out.println("���� ���� ���մϴ�: �Ű� ���� ���� �� ���");
	} 
}

class CC{ //7. ��ü�� abc �޼��� ȣ�� �� AA Ÿ���� �Ű������� ����.
	void abc(AA aa){ // ���� �ڽ� Ŭ������ �Ű������� ����� ��� A Ÿ������ �ڵ� ��ĳ������ ��.
		aa.cry();
		aa.fly();
	}
}


public class AnonymousClass_3_1 {

	public static void main(String[] args) {
		
		//8. Ŭ������ ������ ��쿡 �������� �����ؼ� �� ���������� �Ű������� ������  
		
		CC cc = new CC();
		AA aa = new BB(); // BB�� ��üȭ�ؼ� AA Ÿ������ ������. �� �� aa�� ���� ������.
		 
		cc.abc(aa);
		
		System.out.println("==========================");
		
		//9. Ŭ������ ������ ��쿡 ���������� �������� �ʰ� �׳� �Ű������� ����
		
		 cc.abc(new BB());
		
		
		// ������ ��
	}

}
