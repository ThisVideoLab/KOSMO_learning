package EX;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		boolean run = true;
		int num = 0; // 스캐너로 번호를 인풋 받는 변수
		Scanner scan = new Scanner(System.in);
		System.out.println("==============================");
		System.out.println(" 1을 입력하면 19단출력 / 2를 입력하면 홀수단 출력 / 3 넣으면 3의 배수 출력 / 4 넣으면 프로그램 종료");
		System.out.println("==============================");
		
		do {
				num = scan.nextInt();
				if ( num == 1 ) { // 이중 for문을 사용해서, 19단 출력
					for(int f = 1; f< 20 ; f++) {
						for (int s = 1; s < 10; s++) {
							System.out.println(f + " X " + s + " = " + (f*s) );	
						}
					}
				}
				else if  ( num == 2 ) { // 홀수단만 출력
					for(int f = 1; f< 20 ; f++) {
						for (int s = 1; s < 10; s++) {
							if ((s*f)%2 != 0 ) {
							System.out.println(f + " X " + s + " = " + (f*s) );	
						}
					}
						
					}
					
				}
				else if  ( num == 3 ) { // 홀수단만 출력
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
		System.out.println(" 프로그램을 종료합니다");
		
		// 문서의 끝
	}

}
