package EX;

import java.util.Scanner;

public class Ex0107 {

	public static void main(String[] args) {
		
		
		int[] arr = new int[10];
		int a = 1; // 2��° for�� ������ while ������ ���� 1ȸ�� ����ϵ��� �ϴ� ����
		int k = 0; // 2��° for�� ������ if ������ ���� 1ȸ�� ����ϵ��� �ϴ� ����
		System.out.println("���� ���� 10���� �Է��Ͻʽÿ�.");
		Scanner scn = new Scanner(System.in);

		int tmpCnt = 0; // ���� �Է� Ƚ��
		
		for (tmpCnt = 0; tmpCnt < arr.length; tmpCnt++){
			arr[tmpCnt] = scn.nextInt();
			if(tmpCnt < (arr.length)) { // 10�� �̸��� ������ �Է��Ͽ� ��°��� ���� ���ϴ� ��츦 ����
				System.out.println("������ 10���� ���� �Է��ϴ� ���Դϴ�" + "(" + (tmpCnt+1) + "/10)");
			}
		}
		scn.close();

		System.out.println();
				
		for (k = 0; k < arr.length; k++){
			while (a == 1) {
	 			System.out.print("�Է��Ͻ� ������ �߿��� 3�� ����� ");
	 			a++;
	 		 }
			if(arr[k] % 3 == 0) {
			System.out.print(arr[k] + " ");
			}
		}
	
		if(k == arr.length) {
       	 System.out.println("�Դϴ�.");	 
		}
	scn.close();
	}
}
