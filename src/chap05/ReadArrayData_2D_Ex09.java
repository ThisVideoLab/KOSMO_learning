package chap05;

public class ReadArrayData_2D_Ex09 {

	public static void main(String[]args){
		int[][] array1 = array1 = new int[2][3];
		System.out.println(array1.length); // 2���� �迭�� ��� .length (���� ������ ���
		System.out.println(array1[1].length); // ���� �ε��� 0�� ���� ����
		System.out.println(array1[1].length); // ���� �ε��� 1�� ���� ����
		
		
		int[] array11 = new int[10];
		System.out.println(array11.length); // 1���� �迭�� ��� .length (���� ������ ��� 
		System.out.println("==========");
		
		//���� �迭 ��� ���1
		int[][] array2 = new int[][] {{1,2},{3,4,5}};
		System.out.println(array2.length); // ���� ���� : 2
		System.out.println(array2[0].length); // 0���� ���� ���� : 2
		System.out.println(array2[1].length); // 1���� ���� ���� : 3
		System.out.println("==========");
		
		// �迭�� index ��ȣ�� ����ϴ� ���
		System.out.println(array2[0][0] + " " + array2[0][1]);
		System.out.println();
		System.out.println(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
		System.out.println();
		
		System.out.println("=====���� for���� ����� ���=====");
		
		// ���� for ���� ����ؼ� ����ϴ� ���
		
		for (int r = 0; r < array2.length; r++) { // �ٱ��� for���� ���� ���� ����
			for (int c = 0; c < array2[r].length; c++) { // ���� for ���� ���� ���� ����
				System.out.print(array2[r][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==== ���� ���� for�� ======");
		
		for (int[] array : array2) { // 2���� �迭�� ���� ���� 1���� �迭������ ���
			for(int k: array) {  // �迭 ���� ������ ��Ƽ� �����
				System.out.print(k +" ");
			}
			System.out.println();
		}
		/*  1. �ٱ� for������ array2�� ù���� �ҷ���. �� ���� array�� ��� 2���� �迭�� �Ϻθ� 1���� 1�迭�� ���� �� ���� for������ ��.
		 *  2. ���� for ������ array ���� [0][0]���� [0][n]���� ���������� k�� ���� �־ ���๮���� ��� 
		 *  3. ����Ǹ� ���� for���� ����� �Ŀ� ����for���� ����Ʈ�������� �� ���� ������.
		 *  4. �ٽ� �ٱ� for������ ������ �����ؼ� �̹��� array2�� �ι�° ���� �ҷ��ͼ� 1~3�� �ݺ���.
		 *  5. ���� array2�� n ���� �ִٸ� �� ������ nȸ �ݺ��� �Ŀ� �����
		 */
		
	}
	
}
