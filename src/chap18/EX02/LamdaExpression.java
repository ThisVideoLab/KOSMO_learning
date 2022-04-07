package chap18.EX02;

// ���ٽ� ������ ���¿� ���� �˾ƺ���
// �Ʒ� 4���� �������̽��� �Լ��� 1������ �Լ��� �������̽��� ������ ���ٽ����� ó���� ������

@FunctionalInterface
interface A { //�Է� X, ���� X
	void method1();
}

@FunctionalInterface
interface B { //�Է� O, ���� X
	void method2(int a);
}

@FunctionalInterface
interface C { //�Է� X, ���� O 
	int method3();
}

@FunctionalInterface
interface D { //�Է� O, ���� O
	double method4(int a, int b);
}


public class LamdaExpression {
	public static void main(String[] args) {

		// ���ٽ����� �������̽��� �������� ���� �Լ��� �����ϱ�
		
		//1-1. �Է� X, ���� X
		System.out.println("=====================");
		System.out.println("1-1. �Է� X, ���� X");System.out.println();
		
		A a1 = new A(){
			@Override
			public void method1() {
				System.out.println("�޼��� 1, a1");
			}
		};
		a1.method1();
		
		//1-2. �� �͸� Ŭ���� ���ٽ����� ó���ϱ�: ���ٽ��� ���� Ÿ��, �޼��� �̸����� �����ϰ� �����. 
		//   ���´� (��ǲ) -> {������}; ���·θ� �ִ��� �����ϰ� ǥ����
		System.out.println("=====================");
		System.out.println("1-2. �� �͸� Ŭ���� ���ٽ����� ó���ϱ�");System.out.println();
		
		A a2 = () -> {System.out.println("�޼��� 1, a1");}; // ���� ����ϰ� �ۼ��� ���ٽ��� �⺻��
		A a3 = () -> System.out.println("�޼��� 1, a3"); // �����ο� �Ѷ��θ� ������ ���� { }; ���� ���� ������
		
		a2.method1();
		a3.method1();
		
		//2-1. �Է� O, ���� X
		System.out.println("=====================");
		System.out.println("2-1. �Է� O, ���� X");System.out.println();
				
				B b1 = new B(){
					@Override
					public void method2(int a) {
						System.out.println("�޼��� 2, b1");
					}
				};
				b1.method2(0);
		
		//2-2. ���ٽ� ǥ���� �ִ��� �����غ���
		System.out.println("=====================");
		System.out.println("2-2. ���ٽ� ǥ���� �ִ��� �����غ���");System.out.println();
		
		B b2 = (int a) -> {System.out.println("�޼��� 2, b2: " + a);}; // ��ü ǥ��, ���� ����ϰ� �ۼ��� ���ٽ��� �⺻��
		B b3 = (a) -> System.out.println("�޼��� 2, b3: " + a); // �����ο� �Ѷ��θ� ������ ���� { }; ���� ���� ������
		B b4 = (a) -> {System.out.println("�޼��� 2, b4: " + a);}; // �Է� �Ű������� ��ġ�ϰ� ������ ���� Ÿ�Ե� ��������.
		B b5 = a -> System.out.println("�޼��� 2, b5: " + a); // �Է� �Ű� ������ �ϳ��� �Ұ�ȣ�� ������ ������.
		
		b2.method2(0);
		b3.method2(0);
		b4.method2(0);
		b5.method2(0);
		
		//3-1. �Է� X, ���� O 
		System.out.println("=====================");
		System.out.println("3-1. �Է� X, ���� O");System.out.println();
		
		C c1 = new C() {
			@Override
			public int method3() {
				return 4;
			}
		};
		System.out.println("c1 ���ϰ�: " + c1.method3());
		
		//3-2. ���ٽ� ǥ�� 
		System.out.println("=====================");
		System.out.println("3-2. ���ٽ� ǥ��");System.out.println();
		
		C c2 = () -> {return 5;}; // ��ü ǥ��
		C c3 = () -> 6; // ������ �� �������� ����� ��쿡 ������ ���� �����ѵ�, �ݵ�� �߰�ȣ�� ��������� ��.
		
		{System.out.println("c2 ���ϰ�: " + c2.method3());};
		{System.out.println("c3 ���ϰ�: " + c3.method3());};
		
		//4-1. �Է� O, ���� O 
		System.out.println("=====================");
		System.out.println("3-1. �Է� X, ���� O");System.out.println();
		
		D d1 = new D() {
			@Override
			public double method4(int a, int b) {
				return a + b;
			}
		};
		System.out.println("d1 ���ϰ�: " + d1.method4(1,2));
		
		//4-2. ���ٽ� ǥ��
		D d2 = (int a, int b) -> {return a + b;}; // ��ü ǥ��
		D d3 = (a, b) -> {return a + b;}; // ��ǲŸ���� �Ű����� ���� ����
		D d4 = (a, b) -> a + b; // ������ �� �������� ����� ��쿡 ������ ���� �����ѵ�, �ݵ�� �߰�ȣ�� ��������� ��.
		
		System.out.println("d2 ���ϰ�: " + d2.method4(2,3));
		System.out.println("d3 ���ϰ�: " + d3.method4(3,4));
		System.out.println("d4 ���ϰ�: " + d4.method4(3,4));
		
	// ������ ��
	}
}
