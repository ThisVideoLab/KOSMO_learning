package chap05;

public class InitialValue_03 {

	public static void main(String[] args) {

		//1. 메모리의 초기값 - 기본 자료형과 참조 자료형의 비교
		
		// int value1; 기본 자료형의 초기값을 할당하지 않았다면
		// System.out.println(value1); 이 구문은 오류를 뿜뿜함
		// int[] value2; 이녀석도 배열 참조 자료형이라고 선언만 해서
		// System.out.println(value2); 이 구문도 바로 오류 뱉어냄
		
		/* 스택 영역은 해당 변수의 위치만을 가지고 있다. 예를 들자면 신석로 71같은 지번 주소와 같다.
		   반면 힙 영역은 해당 세부 번지와 입주민의 정보까지 품고 있는 영역임.
		   이때 기본 자료형은 기본적으로 기본형 값을 세입자로 품고 있음. 그래서 별도의 변수값 설정(입주민 할당)을 하지 않아도
		   출력(초인종 눌러서 불러냄)을 하면 자동으로 기본값이 출력(기본 세입자가 누구세요 하고 나옴)
		   반면 참조 자료형은 별도의 세입자가 없다. 그냥 변수만 선언해놓으면 빈 방이기 때문에 응답이 없음.
		   고로 이거 빈방이면 왜 만든거야? 라는 노란 에러가 뜸. 그러므로 반드시 변수값 선언을 통해 세입자를 정해줘야 함
		   
		   각 자료형 별 배열 기본값
		   boolean: false, integer: 0, double: 0.0,
		 */
		
		
		int value3 = 0;
		System.out.println(value3); // 이녀석은 선언과 선언을 한큐에 해서 정상 작동함 
		
		int[] value4 = null; // 참조 자료형은 초기값으로 null, 즉 공백값을 입력함
		System.out.println(value4); // null로 출력됨
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		//2. heap 메모리의 초기값 (강제 초기화, heap 에는 참조 자료형의 값이 생성과 동시에 자동 할당됨)
		
		boolean[] array1 = new boolean[3];
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]); // 각각 어레이는 스택 영역에 집처럼 만들어짐
																		   // 그리고 new 를 붙여서 배열 변수를 선언하면 각 힙영역의 자리마다 초기값이 강제 할당됨. 이때 boolean은 false가 할당됨. 
		                                                                   // int는 반드시 값을 지정해줘야 하지만, boolean 타입 같은 몇몇 애들은 초기값이 있는 경우가 있음.
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		for ( int i = 0; i<3; i++) {
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		System.out.println("객체의 메모리 주소: " + array1); // 이것은 배열변수 객체 자체의 메모리 번지임.
		System.out.println("객체의 방의 갯수를 출력: " + array1.length); //
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println("array[" + i + "]번째 방의 값은 : " + array1[i]); // 이건 짧아서 걍 포문 안돌려도 되지만, 200개짜리는 무조건 포문 돌려야 함
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		int [] array2 = new int[3]; // 0 이 기본값으로 할당됨
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
		
		// 참조형 자료형 배열인 경우에는 기본 값이 null
		
		String[] array4 = new String[3];
		for (int i = 0 ; i < array4.length; i++) {
			System.out.print(array4[i] + " ");
		}
		
	}

}
