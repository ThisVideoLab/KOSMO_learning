package chap14;

import java.util.Scanner;

//1. Error : ���α׷��Ӱ� ������ �� ���� �κ�, OS���� �߻��ϴ� Error, Hardware���� �߻��ϴ� Error
//2. Exception: ���α׷��Ӱ� ������ �� �ִ� �κ�, ���ܰ� �߻��ϸ� ���α׷��� ����Ǿ����.
//3. ArithmeticException : � ���� 0���� ������ �߻��ϴ� ����. �츮�� ���������� �˰� ������, ��ǻ�ʹ� 0���� ������ ���� ������� ����.

public class CheckedException_1 {
	public static void main(String[] args) {
		
		System.out.println("���� �� �ϳ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		int b = 10;
		
		try { // try ��: try ������ ���� (Exception)�� �߻��� ���
			System.out.println((b/a));
		}catch (ArithmeticException e) { // catch ��: try ������ ������ �߻��� ��� catch {}���� �۵���
		System.out.println("������ �߻��߽��ϴ�. 0���� ���� �� �����ϴ�. �ٸ� ���� �־��ּ���");
		}finally {
			System.out.println("���α׷��� �����մϴ�");
		}
		
		
	}

}
