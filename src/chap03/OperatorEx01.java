package chap03;

import java.util.Scanner;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		int data1 = 13;
		System.out.println("2������ ��ȯ : " + Integer.toBinaryString(data1)); // 2������ ��ȯ
		System.out.println("8������ ��ȯ : " + Integer.toOctalString(data1)); // 8���� ��ȯ
		System.out.println("16������ ��ȯ : " + Integer.toHexString(data1)); // 16���� ��ȯ
		
		System.out.println("==========");
		
		System.out.println("2 to 10������ ��ȯ : " + Integer.parseInt("1101",2)); // 2������ �� 1101�� 10������ ��ȯ
		System.out.println("8 to 10������ ��ȯ : " + Integer.parseInt("15",8)); // 8������ �� 15�� 10������ ��ȯ
		System.out.println("8 to 10������ ��ȯ : " + Integer.parseInt("0D",16)); // 1������ �� 0d�� 10������ ��ȯ
		
		/* NOT ������ 
		   NOT �����ڴ� �Է°��� ���̳ʸ� �ڵ�� �ٲ� �Ŀ�, 0�� 1��, 1�� 0���� �������� �� ���� ����ϴ� ��������. ���̳ʸ� �ڵ�� ��� �տ�
		   �ִ� ������ 0���� ���� �����ϰ� 4�ڸ� �����θ� ǥ���ϴµ� ���� ��� 3���� ��쿡��, 0011�� ǥ����. �׷��� �����δ� �տ� ������
		   0�� �ֱ� ������ 00..0011 �� ������.
		   �׷��� �� 0011�� ġȯ�ϰ� �Ǹ� 11..1100�� �ǰ�, �տ��� ���Ѵ��� 1�� ������. ��� �̷��� 11�� ���Ѵ�� �ٴ� ���� �����̸�,
		   ���ǹ��� �κ��� 0�� �о �� ���� �����. �ٸ� �̶� �ٲ� �ڸ����� ���� ����� ���µ�, �̰� �����ϱ� ���ؼ� ���밪 1�� �߰��� �Ŀ�
		   ���̳ʽ� ��ȣ�� �ٿ���. ���� 00..0011�� �������� 11..1100�� �ι�° �ڸ�(2^1)�� ù��° �ڸ�(2^0)�� ����� ���밪 3�� ������
		   ���⿡ ����ġ 1�� �����༭ -|2^1+2^0+| = -4�� ��. ���� ����ġ�� �� �ٴ����� ���� ��. ������� ��������. 
		   
		   ��, NOT ������ �ϸ� ��� - �������� ������ �Ͼ�� �Ǳ� �ϳ�, �ٴ� ����ġ�� �������� �д� �������� ����� �ٴ� ������,
		   ���� �������� ���� ���� ��������� ������ ��.
		*/
		
		System.out.println(~3); // 
		System.out.println(~7); // ����� ~�� �ϸ� �������� �Ŀ� 0�� �������� ���� �Ѵ��� �� �־���
		
		System.out.println("==========");
		
		// �پ��� ���� ǥ��
		
		System.out.println(13); 
		System.out.println(0b1101); // 0b ������ ǥ�� 
		System.out.println(015); // 0 8���� ǥ��
		System.out.println(0x0D); // 0x 16���� ǥ��  
		System.out.println();
		
		
		System.out.println("===== ���� ��Ʈ1 ====="); // �� ���� �־ �����
		
		int ip1 = 192;
		int ip2 = 168;
		int ip3 = 0;
		int ip4 = 23;
		
		// ����� ��ĳ�� ������ �Է��ؼ� ����ϱ� �����ҵ�?
		
		System.out.println("ip�� ���� �־ ���� 2������ �����ؼ�����ϴ� ��Ʈ:");
		System.out.println(Integer.toBinaryString(ip1) + "." + Integer.toBinaryString(ip2) + "." + Integer.toBinaryString(ip3) + "." + Integer.toBinaryString(ip4)); // 2������ ��ȯ
		
		// ��ĳ�� �־ �غ���
		
		System.out.println("===== ���� ��Ʈ2 ====="); // ip ���� 2������ ��ȯ���Ѻ���
		
		System.out.println("ip �ּҸ� ����� ������ �Է��� �ּ���.");
		Scanner scn = new Scanner(System.in);
		
		int first = scn.nextInt(); // ������ ��ǲ�޵��� ��.
		System.out.print(Integer.toBinaryString(first) + ".");
		
		int second = scn.nextInt();
		System.out.print(Integer.toBinaryString(second) + ".");
		
		int third = scn.nextInt(); // �������� ��ǲ�޾Ƽ� �о� ����
		System.out.print(Integer.toBinaryString(third) + ".");
		
		int fourth = scn.nextInt(); // �Ǽ����� ��ǲ �޾Ƽ� �о� ����
		System.out.print(Integer.toBinaryString(fourth) + ".");
		scn.close();
		
		
	}

}