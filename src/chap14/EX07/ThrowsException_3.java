package chap14.EX07;

//Exception - Checked Exception - 컴파일 과정에서 탐지해서 예외처리가 가능함
//          -unckecked Exception, Runtime Exception - 컴파일 과정에서 검사할 수 없음. 실행 과정에서 예외처리 해야함.
//예외처리 방식 -try catch - 자신이 직업 예외를 처리함
//          - throws - 예외처리를 미루는 것, 메소드블락 안의 예외를 메소드 호출시에 호출하는 쪽에 미루는 것.
//			throw: 예외를 강제로 발생시킴.


//1. Exception이 발생되는 메서드 내부에서 자신이 직접 예외를 처리한 경우
class A {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
				Thread.sleep(1000);
			  // 괄호 안의 단위는 ms, 밀리 세컨드, 1000은 1초를 의미함.
		}catch (ClassNotFoundException | InterruptedException e) {
		}
	}
		//class.forname : 동적 로딩 - 컴파일 단계에서는 체크하지 않고 실행할 때 객체가 존재하는지에 대해 확인함.
		// 실행시 클래스 파일이 존재할수도 있고 존재하지 않을수도 있기 때문에 예외처리해야 함.

//2. Throws를 사용해서 Exception을 미루는 경우
class B {
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void bcd() throws ClassNotFoundException, InterruptedException {
		Class cls = Class.forName("java.lang.Object"); // 일반예외 중 ClassNotFoundException에 해당함
		Thread.sleep(1000);  // 괄호 안의 단위는 ms, 밀리 세컨드, 1000은 1초를 의미함. // 일반 예외에 해당함
	 
	}
}

}

public class ThrowsException_3 {
	public static void main(String[] args) {

	}
}
