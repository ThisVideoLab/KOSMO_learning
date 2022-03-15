package chap02;

public class FloatVsDouble {

	public static void main(String[] args) {
		
		// float vs double 의 정밀도 차이: float는 소숫점이하 7자리까지, double는 소수점 이하 15자리까지 정밀도 유지.
		
		float f1 = 1.1234567f; // 소수점 맥시멈 7자리까지 달아주고 뒤에 식별자 f나 F를 붙여줌. float는 비주류니까.
		System.out.println(f1);
		
		float f2 = 1.12345689f; // 이번에는 소수점 하나 더 달아서 8자리 까지 표기해줌. 
		System.out.println(f2); // 근데 값이 딱 잘리는게 아니로 좀 다르게 뜸 뭐지
		
		double d1 = 1.123456789012345; // 뭐 여기도 15자리 달아주고
		System.out.println(d1); // 출력해보니 정상적
		
		double d2 = 1.12345678901234567890; // 그다음에 일부러 더 달아보면
		System.out.println(d2); // 플로트처럼 약간 짜부러짐 걍 넣지 말란 소리같음
		
	}

}
