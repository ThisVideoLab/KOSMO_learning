package chap03;

public class new_thang {
	public static void main(String[] args) {
		int score = 81;
		String range;
		char grade;
		
	if(score < 60) {
		range ="60�� ����";
		grade = 'F';
	}
	else if(score < 70) {
		range = "60 ~ 69��";
		grade = 'D';
	}
	else if(score < 80) {
		range = "70 ~ 79��";
		grade = 'C';
	}
	else if(score < 90) {
		range = "80 ~ 89��";
		grade = 'B';
	}
	else {
		range = "90 ~ 100��";
		grade = 'A';
	}
	System.out.println(score + "�� �� " + range + " �����̹Ƿ� " + grade + " �����Դϴ�.");	
		
	}
}
