package chap05;

public class RectangleArrayDefinition {

	public static void main(String[] args) {

		// 1. 2���� �迭 �����ϱ�
		
		
		// ����� �Ҵ��� ���ÿ�
		int[][] array1 = new int[3][4];  //int [���] [����]
		
		//����� �Ҵ��� ����
		int[][] array2;
		array2= new int[3][4];
		
		// ���������� �ʱⰪ : int 0
		System.out.println(array1[0][2]); // 2���� �迭�� ����� ���� �Ҵ����� �ʾұ� ������, �ʱⰪ�� 0�� ��µ�.
		
		// 2. 2���� �迭 �����ϱ� 2
		int array3[][] = new int[3][4];
		int array4[][];
		array4= new int [3][4];
		
		// 3. 2���� �迭 �����ϱ� 3 
		int[] array5[] = new int [3][4];
		int[] array6[];
		array6 = new int [3][4];
		
		//4. �پ��� �ڷ����� �迭 ���� (�⺻ �ڷ��� �迭, ���� �ڷ��� �迭)
		boolean [][] array7 = new boolean[3][4];  // false �ʱⰪ
		int [][] array8 = new int[2][4];  // 0���� �ʱⰪ
		String[][] array10 = new String[2][6]; // 0.0 ���� �⺻��
		
		
		
	}

}
