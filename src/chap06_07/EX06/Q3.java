package chap06_07.EX06;

import java.util.Scanner;




public class Q3 {
	
	
	static void sport1 ( String ... values) {
		int a = 0 ;
		int c = 0 ;
		double k = 0 ;
		
		for(int i = 0 ; i < values.length ; i++) {
			if(values[i].equals("그만")) {
				System.out.println("프로그램 종료");
				break;
			}
			if(i %2 ==0) {
				System.out.print(values[i] + " : ");
				c++ ;
			}
			if(i %2 == 1) {
				int j = Integer.parseInt(values[i]);
				System.out.print(j + " ");
				a += Integer.parseInt(values[i]);
			}
			
		}
		k = (double)a/(values.length-c);
		System.out.println();
		System.out.println("운동종목의 구성원 총 합계 : " + a);
		System.out.println("운동종목의 구성원 평균 : " + k);
		
		
	}

	public static void main(String[] args) {
		
		System.out.println( "임의의 운동과 해당운동의 구성원을 입력하세요");
		Scanner sca = new Scanner (System.in);
		
		String sport = sca.nextLine();        // String 값을 인풋 받는 변수 
		String array [] = sport.split(" ");         // 인풋받은 값을 공백을 기준으로 나눠서 배열에 저장 
		
		
		sport1(array);
		
		
		
			
				
		

	}

}
