package chap05;

public class NonRectangleArray_Ex08 {

	public static void main(String[] args) {

		//1. 비정방형(NonRectangle) 선언과 값 대입 방법 1
		// 비정방형이란? 행에 따라서 열의 갯수가 각각 다르다
		
		int[][] array1 = new int [2][]; // 행만 지정하고 일단 열은 미지정
		array1[0] = new int[2]; // 0행, 즉 1번째 행을 불러온 후에  new로 그 행의 열을 2개로 지정해줌. 그러면 미지정했던 열이 확정됨. 이것은 해당 행에 국한된 것. 전역 지정은 아님. 
		array1[0][0] = 1;
		array1[0][1] = 2;
		array1[1] = new int[3]; // 그리고 미지정된 1행, 즉 2번째 행의 값을 이렇게 다르게 지정도 가능함.
		array1[1][0] = 3;
		array1[1][1] = 4;
		array1[1][2] = 5;
		
		System.out.print(array1[0][0] + " " + array1[0][1]);
		System.out.println();
		System.out.print(array1[1][0] + " " + array1[1][1] + " " + array1[1][2]);
		System.out.println();
		System.out.println("==========");
		
		int [][] array2 = new int[2][]; // 주로 초기값을 알 수 있는 경우, 실무에서는 보통 모르고 불러와서 씀
		array2 [0] = new int[] {1,2};
		array2 [1] = new int[] {3,4,5};
		
		System.out.print(array2[0][0] + " " + array2[0][1]);
		System.out.println();
		System.out.print(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
		System.out.println();
		System.out.println("==========");
		
		
		// 비정방형(NonRectangle) 선언과 값 대입 방법 2
		
		int[][] array3 = new int[][] {{1,2},{3,4,5}}; // 주로 초기값을 알 수 있는 경우, 실무에서는 보통 모르고 불러와서 씀
		
		System.out.print(array3[0][0] + " " + array3[0][1]);
		System.out.println();
		System.out.print(array3[1][0] + " " + array3[1][1] + " " + array3[1][2]);
		System.out.println();
		System.out.println("==========");
		
		int[][] array4;
		array4 = new int[][] {{1,2},{3,4,5}}; // 선언과 값을 넣는 타이밍을 분리 가능함
		
		System.out.print(array4[0][0] + " " + array4[0][1]);
		System.out.println();
		System.out.print(array4[1][0] + " " + array4[1][1] + " " + array4[1][2]);
		System.out.println();
		System.out.println("==========");
		
		// 비정방형(NonRectangle) 선언과 값 대입 방법 3
		
		
		int[][] array5 = {{1,2},{3,4,5}}; // 선언과 값을 넣는 타이밍을 분리 가능함
		
		System.out.print(array5[0][0] + " " + array5[0][1]);
		System.out.println();
		System.out.print(array5[1][0] + " " + array5[1][1] + " " + array5[1][2]);
		System.out.println();
		System.out.println("==========");
		
		
		/*
		int[][] array6;
		array6 = {{1,2},{3,4,5}; 오류 뿜뿜구문}
		*/
		
		System.out.println(array5[0][0] + " " + array5[0][1]);
		System.out.println();
		System.out.println(array5[1][0] + " " + array5[1][1]+ " " + array5[1][1]);
		System.out.println();
		System.out.println("==========");
		

		
	}
 
}
