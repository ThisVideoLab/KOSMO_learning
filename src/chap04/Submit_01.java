package chap04;

public class Submit_01 {

	public static void main(String[] args) {
		
		// for���� ����ؼ� 1���� 1000���� 4���� ����� ���� ���� ��հ��� ���Ͻÿ� (double)�� ����� ��.
				
		int i; // double�� �϶�°� �ڴ��� ������ int�� ��� ������ ��⸦ ȣ�尡 ���� ��ϴ�
		int multi4 = 0;
		for (i=1; i <= 250 ; i++) {
			multi4 += 4*i;
		}
		System.out.println("4�� ����� �� �� : " + multi4);
		System.out.println("4�� ����� �� ���� ��հ� : " + multi4/(i-1));
		
		System.out.println("=======�Ʒ��� ������ �亯========");
		
		double sum1 = 0;
		int j = 0;
		for (i = 1; i<= 1000; i++) {
			if (i % 4 == 0) {
				sum1 += i;
				j++;
			}
		}
		
		System.out.println("���� :" + sum1);
		System.out.println("����� :" + sum1/(j));
		
	}

}