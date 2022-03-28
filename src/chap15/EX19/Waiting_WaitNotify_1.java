package chap15.EX19;

//Waiting:
	// a.join(): 자신의 쓰레드는 Waiting 상태이고 a 객체에게 CPU로 이동할 순서를 양보해서 그 쓰레드를 (Runnable)하게 만들어 줌
	// a 객체가 실행이 완료되면 자신의 쓰레드가 (Runnable)로 이동함
	// 다른 쓰레드의 결과를 받고 난 후에 자신의 쓰레드를 돌릴 수 있는 경우에도 유용함 // 어찌보면 순서의 강제라고 볼 수 있음.
	//wait(), notify(), notifyAll(),<== 동기화 블럭에서만 사용이 됨.
	// wait()  : 동기화 블럭 내에서 wait() 메서드를 만나면 waiting 상태로 진입함.
	// notify()와 notifyAll() 메서드는 이런 waiting 상태의 메서드를 깨울 수 있음.

class DataBox{
	int data; // 공유 필드
	
	synchronized void inputData (int data) {  // 동기화 메서드
		this.data = data;
		System.out.println("입력 데이터" + data); // data : 매개변수 값으로 들어온 데이터
	}
	synchronized void outputData() { // 동기화 메서드
		System.out.println("출력 데이터" + data); // this가 생략된 형태
	}
}

public class Waiting_WaitNotify_1 {
	public static void main(String[] args) {
		
		//첫번째 쓰레드 : 공유 객체에 값을 넣는 쓰레드
		DataBox dataBox = new DataBox(); // 익명 내부 클래스
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 9 ; i++) {
					dataBox.inputData(i);
				}
			}
		};
		
		// 두번째 쓰레드 : 공유 객체로부터 값을 읽어오는 메서드
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 9 ; i++) {
					dataBox.outputData();
				}
			}
		};
		t1.start();
		t2.start();
		
	// 문서의 끝
	}
}
