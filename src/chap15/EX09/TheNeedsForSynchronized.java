package chap15.EX09;

// 메소드 동기화 : 메소드 전체를 동기화 하는 것
	//key 값이 this에 할당됨.

class MyData { // 두 쓰레드가 공유하는 객체 필드 생성
	int data = 3;
	public synchronized void plusData() { // 동기화 처리 메소드: 하나의 쓰레드가 작업을 완료하고 나면 다음 쓰레드가 작업 가능함.
		int mydata = data;
		try{Thread.sleep(2000);}catch(InterruptedException e){} // 딜레이를 2초 줘서 1번 2번 플러스 쓰레드가 동시에 값을 가져가게끔 만들어줌
		data = mydata + 1; // 1씩 증가함
	}
}

class PlusThread extends Thread{
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

public class TheNeedsForSynchronized {
	public static void main(String[] args) {

		// 공유 객체 생성
		MyData myData = new MyData();
		
		//1. plusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
		
	// 문서의 끝	
	}

}
