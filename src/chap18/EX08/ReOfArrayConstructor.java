package chap18.EX08;

// 배열의 생성자에 참조

interface A{
	int[] abc(int len);
}

public class ReOfArrayConstructor {
	public static void main(String[] args) {

	//배열의 생성자 참조.
	//1. 익명 이너 클래스
	A a1 = new A(){ // 배열선언  int [] arr = new int[방의 갯수] ; < ==
		@Override
		public int[] abc(int len) { // 정수로 len 값을 받은 후에
			return new int[len];    // 배열의 방의 크기를 리턴해줌.
		}
	};
			
	// 람다식 표현법
	A a2 = len -> new int[len];  
	
	//배열의 생성자 참조 표현식
	A a3 = int[]::new;
	
	//배열 선언 구문
	// int [] array1 = new int[3]; // < = 배열과 크기만 선언
	// int [] array2 = new int[3] {1,2,3,4,5}; // < = 배열 선언과 동시에 값 할당
	// int [] array3 =  {1,2,3,4,5}; //
	int[] array1 = a1.abc(3);
	System.out.println(array1.length);
	
	int[] array2 = a2.abc(4);
	System.out.println(array2.length);
	
	int[] array3 = a3.abc(5);
	System.out.println(array3.length);
	
	//문서의끝
	}
}
