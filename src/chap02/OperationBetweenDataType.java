package chap02;

public class OperationBetweenDataType {

	public static void main(String[] args) {

		// 같은 자료형 간의 연산
		int value1 = 3+5; // int +-*/ int = int 의 형태로 결과값이 출력됨
		int value2 = 8/5; // 위와 같음
		float value3 = 3.0f + 5.0f; // float +-*/ float = float 의 형태로 결과값이 출력됨 
		double value4 = 8.0 / 5.0; // double +-*/ double = double 의 형태로 결과값이 출력됨
		
		byte data1 = 3;
		byte data2 = 5;
		
		int value5 = data1 + data2; // int보다 작은 자료형은 연산 결과를 int 타입으로 반환함. 아마 예외 규칙인듯함.
									// byte value5 = data1 + data2; 넣으면 바로 오류 뿜뿜
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		//다른 자료형 간의 연산
		
		double value6 = 5 + 3.5; // int + double = double 의 형태로 결과값이 출력됨
//		int value66 = 5 + 3.5; // 뒤쪽 3.5가 더블이라서 int가 품지 못해서 에러 뿜뿜 
		int value666 = (int) (5 + 3.5); // 
		int value6666 = (int)5 + (int)3.5; //
		
		double value8 = 5/2.0;
		byte data3 = 3;
		short data4 = 5;
		
		int value9 = data3 + data4; // int보다 작은 데이터 타입이 연산할 경우에는 int 타입으로 변환함.
//		short value99 = data3 + data4; // short 타입은 int보다 작기 때문에 오류 뿜뿜
		double value10 = data3 + data4;
		
		System.out.println(value6);
		System.out.println(value666);
		System.out.println(value6666);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		
		
		
	}

}
