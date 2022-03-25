package chap15.EX06;

public class ThreadProperties_1 {

	public static void main(String[] args) {
		
		
		//1. 객체 가져오기 (currentThread()) // 쓰레드 수 (activeCount())
			//static
		Thread curThread = Thread.currentThread(); // main Thread
		// 클래스 (타입) 참조변수
		System.out.println("현재 스레드의 이름 : " + curThread.getName());
		System.out.println("현재 스레드의 이름 : " + curThread.activeCount());
		
		
		System.out.println("==========================================");
		//2. 스레드의 이름 출력 (자동출력) -JVM 스레드 이름을 자동 할당 - Thread- 0 ..... Thread-0 까지 총 10개 생성
		
		for (int i = 0; i < 10; i++ ) {
			Thread thread1 = new Thread();
			System.out.println(thread1.getName());
			thread1.start();
		}
		
		System.out.println("==========================================");
		//3. 스레드의 이름을 지정하여 출력: 객체명.setName() 으로 설정, 
		
		for(int i = 0; i< 10; i++) {
			Thread thread2 = new Thread();
			thread2.setName(i + "번째 쓰레드");
			System.out.println(thread2.getName());
			thread2.start();
		}
		
		System.out.println("==========================================");
		//3. 스레드의 이름 출력 (자동출력): 이때 자동 10개 이후에 수동 20개를 카운팅한 뒤 그 다음 순서부터 시작함
		//    가령 2번과 3번에서 각각 10개를 넣었으니, 자동 설정은 21번째 이름부터 출력이 됨
		
				for(int i = 0; i< 10; i++) {
					Thread thread3 = new Thread();
					System.out.println(thread3.getName());
					thread3.start();
				}
	// 문서의 끝
	}

}
