package chap01;

public class Ex01_consolOut2 {

	public static void main(String[] args) {
		
		System.out.printf("나의 나이는 %d세입니다. \n", 35);	//"출력포맷"(예제에서는 %d - 10진수) + 인자(예제에서는\n), 인자(10진수 정수형 - 여기서는 35)
		//%d는 10진수의 정수 값을 인자로 사용해 결과값을 출력함.
		
		System.out.printf("%o\n",10); // "출력포맷"(예제에서는 %o - 8진수)
		
		System.out.printf("%x\n",30); // "출력포맷"(예제에서는 %x - 16진수)
		
		System.out.printf("%s\n","문자열"); // "출력포맷"(예제에서는 %s - 문자열)
		
		System.out.printf("%f\n", 5.8000000); // "출력포맷"(예제에서는 %f - 실수값)
		
		System.out.printf("%4.2f\n", 5.8); // %4.2f 는 전체 4자리, 소숫점 이하 2자리 인풋을 받을 때 사용함
		
		System.out.printf("%d 와 %4.2f", 10, 5.8); // 후행 인자들을 설정해주면 순서대로 인자값을 대입해 결과값을 출력함
		
	}

}
