package chap15.EX19;

//Waiting:
	// a.join(): �ڽ��� ������� Waiting �����̰� a ��ü���� CPU�� �̵��� ������ �纸�ؼ� �� �����带 (Runnable)�ϰ� ����� ��
	// a ��ü�� ������ �Ϸ�Ǹ� �ڽ��� �����尡 (Runnable)�� �̵���
	// �ٸ� �������� ����� �ް� �� �Ŀ� �ڽ��� �����带 ���� �� �ִ� ��쿡�� ������ // ����� ������ ������� �� �� ����.
	//wait(), notify(), notifyAll(),<== ����ȭ �������� ����� ��.
	// wait()  : ����ȭ �� ������ wait() �޼��带 ������ waiting ���·� ������.
	// notify()�� notifyAll() �޼���� �̷� waiting ������ �޼��带 ���� �� ����.

class DataBox{
	int data; // ���� �ʵ�
	
	synchronized void inputData (int data) {  // ����ȭ �޼���
		this.data = data;
		System.out.println("�Է� ������" + data); // data : �Ű����� ������ ���� ������
	}
	synchronized void outputData() { // ����ȭ �޼���
		System.out.println("��� ������" + data); // this�� ������ ����
	}
}

public class Waiting_WaitNotify_1 {
	public static void main(String[] args) {
		
		//ù��° ������ : ���� ��ü�� ���� �ִ� ������
		DataBox dataBox = new DataBox(); // �͸� ���� Ŭ����
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 9 ; i++) {
					dataBox.inputData(i);
				}
			}
		};
		
		// �ι�° ������ : ���� ��ü�κ��� ���� �о���� �޼���
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 9 ; i++) {
					dataBox.outputData();
				}
			}
		};
		t1.start();
		t2.start();
		
	// ������ ��
	}
}
