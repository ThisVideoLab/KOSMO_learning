package chap02;

 public class TypeCasting_1 {

	public static void main(String[] args) {
		
		// ĳ���� ��� 1: �ڷ����� ����
		
//		int value1 = 5.3; // ���� �߻�. integer���� �������� ���� �ϴµ� �Ǽ����̱� ������.
		int value1 = (int) 5.3; // ĳ������ ����� �ڷ����� �Ǽ����� ������ ��ȯ�� ���� �Ҵ���. �̶� ���� �� ������ ���� ����.
		System.out.println(value1); // �Ҽ��� ������ 5�� ����� ����
		
		long value2 = (long) 10.333; // long�� ������ ��� �����ϴ°��� �Ǽ����� ������.
		System.out.println(value2);
		
		float value3 = (float) 5.8;
		System.out.println(value3);
		
		double value4 = (double) 5;
		System.out.println(value4);
		
		double value5 = 10;
		System.out.println(value5);

		// ĳ���� ��� 2: L �Ǵ� F��� �����ؼ� ĳ����. long : l �Ǵ� L, float : f �Ǵ� F
		
		long value6 = 10L;
		System.out.println(value6);
		
		long value7 = 10l;
		System.out.println(value7);
		
		float value8 = 5.8F;
		System.out.println(value8);
		
		float value9 = 5.8f;
		System.out.println(value9);
		
		
	}

}


