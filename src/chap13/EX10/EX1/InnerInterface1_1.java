package chap13.EX10.EX1;

class A {
	B b;   // B�� �������̽� Ÿ��, b�� ���� ���� �� �� ���� �Ҵ� �ϴ� ��� 
			// b�� �ʱⰪ�� null ����. �� �� ���� �Ҵ��ϴ� ����� 3���� 
				//1. ��ü������ ���� �Ҵ�. 
				//2. �����ڸ� ���ؼ� ���� �Ҵ�. 
				//3. setter�� ���ؼ� ���� �Ҵ�. 
	
	A () {}	//�⺻ ������ 
	
	A(B b){
		this.b = b;
	}
	
	public void setB (B b) {
		this.b = b; 
	}
	interface B {
		void play();
		void stop();	
	}
	void abc () {	//play()������, stop() ������ 
		b.play();
		b.stop();
	}
}
public class InnerInterface1_1 {
	public static void main(String[] args) {
		
		//1. ��ü ������ �ʵ��� ���� �Ҵ�. 
		A a1 = new A(); 
		
		a1.b = new A.B() { //a1 ��ü�� b ���� ���� �Ҵ�
			@Override
			public void play() {System.out.println("±±");};
			@Override
			public void stop() {System.out.println("���� �ϴ��� ���ϴ�.");};
		};		//�������̽� : A.B�� ���� �޼��� ���� ����������
		a1.abc();
		
		System.out.println("========================");
		
		//2. �����ڸ� �̿��ؼ� ���� �Ҵ�
		A a2 = new A( 
			new A.B() {	
				@Override
				public void stop() {
					System.out.println("���� ����");				
				}			
				@Override
				public void play() {
					System.out.println("���� �÷��� ���� ");				
				}
			}				
				);     //������ ���ο� A.B Ÿ���� ��ü ������ ���� 
		a2.abc();

		System.out.println("===================");
		//3. setter�� ���ؼ� ���� �Ҵ�. 
		A a = new A(); // ���� ��� �ν��Ͻ� ��ü�� ������ �� 
		a.setB(new A.B() { // �ν��Ͻ� a�� ���ؼ� �̳� �������̽� B�� �Ű������� �ְ� �� �ȿ� �������̵�����
			               // play()��  stop()�� �޼��� ���� ������ ����.
			@Override
			public void play() {
				System.out.println("�������� �÷��� �մϴ�. ");				
			}
			@Override
			public void stop() {
				System.out.println("�������� ���� �մϴ�. ");
			}
		});
		a.abc(); //�ν��Ͻ� a���� �����ǵ� abc()�޼��带 �����
		
	// ������ ��
	}

}
