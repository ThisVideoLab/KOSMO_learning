package chap02;

public class FloatVsDouble {

	public static void main(String[] args) {
		
		// float vs double �� ���е� ����: float�� �Ҽ������� 7�ڸ�����, double�� �Ҽ��� ���� 15�ڸ����� ���е� ����.
		
		float f1 = 1.1234567f; // �Ҽ��� �ƽø� 7�ڸ����� �޾��ְ� �ڿ� �ĺ��� f�� F�� �ٿ���. float�� ���ַ��ϱ�.
		System.out.println(f1);
		
		float f2 = 1.12345689f; // �̹����� �Ҽ��� �ϳ� �� �޾Ƽ� 8�ڸ� ���� ǥ������. 
		System.out.println(f2); // �ٵ� ���� �� �߸��°� �ƴϷ� �� �ٸ��� �� ����
		
		double d1 = 1.123456789012345; // �� ���⵵ 15�ڸ� �޾��ְ�
		System.out.println(d1); // ����غ��� ������
		
		double d2 = 1.12345678901234567890; // �״����� �Ϻη� �� �޾ƺ���
		System.out.println(d2); // �÷�Ʈó�� �ణ ¥�η��� �� ���� ���� �Ҹ�����
		
	}

}
