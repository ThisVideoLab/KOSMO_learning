package chap14.EX04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TrywithResource_1 {

	public static void main(String[] args) {
		//1. 수동 리소스 해제. (기존 프로그램 사용) -- 코드가 길고 지저분함.
		System.out.println("문자를 입력하세요 !");
		 InputStreamReader isr2 = null;
		
		 try {
			 isr2 = new InputStreamReader(System.in);
			 char input = (char)isr2.read(); // 일반 예외 (checked 예외) : IOException : 입력 출시
			 System.out.println("입력글자 = " + input);
		 }catch (IOException e){
			 e.printStackTrace(); // try {} 블락에서 예외가 발생될 경우에 자세한 정보를 출력함
		 }finally { //객체를 사용 후에 메모리 영역에서 삭제시켜 줌.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
			 // 리소스 해제: isr2.close(); 을 넣어줘야 함. 
			 if (isr2 != null){
				try {
					isr2.close(); // 일반예외 : IOException	 
				}catch (IOException e){
					e.printStackTrace();                                                                                                                                                                                                                                    
				}
			 }
		 }
		 
		 
		 
		//2. 자동 리소스 해제 (Java 1.7 자동으로 리소스를 해제) -- 코드가 간결함. 그러나 필요 조건이 있음.
		 	//1. 하는 객체가 AutoCloseable 인터페이스를 구현한 객체여야 한다.
		 	//2. 반드시 객체에 close()가 반드시 존재해야 함.
		 	// 위의 2가지 조건을 만족할 대 자동 리소스 해제
		 	//try (자동으로 리소스를 해제할 객체 선언( {} catch{} finally{}

		 //InputStreamReader는 AutoCloseable 인터페이스를 구현하고 있으며, close()를 가지고 있다.
		 //Try with Resource: try ( with resource: 객체 메모리 로드) {}
		 
		 //자동 메모리 해제: 
		 try(InputStreamReader isr1 = new InputStreamReader(System.in);) {
			 char input = (char) isr1.read();
			 System.out.println("입력글자 = " + input);
		 }catch(IOException e){
			 e.printStackTrace();
		 } // finally 블럭을 생략하더라도 객체를 자동으로 isr1.close()
			 
		 		 
	// 문서의 끝
	}	
}
