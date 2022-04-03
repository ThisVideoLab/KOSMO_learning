package chap15.EX11;

/*
 ����ȭ : ���� �����尡 ������ �ϳ��� �ʵ带 ������ �� �ϳ��� �����尡 �Ϸ�Ǹ� �ٸ� �����忡�� ������ ������
  		�ϳ��� �����尡 ������� ��� lock�� �ɰ� �۾��� �Ϸ�Ǹ� �ٸ� �����尡 ���� �����ϵ��� Lock�� ������
 
 		���� �����尡 ������ �ʵ忡 ������ �� ���ü��� ������ �߻���. ==> ����ȭ�� ���ü� ������ �ذ���
		��� ����ȭ�� �޼ҵ��  this (�ڽ��� ��ü)��� Ű���� ������.
		���� �޼ҵ尡 ����ȭ�� �޼ҵ��� ���: �ϳ��� �����常 ������ ������
*/

class MyData{
	// ����ȭ�� �޼���� key���� ��� this�� �ڵ����� ���, ������ �Ұ�����.
	// �ϳ��� �����尡 ������ �� key���� ������ ����ȭ�� �޼ҵ带 ���ٰ����ϴ�.
	// key�� ��ü�� Ű�� ����� �� ����.
	// ����ȭ ���� key���� ���Ƿ� �Ҵ��� �����ϴ�.
	synchronized void abc() { // ���� �����尡 ������ �� ���ü� ������ �����ϱ� ���� ����ȭ ó�� // �̰� ����� �����Ƽ� ��µ�
		for( int i = 0; i <3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(450);} catch (InterruptedException e) {}
		}
	}
	synchronized void bcd() { // ���� �����尡 ������ �� ���ü� ������ �����ϱ� ���� ����ȭ ó�� // �̰� ����� �����Ƽ� ��µ�
		for( int i = 0; i <3; i++) {
			try {Thread.sleep(150);} catch (InterruptedException e1) {}
			System.out.println(i + "��");
			try {Thread.sleep(450);} catch (InterruptedException e) {}
		}
	}
	synchronized void cde() { // ���� �����尡 ������ �� ���ü� ������ �����ϱ� ���� ����ȭ ó�� // �̰� ����� �����Ƽ� ��µ�
		for( int i = 0; i <3; i++) {
			try {Thread.sleep(300);} catch (InterruptedException e1) {}
			System.out.println(i + "��°");
			try {Thread.sleep(450);} catch (InterruptedException e) {}
		}
	}
}

public class KeyObject_1 {
	public static void main(String[] args) {

		// ������ü
		MyData myData = new MyData();
		
		// ������ �����尡 ������ �޼��� ȣ��
		new Thread() { // �͸�Ŭ���� : ������Ŭ������ �����ϴ� �ڽ� �͸� Ŭ���� 
			public void run() {
				myData.abc(); //ù��° ������ abc() �޼��� ȣ�� 
			};
		}.start();
		
		new Thread() { // �͸�Ŭ���� : ������Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.bcd(); //�ι�° ������ bcd() �޼��� ȣ�� 
			};
		}.start();
		 
		new Thread() { // �͸�Ŭ���� : ������Ŭ������ �����ϴ� �ڽ� �͸� Ŭ����
			public void run() {
				myData.cde(); //����° ������ cde()  �޼��� ȣ�� 
			};
		}.start(); 
		
		
	// ������ ��
	}
}