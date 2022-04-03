package chap14.EX04;

import java.io.InputStreamReader;

//1. 직접 생성한 객체에서 AutoCloseable을 사용해보기
//2. try ( 객체 생성 구문) {} catch {} : 자동으로 close() 메서드가 포함됨 /// try (with resource)
//3. AutoCloseable 인터페이스의 close() 메소드를 오버라이딩 해야 한다.

//4. java.lang.AutoCloseable => java.lang 은 굉장히 많이 쓰는 단골이기 때문에 import를 안써도 됨.
 // java.lang.object

//10. 예외를 처리하는 방법
  // try catch를 사용해서 예외 처리: 자신이 직접 예ㅒ외를 처리하겠다
  // throws를 통해서 예외를 처리: 예외를 내가 처리하지 않고 호출하는 곳에서 예외를 처리하도록 미룸.
	// 예외의 전가. 메소드의 예외 전가라고 칭함. 다만 예외를 강제로 발생시키는 경우에 throw를 씀.	

class A implements AutoCloseable{ //5. # 필드, 생성자, 오버라이딩 순으로 일정한 규칙을 두면 좋음.  일종의 관례

	String resource;
	
	A (String resource){ //6. 생성자의 매개변수로 String 값을 받아서 메모리로 로딩함.
		this.resource = resource;
	}
	@Override
	public void close() throws Exception { //7. AutoCloseable 인터페이스를 상속하면 class A 내부에
										   //close 메서드가 자동으로 호출되서 오버라이딩도 자동으로 일어남.
		if(resource != null) { //8. 리소스의 값이 null이 아니라면 if문 발동
			resource = null; //9. 발동된 후에 resource에 null값을 넣어줌
			System.out.println("리소스가 해제 되었습니다.");
			System.out.println("class A 내부 resource 필드의 값: " + resource);
		}
	}
}


public class TrywithResource_2 {
	public static void main(String[] args) {
		InputStreamReader isr2 = null;
		
		//1. 자동 리소스 해제 사용
		try(A a1 = new A("특정 파일");){ //10. A("String resource")이 부분을 들고 class A에 들어가서 메서드를 출력함.
		}catch (Exception e){ //11. 이미 class A 내부에서 리소스 해제했기 때문에 예외 발생하지 않음
			System.out.println("예외가 발생되었습니다.");   
			e.printStackTrace();
		}finally {
			System.out.println("자동 리소스 해제절차를 종료합니다"); //12. finally 구문 출력
			
		}
		//finally 블락에 a.close() 메소드를 자동으로 호출됨.
		
		System.out.println("===================");
		
		//2 수동 리소스 해제 사용
		
		
		
		A a2 = null;
		try {
			a2 = new A("생성자초기값할당");
		}catch (Exception e){
		e.printStackTrace();
		System.out.println("예외가 발생되었습니다.");
		}finally { // 수동 리소스 해제 구문 시작
			if( a2.resource != null) {
				
				try {
					a2.close();
				}catch (Exception e) {
					e.printStackTrace();
				}finally {
					System.out.println("수동 리소스 해제절차를 종료합니다");
				}
			}
		}
		
	// 문서의 끝
	}

}
