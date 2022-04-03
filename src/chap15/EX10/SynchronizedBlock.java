package chap15.EX10;

// 동기화 :여러 쓰레드가 공유된 필드에 접근할 때 하나의 쓰레드 작업시 다른 쓰레드가 접근하지 못하도록 설정
//        한마디로 일부만 블럭으로 잡아서 동기화 시키는 것.

// 블락 동기화 : 메서드 내부의 일부분만을 동기화 시킴. 메서드 내부의 일부부
// - 구문형식: synchronized (임의의 객체){ 블럭화할 내용들 }
//			이때 this는 자신의 객체, new 가 달린 객체를 뜻함.

class MyData { // 두 쓰레드가 공유하는 객체 필드
	int data = 3;
	public void plusData() { 
		
		synchronized (this){ // 블럭 동기화 메서드의 일부분만 동기화, 여기서 this란 자신의 객체를 가리킴.
			 				// this: 자신의 객체를 뜻하고, 동기화 블록에 접근하는 키이다.
			 				// 모든 쓰레드는 key를 가져야 동기화 블록에 접근이 가능하다.
			int mydata = data;
			try{Thread.sleep(2000);}catch(InterruptedException e){} 
			data = mydata + 1; 
		}
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

public class SynchronizedBlock {
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
