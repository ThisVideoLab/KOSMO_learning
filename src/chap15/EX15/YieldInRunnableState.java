package chap15.EX15;

//Thread.yield() : �������� ������� (RUNNABLE)�� �ִ� Ư�� �����忡�� �ڽ��� ������ ������ �Ͻþ纸��.
	// ������� ���ο��� �ٸ� �����带 ���� �����ϵ��� �纸��.
	// ����ȭ���� key�� ���� �����ϴ� ������ �߻��ϸ�, Ű�� �纸�ؼ� �յ��ϰ� ó���ϵ��� �ϴ� ����� ����.

class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
			while (true) {
				if(yieldFlag) { // yieldFlag�� True�� �� �����带 �纸����
					Thread.yield(); // �����带 �纸�ϴ� ����
				}else { // yieldFalg�� false�� ��쿡�� ������ ������ �������.
					System.out.println(getName() + "����");
					for (long i = 0; i <100000000; i++) {} // �� ���������� ���� �ٳ����� �ٷ� ������.
				}
			}
	}
}


public class YieldInRunnableState {
	public static void main(String[] args) {

	MyThread thread1 = new MyThread();
	thread1.setName("thread1");
	thread1.yieldFlag = false; // false�� �� �������� ������ �����
	thread1.setDaemon(true); // ������ �����尡 ����� �� �����. // while���� ���� ������ ���������� ����
	thread1.start();

	MyThread thread2 = new MyThread();
	thread2.setName("thread2");
	thread2.yieldFlag = true;  // false�� �� �������� ������ �����
	thread2.setDaemon(true); // ������ �����尡 ����� �� �����. // while���� ���� ������ ���������� ����
	thread2.start();
	
	// ������ 6�� ���� (1�ʸ��� 1���� �纸 �߻�)
	for(int i = 0; i < 6; i++) {
		try{Thread.sleep(10);}catch(InterruptedException e) {}
		thread1.yieldFlag =! thread1.yieldFlag; // ���϶� ������ �����ϰ� �����϶� ���� ������
		thread2.yieldFlag =! thread2.yieldFlag; // ���϶� ������ �����ϰ� �����϶� ���� ������	
	}
	
		
		
	// ������ ��
	}
}
