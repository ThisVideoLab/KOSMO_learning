package chap15.EX07;

// ���� �������� Ư��, ������ ���� ���ῡ ���� �˾ƺ���
// �Ϲݾ����� : setDaemon(false) -> �� ���°� �⺻ ������ default:off ������ -> ������ �����尡 ����Ǵ��� �ڽ��� ���� �ٸ�ġ�� ����
// ���󾲷��� : setDaemon(true) -> ������ start �������� ���� ������. ������ ���۵Ǹ� ���� �Ұ�����. 
// - ������ �����尡 ����Ǵ� ������ ���� �����带 �����Ŵ.
// - �Ϲ������� �ٸ� �������� �۾��� ���� ���� ������ ������ ��.
// - ��������� ������ �Ϲ� ������ ��������̶�� �� �ܿ��� �Ϲ� ������� ������.
// - ������ (�޸𸮿��� ������ �ʴ� ��ü) �÷��� ���� -> ��������
// - ���μ����� ��������� �ڵ�������, ȭ�� �ڵ� ����...
// - ���� ������ ����ؼ� �׽� ����ϰ� �ִٰ� Ư�� ������ �����ϸ� �۾��� �����ϰ� �ٽ� ��� ���¿� ����.
class MyThread extends Thread{ // ������ �۵��� ���� Ŭ����
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon() ? "���󾲷���":"�Ϲݾ�����"));
		for (int i = 0; i < 6; i++) {
			System.out.println(getName() + " : " + i + "��");
			try {Thread.sleep(1000);}catch (InterruptedException e) {}
		}
	}
}



public class ThreadProperties_3 {
	public static void main(String[] args) {

	/*//1-1. 5�ʰ� �۵��ϴ� �Ϲ� ������ �ۼ�
		Thread thread1 = new MyThread();
		thread1.setDaemon(false);
		thread1.setName("�����ޱ�1");
		thread1.start();
	*/	
	System.out.println("==============");
	//1-2. Daemon ������
	
	Thread thread3 = new MyThread();
	thread3.setDaemon(true);
	thread3.setName("�����ޱ�3");
	thread3.start();	

	//2. 3.5�� �Ŀ� main Thread ���� �ϴ� ������ �߰�
		try {Thread.sleep(3500);}catch (InterruptedException e) {} 
		System.out.println("3.5�ʿ� main Thread ����"); //3. 3.5�ʿ��� �Ϲ� ������� ���� ���� �ʰ� ����ٷ� ����
		
	System.out.println("===================");
	try {Thread.sleep(3500);}catch (InterruptedException e) {}
	System.out.println();System.out.println();
	
	//3. ���������� 5�ʰ� �۵��ϴ� ���� �����带 �Ȱ��� ���·� ����
	Thread thread2 = new MyThread();
	thread2.setDaemon(true);
	thread2.setName("�����ޱ�2");
	thread2.start();
	
	//4. 3.5�� �Ŀ� main Thread �����ϴ� ������ �߰�
	try {Thread.sleep(3500);}catch (InterruptedException e) {} 
	System.out.println("3.5�ʿ� main Thread ����"); // 3.5�ʿ� ���� �����尡 �ٷ� ��������
	
	
	

		
	// ������ ��
	}

}
