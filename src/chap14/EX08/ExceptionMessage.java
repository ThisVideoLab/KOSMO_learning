package chap14.EX08;

public class ExceptionMessage {
	public static void main(String[] args) {
		
		//1. ���� ��ü ������ �޽��� �������� ���� ���
		
		try {
			throw new Exception(); // ���ܸ� ������ �����ؼ� ����. ���ܸ� ������ �޽����� ���� ����.
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("========================");
		
		//2.  ���� ��ü ������ �޽��� �����ϴ� ���
		try {
			throw new Exception("���� �޽��� ���"); // �̷��� ������ ����鼭 �޽����� �־ �����Ⱑ ������.
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	// ������ ��
	}
}
