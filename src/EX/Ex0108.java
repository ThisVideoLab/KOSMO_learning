package EX;
import java.util.Scanner;
public class Ex0108 {
		public static void main(String[] args) {
			System.out.println("�ݾ��� �Է��Ͻÿ�.");
			Scanner scan = new Scanner (System.in);
			int money = scan.nextInt();
			int[][] arr = new int [2][9];
			
			arr[0][0] = 50000; // 50,000��¥��
			arr[0][1] = 10000; // 10,000��¥��
			arr[0][2] = 5000; // 5,000��¥��
			arr[0][3] = 1000; // 1,000�� ¥��
			arr[0][4] = 500; // 500��¥��
			arr[0][5] = 100; // 100��¥��
			arr[0][6] = 50; // 50��¥��
			arr[0][7] = 10; // 10��¥��
			arr[0][8] = 1; // 1��¥��
	
		 	arr[1][0]= money/arr[0][0]; // 50,000��¥�� ������ ��
			arr[1][1]= (money%arr[0][0])/arr[0][1]; // 10,000��¥�� ������ ��
			arr[1][2]= (money%arr[0][1])/arr[0][2]; // 5,000��¥�� ������ ��
			arr[1][3]= (money%arr[0][2])/arr[0][3]; // 1,000�� ¥�� ������ ��
			arr[1][4]= (money%arr[0][3])/arr[0][4]; // 500��¥�� ������ ��
			arr[1][5]= (money%arr[0][4])/arr[0][5]; // 100��¥�� ������ ��
			arr[1][6]= (money%arr[0][5])/arr[0][6]; // 50��¥�� ������ ��
			arr[1][7]= (money%arr[0][6])/arr[0][7]; // 10��¥�� ������ ��
			arr[1][8]= (money%arr[0][7]); // 1��¥�� ������ ��
			
			System.out.println();
			System.out.println("�Է��Ͻ� �ݾ� " + money +"���� ������ ������ ������ �����ϴ�.");
			System.out.println();
			
			for(int c = 0; c < arr[1].length; c++) {
				if (arr[1][c] >0) { // [0][c]�� ������ ������ �ִ� ��쿡��? �������? ���?
					System.out.print(arr[0][c] + "��: " + arr[1][c]);
					if (arr[0][c] < 1000 ) {
						System.out.println("��");
					}
					else {
						System.out.println("��");
					}
				}
			}
		scan.close();
	}
}