package chap14.EX01;

// 예외처리의 첫번째 방법: try ~ catch 문의 기본 구조에 대해 알아보자

public class ArrayException_1 {
	public static void main(String[] args) {

		int [] arr = new int[5]; // arr 배열에 배열방 5개를 생성, 이 때 index는 0, 1, 2, 3, 4
		
		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			
		}catch (ArrayIndexOutOfBoundsException e) { // 배열의 색인 번호가 범위를 초과한 경우에 예외처리
			e.printStackTrace(); // 실행시에 에러의 이유를 출력해줌.
			System.out.println("배열의 인덱스 방번호를 넘겼습니다.");
		}finally{ 
			System.out.println("출력(finally)");
		}
		System.out.println("프로그램을 종료합니다");
		
	// 문서의 끝
	}
}
