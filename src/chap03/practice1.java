package chap03;

public class practice1 {
	public static void main(String[] args) {
		int age = 21;
		int charge;		
		String grade;
				
		if(age<8) { // ������ �Ƶ� �����1000��
			charge = 1000;
			grade = "������ �Ƶ�";
		}
		else if(age < 14) { // �ʵ��л� �����2000��
			charge = 2000;
			grade = "�ʵ��л�";
		}
		else if (age < 20) {   // �߰���л� �����2500��
			charge = 2500;
			grade = "�߰���л�";
		}
		else {  // ���� �����3000��
			charge = 3000;
			grade = "����";
		}
		System.out.println(grade + " �����" + charge + "�� �Դϴ�.");
	}   
}