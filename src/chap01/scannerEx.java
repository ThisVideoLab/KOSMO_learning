package chap01;

import java.util.Scanner;

public class scannerEx {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력해 주세요.");
		Scanner scn = new Scanner(System.in);
		
		String name = scn.next(); // 문자열을 인풋받도록 함.
		System.out.println("이름은" + name + ", ");
		
		String city = scn.next();
		System.out.println("도시는" + city + ", ");
		
		int age = scn.nextInt(); // 정수값을 인풋받아서 읽어 들임
		System.out.println("나이는" + age + ", ");
		
		double weight = scn.nextDouble(); // 실수값을 인풋 받아서 읽어 들임
		System.out.println("체중은" + weight + ", ");
		
		Boolean single = scn.nextBoolean(); // 논리값을 읽어 들여서 참 거짓을  판별해 읽어들임
		System.out.println("독신 여부는 " + single + "입니다. ");
		scn.close();
			
	}

}
