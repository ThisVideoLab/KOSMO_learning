package chap14.EX08;

public class ExceptionMessage {

	public static void main(String[] args) {
		
		//1. 예외 객체 생성시 메시지 전달하지 않은 경우
		
		try {
			throw new Exception();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("========================");
		
		//2.  예외 객체 생성시 메시지 전달하는 경우
		try {
			throw new Exception("예외 메시지 출력");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
