package chap02;

public class PrimaryDataType_1 {

	public static void main(String[] args) {

		// boolean true / false
		
		boolean bool1 = true;
		boolean bool2 = false;
// 		boolean bool3 = yes; �̷� �־��� ��û�̰� �ٷ� ���� �Һ� �Һ� �κ�ι�
		
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println();
		
		System.out.println("=====����: ���� ����, 0, ���� ����=====");
		
		byte value1 = -128; // -128 ~ 127 ������ ���� �� ����.
//		byte value11 = -129; // ����ڷ� ������ �ٷ� ������.
		byte value111 = (byte) -129; // �ٵ� �䷡ ������ �� ������? �̰� -129�� byte Ÿ������ ��ȯ�ؼ� �����ϴϱ�.
									// Ư���Ѱ� ���� 127�� ����. ���� �������� -128���� ��ĭ �� ���Ŵϱ� �� ���� ������ 127�� ��µ�. ����.
		
		System.out.println(value1);
		System.out.println(value111);
		
		short value2 = -10; // short : 2byte range (-32768 ~ 32767)
//		short value22 = -32769; ������ �Ѿ�� ���� �߻�	
		short value222 = (short) -32769; // �̰͵� value111�� �����ڱ�� ��ĭ �� �Ѿ�� 32767�� ��.
		
		int value3 = 100;
		long value4 = 100l; // ���� �ڷ�� �ν�
		
		System.out.println(value2);
		System.out.println(value222);
		
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();
		
		System.out.println("=====����: ���� ����, 0, ���� ����=====");
		
		float value5 = 1.2f; // ���ַ��� ����. f �ĺ��ڰ� ���δ�.
		double value6 = -1.5;
		double value7 = 5;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7); // �׳� 5�ε� ��г� �� ���� 5.0���� �Ǽ������� ��ȯ�ؼ� �������
		
	}

}
