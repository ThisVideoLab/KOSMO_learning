package chap06_07.Ex02;

import java.util.Scanner;

public class Q2 {
	
		static void math ( String ... values) {
			int sum = 0 ;        // 들어오는 정수를 합하는 변수
		    double  avg ;        // 평균을 저장하는 변수
		    
		    for (int i = 0 ; i < values.length ; i++) {
		    	 // sum = sum + values[i] ;       //
		    	 //	sum = sum + Integer.parseInt(values[i]);     //Integer.parseInt (String)  : 숫자형 String 타입을 정수로 변환
		    	sum += Integer.parseInt(values[i]);
		    }
		    avg = (double)sum/values.length;
			System.out.println("합 : " + sum);
			System.out.println("평균 : " + avg);
		}
	
	
	

	public static void main(String[] args) {
		// 스캐너로 임의의 정수값을 할당 받아서 합계와 평균을 출력
		
		Scanner sca = new Scanner (System.in);
		System.out.println("정수값을 입력하세요");
		
		
		String num = sca.nextLine();  // 공백이 들어가므로 전체 정수값을 스트링으로 받아야함
		String [] array1 = num.split(" ");     // split : 구분자료 기준으로 글자를 잘라서 배열에 저장 
		
		
		for (int i = 0 ; i < array1.length ; i ++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		math(array1);   // 가변 길이 메소드 math 를 호출하면서 매개변수로 array1을  넣어줌 
		
		

	}

}
