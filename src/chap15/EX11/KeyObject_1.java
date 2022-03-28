package chap15.EX11;

/*
 
 동기화 : 여러 쓰레드가 공유도니 필드를 접근할 때 하나의 쓰레득 ㅏ완료되면 다른 쓰레드에서 접근이 가능함
  		하나의 쓰레드가 사용중인 경우 lock를 걸고 작업이 완료되면 다른 쓰레드가 접근 가능하도록 Lock를 해제함
 
 		여러 쓰레드가 공유된 필드에 접근할 때 동시성의 문제가 발생함. ==> 동기화는 동시성 문제를 해결함
		모든 동기화된 메소드는  this (자신의 객체)라는 키만을 가진다.
		여러 메소드가 동기화된 메소드일 경우: 하나의 쓰레드만 접근이 가능함
*/

class MyData{
	// 동기화된 메서드는 key값이 모두 this가 자동으로 등록, 수정이 불가능함.
	// 하나의 쓰레드가 접근할 때 key값을 가지고 동기화된 메소드를 접근가능하다.
	// key는 객체를 키로 사용할 수 없다.
	// 동기화 블럭은 key값을 임의로 할당이 가능하다.
	synchronized void abc() { // 여러 쓰레드가 접근할 때 동시성 문제를 방지하기 위해 동기화 처리 // 이거 지우면 번갈아서 출력됨
		for( int i = 0; i <3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(450);} catch (InterruptedException e) {}
		}
	}
	synchronized void bcd() { // 여러 쓰레드가 접근할 때 동시성 문제를 방지하기 위해 동기화 처리 // 이거 지우면 번갈아서 출력됨
		for( int i = 0; i <3; i++) {
			try {Thread.sleep(150);} catch (InterruptedException e1) {}
			System.out.println(i + "초");
			try {Thread.sleep(450);} catch (InterruptedException e) {}
		}
	}
	synchronized void cde() { // 여러 쓰레드가 접근할 때 동시성 문제를 방지하기 위해 동기화 처리 // 이거 지우면 번갈아서 출력됨
		for( int i = 0; i <3; i++) {
			try {Thread.sleep(300);} catch (InterruptedException e1) {}
			System.out.println(i + "번째");
			try {Thread.sleep(450);} catch (InterruptedException e) {}
		}
	}
	
}

public class KeyObject_1 {
	public static void main(String[] args) {
		
		// 공유객체
		MyData myData = new MyData();
		
		// 세개의 쓰레드가 각각의 메쏘드 호출
		new Thread() {
			public void run() {
				myData.abc();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData.bcd();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData.cde();
			};
		}.start();
		
		
		// 문서의 끝
	}

}
