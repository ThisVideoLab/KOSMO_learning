package chap02;

public class PrimaryDataType_1 {

	public static void main(String[] args) {

		// boolean true / false
		
		boolean bool1 = true;
		boolean bool2 = false;
// 		boolean bool3 = yes; 이래 넣었던 멍청이가 바로 나야 둠빠 둠빠 두비두바
		
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println();
		
		System.out.println("=====정수: 양의 정수, 0, 음의 정수=====");
		
		byte value1 = -128; // -128 ~ 127 까지를 넣을 수 있음.
//		byte value11 = -129; // 요로코롬 넣으면 바로 오류남.
		byte value111 = (byte) -129; // 근데 요래 넣으면 또 괜찮네? 이건 -129를 byte 타입으로 변환해서 저장하니까.
									// 특이한건 값이 127이 나옴. 음의 방향으로 -128보다 한칸 더 간거니까 그 다음 범위인 127이 출력됨. 졸잼.
		
		System.out.println(value1);
		System.out.println(value111);
		
		short value2 = -10; // short : 2byte range (-32768 ~ 32767)
//		short value22 = -32769; 범위를 넘어가며 오류 발생	
		short value222 = (short) -32769; // 이것도 value111과 마찬자기로 한칸 더 넘어가서 32767이 뜸.
		
		int value3 = 100;
		long value4 = 100l; // 롱형 자료로 인식
		
		System.out.println(value2);
		System.out.println(value222);
		
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();
		
		System.out.println("=====정수: 양의 정수, 0, 음의 정수=====");
		
		float value5 = 1.2f; // 비주류의 슬픔. f 식별자가 보인다.
		double value6 = -1.5;
		double value7 = 5;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7); // 그냥 5인데 기분낼 겸 굳이 5.0으로 실수형으로 변환해서 출력해줌
		
	}

}
