package chap05;



public class Array_Definition_Ex01 {

	public static void main(String[] args) {
		/*
		*배열 변수 선언 방법
		*	- 배열은 하나의 배열 변수에 많은 데이터를 저장함.
		*	- 배열은 선언하면언 동일한 자료형의 값을 저장. (컬렉션은 여러 데이터 타입을 저장함)
		* 	- 배열은 배열의 값을 저장할 방(공간)크기를 한번 지정하고나면 크기를 다시 수정할 수 없다.
		* 		(컬렉션은 수정에 맞춰 방크기가 자동으로 늘어난다.)
	    */
		
		// 배열 선언 방법 1
		
		int[] array1 = new int[3]; // 배열을 선언과 동시에 배열의 방크기를 할당, 여기서 방크기란 대괄호 안의 숫자로, 대괄호 내 n 만큼 n개의 변수가 들어감.
		
		int[] array2; // 일단 선언만 땡겨두고 
		array2 = new int[3]; // 나중에 기분 좋을때나 따로 선언도 가능함. 변수랑 같음. 좀 fancy해도 결국 변수는 변수다 뭐 이런거지.
		
		// 배열 변수 선언 방법 2
		int array3[] = new int[3];
		
		int array4[] ;
		array4 = new int[3]; // 변수에 붙는 대괄호는 최초 선언시에만 필요하고 후에 변수를 부를때는 불필요함.
		
		// 다양한 배열 선언 (기본 자료형 배열, 참조 자료형 배열)
		
		boolean[] array5 = new boolean[5];
		int[] array6 = new int[5];
		double[] array7 = new double[7];
		String[] array8 = new String[9];
		
		array4[1]= 1;
		array4[2]= 2;
		array4[3]= 3;
	
		System.out.println("");
		
	}

}
