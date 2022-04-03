package chap14.EX08;

public class ExceptionMessage {
	public static void main(String[] args) {
		
		//1. 예외 객체 생성시 메시지 전달하지 않은 경우
		
		try {
			throw new Exception(); // 예외를 강제로 생성해서 던짐. 예외만 던지고 메시지는 따로 없음.
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("========================");
		
		//2.  예외 객체 생성시 메시지 전달하는 경우
		try {
			throw new Exception("예외 메시지 출력"); // 이렇게 에러를 만들면서 메시지를 넣어서 던지기가 가능함.
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	// 문서의 끝
	}
}
