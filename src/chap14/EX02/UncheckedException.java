package chap14.EX02;

//1. ���࿹�� (Uncheckd Exception, RumTime Exception) : ������ �ܰ迡���� ���ܰ� �߻����� �ƴ���.
//2. �ٸ� ����ÿ��� �߻��� ���� ����.

class AA{}
class BB extends AA{}

public class UncheckedException {

	public static void main(String[] args) {

		//3. ���࿹��
		
		//4. System.out.println(10/0); // ����ڷ� ���δ�� 0���� ������ ������ �߻���.
		//5 ArithmaticException : 0���� � ���� ������ ������ �߻���.
		
		//6.ClassCastException : Ŭ���� Ÿ���� ��ȯ�� �� ��ȯ���� �ʴ� ����
		
		AA aa = new AA();
		// BB bb = new BB(); // ������ �ܰ迡���� ������ �߻����� �ƴ���.

		//7.ArrayIndexOutOfBoundException : �迭���� �������� �ʴ� ���ȣ�� ����� ��쿡 �߻���.
		
		int[]arry = {1,2,3};
		// System.out.println(arry[3]);
		
		//8 . NumberForamtException // ������ ���ڸ� ���� Ÿ������ ��ȯ�� �� ���� ����
		int num = Integer.parseInt("10");
		System.out.println(num);
		
		//
		String str =null;
		System.out.println(str.charAt(num));
		
		
	}

}
