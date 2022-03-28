package chap15.EX10;

// ����ȭ :���� �����尡 ������ �ʵ忡 ������ �� �ϳ��� ������ �۾��� �ٸ� �����尡 �������� ���ϵ��� ����

// ���� ����ȭ : �޼��� ������ �Ϻκи��� ����ȭ ��Ŵ. �޼��� ������ �Ϻκ�
// - ��������: synchronized (������ ��ü){ ����ȭ�� ����� }
//			�̶� this�� �ڽ��� ��ü, new �� �޸� ��ü�� ����.


class MyData { // �� �����尡 �����ϴ� ��ü �ʵ�
	int data = 3;
	public void plusData() { 
		
		synchronized (this){ // ���� ����ȭ �޼����� �Ϻκи� ����ȭ, ���⼭ this�� �ڽ��� ��ü�� ����Ŵ.
			 				// this: �ڽ��� ��ü�� ���ϰ�, ����ȭ ���Ͽ� �����ϴ� Ű�̴�.
			 				// ��� ������� key�� ������ ����ȭ ���Ͽ� ������ �����ϴ�.
			int mydata = data;
			try{Thread.sleep(2000);}catch(InterruptedException e){} 
			data = mydata + 1; 
		}
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

public class SynchronizedBlock {
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