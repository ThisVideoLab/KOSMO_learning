package chap05;

public class ArgumentofMainMethod {

	public static void main(String[] ar) { // ���� �޼ҵ� [�Լ�]	
		
		// �޼ҵ��� �⺻����
		/*
		 
		 void main(String[] args){ // void ����:���ϰ��� ������ �ǹ���.
		 �޼ҵ� ȣ��� ������ �ڵ�;       // main �޼ҵ� ��. ���������� �� �̷� ��
		 						  //( ) ��ȣ �ȿ��� ��ǲ �Ű�����
		 						 // { } �����
		 */
		String a = ar[0]; // ar �谳�������� 0��°���� ���� a�� �Ҵ���
		String b = ar[1];
		String c = ar[2];
		
		// ��Ŭ�� - run as - configuration�� main �ǿ� �ش� Ŭ���� �̸� �Է� - arguement �ǿ� �ȳ��ϼ��� 3 A3.8B �Է� - RUN ����
		
		System.out.println(a+b); 
		System.out.println(b);
		System.out.println(c); // 3���� ��� ��Ʈ�� Ÿ������ ��µ�
		
		System.out.println();
		
		System.out.println(b+1); // 31
		System.out.println(c+1); // 3.81
		System.out.println();
		
		int d = Integer.parseInt(b); // b String = > int ����ȯ
		double e = Double.parseDouble(c); //c String = > double ����ȯ
		
		System.out.println(d+1);
		System.out.println(e+1);
		
		
	}

}
