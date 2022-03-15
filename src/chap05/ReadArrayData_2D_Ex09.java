package chap05;

public class ReadArrayData_2D_Ex09 {

	public static void main(String[]args){
		int[][] array1 = array1 = new int[2][3];
		System.out.println(array1.length); // 2차원 배열인 경우 .length (행의 갯수를 출력
		System.out.println(array1[1].length); // 행의 인덱스 0의 열의 갯수
		System.out.println(array1[1].length); // 행의 인덱스 1의 열의 갯수
		
		
		int[] array11 = new int[10];
		System.out.println(array11.length); // 1차원 배열인 경우 .length (열의 갯수를 출력 
		System.out.println("==========");
		
		//차원 배열 출력 방법1
		int[][] array2 = new int[][] {{1,2},{3,4,5}};
		System.out.println(array2.length); // 행의 갯수 : 2
		System.out.println(array2[0].length); // 0행의 열의 갯수 : 2
		System.out.println(array2[1].length); // 1행의 열의 갯수 : 3
		System.out.println("==========");
		
		// 배열의 index 번호로 출력하는 방법
		System.out.println(array2[0][0] + " " + array2[0][1]);
		System.out.println();
		System.out.println(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
		System.out.println();
		
		System.out.println("=====이중 for문을 사용한 출력=====");
		
		// 이중 for 문을 사용해서 출력하는 방법
		
		for (int r = 0; r < array2.length; r++) { // 바깥쪽 for문은 행을 루프 돌림
			for (int c = 0; c < array2[r].length; c++) { // 안쪽 for 문은 열을 루프 돌림
				System.out.print(array2[r][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==== 이중 향상된 for문 ======");
		
		for (int[] array : array2) { // 2차원 배열의 행의 값을 1차원 배열변수의 담고
			for(int k: array) {  // 배열 값을 변수에 담아서 출력함
				System.out.print(k +" ");
			}
			System.out.println();
		}
		/*  1. 바깥 for문에서 array2의 첫행을 불러옴. 그 값을 array에 담아 2차원 배열의 일부를 1차원 1배열로 만든 후 내부 for문으로 들어감.
		 *  2. 내부 for 문에서 array 값을 [0][0]부터 [0][n]까지 순차적으로 k의 값에 넣어서 실행문으로 출력 
		 *  3. 종료되면 내부 for문이 종료된 후에 내부for문의 프린트라인으로 한 줄을 내려감.
		 *  4. 다시 바깥 for문으로 루프르 시작해서 이번엔 array2의 두번째 행을 불러와서 1~3을 반복함.
		 *  5. 만약 array2에 n 행이 있다면 이 과정을 n회 반복한 후에 종료됨
		 */
		
	}
	
}
