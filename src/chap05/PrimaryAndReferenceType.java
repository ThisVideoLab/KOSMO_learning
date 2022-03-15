package chap05;

public class PrimaryAndReferenceType {

	public static void main(String[] args) {
		
		//1. 기본 데이터 타입의 대입 연산(stack 값을 복사)
		int value1 = 3;
		int value2 = value1;
		
		value2 = 7;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println("");
		
		
		//2. 참조 자료형의 대입 연산 (stack의 힙영역의 주소를 복사)
		
		int[] array1 =new int[] {3,4,5,6,7};
		int[] array2 = array1;
		array2[0] = 7;
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		System.out.println(array1[0]);
		System.out.println(array2[0]);
		System.out.println(array1); // 객체의 힙 영역에 주소값을 출력함 (힙 영역의 주소가 동일함)
		System.out.println(array2); // 객체의 힙 영역에 주소값을 출력함 (힙 영역의 주소가 동일함)
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
	}

}
