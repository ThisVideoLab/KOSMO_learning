package chap05;

public class ValueAssignment_Ex02 {

	public static void main(String []args) {
		
		//1.�迭�� ���Ұ� �����ϴ� ���2
		int[] array1 = new int[3]; // �迭���� array1(�׻� array�� �ʿ䰡 ����). ��ũ��:3.(�̰� �����Ҷ� ���ʷ� 1���ϰ� ��, ���� �Ұ���) 
								   // ���ȣ(index)" 0,1,2(3�̴ϱ� 0���� �����ؼ� 3�� ī����)
								   // ���� ��� array[0],array[1],array[2]
									
		
		array1[0] = 3;
		array1[1] = 6;
		array1[2] = 9;
		
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		int[] bingo1 = new int[3]; // �̷��� ���� �̸��� �� array�� �ʿ�� ����
		
		bingo1[0] = 2;
		bingo1[1] = 4;
		
		System.out.println(bingo1[0] + " + " + bingo1[1]);
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
//		bingo1[2] = 6; // �Ϻη� ���� 2�� �Ҵ����� ����. �׸��� bingo1[2]�� �ҷ����ô�.
		System.out.println(bingo1[2]); // ���� ���� ���� �θ��� 0�� ����.
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		int[] array2 = new int[3];
			array2[0] = 3;
			array2[1] = 6;
			array2[2] = 9;
			
			System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
			
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		//�迭�� ���Ұ� �����ϴ� ���2
		
		int[] array3 = new int[] {3,4,5,6,7,8,9,10};// �̿� ���� new int �ڿ� ���ȣ�� ���ڸ� ���� ��� �߰�ȣ �ȿ� ���� ���� �����ص� ��. ��ũ�� ���� ����.
													// �̷��� �ϸ� ù��° �ڸ����� 0��°, 1��°,.... ������ �ҷ��� ��
		System.out.println(array3[0]); // 0��° �ڸ��� �ִ� 3�� ��µ�
		
		System.out.println();
		System.out.println("===== �׳� �����غ� ���� - �⼮�� ��±� =====");
		System.out.println();
		
		String[] array33 = new String[] {"1��","2��","3��","4��","5��","6��","7��","8��","9��","10��"};
		String[] array333 = new String[] {"���ϴ�","����","���³�","������","���϶�","������","�ٹз�","����","���ܸ�","������"};
		
		for (int i = 0; i < 5; i++ ) {
			System.out.print(array33[i] + " " + array333[i] );
			System.out.println("");// �̷��� �ϸ� �̸� ������ �� ���� ������ �Է��� �� ����.
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		int[] array4;
		array4 = new int[] {3,4,5};
		System.out.println(array4[2]); // index 2 ���� ���� �����
		
		// �迭�� ���Ұ��� �����ϴ� ���3
		int[] array5 = {11,12,13};
		System.out.println(array5[0] + " " + array5[1] + " " +array5[2] + " ");
		
		/* ���� �߻� ���ǻ���
		int array6;
		array6 = {11,12,13};
		System.out.println(array6[0] + " " + array6[1] + " " +array6[2] + " ");
		*/
		
		
		
		System.out.println("-----�����Ѱ輱-----");
	}
}
