package chap01;
import java.util.Scanner;
public class ArihmaticOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("정수를 입력하세요");
		
		int time = sc.nextInt(); // 스캐너에서 인풋값을 받아서  time 변수에 할당
		int scond  = time % 60; // % : 뒤에 오는 숫자로 나누고 난 뒤의 나머지 값. 여기서는 초를 의미함.
		int minite = (time / 60) %60; // 마찬가지로 이것은 분을 의미함. 
		int hour = (time/60 / 60) %24; // 시간
		int day =  (time/60) / 60 / 24; // 일
		
		System.out.println(time + " 초는 ");
		System.out.println(day + " 일는 ");
		System.out.println(hour + "시간, ");
		System.out.println(minite + "분, ");
		System.out.println(scond + "초 입니다. ");
		
		 sc.close();
	}

}
