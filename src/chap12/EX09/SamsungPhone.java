package chap12.EX09;



public class SamsungPhone implements PhoneInterface {//1. ó���� �� PhoneInterface�� ���� �Ｚ���� ������ ��. ������ PhoneInterface�� �ִ� abstract�� �Ѿ�ͼ� �׷�.
	
	//2. �������̽����� ���Ǹ� �ص� �޼��带 �������̵�� ������ : ����
	@Override
	public void senCall() {
		System.out.println("��������~");
	}
	
	@Override
	public void recieveCall() {
		System.out.println("��ȭ��������!");
	} 
	//3. ������ ��.
	
	//4. �߰����� SamsungPhone ���� ����� �߰��غ���
	public void news() {
		System.out.println("GOC�� ���� �ڵ����� ����� �����մϴ�");
		System.out.println("�����迡 �� ����� ��߷����ϴ�");
		System.out.println("�㺥ġ���� ������մϴ�");
		System.out.println("�ְ��� �����մϴ�");
	}
}
