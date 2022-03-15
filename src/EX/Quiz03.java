package EX;

class Student {
	String name; // 이름
	String hobby;
	int studentID; // 학번
	int kor; // 국어시험 점수
	int eng; // 영어시험 점수
	int math; // 수학시험 점수
	int sum; // 총점
 	double avg; // 평균
 	
 	void Hobby() {
 		System.out.println("이학생의 취미는 " + hobby + "입니다.");
 	}
 	
	@Override
	public String toString() {
		return " 이름 : " + name + "/ 학번 : " + studentID + "/ 국어: " + kor + "/ 영어: " + eng + "/ 수학: " + math + "/ 총점: " + sum + "/ 평균: " + avg + "/ 취미: " + hobby; 
	}
	// (String a, int b, int c, int d ,int e, int f, double g, String h);
 		
 	
}
class student_cheolsoo extends Student{

	student_cheolsoo(){}
	
	student_cheolsoo (String a, int b, int c, int d ,int e, String g){
		super.name = a;
		super.studentID = b;
		super.kor = c; // 국어시험 점수
		super.eng = d; // 영어시험 점수
		super.math = e; // 수학점수
		super.sum = c+d+e;
		super.avg = (c+d+e)/3;
		super.hobby = g;
	}
	
	@Override
	void Hobby() {
		System.out.println("철수의 취미는 낚시입니다.");
	}
	
}
class student_yeonghee extends Student{
	
	student_yeonghee(){}
	
	student_yeonghee (String a, int b, int c, int d ,int e, String g){
		super.name = a;
		super.studentID = b;
		super.kor = c; // 국어시험 점수
		super.eng = d; // 영어시험 점수
		super.math = e; // 수학점수
		super.sum = c+d+e;
		super.avg = (c+d+e)/3;
		super.hobby = g;
	}
	
	@Override
	void Hobby() {
		System.out.println("영희의 취미는 익스트림 스포츠입니다.");
	}
}
class student_badugi extends Student{
	
	student_badugi(){}
	
	student_badugi (String a, int b, int c, int d ,int e, String g){
		super.name = a;
		super.studentID = b;
		super.kor = c; // 국어시험 점수
		super.eng = d; // 영어시험 점수
		super.math = e; // 수학점수
		super.sum = c+d+e;
		super.avg = (c+d+e)/3;
		super.hobby = g;
	}
	
	@Override
	void Hobby() {
		System.out.println("바둑이의 취미는 산책입니다.");
	}
}




public class Quiz03 {

	public static void main(String[] args) {

		Student cs1 = new student_cheolsoo("철수",0001,80,80,70,"낚시");
		Student yh1 = new student_yeonghee("철수",0002,40,50,60,"익스트림 스포츠");
		Student bdg1 = new student_badugi("철수",0003,67,77,42,"산책");
		
		Student arr[] = {cs1,yh1,bdg1};
		
		for(int i=0;i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].Hobby();
		}
		
		for (Student k: arr) {
			System.out.println(k);
			k.Hobby();
		}
		
		
		// 문서의 끝
	}

}
