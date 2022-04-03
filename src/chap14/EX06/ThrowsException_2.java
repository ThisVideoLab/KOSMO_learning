package chap14.EX06;

//일반 예외 (checked Exception) 컴파일 단계에서 예외,
//1. 직접 처리
//2. throw 전가 (미룬다)

// main 메소드에 throws를 전가시키는 경우, 처리된 결과 메시지를 찍어주고 종료를 시켜버림.

//main 메소드에 throws를 전가시키는 경우, Exception이 발생될 경우에 정보를 출력해주고 중지함.

public class ThrowsException_2 {

	public static void main(String[] args) throws ClassNotFoundException {

		//정상적으로 파일이 존재 합니다. ClassNotFoundException 이 발생되지 않는다. 
		Class cls = Class.forName("java.lang.Object");
		
		////정상적으로 파일이 존재하지 않는다. ClassNotFoundException 이 발생된다.  
		Class cls2 = Class.forName("java.lang.Object00");

	}

}