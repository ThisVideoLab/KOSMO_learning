package EX;

class students{
	int studentID;
	String name;
	int kor;
	int eng;
	
	students(int students, String name, int kor, int eng){
		this.studentID = studentID;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	@Override  // a1.eauals(a2)
	public boolean equals(Object obj) { // ��ü�� �Ű������� ���� �� Object Ÿ������ �ڵ� ��ĳ����
		if (this.studentID == ((students)obj).studentID) { //B Ÿ������ �ٿ� ĳ���� �� �� ��ü�� name �ʵ��� ���� ����
			return true;
		}else {
			return false;
		}
	}
}


public class Quiz04 {
	
	public static void main(String[] args) {
		students s1 = new students(1111, "ȫ�浿", 90 ,80); // ��ǲ�� �־ �� ������
		students s2 = new students(1112, "��û��", 70, 90);
		students s3 = new students(1113, "�ٵ���", 90, 70);
		students s4 = new students(1111, "ȫ�浿�� �Ӹ�ī�� �н�", 30, 40);
		
		
		
		// studentID�� ���� ��� �������� == �Ἥ ���� �л��̴ٶ�� �����. 
		if(s1.equals(s4)) {
			System.out.println(s1.name + "�� " + s4.name +" �л��� ���� �л��Դϴ�"); // true�� ���ϵǵ��� �ۼ�	
		}
		
	}

}
