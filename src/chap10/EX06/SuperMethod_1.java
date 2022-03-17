package chap10;

// super. Ű���� : �θ�Ŭ������ ��Ī, �޼ҵ� ���ο��� ����� ��.

// super : ������ ���ο����� ����ϴ� �ڵ� , �θ� �����ڸ� ȣ���� �� �����.
//		   �ݵ�� ù ���ο� ��ġ�ؾ� ��.

// this. Ű���� : �ڽ��� ��ü�� ��Ī, �޼ҵ� ���ο��� ���, ������ ���ο����� ���.

// this : ������ ���ο����� �����. �ڱ� Ŭ���� ������ �ٸ� �����ڸ� ȣ���� �� ����.
//		  �ݵ�� ù ���ο� ��ġ�ؾ� ��.


class AAA{
	AAA(){
		System.out.println("AAA �⺻ ������");
	}
	
}
class BBB extends AAA{
	BBB(){
		super();
		System.out.println("BBB �⺻ ������");
	}
	
}

class CCC extends BBB{
	CCC(){
		System.out.println("CCC �⺻ ������");
	}
	CCC(int a){
		System.out.println("CCC int a ������");
	}
}
class DDD extends CCC{
	DDD(){
		super();
		System.out.println("DDD �⺻ ������");
	}
	DDD(int a){
		super(3);
		System.out.println("DDD ������ ���� 1 : " + a);
	}
}

public class SuperMethod_1 {

	public static void main(String[] args) {
		
		//1. ��ü ����
		AAA aaa = new AAA(); // �⺻ ������ ȣ��
		System.out.println("==========");
		
		BBB bbb = new BBB(); // �⺻ ������ ȣ��
		System.out.println("==========");
		
		DDD ddd = new DDD(5); // �����ڿ� 5���� �����ָ� �� 5���� ���� DDD Ŭ������ int a ������ �����ڸ� �θ�. �׸��� �� �ȿ��� super(3); �� �־ 
		                      // �� 3�� �ٽ� �θ� Ŭ������  CCC�� ���� int a�� �Ű������� �޸� �����ڸ� ȣ����.
							  // �� ���δ� �׳� �ƹ� ���� �� ���� ������ �������� �ö󰡼� ���ʴ�� �⺻, �⺻, int a, int a�� ��µ�.
		System.out.println("==========");

	}

}
