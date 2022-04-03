package chap15.EX02;


//1. ���ο� ������ ����
//2. Thread Ŭ������ ����� �� run()�� �������̵����� ������Ŵ (run(){}) �̶�� �ϼ��� �޼��带 �����.
//3. Runable �������̽��� run()�� ������ (run(); �̶�� �̿��� �ż���)


class SMIFileThread extends Thread{

	@Override
	public void run() { // ������ �����忡�� �۾��� ������ ������
		// 2��° �����忡�� �۾��� ����
		// �ڸ��� ����ϴ� ������
		String[] strArr = {"�ϳ�", "��", "��", "��", "�ټ�"};
	
	// �ڸ� ��±���
		for(int i = 0; i < strArr.length ; i++) {
			System.out.println(" - (�ڸ���ȣ) " + strArr[i]);
			try {Thread.sleep(200);}catch (InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread {
	public static void main(String[] args) {
		
		//1. ������ �۵����� �ڸ� ��Ʈ�� ���� ����� 
		Thread sm = new SMIFileThread(); // ����: run()�� ���� ȣ���ϸ� �����尡 �۵��ϴ� ���� �ƴϰ� �޼��常 �����.
		sm.start();						 // start(): �����带 �۵��ϱ� ���� �޸� �Ҵ� �� run()�� ȣ�� : ������� �۾���.
		
		//2. ù��° ������ (main Thread���� �۵�) - ���� ������ ���
		int [] intArr = {1,2,3,4,5};
		
		// ���� ������ ���
		for (int i = 0; i < intArr.length; i++ ) {
			System.out.print("(���� ������)" + intArr[i]);
			
			// �۾����� (0.2�� ������)
			try {Thread.sleep(200);}catch (InterruptedException e){ }
		}
		
	//������ ��
	}
}
