package chap03;

public class OperatorEx05 {

	public static void main(String[] args) {

		// 삼항 연산자 : (조건) ? 참 : 거짓 (x : y)
		//            괄호 안의 조건이 참일때는 x 위치에 있는 값을 출력하고, 거짓일때는 y 위치에 있는 값을 출력함.
		int value1 = (3>5) ? 6:9 ;
		System.out.println(value1);
		
		System.out.println("==========");
		
		int value2= (5 > 3) ? 10 : 20 ; // 조건이 참이므로 value2의 x 위치에 있는 참값 10이 저장됨.
		System.out.println(value2);
		
		System.out.println("==========");
		
		int value3 = 3;
		System.out.println((value3 % 2 == 0)  ? "짝수" : "홀수");
		
		// if 문으로 처리
		
		if (value3 % 2 == 0) {
			System.out.println("짝수"); // 조건이 참일 때 실행되는 구문
		} else {
			System.out.println("홀수"); // 조건이 거짓일 때 실행되는 구문
		}
		
		
	}

}
