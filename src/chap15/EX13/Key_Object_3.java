package chap15.EX13;


class A{}
class B{}
class C{}


/*

����ȭ : ���� �����尡 ������ �ʵ带 ������ �� �ϳ��� �����尡 �Ϸ�Ǹ� �ٸ� �����忡�� ������ ������
 		�ϳ��� �����尡 ������� ��� lock�� �ɰ� �۾��� �Ϸ�Ǹ� �ٸ� �����尡 ���� �����ϵ��� Lock�� ������

		���� �����尡 ������ �ʵ忡 ������ �� ���ü��� ������ �߻���. ==> ����ȭ�� ���ü� ������ �ذ���
		��� ����ȭ�� �޼ҵ��  this (�ڽ��� ��ü)��� Ű���� ������.
		���� �޼ҵ尡 ����ȭ�� �޼ҵ��� ���: �ϳ��� �����常 ������ ������
		
Ŭ���� ���ο� �������� ����ȭ �޼��尡 ������ ��� : ��� �����尡 ���� �� �� �ִ� Ű�� this Ű
�������� ����ȭ �޼��� ������ ��Ƽ �����带 ����� ó���� ��� : ����ȭ ����� �������� ��.
*/

class MyData{
	// ����ȭ�� �޼���� key���� ��� this�� �ڵ����� ���, ������ �Ұ�����.
	// �ϳ��� �����尡 ������ �� key���� ������ ����ȭ�� �޼ҵ带 ���ٰ����ϴ�.
	// key�� ��ü�� Ű�� ����� �� ����.
	// ����ȭ ���� key���� ���Ƿ� �Ҵ��� �����ϴ�.
	synchronized void abc() { 
		for( int i = 0; i <3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(450);} catch (InterruptedException e) {}
		}
	}
	synchronized void bcd() {  
		synchronized (new A()) { // �����尡 ������ ������ Ű�� ����
			for( int i = 0; i <3; i++) {
				try {Thread.sleep(150);} catch (InterruptedException e1) {}
				System.out.println(i + "��");
				try {Thread.sleep(450);} catch (InterruptedException e) {}
			}
		}
	}
	void cde() {
		synchronized (new Object()) { // ���� �޼��� 2���ʹ� �ٸ��� ������ key�� ������ ����. 
			for( int i = 0; i <3; i++) {
				try {Thread.sleep(300);} catch (InterruptedException e1) {}
				System.out.println(i + "��°");
				try {Thread.sleep(450);} catch (InterruptedException e) {}
			}
		}
	}
}



public class Key_Object_3 {

	public static void main(String[] args) {

		// ������ü
		MyData myData = new MyData();
		
		// ������ �����尡 ������ �޽�� ȣ��
		new Thread() {
			public void run() {
				myData.abc();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData.bcd();
			};
		}.start();
		
		new Thread() {
			public void run() {
				myData.cde();
			};
		}.start();

		
	}

}
