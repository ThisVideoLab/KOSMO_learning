package chap05;

public class Ex03 {

	public static void main(String[] args) {

		// �迭 ����
		int[][] arr1 = new int[][] {{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20}};
		
		System.out.println("===========");
		
		// ���� for���� ���ؼ� ����ϱ�
		
		for (int r = 0; r <arr1.length; r++ ) {
			for (int c = 0; c < arr1[r].length; c++) {
				System.out.print(arr1[r][c] + " ");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("===========");
		
		// ���� ����� for���� ���ؼ� ����ϱ�

		for (int[] arr : arr1) {
			for (int k: arr) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		System.out.println("===========");
		
		// �������� �迭 �����
		int[][]  arr2 = new int [][] {{1,2},{11,12,13},{21,22,23,24,25},{31,32}};
		
		// ���� for���� ���ؼ� ����ϱ�
		
				for (int r1 = 0; r1 <arr2.length; r1++ ) {
					for (int c1 = 0; c1 < arr2[r1].length; c1++) {
						System.out.print(arr2[r1][c1] + " ");
					}
					System.out.println();
				}
				
				
				System.out.println("===========");
				
				// ���� ����� for���� ���ؼ� ����ϱ�

				for (int[] arr22 : arr2) {
					for (int k1: arr22) {
						System.out.print(k1 + " ");
					}
					System.out.println();
				}
		
		
	}

}
