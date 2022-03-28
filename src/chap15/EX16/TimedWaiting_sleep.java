package chap15.EX16;

// Thread.sleep(1000) => TimedWaiting ���·� �̵� ==> Ư�� �ð� (1��)�� ����Ǹ� Runnable ���·� �̵���
//											  ==> ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� Runnalbe
// �ν��Ͻ���.join(1000) => TimeWaiting ���·� �̵� ==> Ư�� �ð� (1��(�� ����Ǹ� Runnable ���·� �̵���
	//a.join(1000) : �ڽ��� ������� 1�ʸ� ��ٸ��� a ��ü���� CPU �Ҵ� (Runnable), 
		// 1�� �ڿ��� �ڽ��� �����嵵 Runnalbe ���·� �̵���
// ���� ) �ν��Ͻ���(��ü��).join() ===> Waiting ���·� �̵� ==> 
			// �ڽ��� ���´� ��� Wating ���·� ���� a ��ü���� CPU�� ������ �纸(�Ҵ�)��.
			// a ��ü�� ��� �Ϸ�� ���� �ڽ��� �����嵵 Runnable ���·� ��.

class MyThread extends Thread{
	@Override
	public void run() {
		try {Thread.sleep(3000);}catch (InterruptedException e) { // 3�ʵ��� timed waiting ���·� ��� / Interrupt�� �߻��ϸ� ���ܸ� �߻���Ű�� Runnable ���·� �̵�
			System.out.println("---sleep() ������ Interrupt �߻� �߻ǻ߻�");
			for (long i =0; i < 100000000L; i++) {} // �ð������� for�� // 0.5��
		}
	}
}

public class TimedWaiting_sleep {
	public static void main(String[] args) {
		
		MyThread myThread1 = new MyThread();
		myThread1.start(); // �õ��� ���ѳ��� ������ �� ���� ��µ��� �ƴϱ� ��.
		System.out.println("initial MyThread state: " + myThread1.getState());
		System.out.println();
		System.out.println("================================================");
		

		try {Thread.sleep(2900);} catch (InterruptedException e) {} //  ������ ���� �غ�ð� // �̶� ������ ������ 3000ms�� �Ѵ� ��ġ�� ������ �Է��ϸ� ���� ������
																					   // �ð��� �� ���� �Ķ� terminated�� ��µȴ�.
		System.out.println("MyThread State 1 : " + myThread1.getState()); //timed waiting ���� ���
		
		System.out.println();
		System.out.println("================================================");
		System.out.println();
		
		
		// 3�� ������ Interrupt �߻�
		myThread1.interrupt();
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		System.out.println("MyThread State 2 : " + myThread1.getState());
		
		
	// ������ ��
	}
}
