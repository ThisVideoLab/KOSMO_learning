package chap03;

import java.util.Scanner;

public class Homework_lys {

	public static void main(String[] args) {
		
		// 요거는 p106쪽 연습문제
		
		//q1
		System.out.println(3/2); // 틀림 별도로 입력 안하면 integer 취급해서 소수점을 버리는 충격적인 현실
		System.out.println(10%3 + 5/3); // 2 정답
		System.out.println((4+5/2)%4); // 2
		
		System.out.println("==========");
		
		//q2
		int a = 5;
		int b = a++;
		
		System.out.println(a); // 6 정답
		System.out.println(b); // 5 정답
		System.out.println(++a); // 7 정답
		System.out.println(++b); // 6 정답
		System.out.println(a++ + --b); // 7 + 5 = 12 정답 
		System.out.println(a + b); // 8 + 5 = 13 정답
		
		System.out.println("==========");
		
		//q3 
		
		//3 = 0b00000011
		//5 = 0b00000101
		
		System.out.println(5 & 3); // 1 정답 => 근데 맞춰놓고 햇갈려서 다시 봤으니까 틀린거나 다름 없다 
		System.out.println(5 | 3); // 7 정답 => 근데 맞춰놓고 햇갈려서 다시 봤으니까 틀린거나 다름 없다
		System.out.println(5 ^ 3); // 6 틀림 => 근데 맞춰놓고 햇갈려서 다시 봤으니까 틀린거나 다름 없다
		
		System.out.println("==========");
		
		// 요거는 선생님이 메일로 내라고 한 자료
		
		System.out.println("정수값을 입력하세요");
		Scanner scn = new Scanner(System.in);
		
		int value1 = scn.nextInt();
		
		if (value1 % 3 == 0) {
			System.out.println("3의 배수입니다"); // 조건이 참일 때 실행되는 구문
		} else {
			System.out.println("3의 배수가 아닙니다"); // 조건이 거짓일 때 실행되는 구문
		}
		scn.close();
	
		
		
	}

}
