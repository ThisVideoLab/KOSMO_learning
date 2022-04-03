package chap15.EX06;
// 쓰레드 우선 순위

class MyThread extends Thread{
	@Override
	public void run() {
		for (long i = 0; i <100000000; i++) {} // 시간지연용
			System.out.println(getName() + "우선순위" + getPriority());
		}
	}

public class ThreadProperties_2 {

	public static void main(String[] args) {

	//1. 참고: CPU core 확인하기
		System.out.println("코어수 : " + Runtime.getRuntime().availableProcessors());
		
	//2. 기본(default: 5) 우선순위
		// (낮음:0) ~ (default:5) ~ (높음:10)
	for (int i = 0; i < 3; i++) {
		Thread thread = new Thread();
		System.out.print(thread.getName()+ "\t"); // 쓰레드 이름 출력, \t 는 탭띄어쓰기
		System.out.println(thread.getPriority());
		thread.start();
	}
	
	//1초 지연
	try {Thread.sleep(3000);}catch (InterruptedException e){} 
	// 여기서 시간을 벌어주는 동안 뒤에 2. 과정의 계산이 끝나고 9번째 슬라이드가
	// 우선순위 10을 배정 받아 리스트에서 먼저 출력됨. 이 과정에서 다른 쓰레드들의 순서가
	// 어긋나서 무작위에 가깝게 출력되는 것은 큰 슬픔
	
	System.out.println();
	
	//2. 우선순위 직접 지정
	for (int i = 0; i < 10; i++) {
		Thread thread = new MyThread();
		thread.setName(i + "번째 쓰레드:");
		
		if (i == 9) { // 마지막 쓰레드의 우선 순위를 10으로 할당
			thread.setPriority(10);
		}
		thread.start();
		
		//System.out.print(thread.getName() + "\t");
		//System.out.println(thread.getPriority());
	}
	
	// 문서의 끝
	}
}
