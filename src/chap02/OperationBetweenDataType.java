package chap02;

public class OperationBetweenDataType {

	public static void main(String[] args) {

		// ���� �ڷ��� ���� ����
		int value1 = 3+5; // int +-*/ int = int �� ���·� ������� ��µ�
		int value2 = 8/5; // ���� ����
		float value3 = 3.0f + 5.0f; // float +-*/ float = float �� ���·� ������� ��µ� 
		double value4 = 8.0 / 5.0; // double +-*/ double = double �� ���·� ������� ��µ�
		
		byte data1 = 3;
		byte data2 = 5;
		
		int value5 = data1 + data2; // int���� ���� �ڷ����� ���� ����� int Ÿ������ ��ȯ��. �Ƹ� ���� ��Ģ�ε���.
									// byte value5 = data1 + data2; ������ �ٷ� ���� �ջ�
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		//�ٸ� �ڷ��� ���� ����
		
		double value6 = 5 + 3.5; // int + double = double �� ���·� ������� ��µ�
//		int value66 = 5 + 3.5; // ���� 3.5�� �����̶� int�� ǰ�� ���ؼ� ���� �ջ� 
		int value666 = (int) (5 + 3.5); // 
		int value6666 = (int)5 + (int)3.5; //
		
		double value8 = 5/2.0;
		byte data3 = 3;
		short data4 = 5;
		
		int value9 = data3 + data4; // int���� ���� ������ Ÿ���� ������ ��쿡�� int Ÿ������ ��ȯ��.
//		short value99 = data3 + data4; // short Ÿ���� int���� �۱� ������ ���� �ջ�
		double value10 = data3 + data4;
		
		System.out.println(value6);
		System.out.println(value666);
		System.out.println(value6666);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		
		
		
	}

}
