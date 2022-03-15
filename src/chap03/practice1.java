package chap03;

public class practice1 {
	public static void main(String[] args) {
		int age = 21;
		int charge;		
		String grade;
				
		if(age<8) { // 미취학 아동 요금은1000원
			charge = 1000;
			grade = "미취학 아동";
		}
		else if(age < 14) { // 초등학생 요금은2000원
			charge = 2000;
			grade = "초등학생";
		}
		else if (age < 20) {   // 중고등학생 요금은2500원
			charge = 2500;
			grade = "중고등학생";
		}
		else {  // 성인 요금은3000원
			charge = 3000;
			grade = "성인";
		}
		System.out.println(grade + " 요금은" + charge + "원 입니다.");
	}   
}