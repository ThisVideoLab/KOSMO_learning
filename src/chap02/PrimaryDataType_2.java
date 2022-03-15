package chap02;

public class PrimaryDataType_2 {

	public static void main(String[] args) {
		
//      <char 자료형에 값을 할당하는 방식>
		
		// 문자로 저장하는 방법
		
		char value1 = 'A'; // 영문자
		char value2 = '가'; // 한글
		char value3 = '3'; // 숫자 3이 아니고 문자로써의 3, 까보면 식별 아스키코드가 다름
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println();
		
		// 정수로 저장하는 방법
		
		char value4 = 65; // 정수 65는 아스키 코드로 문자 A
		char value5 = 0xac00; // 16진수로 할당된 값, 문자 '가'에 해당됨.
		char value6 = 51;
		
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println();
		
		// 유니코드로 직접 입력
		
		char value7 = '\u0041';
		char value8 = '\uac00';
		char value9 = '\u0033';
		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println();
		
		System.out.println("=====문자 A를 저장하는 다양한 방법 =====");
		
		char a = 'A'; /* 문자로 직접 할당*/
		char b = 65; // 10진수로 저장 : 아스키 코드 값
		char c = 0b1000001; // 0b는 이진수 선언
		char d = 00101; // 00은 8 진수 선언
		char e = 0x0041; // 0x는 16진수 선언
		char f = '\u0041'; // 유니코드로 선언
		
		System.out.println(a + " : 문자로 직접 할당");
		System.out.println(b + " : 10진수로 저장 : 아스키 코드 값");
		System.out.println(c + " : 0b는 이진수 선언");
		System.out.println(d + " : 00은 8 진수 선언");
		System.out.println(e + " : 0x는 16진수 선언");
		System.out.println(f + " : 유니코드로 선언");
		

	}

}
