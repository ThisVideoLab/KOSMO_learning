package chap12.EX09;

public class EX {

	public static void main(String[] args) {

		//1. ���� ����θ� ����غ���
		SamsungPhone g20 = new SamsungPhone(); 
		g20.printLogo(); //2. interface���� default �޼��尡 ��ӵǾ� �������� �κ�
		g20.senCall();
		g20.recieveCall();
		g20.news();
		
		System.out.println("===================");
		
		//3 ������ PhoneInterface�� ��ĳ���ý��Ѻ���
		
		PhoneInterface g21 = new SamsungPhone();
		g21.printLogo(); //2. interface���� default �޼��尡 ��ӵǾ� �������� �κ�
		g21.senCall();
		g21.recieveCall();
		// g21.news(); // �̷��� ġ�� ���� �߻�. �����ｼ news�� PhoneInterface�� �ڽ� Ŭ������ SamsungPhone�� ����̱� ������.
		// �׷��� news()�� ȣ���ϰ� �ʹٸ� ������ ���� �ٿ�ĳ�����ؾ� ��.
		SamsungPhone g22 = (SamsungPhone) g21; // �ٿ� ĳ���� �Ϸ�
		g22.news(); // �ٿ�ĳ���� �Ŀ� ȣ��. ��� �ٿ�ĳ�������� ��ȯ�̶�⺸�� ������ �����ϴ°�����
		int[ ]  studnetIDs  =  { 102, 102 } ;
	}

}
