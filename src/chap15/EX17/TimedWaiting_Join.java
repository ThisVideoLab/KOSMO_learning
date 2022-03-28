package chap15.EX17;

// a.join (1000); : a 객체에게 CPU를 할당하고 자신은 TimedWaiting 상태로 대기함

class MyThread1 extends Thread{
	public void run() {
	for(long i = 0; i < 100000000l; i++) {} // 시간 지연 0.5초 발생
	};
}

class MyThread2 extends Thread{
	MyThread1 myThread1; // 클래스 타입의 참조변수 // 기본적으로는 null값임.
						 // 생성자를 통해서 객체를 활성화 해야함. 
	public MyThread2 (MyThread1 myThread1) { // 생성자를 통해서 참조변수의 값 할당
		this.myThread1 = myThread1;
	}
	@Override
	public void run() {
		try {myThread1.join(3000);} catch (InterruptedException e) { //MyThread2는 3초 대기하면서 MyThread1에게 CPU를 할당해줌.
			System.out.println("---- join(...) 진행중에 Interrupt 발생!");
			for(long i = 0; i < 100000000L; i++) {} // 시간지연 0.5초
		}
	}
}


public class TimedWaiting_Join {
	public static void main(String[] args) {

		//1. 객체 생성
		MyThread1 myThread1 = new MyThread1(); 
		MyThread2 myThread2 = new MyThread2(myThread1); 
		myThread1.start();
		myThread2.start();// 
		
		try {Thread.sleep(1);} catch (InterruptedException e) {} // 쓰레드 시작 준비시간 0.001 초
		
		System.out.println("MyThread1 State : " + myThread1.getState()); // 바로 Runnable 상태로 돌입
		System.out.println("MyThread1 State : " + myThread2.getState()); // 3초간 Timed waiting 상태 후 Runnable로 돌입
		
		System.out.println();
		System.out.println("==========================================");
		System.out.println();
		
		
		//2. 강제로 에러 발생시키기
		
		myThread2.interrupt();
		try {Thread.sleep(1);} catch (InterruptedException e) {};
		System.out.println("MyThread State 1 : " + myThread1.getState()); // 예외라서 myThread1 강제 종료시켜버림
		System.out.println("MyThread State 2 : " + myThread2.getState()); // myThread1에게 join으로 양보했었는데 myThread1이 강제종료 되면서 Runnable로 표시됨. 
		
		
	// 문서의 끝
	}
}