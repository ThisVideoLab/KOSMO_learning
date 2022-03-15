package chap02;

public class TypeCasting_2 {

	public static void main(String[] args) {
		/* 타입 캐스팅: 제일 작은 byte 부터 short, char, int, long, float, 마지막 가장 큰 double까지 있음.
		 *   -업캐스팅: 작은 자료형에서 큰 자료형으로 변환. 
		 *   -다운캐스팅: 큰 자료형에서 작은 자료형으로 변환.
		 *   
		 *    정수형은 기본적으로 int로 저장하는게 국룰. 실수형은 기본적으로 double로 저장하는게 국룰.
		 */
		
		// 자동으로 타입 캐스팅
		
		float value1 = 3; // int에서 float 데이터 타입으로 자동으로 업캐스팅
		long value2 = 5; // int에서 long 데이터 타입으로 자동으로 업캐스팅
		double value3 = 7; // int에서 double 데이터 타입으로 자동으로 업캐스팅
		byte value4 = 9; // int에서 float 데이터 타입으로 자동으로 업캐스팅
		short value5 = 11;// int에서 short 데이터 타입으로 자동으로 업캐스팅
		
		// 이처럼 업캐스팅은 굳이 언급하지 않아도 자동으로 해주는 순방향이라 할 수 있겠다. 아님 말고.
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println("==========");
		
		// 수동으로 타입 캐스팅 - 왜하냐고? 안하면 오류남. 일부러 안되는 값 다 박아넣음.
		
		byte value6 = (byte) 128; // int에서 byte 타입으로 수동 다운 캐스팅 // byte 범위 -128 ~ 127
		int value7 = (int) 3.5; // double에서 int 타입으로 수동 다운 캐스팅 // int는 0과 정수만 가능
		float value8 = (float) 7.5;  // double에서 float 타입으로 수동 다운 캐스팅 // 이것도 안들어감
		float value9 = 7.7f;  // double에서 float 타입으로 수동 다운 캐스팅
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
	}

}
