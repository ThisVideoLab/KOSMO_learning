package chap16.EX06.EX1;

// GenericPrinter �� ���� ��ü [���]

public class Plastic extends Meterial{

	public void doPrinting() {			// �߻�޼ҵ带 ����
		System.out.println("�ö�ƽ ���� ��� �մϴ�");
	}
	
	@Override
	public String toString() {
		return "���� �ö�ƽ �Դϴ�";
	}


}
