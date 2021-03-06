package chap14.EX06;

/* 
  예외 처리의 2가지 방법:
  1. 직접처리: try catch
  2. 예외전가(aka 미루기) : thows, 메소드를 호출하는 쪽에서 예외를 처리하도록 전가 (미룬다)
  	throw : 강제로 예외를 발생시킨다.
 */

class A{ // 메소드 내부에서 예외 처리를 직접 구현해보기
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Thread.sleep(1000); // 일반 예외 : InterruptedException
			System.out.println("class A의 try 문을 구동중입니다");
			Thread.sleep(1000);
			System.out.println("..");
			Thread.sleep(1000);
			System.out.println("....");
			Thread.sleep(1000);
			System.out.println("......");
			Thread.sleep(1000);
		}catch (InterruptedException e){
			System.out.println("예외발생 1");
		}finally {
			System.out.println("try catch 문을 종료합니다");
		}
	}
}
class B{
	void abc() { // bcd() 메서드의 예외를 처리할 의무를 지님.
		try {
			bcd();
		} catch (InterruptedException e) {
			// e.printStackTrace(); //
			System.out.println("예외 발생 2");
		}finally{
			System.out.println("try catch 문을 종료합니다");
		}
	}
	
	
	
	
	void bcd() throws InterruptedException { //bcd 메서드를 호출하는 쪽에서 예외를 처리하도록 미룬다.
		System.out.println("class B의 try 문을 구동중입니다");
		Thread.sleep(1000);
		System.out.println("..");
		Thread.sleep(1000);
		System.out.println("....");
		Thread.sleep(1000);
		System.out.println("......");
		Thread.sleep(1000);
	}
}

public class ThrowsException_1 {

	public static void main(String[] args) {
		
		A a1 = new A(); 
		a1.abc();
	
		System.out.println();
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println("===================");
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println();
		
		B b1 = new B();
		b1.abc();
		
	// 문서의 끝
	}
}
