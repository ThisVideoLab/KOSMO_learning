package chap15.EX03;

//2번째 스레드

class SMIFileThread extends Thread{

	@Override
	public void run() {
		//1 자막 번호 출력
		String[] strArr = {"하나","둘","셋","넷","다섯"};
		try {Thread.sleep(100);}catch(InterruptedException e) {} // 0.2초 딜레이
		for (int i = 0; i < strArr.length ; i++) {
		System.out.println(" - 자막 번호 " + strArr[i]);
		try {Thread.sleep(200);}catch(InterruptedException e) {} // 0.2초 딜레이
		}
	}
}

class VideoFileThread extends Thread { // 비디오 프레임을 처리하는 쓰레드
	@Override
	public void run() {
		//2. 비디오 프레임 출력
		int[] intArr = {1,2,3,4,5};
		for(int i = 0; i < intArr.length ; i ++) {
			System.out.print(" 비디오프레임" + intArr[i]);
			try {Thread.sleep(200);}catch(InterruptedException e) {} // 0.2초 딜레이
		}
	}
}

//3 번째 쓰레드

public class CreateAndStartThread_2 {

	
// main 쓰레드
	public static void main(String[] args) {

		//SMIFileThread 객체 시작
		Thread smi = new SMIFileThread();
		smi.start();
		
		//VideoFileThe
		Thread video = new VideoFileThread();
		video.start();
		
		
	// 문서의 끝
	}

}
