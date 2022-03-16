package chap10.EX05;

class AAAA{
	static void print() {
		System.out.println("AAAA class");
	}
}

class BBBB extends AAAA{
	static void print() {
		System.out.println("BBBB class");
	}
}

public class OverlapStaticMethod {

	public static void main(String[] args) {
		
		//1. ��ü ���� ���� ȣ��: �������
		AAAA.print();
		BBBB.print();
		System.out.println("==========");
		
		//2. ��ü ���� �� ȣ��
		AAAA aaaa = new AAAA(); // A Ŭ���� ȣ��
		aaaa.print();
		BBBB bbbb = new BBBB(); // B Ŭ���� ȣ��
		bbbb.print();
		AAAA aabb = new BBBB(); // ������ B Ŭ������ ������ �ϴµ�, static�� override�� �ȵǼ� A�� ����.
		aabb.print();
	}

}
