package chap15.EX17;

// a.join (1000); : a ��ü���� CPU�� �Ҵ��ϰ� �ڽ��� TimedWaiting ���·� �����

class MyThread1 extends Thread{
	public void run() {
	for(long i = 0; i < 100000000l; i++) {} // �ð� ���� 0.5�� �߻�
	};
}

class MyThread2 extends Thread{
	MyThread1 myThread1; // Ŭ���� Ÿ���� �������� // �⺻�����δ� null����.
						 // �����ڸ� ���ؼ� ��ü�� Ȱ��ȭ �ؾ���. 
	public MyThread2 (MyThread1 myThread1) { // �����ڸ� ���ؼ� ���������� �� �Ҵ�
		this.myThread1 = myThread1;
	}
	@Override
	public void run() {
		try {myThread1.join(3000);} catch (InterruptedException e) { //MyThread2�� 3�� ����ϸ鼭 MyThread1���� CPU�� �Ҵ�����.
			System.out.println("---- join(...) �����߿� Interrupt �߻�!");
			for(long i = 0; i < 100000000L; i++) {} // �ð����� 0.5��
		}
	}
}


public class TimedWaiting_Join {
	public static void main(String[] args) {

		//1. ��ü ����
		MyThread1 myThread1 = new MyThread1(); 
		MyThread2 myThread2 = new MyThread2(myThread1); 
		myThread1.start();
		myThread2.start();// 
		
		try {Thread.sleep(1);} catch (InterruptedException e) {} // ������ ���� �غ�ð� 0.001 ��
		
		System.out.println("MyThread1 State : " + myThread1.getState()); // �ٷ� Runnable ���·� ����
		System.out.println("MyThread1 State : " + myThread2.getState()); // 3�ʰ� Timed waiting ���� �� Runnable�� ����
		
		System.out.println();
		System.out.println("==========================================");
		System.out.println();
		
		
		//2. ������ ���� �߻���Ű��
		
		myThread2.interrupt();
		try {Thread.sleep(1);} catch (InterruptedException e) {};
		System.out.println("MyThread State 1 : " + myThread1.getState()); // ���ܶ� myThread1 ���� ������ѹ���
		System.out.println("MyThread State 2 : " + myThread2.getState()); // myThread1���� join���� �纸�߾��µ� myThread1�� �������� �Ǹ鼭 Runnable�� ǥ�õ�. 
		
		
	// ������ ��
	}
}