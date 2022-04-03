package chap15.EX14;

// 쓰레드의 6가지 상태
//1. NEW : 쓰레드 객체 생성 후 .start() 메서드가 호출되기 전 상태
//2. RUNNABLE : .start() 메서드가 호출되면 run() 메서드 내부의 코드가 CPU에서 실행되고 있는 상태
//3. TERMINATED : run() 모든 코드가 실행되면 쓰레드가 종료됨
//4. TIMED WAITING : 특정 시간동안만 대기상태, Thread.sleep(1000);,
//				 a.join(1000) < ==== 현재 자신의 쓰레드는 1초 대기 상태에 있고, a 객체에게 실행을 먼저 양보함.
//               특정 시간이 종료되면 실행 상태로 감, 인터럽트가 발생되면 예외를 발생시키고 실행 상태로 넘어감.

//5. BLOCKED : 동기화 처리에서 Lock 걸려서 접근이 잠시 차단된 상태, 키를 반납한 경우 키를 힉득해서 실행 상태로 감.
//6. WAITING : 무한정 대기 상태, 다른 쓰레드가 깨워줘야지 다시 활성화 됨.

public class newRunnableTerminated {

	public static void main(String[] args) {

		// 스테이트는 쓰레드의 상태를 저장해놓은 클래스이다. 총 6개의 상태를 저장할 수 있음.
		Thread.State state; // State  변수에는 총 6가지 상수만 저장 가능함
			
		
		// 1. 객체 생성 (NEW) - 객체를 막 생성해놓기만 하고 아직 run 돌리기 전까지의 상태임.
		Thread myThread1 = new Thread() {
			@Override
			public void run() {
				for (long i = 0; i < 10000000L ; i ++) {} // 0.5ch 시간 지연, CPU마다 상이함.
				// 객체 생성시 약간의 시간이 필요함
				// 메모리의 할당 시간이 필요함
				System.out.println();
				System.out.println(this + "이(가) 작동중입니다.");
				System.out.println();
			} 
		};
		state = myThread1.getState();
		System.out.println("myThread1 state: " + state); //NEW 상태, 그냥 생기기만해서 아직 뭘 안함.
		
		//2. myThread1 시작
		myThread1.start(); // myThread1 을 구동시킴. 이 뒤로 RUNNABLE 상태로 돌입함.
		state = myThread1.getState();
		System.out.println("myThread State : " + state); // RUNNABLE
		
		//3. myThread1 종료
			// mtThread.join(); 이 구문 자체가 내 쓰레드 (mian) 쓰레드는 대기하고 , myThread를 처리하라는 뜻.
		
		try{myThread1.join();} catch (InterruptedException e) {}
		state = myThread1.getState();
		System.out.println("myThread1 State : " + state); // TERMINATED
		
		
	// 문서의 끝
	}
}
