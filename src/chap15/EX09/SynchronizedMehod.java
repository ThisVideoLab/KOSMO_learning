package chap15.EX09;

// �޼ҵ� ����ȭ : �޼ҵ� ��ü�� ����ȭ �ϴ� ��
	//key ���� this�� �Ҵ��.

class MyData { // �� �����尡 �����ϴ� ��ü �ʵ� ����
	int data = 3;
	public synchronized void plusData() { // ����ȭ ó�� �޼ҵ�: �ϳ��� �����尡 �۾��� �Ϸ��ϰ� ���� ���� �����尡 �۾� ������.
		int mydata = data;
		try{Thread.sleep(2000);}catch(InterruptedException e){} // �����̸� 2�� �༭ 1�� 2�� �÷��� �����尡 ���ÿ� ���� �������Բ� �������
		data = mydata + 1; // 1�� ������
	}
}

class PlusThread extends Thread{
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "���� ��� : " + myData.data);	
	}
}

public class TheNeedsForSynchronized {
	public static void main(String[] args) {

		// ���� ��ü ����
		MyData myData = new MyData();
		
		//1. plusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
		
	// ������ ��	
	}

}
