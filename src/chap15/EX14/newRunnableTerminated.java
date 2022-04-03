package chap15.EX14;

// �������� 6���� ����
//1. NEW : ������ ��ü ���� �� .start() �޼��尡 ȣ��Ǳ� �� ����
//2. RUNNABLE : .start() �޼��尡 ȣ��Ǹ� run() �޼��� ������ �ڵ尡 CPU���� ����ǰ� �ִ� ����
//3. TERMINATED : run() ��� �ڵ尡 ����Ǹ� �����尡 �����
//4. TIMED WAITING : Ư�� �ð����ȸ� ������, Thread.sleep(1000);,
//				 a.join(1000) < ==== ���� �ڽ��� ������� 1�� ��� ���¿� �ְ�, a ��ü���� ������ ���� �纸��.
//               Ư�� �ð��� ����Ǹ� ���� ���·� ��, ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� ���� ���·� �Ѿ.

//5. BLOCKED : ����ȭ ó������ Lock �ɷ��� ������ ��� ���ܵ� ����, Ű�� �ݳ��� ��� Ű�� �����ؼ� ���� ���·� ��.
//6. WAITING : ������ ��� ����, �ٸ� �����尡 ��������� �ٽ� Ȱ��ȭ ��.

public class newRunnableTerminated {

	public static void main(String[] args) {

		// ������Ʈ�� �������� ���¸� �����س��� Ŭ�����̴�. �� 6���� ���¸� ������ �� ����.
		Thread.State state; // State  �������� �� 6���� ����� ���� ������
			
		
		// 1. ��ü ���� (NEW) - ��ü�� �� �����س��⸸ �ϰ� ���� run ������ �������� ������.
		Thread myThread1 = new Thread() {
			@Override
			public void run() {
				for (long i = 0; i < 10000000L ; i ++) {} // 0.5ch �ð� ����, CPU���� ������.
				// ��ü ������ �ణ�� �ð��� �ʿ���
				// �޸��� �Ҵ� �ð��� �ʿ���
				System.out.println();
				System.out.println(this + "��(��) �۵����Դϴ�.");
				System.out.println();
			} 
		};
		state = myThread1.getState();
		System.out.println("myThread1 state: " + state); //NEW ����, �׳� ����⸸�ؼ� ���� �� ����.
		
		//2. myThread1 ����
		myThread1.start(); // myThread1 �� ������Ŵ. �� �ڷ� RUNNABLE ���·� ������.
		state = myThread1.getState();
		System.out.println("myThread State : " + state); // RUNNABLE
		
		//3. myThread1 ����
			// mtThread.join(); �� ���� ��ü�� �� ������ (mian) ������� ����ϰ� , myThread�� ó���϶�� ��.
		
		try{myThread1.join();} catch (InterruptedException e) {}
		state = myThread1.getState();
		System.out.println("myThread1 State : " + state); // TERMINATED
		
		
	// ������ ��
	}
}
