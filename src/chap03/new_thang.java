package chap03;

public class new_thang {
	public static void main(String[] args) {
		int score = 81;
		String range;
		char grade;
		
	if(score < 60) {
		range ="60점 이하";
		grade = 'F';
	}
	else if(score < 70) {
		range = "60 ~ 69점";
		grade = 'D';
	}
	else if(score < 80) {
		range = "70 ~ 79점";
		grade = 'C';
	}
	else if(score < 90) {
		range = "80 ~ 89점";
		grade = 'B';
	}
	else {
		range = "90 ~ 100점";
		grade = 'A';
	}
	System.out.println(score + "점 은 " + range + " 구간이므로 " + grade + " 학점입니다.");	
		
	}
}
