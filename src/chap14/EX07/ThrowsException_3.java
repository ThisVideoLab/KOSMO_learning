package chap14.EX07;

//Exception - Checked Exception - ������ ����, �ݵ�� ����ó��
//          -unckecked Exception, Runtime Exception - ����ÿ� ����,
//����ó�� ��� -try catch - �ڽ��� ���� ���ܸ� ó����
//          - throws - ����ó���� �̷�� ��, �޼ҵ���� ���� ���ܸ� �޼ҵ� ȣ��ÿ� ȣ���ϴ� �ʿ� �̷�� ��.
//			throw: ���ܸ� ������ �߻���Ŵ.

// ���� �޼��忡 ���ܸ� ó���ϴ� ���

class A {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
				Thread.sleep(1000);
			  // ��ȣ ���� ������ ms, �и� ������, 1000�� 1�ʸ� �ǹ���.
		}catch (ClassNotFoundException | InterruptedException e) {
		}
	}
		//class.forname : ���� �ε� - ������ �ܰ迡���� üũ���� �ʰ� ������ �� ��ü�� �����ϴ����� ���� Ȯ����.
		// ����� Ŭ���� ������ �����Ҽ��� �ְ� �������� �������� �ֱ� ������ ����ó���ؾ� ��.

class B {
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void bcd() throws ClassNotFoundException, InterruptedException {
		Class cls = Class.forName("java.lang.Object"); // �Ϲݿ��� �� ClassNotFoundException�� �ش���
		Thread.sleep(1000);  // ��ȣ ���� ������ ms, �и� ������, 1000�� 1�ʸ� �ǹ���. // �Ϲ� ���ܿ� �ش���
	 
	}
}

}

public class ThrowsException_3 {

	public static void main(String[] args) {

	}

}