package EX;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		boolean run = true;
		int num = 0; // ��ĳ�ʷ� ��ȣ�� ��ǲ �޴� ����
		Scanner scan = new Scanner(System.in);
		System.out.println("==============================");
		System.out.println(" 1�� �Է��ϸ� 19����� / 2�� �Է��ϸ� Ȧ���� ��� / 3 ������ 3�� ��� ��� / 4 ������ ���α׷� ����");
		System.out.println("==============================");
		
		do {
				num = scan.nextInt();
				if ( num == 1 ) { // ���� for���� ����ؼ�, 19�� ���
					for(int f = 1; f< 20 ; f++) {
						for (int s = 1; s < 10; s++) {
							System.out.println(f + " X " + s + " = " + (f*s) );	
						}
					}
				}
				else if  ( num == 2 ) { // Ȧ���ܸ� ���
					for(int f = 1; f< 20 ; f++) {
						for (int s = 1; s < 10; s++) {
							if ((s*f)%2 != 0 ) {
							System.out.println(f + " X " + s + " = " + (f*s) );	
						}
					}
						
					}
					
				}
				else if  ( num == 3 ) { // Ȧ���ܸ� ���
					for(int f = 1; f< 20 ; f++) {
						for (int s = 1; s < 10; s++) {
							if ((s*f)%3 == 0 ) {
							System.out.println(f + " X " + s + " = " + (f*s) );	
							}
						}
					}
				}	
				else if  ( num == 4 ) { 
					break;
				}
			}while(run);
		scan.close();
		System.out.println(" ���α׷��� �����մϴ�");
		
		// ������ ��
	}

}
