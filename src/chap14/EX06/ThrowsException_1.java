package chap14.EX06;

/* 
  ���� ó���� 2���� ���:
  1. ����ó��: try catch
  2. ��������(aka �̷��) : thows, �޼ҵ带 ȣ���ϴ� �ʿ��� ���ܸ� ó���ϵ��� ���� (�̷��)
  	throw : ������ ���ܸ� �߻���Ų��.
 */

class A{ // �޼ҵ� ���ο��� ���� ó���� ���� �����غ���
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Thread.sleep(1000); // �Ϲ� ���� : InterruptedException
			System.out.println("class A�� try ���� �������Դϴ�");
			Thread.sleep(1000);
			System.out.println("..");
			Thread.sleep(1000);
			System.out.println("....");
			Thread.sleep(1000);
			System.out.println("......");
			Thread.sleep(1000);
		}catch (InterruptedException e){
			System.out.println("���ܹ߻� 1");
		}finally {
			System.out.println("try catch ���� �����մϴ�");
		}
	}
}
class B{
	void abc() { // bcd() �޼����� ���ܸ� ó���� �ǹ��� ����.
		try {
			bcd();
		} catch (InterruptedException e) {
			// e.printStackTrace(); //
			System.out.println("���� �߻� 2");
		}finally{
			System.out.println("try catch ���� �����մϴ�");
		}
	}
	
	
	
	
	void bcd() throws InterruptedException { //bcd �޼��带 ȣ���ϴ� �ʿ��� ���ܸ� ó���ϵ��� �̷��.
		System.out.println("class B�� try ���� �������Դϴ�");
		Thread.sleep(1000);
		System.out.println("..");
		Thread.sleep(1000);
		System.out.println("....");
		Thread.sleep(1000);
		System.out.println("......");
		Thread.sleep(1000);
	}
}

public class ThrowsException_1 {

	public static void main(String[] args) {
		
		A a1 = new A(); 
		a1.abc();
	
		System.out.println();
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println("===================");
		try {Thread.sleep(1000);}catch(Exception e) {}
		System.out.println();
		
		B b1 = new B();
		b1.abc();
		
	// ������ ��
	}
}
