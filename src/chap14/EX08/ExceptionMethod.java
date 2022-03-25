package chap14.EX08;

//1. Method에 throws를 계속 전가해 main method까지 전가하는 방법에 대해 알아보자
//2. main method까지 예외가 전가 된 경우에는 예외의 결과 창을 띄우고 프로그램을 종료함.
//3. 즉 main method는 예외처리하지 않고 메시지만 띄워주고 프로그램을 종료시켜버림.

class AA{
	public void abc() throws NumberFormatException {
		bcd();
	}
	public void bcd() throws NumberFormatException {
		cde();
	}
	public void cde() throws NumberFormatException { //5. 강제로 예뢰를 던져줌
		int num = Integer.parseInt("10A"); // 4. Exception 발생, 실행과 동시에 NumberFormatException 발생
	}
}	

public class ExceptionMethod {

	public static void main(String[] args) {
		//6. 객체 생성
		AA aa = new AA();
		
		//7. 메서드 호출
		try {
			aa.abc();	
		}catch (NumberFormatException e) {
			System.out.println("예외가 발생하였습니다.");
			e.printStackTrace();
		}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
		System.out.println("프로그램을 종료합니다.");
		
	
		//문서의 끝
	}

}
