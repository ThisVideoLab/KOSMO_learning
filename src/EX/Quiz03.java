package EX;

class Student {
	String name; // �̸�
	String hobby;
	int studentID; // �й�
	int kor; // ������� ����
	int eng; // ������� ����
	int math; // ���н��� ����
	int sum; // ����
 	double avg; // ���
 	
 	void Hobby() {
 		System.out.println("���л��� ��̴� " + hobby + "�Դϴ�.");
 	}
 	
	@Override
	public String toString() {
		return " �̸� : " + name + "/ �й� : " + studentID + "/ ����: " + kor + "/ ����: " + eng + "/ ����: " + math + "/ ����: " + sum + "/ ���: " + avg + "/ ���: " + hobby; 
	}
	// (String a, int b, int c, int d ,int e, int f, double g, String h);
 		
 	
}
class student_cheolsoo extends Student{

	student_cheolsoo(){}
	
	student_cheolsoo (String a, int b, int c, int d ,int e, String g){
		super.name = a;
		super.studentID = b;
		super.kor = c; // ������� ����
		super.eng = d; // ������� ����
		super.math = e; // ��������
		super.sum = c+d+e;
		super.avg = (c+d+e)/3;
		super.hobby = g;
	}
	
	@Override
	void Hobby() {
		System.out.println("ö���� ��̴� �����Դϴ�.");
	}
	
}
class student_yeonghee extends Student{
	
	student_yeonghee(){}
	
	student_yeonghee (String a, int b, int c, int d ,int e, String g){
		super.name = a;
		super.studentID = b;
		super.kor = c; // ������� ����
		super.eng = d; // ������� ����
		super.math = e; // ��������
		super.sum = c+d+e;
		super.avg = (c+d+e)/3;
		super.hobby = g;
	}
	
	@Override
	void Hobby() {
		System.out.println("������ ��̴� �ͽ�Ʈ�� �������Դϴ�.");
	}
}
class student_badugi extends Student{
	
	student_badugi(){}
	
	student_badugi (String a, int b, int c, int d ,int e, String g){
		super.name = a;
		super.studentID = b;
		super.kor = c; // ������� ����
		super.eng = d; // ������� ����
		super.math = e; // ��������
		super.sum = c+d+e;
		super.avg = (c+d+e)/3;
		super.hobby = g;
	}
	
	@Override
	void Hobby() {
		System.out.println("�ٵ����� ��̴� ��å�Դϴ�.");
	}
}




public class Quiz03 {

	public static void main(String[] args) {

		Student cs1 = new student_cheolsoo("ö��",0001,80,80,70,"����");
		Student yh1 = new student_yeonghee("ö��",0002,40,50,60,"�ͽ�Ʈ�� ������");
		Student bdg1 = new student_badugi("ö��",0003,67,77,42,"��å");
		
		Student arr[] = {cs1,yh1,bdg1};
		
		for(int i=0;i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].Hobby();
		}
		
		for (Student k: arr) {
			System.out.println(k);
			k.Hobby();
		}
		
		
		// ������ ��
	}

}
