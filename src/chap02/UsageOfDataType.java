package chap02;
public class UsageOfDataType {
	public static void main(String[] args) {
		// 변수 선언법 1 : 자료형(int, double 따위의)이 먼저 온 뒤에 뒤에 변수 명이 옴. 이때 변수의 값은 후에 지정해줌.
		// 변수 선언법 2 : 위와 마찬가지이나 변수 값까지 한방에 할당해 줌.
		
		int a;
		a=3;
		int b = 4;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("==========");
		
		a = 10;
		b = 30; // a와 b의 변수값을 재 설정해줌. 이 라인 밑으로는 이제 새로운 변수값이 적용됨.
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("==========");
		
		//byte a; -> 오류 메시지 출력, 선언된 변수는 재선언할 수 없음. 다른 변수명으로 쓸 것.
		// a = 10.02 -> 오류 메시지 출력, a는 integer 정수로 선언된 변수이므로 다른 타입의 값을 넣을 수 없음.
	
		char c; // char 자료형은 글자 1개만을 변수값으로 가짐.
		c ='A'; // char 자료형은 작은 따옴표를 사용해서 변수값을 읽어들임.
		System.out.println(c);
		
		String d; // 객체형, 레퍼런스형 자료형(데이터타입), 고로 앞에 꼭 대문자를 써야 함.
		d = "오늘은 많이 쌀쌀합니다";
		System.out.println(d);
		
		String e = "선언과 동시에 값 넣기";
		System.out.println(e);
		
	}

}
