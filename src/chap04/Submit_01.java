package chap04;

public class Submit_01 {

	public static void main(String[] args) {
		
		// for문을 사용해서 1부터 1000까지 4배의 배수만 더한 값과 평균값을 구하시오 (double)을 사용할 것.
				
		int i; // double로 하라는거 자느라 못보고 int로 적어서 제출한 용기를 호드가 높이 삽니다
		int multi4 = 0;
		for (i=1; i <= 250 ; i++) {
			multi4 += 4*i;
		}
		System.out.println("4의 배수의 총 합 : " + multi4);
		System.out.println("4의 배수의 총 합의 평균값 : " + multi4/(i-1));
		
		System.out.println("=======아래는 선생님 답변========");
		
		double sum1 = 0;
		int j = 0;
		for (i = 1; i<= 1000; i++) {
			if (i % 4 == 0) {
				sum1 += i;
				j++;
			}
		}
		
		System.out.println("합은 :" + sum1);
		System.out.println("평균은 :" + sum1/(j));
		
	}

}