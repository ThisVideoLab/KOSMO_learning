package chap03;

public class OperatorEx02 {

	public static void main(String[] args) {
		// 크기 비교 (<, >, <=, >=, ) ====> true, false
		System.out.println(5 <2); // false
		System.out.println(-5 < 5); // true
		System.out.println(5 <= 5); // true
		System.out.println("==========");
		
		// 등가 비교 ( == : 같다의 의미, 그냥 = 하나는 우변을 좌변에 대입하는 의미임),
		//         ( != : 같지 않다 )  ===> 요 연산자들에 대해 true, false 값을 출력함
		
		int a = 5;
		int b = 2;
		int c = 5;
		
		System.out.println(a == b); // false 출력될 것으로 예상
		System.out.println(a != b); // true 예상
		System.out.println(a == c); // true 예상
		System.out.println(a != c); // false 예상
		System.out.println("==========");
		
		// 참조자료형 비교 (객체의 메모리로 번지(주소)를 비교함)
		
		String str1 = new String ("안녕");
		String str2 = new String ("안녕");
		
		System.out.println(str1 == str2); // false 값이 출력되는 이유가, 객체의 메모리의 번지(주소)를 비교, 결과값은 같더라도 변수값이 달라서 다르다고 인식함.
		
		
	}

}

