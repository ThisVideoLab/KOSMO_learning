package chap01;

public class Hello02 {
	/*메소드 선언 (c나 c++에서 함수라고 하는 요소를, 자바에서는 메쏘드라고 함. 메소드란 객체 지향 언어에서 함수를 일컷는 말.)
	* 인풋값을 넣어서 프로그램에 따라 결과를 출력하는 것. */
	public static int sum(int n, int m) {
		return n+m;
	}

	public static void main(String[] args) {
		// 변수 선언
		
		int i = 20; // 정수 전용
		int s;  // 정수 전용, 지금 s는 선언만 하고 변수값을 지정하진 않음.
		char a; // 문자 전용, 한 글자만 넣을 수 있음 (이때는 아스키 코드 값으로 인풋됨), 작은 따옴표로 값을 할당함
		String b ; // char에 비해 string은 많은 글자를 넣을 수 있음. 그래서 보통 문자는 스트링으로 때운다고 함.

		b ="오늘 날씨는 참 맑습니다.";
		
		s= sum(i,10); // sum 메소드 호출
		a='?';
		System.out.println(a);
		System.out.println("hello");
		System.out.println(s);
		System.out.println(b);
	
	}

}
