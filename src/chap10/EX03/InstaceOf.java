package chap10.EX03;

//instanceof : ��ü ������ ĳ������ ���ɿ��θ� �� �� �ֵ��� �ϴ� Ű����
	// ��ĳ������ ��ü ���ο� � Ÿ���� �����ϴ��� True / false�� ��������
	// �ٿ� ĳ���ý� ��Ÿ�� ������ �߻��� �� �ִ�. ��Ÿ�� ������ �������� �ش�
	// �ٿ� ĳ���ý� �ش� Ÿ���� ��ü�� ������ �� �ٿ� ĳ������ �ϵ��� ����

class A{
	int m;
	void a() { //
		System.out.println(m);
	}
}

class B extends A{
	int n;
	void b(){
		System.out.println("n�� ���� ����մϴ� :" + n);
	}
}

public class InstaceOf {

	public static void main(String[] args) {
		
		//1. insteadof
		
		A aa = new A(); // aa�� A Ÿ�Ը� ������.
		A ab = new B(); // ab�� �θ� A�� ��ӹ��� B�����̹Ƿ�, A�� B�� ��� �ʵ�� �޼��带 ����Ѵ�.
		
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);
		System.out.println(aa instanceof B);
		
		if (aa instanceof B) { // ��ü aa�� b Ÿ��(Ŭ����)�� ���ԵǾ� ���� ��쿡�� ĳ���� ��.
			B b = (B)aa;
			System.out.println("��ü aa�� BŸ������ ĳ�����߽��ϴ�");
		}else {
			System.out.println("aa�� BŸ������ ĳ������ �Ұ����մϴ�");
		}
		if (ab instanceof B) {
			B b = (B)ab; // �̷��� ������ ���� �������̶�, ��Ŭ���������� ������ �߰߸��ص� ���� ��������
						// ��Ÿ�� ������ ���� ��찡 ����. �̷� �� �ν��Ͻ����긦 �Ἥ �Ǻ���.
			System.out.println("ab�� BŸ������ ĳ�����߽��ϴ�");
		}else {
			System.out.println("ab�� BŸ������ ĳ���� �Ұ���");
		}
		
		if("�ȳ�" instanceof String) { // ��ü�� ������ Ÿ���� Ȯ����
			System.out.println("\"�ȳ�\"�� String Ŭ�����Դϴ�.");	
		}else {
			System.out.println("\"�ȳ�\"�� String Ŭ������ �ƴմϴ�");
		}
		
	// ������ ��
	}
}

