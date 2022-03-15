package chap03;

public class OperatorEx06 {

	public static void main(String[] args) {

		// 논리 쉬프트를 이용해서 각 비트의 위치의 값을 알아내기
		 
		int flags = 0b10110110;
		System.out.println(flags >>> 0 & 1); //  0 : 0번째 비트 값이 출력됨
		System.out.println(flags >>> 1 & 1); //  0 : 1번째 비트 값이 출력됨
		System.out.println(flags >>> 2 & 1); //  0 : 2번째 비트 값이 출력됨
		System.out.println(flags >>> 3 & 1); //  0 : 3번째 비트 값이 출력됨
		System.out.println(flags >>> 4 & 1); //  0 : 4번째 비트 값이 출력됨
		System.out.println(flags >>> 5 & 1); //  0 : 5번째 비트 값이 출력됨
		System.out.println(flags >>> 6 & 1); //  0 : 6번째 비트 값이 출력됨
		System.out.println(flags >>> 7 & 1); //  0 : 7번째 비트 값이 출력됨
		System.out.println(flags >>> 8 & 1); //  0 : 8번째 비트 값이 출력됨, 이때 분간을 위해 b라고 표시해놓은 자리의 실제 값은 0이기 때문에 0이 출력됨.
		
	}

}
