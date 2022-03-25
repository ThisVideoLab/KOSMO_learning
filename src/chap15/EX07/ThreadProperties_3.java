package chap15.EX07;

// 데몬 쓰레드의 특성, 쓰레드 강제 종료에 대해 알아보자
// 일반쓰레드 : setDaemon(false) -> 이 상태가 기본 상태인 default:off 상태임 -> 마지막 쓰레드가 종료되더라도 자신의 일을 다마치고 끝냄
// 데몬쓰레드 : setDaemon(true) -> 쓰레드 start 시점에서 설정 가능함. 쓰레드 시작되면 변경 불가능함. 
// - 마지막 쓰레드가 종료되는 시점에 메인 쓰레드를 종료시킴.
// - 일반적으로 다른 쓰레드의 작업을 돕는 보조 쓰레드 역할음 함.
// - 종료시점이 마지막 일반 쓰레드 종료시점이라는 것 외에는 일반 쓰레드와 동일함.
// - 가비지 (메모리에서 사용되지 않는 겍체) 컬렉팅 역할 -> 날려버림
// - 프로세서가 종료시점에 자동저장함, 화면 자동 갱신...
// - 무한 루프를 사용해서 항시 대기하고 있다가 특정 조건이 만족하면 작업을 수행하고 다시 대기 상태에 들어간다.
class MyThread extends Thread{ // 스레드 작동을 위한 클래스
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon() ? "데몬쓰레드":"일반쓰레드"));
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + " : " + i + "초");
			try {Thread.sleep(1000);}catch (InterruptedException e) {}
		}
	}
}



public class ThreadProperties_3 {
	public static void main(String[] args) {

	/*//1-1. 5초간 작동하는 일반 쓰레드 작성
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);
		thread1.setName("쓰레받기1");
		thread1.start();
	*/	
	System.out.println("==============");
	//1-2. Daemon 쓰레드
	
	Thread thread3 = new MyThread();
	thread3.setDaemon(true);
	thread3.setName("쓰레받기3");
	thread3.start();	

	//2. 3.5초 후에 main Thread 종료 하는 구문을 추가
		try {Thread.sleep(3500);}catch (InterruptedException e) {} 
		System.out.println("3.5초에 main Thread 종료"); //3. 3.5초에도 일반 쓰레드는 종료 되지 않고 노빠꾸로 일함
		
	System.out.println("===================");
	try {Thread.sleep(3500);}catch (InterruptedException e) {}
	System.out.println();System.out.println();
	
	//3. 마찬가지로 5초간 작동하는 데몬 쓰레드를 똑같은 형태로 생성
	Thread thread2 = new MyThread();
	thread2.setDaemon(true);
	thread2.setName("쓰레받기2");
	thread2.start();
	
	//4. 3.5초 후에 main Thread 종료하는 구문도 추가
	try {Thread.sleep(3500);}catch (InterruptedException e) {} 
	System.out.println("3.5초에 main Thread 종료"); // 3.5초에 데몬 쓰레드가 바로 날려버림
	
	
	

		
	// 문서의 끝
	}

}
