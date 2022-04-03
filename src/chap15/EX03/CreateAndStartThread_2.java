package chap15.EX03;

//2��° ������ - �ð����� �־� ������ �����Ӱ� �ڸ��� ����غ���

class SMIFileThread extends Thread{ //�ڸ� ���� ó���ϴ� ������

	@Override
	public void run() {
		//1 �ڸ� ��ȣ ���
		String[] strArr = {"�ϳ�","��","��","��","�ټ�"};
		try {Thread.sleep(100);}catch(InterruptedException e) {} // 0.1�� ������
		for (int i = 0; i < strArr.length ; i++) {
		System.out.println(" - �ڸ� ��ȣ " + strArr[i]);
		try {Thread.sleep(200);}catch(InterruptedException e) {} // 0.2�� ������
		}
	}
}

class VideoFileThread extends Thread { // ���� �������� ó���ϴ� ������
	@Override
	public void run() {
		//2. ���� ������ ���
		int[] intArr = {1,2,3,4,5};
		for(int i = 0; i < intArr.length ; i ++) {
			System.out.print(" ����������" + intArr[i]);
			try {Thread.sleep(200);}catch(InterruptedException e) {} // 0.2�� ������
		}
	}
}

//3 ��° ������

public class CreateAndStartThread_2 {

	
// main ������
	public static void main(String[] args) {

		//SMIFileThread ��ü ����
		Thread smi = new SMIFileThread();
		smi.start();
		
		//VideoFileThe
		Thread video = new VideoFileThread();
		video.start();
		
		
	// ������ ��
	}

}
