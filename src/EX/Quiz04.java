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
	public boolean equals(Object obj) { // 객체를 매개변수로 넣을 때 Object 타입으로 자동 업캐스팅
		if (this.studentID == ((students)obj).studentID) { //B 타입으로 다운 캐스팅 후 각 객체의 name 필드의 값을 비교함
			return true;
		}else {
			return false;
		}
	}
}


public class Quiz04 {
	
	public static void main(String[] args) {
		students s1 = new students(1111, "홍길동", 90 ,80); // 인풋값 넣어서 쭉 재정의
		students s2 = new students(1112, "심청이", 70, 90);
		students s3 = new students(1113, "바둑이", 90, 70);
		students s4 = new students(1111, "홍길동의 머리카락 분신", 30, 40);
		
		
		
		// studentID가 같은 경우 이퀄스와 == 써서 같은 학생이다라고 출력함. 
		if(s1.equals(s4)) {
			System.out.println(s1.name + "과 " + s4.name +" 학생은 같은 학생입니다"); // true가 리턴되도록 작성	
		}
		
	}

}
