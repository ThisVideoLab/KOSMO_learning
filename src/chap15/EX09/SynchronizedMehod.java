package chap15.EX09;

// 메소드 동기화 : 메소드 전체를 동기화 하는 것
	//key 값이 this에 할당됨.

class MyData { // 두 쓰레드가 공유하는 객체 필드 생성
	int data = 3;
	public synchronized void plusData() { // 동기화 처리 메소드: 하나의 쓰레드가 작업을 완료하고 나면 다음 쓰레드가 작업 가능함.
		int mydata = data;
		try{Thread.sleep(2000);}catch(InterruptedException e){} 
		data = mydata + 1; // 1씩 증가함
	}
}

class PlusThread extends Thread{ //1씩 증가하면서 두개의 쓰레드에서 순차적으로 작동함
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행 결과 : " + myData.data);	
	}
}

public class SynchronizedMehod {
	public static void main(String[] args) {

		// 공유 객체 생성
		MyData myData = new MyData();
		
		//1. plusThread 1 - 먼저 작동함.
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		//2. plusThread 2 - Synchronized 코드가 없다면 동시 실행되야 하지만 선행 쓰레드가
		// 					동작할때까지 대기 상태에 있다 실행되므로, 수초간의 대기 시간이 발생함.
		
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
		
	// 문서의 끝	
	}
}
