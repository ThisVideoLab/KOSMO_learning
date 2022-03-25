package chap14.EX08;

//1. Exception�� ��ӹ޴� ����� ���� - �Ϲݿ���ó��
	//1-1. ������ ������ ��� ����ó��
	//1-2. ������ 100���� �ʰ��ϴ� ��� ����ó��

class MinusException extends Exception{ // ������ �ԷµǴ� ��쿡 ���� ����ó�� ����
	
	public MinusException(){
		super();
	}
	public MinusException(String message){ // ���� �޽��� ���, e.getMessage();
		super(message);
	}
}

class OverException extends Exception{ // 100 �̻��� ���� ������ ȣ����
	public OverException() {
		super();
	}
	public OverException(String message) { // ���� �޽��� ���, e.getMessage();
		super(message);
	}
}

class AAA{
	
	int score;
	String name;
	
	void checkScore(int score,String name) throws MinusException, OverException {
		if(score < 0 ) {
			this.score = score;
			System.out.println("�Է��Ͻ� ������ " + this.score + "���Դϴ�.");
			throw new MinusException("���� �߻�: ������ ���� �� �����ϴ�.");
		}else if(score > 100) {
			this.score = score;
			System.out.println("�Է��Ͻ� ������ " + this.score + "���Դϴ�.");
			throw new OverException("���� �߻�: ȹ�� ������ 100���� ���� �� �����ϴ�.");
		}else if(name == "¯��") {
			System.out.println("�ȴ�");
		
		}else {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			this.score = score;
			System.out.println("�Է��Ͻ� ������ " + this.score + "���Դϴ�.");
			System.out.println(this.name);
		}
	}
}

public class UserException {

	public static void main(String[] args) {
		
		AAA aaa1 = new AAA();
		try {
			aaa1.checkScore(-100,"¯��");
		} catch (MinusException | OverException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("=========================");
		
		try {
			aaa1.checkScore(200,"�ͱ�");
		} catch (MinusException | OverException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("=========================");
		
		try {
			aaa1.checkScore(80,"¯��");
		} catch (MinusException | OverException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	// ������ ��
	}

}
