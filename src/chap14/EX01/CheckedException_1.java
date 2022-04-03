package chap14.EX01;

import java.util.Scanner;

//1. Error : ���α׷��Ӱ� ������ �� ���� �κ�, OS���� �߻��ϴ� Error, Hardware���� �߻��ϴ� Error
//2. Exception: ���α׷��Ӱ� ������ �� �ִ� �κ�, ���ܰ� �߻��ϸ� ���α׷��� ����Ǿ����.
//3. ���ܴ� �ٽ� cheked�� unchecked�� ����. ���⼭ check�� �ϴ� ��ü�� �����Ϸ���, �ٽ� �����ڸ� �����Ϸ���
//   ���� ������ ���ܿ� ������ �Ұ����ؼ� �����Ͻÿ��� �����̳� ���� �ܰ迡�� �߻��ϴ� ���ܰ� ����.
//   �̸� �ΰ� checked�� �Ϲ� ����, unchecked�� ���࿹�ܶ�� �θ�. 		


public class CheckedException_1 {
	public static void main(String[] args) {
		
		//4. ArithmeticException : � ���� 0���� ������ �߻��ϴ� ����. �츮�� ���������� �˰� ������, ��ǻ�ʹ� 0���� ������ ���� ������� ����.
		//5. �� ArithmeticException �� �Ͼ�� ������ try catch���� ���� �ٷ�鼭 ����ó���� ���� �⺻ ������ ��������
		
		System.out.println("���� �� �ϳ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		int b = 10;
		
		try { // try ��: try ������ ���� (Exception)�� �߻��� ���
			System.out.println((b/a));
		}catch (ArithmeticException e) { // catch ��: try ������ ������ �߻��� ��� catch {}���� �۵���
										 // Arithmetic ���ܴ� ���� 0���� ���� ��쿡 �߻���.
		e.printStackTrace(); // ���� ���������� �� ��µǱ⵵ ���� ���� ������ ��µǾ ������ ����� �����⵵ ��.
		System.out.println("������ �߻��߽��ϴ�. 0���� ���� �� �����ϴ�. �ٸ� ���� �־��ּ���");
		}finally { //���� �Ǿ��� ���� ��µǴ� �������� �ݵ�� �۵��ؾ��� ������ �ַ� ����. ���� �ʿ���ٸ� �����ϱ⵵ ��.
			System.out.println("���α׷��� �����մϴ�");
		}
		
		
	}

}
