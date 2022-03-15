package chap05;

public class PlusOperationOfString {

	public static void main(String[] args) {
		//1. 문자열 + 문자열
		String str1 = "안녕" + "하세요" + "!";
		System.out.println(str1);
		
		System.out.println("==========");
		
		String str2 = "안녕";
		str2 += "하세요"; //기존 str2에 "습니다" 더하기
		str2 += "!"; //기존 str2에 "!" 더하기
		System.out.println(str2); // str1과 같은 변수의 값으로 출력됨.
		
		System.out.println("==========");
		
		System.out.print("str1 == str2: "); // 메모리 주소 비교 = false
		System.out.println(str1 == str2);
		System.out.print("str1.equals(str2): "); // 변수의 값 비교 = true
		System.out.println(str1.equals(str2));

		//2. 문자열 + 기본자료형 // 기본자료형을 문자열로 변환시킴
		String str3 = "안녕" +1; // 안녕1 출력
		String str4 = "안녕" +String.valueOf(1); // 안녕1
		String str5 = "안녕" +"1"; // 안녕1
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println();
		
		System.out.println("==========");
		
		//3 문자열과 기본 자료형을 혼용하는 경우 // 스트링 후에 오는 자료형들은 스트링으로 바뀜
		
		System.out.println(1 + "안녕");
		System.out.println(1 + "안녕" + 2);
		System.out.println("안녕" + 1 + 2); // 여기가 클라이막스 안녕 때문에 뒤에 1+2 에서 +가 연산부호가 아니라 연결연산자가 되어버림
		System.out.println("안녕" + (1 + 2)); // 위처럼 떡지는 걸 막으려면 괄호를 통해 연산 순서를 구분해주면 됨
		System.out.println(1 + 2 + "안녕");
		
		
		
		
	}

}
 