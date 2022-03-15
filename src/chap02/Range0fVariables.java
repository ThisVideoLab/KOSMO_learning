package chap02;

public class Range0fVariables {
	public static void main(String[] args) {
		
		
		// 변수의 소멸 시기 . 전역변수와 지역 변수
		
		int value1 = 3; //전역 변수는 불락 밖에서 선언된 변수임. 클래스 전체에 걸쳐 사용됨.
		{// 새로 생성된 블락 시작점
			int value2 = 5; // 지역 변수는 블락 안에서 선언된 변수임.
			System.out.println(value1);
			System.out.println(value2);
		}// 새로 생성된 블락 종료점
		
		System.out.println(value1);
//		System.out.println(value2); // 이때 value2는 지역변수를 가져올 수 없기 때문에 오류가 남.
		
	}

}
