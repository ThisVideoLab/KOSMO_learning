package chap13.EX08;

// Ŭ���� ���� �� ���� ������ ��� / �̻���� ��� �Ű� ������ ��ü�� ����

interface A{
	void abc();
}

class B implements A{

	@Override
	public void abc() {
		System.out.println("�Ű����� ����");
	}
	
}


class C{		// cde �޼ҵ忡 ��ǲ������ AŸ���� ��ü a�� �޽��ϴ�
	void cde( A a) {			// Cde �޼ҵ带 ȣ���ϸ鼭 �Ű������� AŸ���� ��ü�� ����
		a.abc();
	}
}


public class AnonymousClass_3 {

	public static void main(String[] args) {
		 
		C c = new C();
		A a  = new B (); // ���� ���� ����
		
		c.cde(a);

	}

}
