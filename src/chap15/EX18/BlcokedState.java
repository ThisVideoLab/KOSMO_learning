package chap15.EX18;

//Blocked 상태 : 동기화 메소드나 둥기화 블락에서 한 쓰라드가 키를 점유한 경우에 대기 상태의 쓰레드

class MyBlockTest{
	//1. 공유 객체 (동기화 메서드, 동기화 블락)
	MyClass mc = new MyClass();
	//2. 3개의 쓰레드 필드 생성
	Thread t1 = new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		};
	};
	Thread t2 = new Thread("thread2"){
		public void run() {
			try {Thread.sleep(1000);} catch (InterruptedException e) {} // 이걸 꽂아넣으면 돌아가는 순서를 변경할 수 있음.
			mc.syncMethod();
		};
	};
	
	Thread t3 = new Thread("thread3"){
		public void run() {
			mc.syncMethod();
		};
	};
	void startALL() {
		t1.start();
		t2.start();
		t3.start();
	}
	class MyClass{ // 내부 클래스
		synchronized void syncMethod() { // 동기화 메서드 : 키를 가진 쓰레드만 접근 가능함
			try {Thread.sleep(100);} catch (InterruptedException e) {}
			System.out.println("=====" + Thread.currentThread().getName() + "=====");
			System.out.println("thread1 -> " + t1.getState());
			System.out.println("thread2 -> " + t2.getState());
			System.out.println("thread3 -> " + t3.getState());
		}
	}
}


public class BlcokedState {
	public static void main(String[] args) {
		MyBlockTest mbt = new MyBlockTest(); 
		mbt.startALL();
		
	// 문서의 끝
	}
}
