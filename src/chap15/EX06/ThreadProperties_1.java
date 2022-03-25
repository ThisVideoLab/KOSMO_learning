package chap15.EX06;

public class ThreadProperties_1 {

	public static void main(String[] args) {
		
		
		//1. ��ü �������� (currentThread()) // ������ �� (activeCount())
			//static
		Thread curThread = Thread.currentThread(); // main Thread
		// Ŭ���� (Ÿ��) ��������
		System.out.println("���� �������� �̸� : " + curThread.getName());
		System.out.println("���� �������� �̸� : " + curThread.activeCount());
		
		
		System.out.println("==========================================");
		//2. �������� �̸� ��� (�ڵ����) -JVM ������ �̸��� �ڵ� �Ҵ� - Thread- 0 ..... Thread-0 ���� �� 10�� ����
		
		for (int i = 0; i < 10; i++ ) {
			Thread thread1 = new Thread();
			System.out.println(thread1.getName());
			thread1.start();
		}
		
		System.out.println("==========================================");
		//3. �������� �̸��� �����Ͽ� ���: ��ü��.setName() ���� ����, 
		
		for(int i = 0; i< 10; i++) {
			Thread thread2 = new Thread();
			thread2.setName(i + "��° ������");
			System.out.println(thread2.getName());
			thread2.start();
		}
		
		System.out.println("==========================================");
		//3. �������� �̸� ��� (�ڵ����): �̶� �ڵ� 10�� ���Ŀ� ���� 20���� ī������ �� �� ���� �������� ������
		//    ���� 2���� 3������ ���� 10���� �־�����, �ڵ� ������ 21��° �̸����� ����� ��
		
				for(int i = 0; i< 10; i++) {
					Thread thread3 = new Thread();
					System.out.println(thread3.getName());
					thread3.start();
				}
	// ������ ��
	}

}
