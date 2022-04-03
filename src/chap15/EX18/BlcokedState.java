package chap15.EX18;

//Blocked ���� : ����ȭ �޼ҵ峪 �ձ�ȭ ������� �� ����尡 Ű�� ������ ��쿡 ��� ������ ������

class MyBlockTest{
	//1. ���� ��ü (����ȭ �޼���, ����ȭ ���)
	MyClass mc = new MyClass();
	//2. 3���� ������ �ʵ� ����
	Thread t1 = new Thread("thread1") {
		public void run() {
			mc.syncMethod();
		};
	};
	Thread t2 = new Thread("thread2"){
		public void run() {
			try {Thread.sleep(1000);} catch (InterruptedException e) {} // �̰� �ȾƳ����� ���ư��� ������ ������ �� ����.
			mc.syncMethod();
		};
	};
	
	Thread t3 = new Thread("thread3"){
		public void run() {
			mc.syncMethod();
		};
	};
	void startALL() {
		t1.start();
		t2.start();
		t3.start();
	}
	class MyClass{ // ���� Ŭ����
		synchronized void syncMethod() { // ����ȭ �޼��� : Ű�� ���� �����常 ���� ������
			try {Thread.sleep(100);} catch (InterruptedException e) {}
			System.out.println("=====" + Thread.currentThread().getName() + "=====");
			System.out.println("thread1 -> " + t1.getState());
			System.out.println("thread2 -> " + t2.getState());
			System.out.println("thread3 -> " + t3.getState());
		}
	}
}


public class BlcokedState {
	public static void main(String[] args) {
		MyBlockTest mbt = new MyBlockTest(); 
		mbt.startALL();
		
	// ������ ��
	}
}
