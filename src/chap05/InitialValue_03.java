package chap05;

public class InitialValue_03 {

	public static void main(String[] args) {

		//1. �޸��� �ʱⰪ - �⺻ �ڷ����� ���� �ڷ����� ��
		
		// int value1; �⺻ �ڷ����� �ʱⰪ�� �Ҵ����� �ʾҴٸ�
		// System.out.println(value1); �� ������ ������ �ջ���
		// int[] value2; �̳༮�� �迭 ���� �ڷ����̶�� ���� �ؼ�
		// System.out.println(value2); �� ������ �ٷ� ���� ��
		
		/* ���� ������ �ش� ������ ��ġ���� ������ �ִ�. ���� ���ڸ� �ż��� 71���� ���� �ּҿ� ����.
		   �ݸ� �� ������ �ش� ���� ������ ���ֹ��� �������� ǰ�� �ִ� ������.
		   �̶� �⺻ �ڷ����� �⺻������ �⺻�� ���� �����ڷ� ǰ�� ����. �׷��� ������ ������ ����(���ֹ� �Ҵ�)�� ���� �ʾƵ�
		   ���(������ ������ �ҷ���)�� �ϸ� �ڵ����� �⺻���� ���(�⺻ �����ڰ� �������� �ϰ� ����)
		   �ݸ� ���� �ڷ����� ������ �����ڰ� ����. �׳� ������ �����س����� �� ���̱� ������ ������ ����.
		   ��� �̰� ����̸� �� ����ž�? ��� ��� ������ ��. �׷��Ƿ� �ݵ�� ������ ������ ���� �����ڸ� ������� ��
		   
		   �� �ڷ��� �� �迭 �⺻��
		   boolean: false, integer: 0, double: 0.0,
		 */
		
		
		int value3 = 0;
		System.out.println(value3); // �̳༮�� ����� ������ ��ť�� �ؼ� ���� �۵��� 
		
		int[] value4 = null; // ���� �ڷ����� �ʱⰪ���� null, �� ���鰪�� �Է���
		System.out.println(value4); // null�� ��µ�
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		//2. heap �޸��� �ʱⰪ (���� �ʱ�ȭ, heap ���� ���� �ڷ����� ���� ������ ���ÿ� �ڵ� �Ҵ��)
		
		boolean[] array1 = new boolean[3];
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]); // ���� ��̴� ���� ������ ��ó�� �������
																		   // �׸��� new �� �ٿ��� �迭 ������ �����ϸ� �� �������� �ڸ����� �ʱⰪ�� ���� �Ҵ��. �̶� boolean�� false�� �Ҵ��. 
		                                                                   // int�� �ݵ�� ���� ��������� ������, boolean Ÿ�� ���� ��� �ֵ��� �ʱⰪ�� �ִ� ��찡 ����.
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		for ( int i = 0; i<3; i++) {
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		System.out.println("��ü�� �޸� �ּ�: " + array1); // �̰��� �迭���� ��ü ��ü�� �޸� ������.
		System.out.println("��ü�� ���� ������ ���: " + array1.length); //
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println("array[" + i + "]��° ���� ���� : " + array1[i]); // �̰� ª�Ƽ� �� ���� �ȵ����� ������, 200��¥���� ������ ���� ������ ��
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		int [] array2 = new int[3]; // 0 �� �⺻������ �Ҵ��
		for (int i = 0; i< array2.length ; i++ ) {
		System.out.print(array2[i] + " ");
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		double[] array3 = new double[3];
		for (int i = 0 ; i<array3.length;i++) {
		System.out.print(array3[i] + " ");	
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		// ������ �ڷ��� �迭�� ��쿡�� �⺻ ���� null
		
		String[] array4 = new String[3];
		for (int i = 0 ; i < array4.length; i++) {
			System.out.print(array4[i] + " ");
		}
		
	}

}
