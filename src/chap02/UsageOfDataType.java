package chap02;
public class UsageOfDataType {
	public static void main(String[] args) {
		// ���� ����� 1 : �ڷ���(int, double ������)�� ���� �� �ڿ� �ڿ� ���� ���� ��. �̶� ������ ���� �Ŀ� ��������.
		// ���� ����� 2 : ���� ���������̳� ���� ������ �ѹ濡 �Ҵ��� ��.
		
		int a;
		a=3;
		int b = 4;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("==========");
		
		a = 10;
		b = 30; // a�� b�� �������� �� ��������. �� ���� �����δ� ���� ���ο� �������� �����.
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("==========");
		
		//byte a; -> ���� �޽��� ���, ����� ������ �缱���� �� ����. �ٸ� ���������� �� ��.
		// a = 10.02 -> ���� �޽��� ���, a�� integer ������ ����� �����̹Ƿ� �ٸ� Ÿ���� ���� ���� �� ����.
	
		char c; // char �ڷ����� ���� 1������ ���������� ����.
		c ='A'; // char �ڷ����� ���� ����ǥ�� ����ؼ� �������� �о����.
		System.out.println(c);
		
		String d; // ��ü��, ���۷����� �ڷ���(������Ÿ��), ��� �տ� �� �빮�ڸ� ��� ��.
		d = "������ ���� �ҽ��մϴ�";
		System.out.println(d);
		
		String e = "����� ���ÿ� �� �ֱ�";
		System.out.println(e);
		
	}

}
