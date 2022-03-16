package chap10.EX05;

class AA{
	int m = 3;
	void print() {
		System.out.println("AA Class");
	}
}
class BB extends AA{
	int m = 4;
	@Override
	void print() {
		System.out.println("BB Class");
	
	}
}
class CC extends AA{
	int m = 5;
	@Override
	void print() {
		System.out.println("BB Class");
	}
}



public class OverlapInstacefield {

	public static void main(String[] args) {
		
		//1. ��ü ����
		AA aa = new AA();
		BB bb = new BB();
		AA ab = new BB();
		
		CC cc = new CC();
		AA ac = new CC();
		
		//2. �ν��Ͻ� �ʵ� ���
		System.out.println(aa.m); // 3
		System.out.println(bb.m); // 4
		System.out.println(ab.m); // 3 // �ν��Ͻ� �ʵ�� �������̵� ���� �ʽ��ϴ�.
									   // �ν��Ͻ� �޼ҵ�� �������̵� �ȴ�. AA�� print() ȣ��� BB�� ����Ʈ�� ��µ�.
		
		System.out.println("==========");
		
		System.out.println(cc.m); //5
		System.out.println(ac.m); //3
		
	}

}
