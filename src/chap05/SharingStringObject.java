package chap05;

public class SharingStringObject {

	public static void main(String[] args) {
		//1 문자열 객체 공유 (리터럴로 생성한 경우) new 키워드로 생성한 경우 (별도의 공간에 생성)
		
		String str1 = new String("안녕"); // new 키워드로 생성하기 때문에 고유의 새 메모리에 할당함
		String str2 = "안녕"; // 
		String str3 = "안녕"; //
		String str4 = new String("안녕"); //
		
		//각 변수의 메모리 주소 비교 ( 논리 연산자 == 는 메모리의 주소를 비교함)
		
		System.out.print("str1 과 str2 주소 비교: "); //false
		System.out.println(str1 == str2);
		System.out.print("str1 과 str3 주소 비교: "); //false
		System.out.println(str1 == str3);
		System.out.print("str1 과 str4 주소 비교: "); //false
		System.out.println(str1 == str4);
		System.out.print("str2 과 str3 주소 비교: "); //true
		System.out.println(str2 == str3);
		System.out.print("str2 과 str4 주소 비교: "); //false
		System.out.println(str2 == str4);
		System.out.print("str3 과 str4 주소 비교: "); //false
		System.out.println(str3 == str4);
		
		System.out.println("==============================");
		
		// 각 변수의 메모리의 값을 비교: 변수명1.equals(변수명2) ==> 참조 자료형일 때 메모리의 값을 비교 (주소 아님 주의)
		
		System.out.print("str1 과 str2 값 비교: ");
		System.out.println(str1.equals(str2));
		System.out.print("str1 과 str3 값 비교: ");
		System.out.println(str1.equals(str3));
		System.out.print("str1 과 str4 값 비교: ");
		System.out.println(str1.equals(str4));
		System.out.print("str2 과 str3 값 비교: ");
		System.out.println(str2.equals(str3));
		System.out.print("str2 과 str4 값 비교: ");
		System.out.println(str2.equals(str4));
		System.out.print("str3 과 str4 값 비교: ");
		System.out.println(str3.equals(str4));
		// 주소가 아닌 값이기 때문에 모두 동일하게 뜬다. 개인적으로 이거 개념 배우기 전에 써보려다가 피똥 쌌으니까 절대 까먹지 말것.
		
	}

}
