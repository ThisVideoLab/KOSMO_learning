package chap06_07.Ex02;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {
	/*
	static void method1() {
		System.out.println("매개변수가 없는 메소드 호출");
	}
	static void method1 (int a, int b) {
		System.out.println(a + " , " + b);
	}
	static void method1 (int a, int b, int c) {
		System.out.println(a + " , " + b + ", " + c);
	}
	static void method1 (int a, int b, int c, int d) {
		System.out.println(a + " , " + b + ", " + c + ", " + d);
	}
	static void method1 (int a, int b, int c, int d, int e) {
		System.out.println(a + " , " + b + ", " + c + ", " + d + ", " + e);
	}
	*/
	
	static void method1(int ... values) {
		System.out.println(values.length);
		System.out.println("======<Arrays.toString>>=======");
		System.out.println(Arrays.toString(values));
		System.out.println();
		
		//for
		for(int i = 0 ; i < values.length ; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
		//향상된 for 문
		for(int k : values) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
	
	
	static void method2(String ... values2) {
		
		for(int i = 0 ; i < values2.length ; i++) {
			System.out.print(values2[i] + " ");
		}
		System.out.println();
		
		for(String k : values2) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//배열의 길이가 고정되지 않고 가변길인 경우 
		// 1. method1 ( int ... values) <<== 가변길이를 처리하는 input 매개변수 설정
		
		method1 ();               // 메소드 오버라이딩 : 메소드명은 모두 동일 , 매개변수의 타입 , 갯수에 따라
		method1 (1,2);            // 해당 메소드 출력 
		method1 (1,2,3);
		method1 (1,2,3,4);
		method1 (1,2,3,4,5);
		method1 (1,2,3,4,5,6,7,8,9,10);
		
		//method2
		method2 ("안녕" , "방가");
		method2 ("월", "화", "수", "목", "금", "토", "일");
		method2 ("사자", "호랑이", "여우", "곰");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
