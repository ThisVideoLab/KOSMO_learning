package chap03;

import java.util.Scanner;

public class Homework_lys {

	public static void main(String[] args) {
		
		// ��Ŵ� p106�� ��������
		
		//q1
		System.out.println(3/2); // Ʋ�� ������ �Է� ���ϸ� integer ����ؼ� �Ҽ����� ������ ������� ����
		System.out.println(10%3 + 5/3); // 2 ����
		System.out.println((4+5/2)%4); // 2
		
		System.out.println("==========");
		
		//q2
		int a = 5;
		int b = a++;
		
		System.out.println(a); // 6 ����
		System.out.println(b); // 5 ����
		System.out.println(++a); // 7 ����
		System.out.println(++b); // 6 ����
		System.out.println(a++ + --b); // 7 + 5 = 12 ���� 
		System.out.println(a + b); // 8 + 5 = 13 ����
		
		System.out.println("==========");
		
		//q3 
		
		//3 = 0b00000011
		//5 = 0b00000101
		
		System.out.println(5 & 3); // 1 ���� => �ٵ� ������� �ް����� �ٽ� �����ϱ� Ʋ���ų� �ٸ� ���� 
		System.out.println(5 | 3); // 7 ���� => �ٵ� ������� �ް����� �ٽ� �����ϱ� Ʋ���ų� �ٸ� ����
		System.out.println(5 ^ 3); // 6 Ʋ�� => �ٵ� ������� �ް����� �ٽ� �����ϱ� Ʋ���ų� �ٸ� ����
		
		System.out.println("==========");
		
		// ��Ŵ� �������� ���Ϸ� ����� �� �ڷ�
		
		System.out.println("�������� �Է��ϼ���");
		Scanner scn = new Scanner(System.in);
		
		int value1 = scn.nextInt();
		
		if (value1 % 3 == 0) {
			System.out.println("3�� ����Դϴ�"); // ������ ���� �� ����Ǵ� ����
		} else {
			System.out.println("3�� ����� �ƴմϴ�"); // ������ ������ �� ����Ǵ� ����
		}
		scn.close();
	
		
		
	}

}
