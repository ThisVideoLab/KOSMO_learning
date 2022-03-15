package chap02;

 public class TypeCasting_1 {

	public static void main(String[] args) {
		
		// 캐스팅 방법 1: 자료형을 선언
		
//		int value1 = 5.3; // 오류 발생. integer에는 정수값만 들어가야 하는데 실수값이기 때문에.
		int value1 = (int) 5.3; // 캐스팅을 사용해 자료형을 실수에서 정수로 변환해 값을 할당함. 이때 정수 외 나머지 수는 버림.
		System.out.println(value1); // 소수점 버리고 5만 출력함 ㅅㄱ
		
		long value2 = (long) 10.333; // long은 정수를 길게 저장하는거지 실수랑은 무관함.
		System.out.println(value2);
		
		float value3 = (float) 5.8;
		System.out.println(value3);
		
		double value4 = (double) 5;
		System.out.println(value4);
		
		double value5 = 10;
		System.out.println(value5);

		// 캐스팅 방법 2: L 또는 F라고 선언해서 캐스팅. long : l 또는 L, float : f 또는 F
		
		long value6 = 10L;
		System.out.println(value6);
		
		long value7 = 10l;
		System.out.println(value7);
		
		float value8 = 5.8F;
		System.out.println(value8);
		
		float value9 = 5.8f;
		System.out.println(value9);
		
		
	}

}


