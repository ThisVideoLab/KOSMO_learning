package chap15.EX08;

//동기화 (Synchronized: 여러 쓰레드가 하나의 공유된 필드에 접근할 때, 한 작업 완전히 완료되고 나서 
//                    그 다음 작업이 진행 될 수 있도록 처리하는 작업. 선행 쓰레드가 작업을 완료하기 전까지는
//                    해당 필드에 대한 접근을 잠궈버려서 한 쓰레드의 작업이 끝나서 동기화가 된 후 다른 작업이 시작됨.

//1. 동기화를 처리하지 않았을 때의 예문

class MyData { // 쓰레드가 공유하는 객체 필드 생성
	int data = 3;
	public void plusData() {
		int mydata = data; // 데이터 가져오기
		try{Thread.sleep(3000);}catch(InterruptedException e){} // 딜레이를 수초 줘서 1번 2번 플러스 쓰레드가 동시에 값을 가져가게끔 만들어줌
		data = mydata + 1; // 값을 1씩 증가시킴
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
	
public class TherNeedsForSynchronized {

	public static void main(String[] args) {

		// 공유 객체 생성
		MyData myData = new MyData();
		
		//1. plusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start(); // 첫번째 스레드 값 출력
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start(); // 두번째 스레드값 출력
		
		try {Thread.sleep(4000);} catch(InterruptedException e) {}
		
		Thread plusThread3 = new PlusThread(myData); // 아쉬우니 대조군으로 +1 된 Thread3 print
		plusThread3.setName("plusThread3");
		plusThread3.start();
		
	// 문서의 끝	
	}

}
