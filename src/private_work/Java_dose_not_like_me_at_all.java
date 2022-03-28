package private_work;
import java.util.Arrays; 
import java.util.Scanner;
public class Java_dose_not_like_me_at_all {
	static void math (String...people) {
		int sum = 0;
		double avg;
			for(int i = 0; i < people.length; i++) {
				if (i%2 != 0) {
				sum += Integer.parseInt(people[i]);
				}
			}	
		avg = ((double)sum/people.length)*2; // 평균은 반드시 double형으로 만들기 맨날 까먹는다 깡깡이야
		
		System.out.println("전체 참여자 수: " + sum);
		System.out.println("종목당 평균 구성원 수 " + avg);
	}
	public static void main(String[] args) {
		System.out.println("임의의 운동 종목 이름과, 해당 운동에 참여하는 인원수를 띄어쓰기로 구분해 입력해주세요.");
		System.out.println("예시) 농구 11 축구 12");
		System.out.println("원하는 만큼 입력하신 후에 엔터를 누르면 입력값이 출력됩니다.");
		while(true) {
			Scanner scan = new Scanner(System.in);
			String num;
			num = scan.nextLine(); // 공백이 들어가므로, 전체 정수값을 String으로 받아야 함. 그러면 인풋값을 전체 받고 스플릿으로 짤라서 공백을 날리고 저장하면 됨.
			if(num.equals("그만")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			String[] arr1;
			arr1 = num.split(" "); // 이렇게 짜놓으면 splite는 구분자를 기준으로 글자를 잘라서 배열에 저장함.
			System.out.println("[전체 종목 및 참여 인원수 현황]");
			for(int i = 0; i < arr1.length; i++) { // 전체 종목 및 각 종목당 인원수 출력 for 문 시작 
				if(i%2 != 0) { // arr1[i]가 짝수 번째의 방이라면
					System.out.print(arr1[i] + "]");
				}
				if(i%2 == 0) { // arr1[i]가 홀수 번째의 방이라면
					System.out.print("[" + arr1[i] + ": ");
				}
			} // 전체 종목 및 각 종목당 인원수 출력 for 문 시작 
			System.out.println();
			math(arr1); // 가변길이 메소드 math를 호출하면서 매개변수로 arr1에 넣어주게 됨.
			
		}
	}
		
}
