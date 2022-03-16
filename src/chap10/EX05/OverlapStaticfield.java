package chap10.EX05;

class AAA {	 // static �ʵ�� �������̵� ���� �ƴ���. �޸� ���� ������ ���� �ϱ� ����.
	static int m = 3;
}
class BBB extends AAA{
	static int m = 4;
}
class CCC extends AAA{
	static int m = 5;
}

public class OverlapStaticfield {

	public static void main(String[] args) {
		
		//1. ��ü ���� ���� ȣ�� (Ŭ���� ������ ȣ����) < == �������
		System.out.println(AAA.m);
		System.out.println(BBB.m);
		
		//2. ��ü ���� �� ȣ��
		AAA aaa = new AAA();
		BBB bbb = new BBB();
		AAA abb = new BBB();
		
		System.out.println(aaa.m); // 3
		System.out.println(bbb.m); // 4
		System.out.println(abb.m); // static�� ���ٸ� �������̵��� �Ǽ� 4�� ������ ������, �������̵��� �ȵǹǷ� 3�� ����
	}
}
