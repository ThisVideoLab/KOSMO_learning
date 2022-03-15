package chap03;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		/*
		 * �� ������ (&&, ||, ^, !) : ��Ʈ ��Ŷ(�պκ��� ���� ����� ������ �� ������, �޺κ��� ������ ������)�� �߻���. 
		 * ��Ʈ ������ ( &, |, ^ ,)   : ��Ʈ ��Ŷ�� �߻����� ����.
		 *  
		*/
		
		// 1. �� ������ AND (&&) �簪�� �Ѵ� tru0e�϶��� true�� �����. �������� �� false
		
		System.out.println(true && true); // true, ��Ʈ ��Ŷ�� �߻����� ����. �ڿ��� ���� �ϴϱ�.
		System.out.println(true && false); // false, ��Ʈ ��Ŷ�� �߻����� ����. �ڿ��� ���� �ϴϱ�.
		System.out.println(false && true); // false, ��Ʈ ��Ŷ�� �߻���. �ڰ� ���� �տ� false �߸� �̹� �����Ŵϱ�.
		System.out.println(true && (5<3)); // false, ��Ʈ ��Ŷ�� �߻����� ����. �ڿ��� ���� �ϴϱ�.
		System.out.println((3<2) && (8<10)); // false, ��Ʈ ��Ŷ�� �߻���. �̹� �պ��� ������ �ڸ� �� �ʿ䰡 ���
		
		System.out.println("==========");
		
		// �� ������ OR (||)  : �� �� �ϳ��� true ���� ������ true�� �����
		
		System.out.println(true || true); // true, ��Ʈ ��Ŷ�� �߻���. �տ� Ʈ��ϱ� �ڴ� ���͵� ����
		System.out.println(false || (5<3)); // true, ��Ʈ ��Ŷ�� �߻����� ����. ���� false�� �ڸ� �����ϴϱ�
		
		System.out.println("==========");
		
		// �� ������ XOR (^) : �� ���� �������� False�� ���, �� ���� �ٸ� ���� true�� ����ϴ� ������
		
		System.out.println(true ^ true); // false, �� �����ڴ� ��Ʈ ��Ŷ���� ������ ����
		System.out.println(false ^ false); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println((5<=5) ^ (7>2));// false
		
		System.out.println("==========");
		
		// NOT (!) : true �̸� false, false �̸� true
		
		System.out.println(!true); // not �̹Ƿ� ������� �����Ǽ� false�� ��
		System.out.println(!false); // ���������� ����
		System.out.println(false || !(5<3)); // 5<3 �� false���µ� ! not �����ڷ� true ���� ��. ��������� �յ� Ʈ�� �޽� ���� �޶� xor �����ڿ��� true�� ��µ�. 
		
		System.out.println("==========");
		
		// �� ��Ŷ ��� ���� ( �� �������� �� �߻�, ��Ʈ �������϶��� �߻����� ����)
		
		int value2 = 3;
		System.out.println(false && ++value2 > 6); // false �߻�. �̶� �� ���� ���� ���� ���϶� ���� �ߴµ� �պ��� �ϴ� ������ ���� �� ����� ���ϰ� �׳� ��Ʈ��Ŷ �ߵ��ؼ� false���� �����.
		System.out.println(value2); // ������ �տ� ���� ������ ������ 4�� ���;� �����ε�, ��Ʈ ��Ŷ�� �ߵ��ؼ� �ƿ� ���� ��ü�� �����ϴ� �ٶ��� �״�� 3�� �ӹ���.
		
		int value3 = 3;
		System.out.println(false & ++value3 > 6); // ����� false�� �ٵ� ��Ʈ��Ŷ�� �߻�����. �ֳĸ� �׳� �ܼ� ��Ʈ �����ڶ� �� �Ǵ��� ���ϱ� ������.
		System.out.println(value3); // 51���� �� �������� ����ʹ� �ٸ��� ��ũ ��Ŷ�� �߻����� �ʾƼ� 55���� ���� �����ڰ� �۵��Ͽ� value3�� ���� 4�� �ٲ� 
		
		int value4 = 3;
		
		System.out.println(true || ++value4>6); // true, ��Ʈ ��Ŷ�� �߻��ؼ� ���� ���� ���� ����
		System.out.println(value4);
		
		int value5 = 3;
		System.out.println(true | ++value5>6); // true, ��Ʈ ��Ŷ�� �߻����� �ʾƼ� ���� ���� ���� Ȯ�ε�
		System.out.println(value5);
		
		System.out.println("==========");
		
		
		
		
		
	}

}
