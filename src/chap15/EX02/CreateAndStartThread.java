package chap15.EX02;


//1. 새로운 쓰레드 생성
//2. Thread 클래스를 상속한 후 run()을 오버라이딩으로 구현시킴 (run(){}) 이라는 완성된 메서드를 사용함.
//3. Runable 인터페이스의 run()을 구현함 (run(); 이라는 미완의 매서드)


class SMIFileThread extends Thread{

	@Override
	public void run() { // 생성된 스레드에서 작업할 내용을 구현함
		// 2번째 쓰레드에서 작업할 내용
		// 자막을 출력하는 쓰레드
		String[] strArr = {"하나", "둘", "셋", "넷", "다섯"};
	
	// 자막 출력구문
		for(int i = 0; i < strArr.length ; i++) {
			System.out.println(" - (자막번호) " + strArr[i]);
			try {Thread.sleep(200);}catch (InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread {
	public static void main(String[] args) {
		
		//1. 쓰레드 작동시켜 자막 파트를 동시 출력함 
		Thread sm = new SMIFileThread(); // 주의: run()을 직접 호출하면 쓰레드가 작동하는 것이 아니고 메서드만 출력함.
		sm.start();						 // start(): 스레드를 작동하기 위해 메모리 할당 후 run()를 호출 : 쓰레드로 작업됨.
		
		//2. 첫번째 쓰레드 (main Thread에서 작동) - 비디오 프레임 출력
		int [] intArr = {1,2,3,4,5};
		
		// 비디오 프레임 출력
		for (int i = 0; i < intArr.length; i++ ) {
			System.out.print("(비디오 프레임)" + intArr[i]);
			
			// 작업지연 (0.2초 딜레이)
			try {Thread.sleep(200);}catch (InterruptedException e){ }
		}
		
	//문서의 끝
	}
}
