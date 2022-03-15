package chap05;

import java.util.Arrays;

public class MethodOfString {

	public static void main(String[] args) {
		
		//1. 문자열 길이를 (length()) : int 타입으로 변환 ==> 내용 불문 1칸당 하나, 쉬프트 누르고 한칸씩 움직이면서 세는 크기만큼의 숫자가 출력됨
		
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다!";
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		 // 이처럼 length로 글자수에 따른 int를 출력함.
		
		
		//2. 문자열 검색 charAt(), indexOf(), LastIndexOf()
		System.out.println(str1.charAt(1)); // 1번방의 문자열 출력 - 이때 방이란 문장의 각 글자를 의미함. str1의 1번방은 e임.
		System.out.println(str2.charAt(2)); // 2번방의 문자열 출력 - 이때 방이란 문장의 각 글자를 의미함. str2의 3번방은 하임.
		
		// indexOf() : 괄호 안의 글자가 있는 방의 번호를 출력함. 이때 방향은 0 -> 마지막방 (정방향) 방 번호 자체는 같음.
		// LastIndexOf() 괄호 안의 글자가 있는 방의 번호를 출력함. 이때 방향은 마지막방 -> 0 (역방향) 방 번호 자체는 같음.
		String str33 ="일이삼사오륙";
		System.out.println(str33.indexOf("이"));
		System.out.println(str33.lastIndexOf("삼"));
		
		System.out.println("==========");
		System.out.println(str1.indexOf('a')); // 7: 앞에서부터 읽으니까 java 단어에서 앞 a인 7번방의 번호를 출력
		System.out.println(str1.lastIndexOf('a')); // 9: 뒤에서부터 읽으니까 java 단어에서 뒤 a인 9번방의 번호를 출력
		System.out.println(str1.indexOf('a',8)); // 9: 8번째 위치부터 검색하라고 수를 넣어줘서 7번방을 뛰어넘어서 9번방을 출력
		System.out.println(str1.lastIndexOf('a',8)); // 7: 8번째 위치부터 검색하라고 수를 넣어줘서 9번방을 뛰어넘어서 9번방을 출력
		System.out.println(str1.indexOf("Java")); // 6: 해당 문자열이 시작되는 첫자리를 표시함.
		System.out.println(str1.lastIndexOf("Java")); // 6: 뒤에서 읽더라도 해당 문자열이 시작되는 첫자리를 표시함.
		System.out.println(str1.indexOf("없는 값을 출력하는 경우")); // 제일 중요함. 보통의 배열에선 나올수 없는 값인-1이 출력됨.
		System.out.println(str1.lastIndexOf("없는 값을 출력하는 경우")); // 마찬가지로 -1이 출력됨.
		
		
		System.out.println("=====================");
		//3. 문자열 변환 및 연결 (String.valueOf(),cocat())
		
		// String.valueOf(기본자료형) : 안에 넣은 기본자료형을 String 참조자료형으로 변환
		String str3 = String.valueOf(2.3); // 실수 2.3을 String형으로 변환
		String str4 = String.valueOf(false); // 불리언타입 false를 String으로 변환
		System.out.println(str3);
		System.out.println(str4);
		
		// concat() : 문자열과 문자열을 연결 : +의 기능인 연결 연산자와 같은 기능.
		String str5 = str3.concat(str4); // 2.3false  문자열을 연결해주는 기능.
		System.out.println(str5);
		System.out.println();
		
		// concat.() 메소드에서 String.valueOf() 사용 ==> 컨캣 메소드가 스트링만 편식해서 안에서 바꿔면서 입력해야 함
		String str6 = "안녕" + 3; //안녕3
		String str7 = "안녕".concat(String.valueOf(3)); // concat을 사용할때는 꼭 String 타입으로 넣어야해서 String.valueOf()를 사용함.
		System.out.println(str6);
		System.out.println(str7);
		
		System.out.println("=====================");
		
		// 4. 문자열 ==> byte[] 타입으로 변환, 입출력 값을 처리할 때 사용함.
			// (getBytes(),
			// 문자열 ==> char[] (toCharArray())
		
		String str8 = "Hello Java!";
		String str9 = "안녕하세요";
		
		//getByte():문자열 ==> bytes[] 변환 // 별도의 반복 없이 자동으로 방 하나씩 값을 받아다가 getbytes 로 byte값을 저장함
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		System.out.println(Arrays.toString(array1)); // 아스키 코드 출력 (11개)
		System.out.println(Arrays.toString(array2));
		
		//toCharArray() 문자열 => char[]로 변환
		char[] array3= str8.toCharArray();
		char[] array4= str9.toCharArray();
		
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
	}

}
