package chap03;

public class OperatorEx06 {

	public static void main(String[] args) {

		// �� ����Ʈ�� �̿��ؼ� �� ��Ʈ�� ��ġ�� ���� �˾Ƴ���
		 
		int flags = 0b10110110;
		System.out.println(flags >>> 0 & 1); //  0 : 0��° ��Ʈ ���� ��µ�
		System.out.println(flags >>> 1 & 1); //  0 : 1��° ��Ʈ ���� ��µ�
		System.out.println(flags >>> 2 & 1); //  0 : 2��° ��Ʈ ���� ��µ�
		System.out.println(flags >>> 3 & 1); //  0 : 3��° ��Ʈ ���� ��µ�
		System.out.println(flags >>> 4 & 1); //  0 : 4��° ��Ʈ ���� ��µ�
		System.out.println(flags >>> 5 & 1); //  0 : 5��° ��Ʈ ���� ��µ�
		System.out.println(flags >>> 6 & 1); //  0 : 6��° ��Ʈ ���� ��µ�
		System.out.println(flags >>> 7 & 1); //  0 : 7��° ��Ʈ ���� ��µ�
		System.out.println(flags >>> 8 & 1); //  0 : 8��° ��Ʈ ���� ��µ�, �̶� �а��� ���� b��� ǥ���س��� �ڸ��� ���� ���� 0�̱� ������ 0�� ��µ�.
		
	}

}
