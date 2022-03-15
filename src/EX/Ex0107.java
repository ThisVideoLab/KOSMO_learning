package EX;

import java.util.Scanner;

public class Ex0107 {

	public static void main(String[] args) {
		
		
		int[] arr = new int[10];
		int a = 1; // 2번째 for문 내부의 while 구문을 최초 1회만 출력하도록 하는 변수
		int k = 0; // 2번째 for문 내부의 if 구문을 최후 1회만 출력하도록 하는 변수
		System.out.println("양의 정수 10개를 입력하십시오.");
		Scanner scn = new Scanner(System.in);

		int tmpCnt = 0; // 현재 입력 횟수
		
		for (tmpCnt = 0; tmpCnt < arr.length; tmpCnt++){
			arr[tmpCnt] = scn.nextInt();
			if(tmpCnt < (arr.length)) { // 10개 미만의 정수를 입력하여 출력값을 얻지 못하는 경우를 방지
				System.out.println("정수를 10개의 값을 입력하는 중입니다" + "(" + (tmpCnt+1) + "/10)");
			}
		}
		scn.close();

		System.out.println();
				
		for (k = 0; k < arr.length; k++){
			while (a == 1) {
	 			System.out.print("입력하신 정수들 중에서 3의 배수는 ");
	 			a++;
	 		 }
			if(arr[k] % 3 == 0) {
			System.out.print(arr[k] + " ");
			}
		}
	
		if(k == arr.length) {
       	 System.out.println("입니다.");	 
		}
	scn.close();
	}
}
