package chap19.EX04;

public class Charactor_EX1 {
	public static void main(String[] args) {

		//1. char ==> int로 변환
		System.out.println("=====================");
		System.out.println("1. char ==> int로 변환");System.out.println();
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch1_1 = 'a';
		System.out.println(ch1_1);
		System.out.println((int)ch1_1);
		
		char ch2 = 'Z';
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		//2. char에 정수(아스키 코드) 저장
		System.out.println("=====================");
		System.out.println("2. char에 정수(아스키 코드) 저장");System.out.println();
		
		char ch3 = 66;
		System.out.println(ch3);
		System.out.println((char)ch3);
		System.out.println((int)ch3);
		
		//3. int ====> char
		System.out.println("=====================");
		System.out.println("3. int ====> char");System.out.println();
		
		int ch4 = 65;
		System.out.println(ch4);
		System.out.println((char)ch4);
		
	// 문서의끝
	}
}
