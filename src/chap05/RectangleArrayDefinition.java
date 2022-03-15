package chap05;

public class RectangleArrayDefinition {

	public static void main(String[] args) {

		// 1. 2차원 배열 선언하기
		
		
		// 선언과 할당을 동시에
		int[][] array1 = new int[3][4];  //int [행수] [열수]
		
		//선언과 할당을 따로
		int[][] array2;
		array2= new int[3][4];
		
		// 참조변수의 초기값 : int 0
		System.out.println(array1[0][2]); // 2차원 배열만 만들고 값을 할당하지 않았기 때문에, 초기값인 0이 출력됨.
		
		// 2. 2차원 배열 선언하기 2
		int array3[][] = new int[3][4];
		int array4[][];
		array4= new int [3][4];
		
		// 3. 2차원 배열 선언하기 3 
		int[] array5[] = new int [3][4];
		int[] array6[];
		array6 = new int [3][4];
		
		//4. 다양한 자료형의 배열 선언 (기본 자료형 배열, 참조 자료형 배열)
		boolean [][] array7 = new boolean[3][4];  // false 초기값
		int [][] array8 = new int[2][4];  // 0값이 초기값
		String[][] array10 = new String[2][6]; // 0.0 값이 기본값
		
		
		
	}

}
