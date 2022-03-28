package chap15.EX15;

//Thread.yield() : 쓰레드의 실행상태 (RUNNABLE)에 있는 특정 쓰레드에게 자신의 쓰레드 순서를 일시양보함.
	// 실행상태 내부에서 다른 쓰레드를 먼저 실행하도록 양보함.
	// 동기화에서 key를 서로 점유하는 현상이 발생하면, 키를 양보해서 균등하게 처리하도록 하는 기능이 있음.

class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
			while (true) {
				if(yieldFlag) { // yieldFlag가 True일 때 쓰레드를 양보해줌
					Thread.yield(); // 쓰래드를 양보하는 구문
				}else { // yieldFalg가 false일 경우에는 스레드 정보를 출력해줌.
					System.out.println(getName() + "실행");
					for (long i = 0; i <100000000; i++) {} // 이 과정때문에 위에 겟네임이 바로 안찍힘.
				}
			}
	}
}


public class YieldInRunnableState {
	public static void main(String[] args) {

	MyThread thread1 = new MyThread();
	thread1.setName("thread1");
	thread1.yieldFlag = false; // false일 때 쓰레드의 정보를 출력함
	thread1.setDaemon(true); // 마지막 쓰레드가 종료될 때 종료됨. // while문의 무한 루프를 빠져나오는 구문
	thread1.start();

	MyThread thread2 = new MyThread();
	thread2.setName("thread2");
	thread2.yieldFlag = true;  // false일 때 쓰레드의 정보를 출력함
	thread2.setDaemon(true); // 마지막 쓰레드가 종료될 때 종료됨. // while문의 무한 루프를 빠져나오는 구문
	thread2.start();
	
	// 쓰래드 6초 지연 (1초마다 1번씩 양보 발생)
	for(int i = 0; i < 6; i++) {
		try{Thread.sleep(10);}catch(InterruptedException e) {}
		thread1.yieldFlag =! thread1.yieldFlag; // 참일땐 거짓을 저장하고 거짓일땐 참을 저장함
		thread2.yieldFlag =! thread2.yieldFlag; // 참일땐 거짓을 저장하고 거짓일땐 참을 저장함	
	}
	
		
		
	// 문서의 끝
	}
}
