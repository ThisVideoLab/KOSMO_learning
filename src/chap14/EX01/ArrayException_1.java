package chap14.EX01;

public class ArrayException_1 {

	public static void main(String[] args) {

		int [] arr = new int[5]; // arr 배열에 배열방 5개를 생성, 이 때 index는 0, 1, 2, 3, 4
		
		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("배열의 인덱스 방번호를 넘겼습니다.");
		}finally{
			System.out.println("출력(finally)");
		}
		System.out.println("프로그램을 종료합니다");
		
		
	}

}
