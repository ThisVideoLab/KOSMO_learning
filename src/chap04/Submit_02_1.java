package chap04;
import java.util.Scanner;
public class Submit_02_1{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�����ڸ� �Է��Ͻñ� �ٶ��ϴ�");
		char operator = scn.next().charAt(0);
		
		int num1 = 10;
		int num2 = 2;
		int result = 0;
						
		switch (operator) {
			case '+':
				result = num1 +num2;
			break;
			case '-':
				result = num1 - num2;
			break;
			case '/':
				result = num1 / num2;
			break;
			case '*':
				result = num1 * num2;
					
			break; //�߰��� �ߺ��� �극��ũ�� ���ְ� result ���� ���� �ڿ��� �־� default�� �и��߽��ϴ�.
			
			default:
				System.out.println("������ �����Դϴ�"); 
		}
		System.out.println("��� ���� :" + result + "�Դϴ�."); //������ �����϶��� ���� 0�̶�� ������ ���� ���ֱ� ���� print �� ���� �÷Ƚ��ϴ�.
		scn.close();
		
	}

}

