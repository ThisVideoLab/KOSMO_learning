package chap15;


/* ������ 4���� �����غ���.
�� ���� String �迭�� ������ �Ŀ� �Ʒ� (������ ����)�� ���� ������� ����� ��.
�̶� ������� ���κ��� ������ ��� 2���� ���ʺ� ����, 3���� �͸��� Ŭ������ �����ؼ� �����Ѵ�

������ ����

11  2222  3333  4444
�̸� ȫ�浿  �̼���  �Ż��Ӵ�
���� 40    50    60 
���� 100   90    80
���� 70    60    100
���� 50    70    80
*/

class Column1Thread extends Thread { // ���� �������� ó���ϴ� ������
	@Override
	public void run() {
		//2. ���� ������ ���
		String[] col1Arr = {"�̸�","����","����","����","����"};
		for(int i = 0; i < col1Arr.length ; i ++) {
			System.out.print(col1Arr[i] + " ");
			try {Thread.sleep(500);}catch(InterruptedException e) {} // 0.2�� ������
		}
	}
}

class SMIFileRunnable implements Runnable{   // �������̽�

	   @Override
	   public void run() {
	      // �ڸ���ȣ ���
		  String [] col2Arr = {"ȫ�浿", "40   ", "100  ", "70   ", "50   "};
	      try {Thread.sleep(100);} catch (InterruptedException e1) {}
	         
	      for (int i = 0 ; i < col2Arr.length ; i++) {
	         System.out.print(col2Arr[i] +" ");
	         try {Thread.sleep(500);} catch (InterruptedException e) {}
	         }
	   }
	}


public class EX_CreateAndStartThread {

	public static void main(String[] args) {
		
		 System.out.println("���ε��� ������ ����մϴ�");
		 System.out.println("==================");
		 System.out.println();
		
		Thread threadCol1 = new  Column1Thread();
		threadCol1.start();
		
		 Runnable col2 = new SMIFileRunnable();
	      Thread threadCol2 = new Thread(col2);   // Runnabel ��ü�� Thread������ ���ο� �ִ´�
	      threadCol2.start();
		
	      Thread threadCol3 = new Thread( new Runnable() {
				public void run() {
		      // 1. �ڸ���ȣ ���
		      String [] col3Arr = {"�̼���", "50   ", "90   ", "60   ", "70   "};
		      try {Thread.sleep(200);} catch (InterruptedException e1) {}
		         
		      for (int i = 0 ; i < col3Arr.length ; i++) {
		         System.out.print(col3Arr[i] + " ");
		         try {Thread.sleep(500);} catch (InterruptedException e) {}
		         }
		   };}
		);
	    threadCol3.start();
		
        Thread threadCol4 = new Thread( new Runnable() {
			public void run() {
	      // 1. �ڸ���ȣ ���
	      String [] col3Arr = {"�Ż��Ӵ�", "60  ", "80  ", "100 ", "80  "};
	      try {Thread.sleep(300);} catch (InterruptedException e1) {}
	         
	      for (int i = 0 ; i < col3Arr.length ; i++) {
	         System.out.println(col3Arr[i]);
	         try {Thread.sleep(500);} catch (InterruptedException e) {}
	         }
	      System.out.println();
	      System.out.println("=================");
	      System.out.println("����� �Ϸ�Ǿ����ϴ�.");
		   };}
		);
	      threadCol4.start();
	   
	   
			
		// ������ ��
	}

}
