package chap10.EX04;

class Human{ // 부모 클래스
	String name; // 인스턴스 필드 : 객체화시켜야 사용 가능함. 메모리는 heap이라는 공간 안에 저장 됨.
	int age;
	
	void eat() { // 인스턴스 메소드 : 객체화 시켜야 사용 가능함. heap 영역의 pointer(주소)를 가지고 있음
				 // 클래스 영역 내의 인스턴스 메소드 영역에 실제 메소드 코드가 저장되어 있음.
		System.out.println("사람이 먹습니다.");
	}
	
	void sleep() {
		System.out.println("사람이 잡니다.");
	}
}

class Student extends Human{
	int StudentID;
	void goToSchool() {
		System.out.println("학생은 학교에 갑니다.");
	}
	
}

class Worker extends Human{
	int WorkerID;
	void goToCompany () {
		System.out.println("직장에 갑니다!");
	}
}



public class Test01 {

	public static void main(String[] args) {

		Human h = new Human();
		h.name = "홍길동";
		h.age = 30;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name = "신사임당";
		s.StudentID = 1111;
		s.eat();
		s.goToSchool();
		
		Worker w = new Worker();
		w.name = "BTS";
		w.WorkerID = 2222;
		w.eat();
		w.goToCompany();
		
		// 문서의 끝
	}

}
