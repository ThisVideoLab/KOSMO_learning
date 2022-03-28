package chap15.EX16;

// Thread.sleep(1000) => TimedWaiting 상태로 이동 ==> 특정 시간 (1초)이 경과되면 Runnable 상태로 이동함
//											  ==> 인터럽트가 발생되면 예외를 발생시키고 Runnalbe
// 인스턴스명.join(1000) => TimeWaiting 상태로 이동 ==> 특정 시간 (1초(이 경과되면 Runnable 상태로 이동함
	//a.join(1000) : 자신의 쓰레드는 1초를 기다리고 a 객체에게 CPU 할당 (Runnable), 
		// 1초 뒤에는 자신의 쓰레드도 Runnalbe 상태로 이동함
// 참고 ) 인스턴스명(객체명).join() ===> Waiting 상태로 이동 ==> 
			// 자신의 상태는 잠시 Wating 상태로 가고 a 객체에게 CPU를 쓰도록 양보(할당)함.
			// a 객체가 모두 완료된 경우는 자신의 쓰레드도 Runnable 상태로 들어감.

class MyThread extends Thread{
	@Override
	public void run() {
		try {Thread.sleep(3000);}catch (InterruptedException e) { // 3초동안 timed waiting 상태로 대기 / Interrupt가 발생하면 예외를 발생시키고 Runnable 상태로 이동
			System.out.println("---sleep() 진행중 Interrupt 발생 삐뽀삐뽀");
			for (long i =0; i < 100000000L; i++) {} // 시간지연용 for문 // 0.5초
		}
	}
}

public class TimedWaiting_sleep {
	public static void main(String[] args) {
		
		MyThread myThread1 = new MyThread();
		myThread1.start(); // 시동만 시켜놓은 상태일 뿐 뭔가 출력되진 아니긴 함.
		System.out.println("initial MyThread state: " + myThread1.getState());
		System.out.println();
		System.out.println("================================================");
		

		try {Thread.sleep(2900);} catch (InterruptedException e) {} //  쓰레드 시작 준비시간 // 이때 위에서 지연한 3000ms를 넘는 수치를 슬립에 입력하면 위의 지연된
																					   // 시간이 다 지난 후라서 terminated가 출력된다.
		System.out.println("MyThread State 1 : " + myThread1.getState()); //timed waiting 상태 출력
		
		System.out.println();
		System.out.println("================================================");
		System.out.println();
		
		
		// 3초 이전에 Interrupt 발생
		myThread1.interrupt();
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread State 2 : " + myThread1.getState());
		
		
	// 문서의 끝
	}
}
