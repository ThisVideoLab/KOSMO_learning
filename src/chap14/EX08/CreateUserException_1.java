package chap14.EX08;

//����� ���� ����
//1. Exception�� ����ϴ� ����: Checked Exception - ������ �ܰ迡�� ����ó�� �ʿ���.
//2. RuntimeException�� ����ϴ� ���� : Unckecked Exception - ����ÿ� ����

class MyException  extends Exception{ // �Ϲݿ���
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);
	}
	
}

class MyRTException extends RuntimeException{
	public MyRTException() {
		super();
	}
	public MyRTException(String message) {
		super(message);
	}
	
}

class A {
	//3. ����� ���� ���� ��ü ���� (�Ϲ� ���� ��ü)
	
	MyException me1 = new MyException("me1 �ߵ�. �⺻������ ȣ��"); // �⺻ ������ ȣ��
	MyException me2 = new MyException("me2 �ߵ�. ���� �޽���"); // ���� �߻��� ���� �޽����� ����ϴ� ������. 
	
	//4. ��Ÿ�� ���� ��ü 
	MyRTException mre1 = new MyRTException("mre1 �ߵ�. �⺻������ ȣ��"); // �⺻ ������ ȣ��
	MyRTException mre2 = new MyRTException("mre2 �ߵ�. ���� �޽���"); // ���� �߻��� ���� �޽����� ����ϴ� ������.
	
	// ���ܸ� ������ �߻���Ű�� (throw):
	
	void abc_1(int num) {
		try {
			if (num > 70) { // abc_1()
				System.out.println("���� �۵�");
			}else {
				throw me2; // ���ܸ� ������ �߻���Ŵ
			}
		}catch (MyException e){ // me1�� ������ Exception�� throw�� ����ؼ� ������ ���ܸ� �ߵ���Ŵ
			System.out.println("70������ ���� �־����ϴ�. 70 �̻��� ���� �����ʽÿ� ");
			System.out.println(e.getMessage());
		}
	}
	//������ ���� (throws): abc_2() �޼ҵ带 ȣ���ϴ� ������ ����ó��
	//					�̶� throw�� throws�� �ٸ���. throw�� ������ ������. throws�� �׳� ������.
	void abc_2(int num) throws MyException{
			if(num > 70) {
				System.out.println("�����۵�");
			}else {
				throw me2; // ������ ����ó���� �߻���Ű�� ����
			}
		}
	
	void bcd_1() {
		abc_1(65);
	}
	void bcd_2() {
		try {
			abc_2(65);
		}catch (MyException e){
			System.out.println("70������ ���� �־����ϴ�. 70 �̻��� ���� �����ʽÿ�");
			System.out.println(e.getMessage());
		}
	}
}

public class CreateUserException_1 {

	public static void main(String[] args) {

		A a1 = new A();
		a1.bcd_1();
		
		A a2 = new A();
		a2.bcd_2();
		
	}

}
