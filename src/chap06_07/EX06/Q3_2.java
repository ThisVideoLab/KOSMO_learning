package chap06_07.EX06;

import java.util.Scanner;

public class Q3_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("운동이름과 구성원수를 공백을 이용해서 입력 하세요");
		System.out.println("예) 입력 >>> 탁구 2 야구 9 축구 11 농구 6 씨름 2");
		
		
		String str;                  
		String [] arr ;               
		int sum =0 ;
		int memberCount = 0;
		double avg = 0; 
		int b = 0 ;
		
		
		
		while(true) {
			str = sc.nextLine();
			arr = str.split(" ");
			if ( str.equals("그만")) {
				System.out.println("프로그램 종료");
				break ;
			}
			
			for (int i = 0 ; i < arr.length ; i ++ ) {
				if ( i %2 == 0 ) {
					System.out.print(arr[i] + " : ");
				}
				if ( i%2 !=0) {
					b = Integer.parseInt(arr[i]);
					sum += b ;
					memberCount++ ;
					System.out.print(arr[i] + " ");
				}
			}
			avg = (double)sum/memberCount ;
			System.out.println();
			System.out.println("구성원의 합 : " + sum);
			System.out.println("구성원의 평균 : " + avg);
				
		}
		
			
		

	}

}
