package chap01;

public class Hello02 {
	/*�޼ҵ� ���� (c�� c++���� �Լ���� �ϴ� ��Ҹ�, �ڹٿ����� �޽���� ��. �޼ҵ�� ��ü ���� ���� �Լ��� ���ƴ� ��.)
	* ��ǲ���� �־ ���α׷��� ���� ����� ����ϴ� ��. */
	public static int sum(int n, int m) {
		return n+m;
	}

	public static void main(String[] args) {
		// ���� ����
		
		int i = 20; // ���� ����
		int s;  // ���� ����, ���� s�� ���� �ϰ� �������� �������� ����.
		char a; // ���� ����, �� ���ڸ� ���� �� ���� (�̶��� �ƽ�Ű �ڵ� ������ ��ǲ��), ���� ����ǥ�� ���� �Ҵ���
		String b ; // char�� ���� string�� ���� ���ڸ� ���� �� ����. �׷��� ���� ���ڴ� ��Ʈ������ ����ٰ� ��.

		b ="���� ������ �� �����ϴ�.";
		
		s= sum(i,10); // sum �޼ҵ� ȣ��
		a='?';
		System.out.println(a);
		System.out.println("hello");
		System.out.println(s);
		System.out.println(b);
	
	}

}
