package chap10.Ex01;

class Student_sub extends Student {
	// Student_sub 는 Student 를 상속 받고 있다 
	// Student 는 Person을 상속 받고있기 떄문에  Student_sub는 Person 과 Student 의 필드와 메소드를 모두 상속받는다  
	
	String sub1;
	
	void sub1() {
		System.out.println("Student_sub클래스 입니다 , Person과 Student 의 필드와 메소드를 전부 상속받는다  ");
	}
	
}


class Student extends Person {     // 대학생 클래스        person : 부모    student : 자식
	// 자식클래스는 부모 클래스의 필드 , 메소드 , 인너클래스를 그대로 상속 받는다. 
	
	int studentId ;
	void goToScool() {
		System.out.println("자식 클래스의 student 메소드 goToSchool 호출 ");
	}
}


class Worker extends Person{       // 직장인 클래스
	int workerID; 
	void goToWork(){
		System.out.println("직장인 클래스의 메소드 호출 ");
	}
}


public class Person {    // 상속 : 부모 클래스의 (필드, 메소드 , 내부클래스 ) 를  자식클래스에게 상속
						 // 상속의 장점 : 1. 중복된 코드의 제거 ( 코드의 재사용)
						 //            2.  코드가 간결해짐 
	
	String name ;
	int age ; 
	
	void eat() {
		
		System.out.println("부모클래스의 eat() 메소드");
	}
	
	void sleep() {
		
		System.out.println("부모클래스의 sleep() 메소드");
	}
	
	

	
	
	
	

	public static void main(String[] args) {
		
		// Person 객체 생성
		Person p = new Person();
		p.name = "강성민";
		p.age = 25 ;
		p.sleep();
		p.eat();
		System.out.println("=======================");
		
		
		// Student 객체 생성
		Student s = new Student();
		// Person 클래스 필드
		s.name = "ㅁㄴㅇㄹ";
		s.age = 22;
		// Student 클래스의 필드
		s.studentId = 111;
		// Person 클레스 메소드
		s.sleep();
		s.eat();
		// Student 클래스 메소드 
		s.goToScool();

		System.out.println("==================");
		
		// Worker 객체 생성 
		Worker w = new Worker();
		// Person 클래스 필드
		w.name = "ㅁㄴㅇㄹ";
		w.age = 22;
		//Worker 클래스 필드
		w. workerID = 12 ;
		// Person 클레스 메소드
		w.sleep();
		w.eat();
		//Worker 클래스 메소드
		w.goToWork();
		
		System.out.println("==========객체 생성시 타입 변환 ===========");
		
		Person p1 = new Person();     // Person()은 Person 이다.   
		Person ps = new Student();    // 업캐스팅 , Student는 Person 이다     
	//	Student sp = new Person();     // Person 은 Student 이다  = 불가능   
		Person pw = new Worker();      // 업캐스팅 ,  Worker는 Person 이다
	//  Worker wp = new Person ();     //   불가능     
	
		
		System.out.println("=======================");
	
		Student_sub sub1 = new Student_sub();
 //       클래스타입  객체명          자식클래스
		
		
			// Person 클래스의 필드와 메소드 사용 가능
			sub1.name = "ㅂㅈㄷㄱ";
			sub1.age = 12;
			sub1.eat();
			sub1.sleep();
			//Student 클래스의 필드와 메소드
			sub1.studentId = 1145;
			sub1.goToScool();
			//Student_sub1 의 필드와 메소드
			sub1.sub1 = "자식의 자식 클래스 ";
			sub1.sub1();
			
		Person ps1 = new Student_sub();    // 업캐스팅; Student_sub 객체를 생성시 부모 데이터 타입으로 형변환 
					// Student_sub 는 Person 타입으로 업캐스팅 , Person클래스의 멤버만 사용 가능
			ps1.name = "ddd";
			ps1.age = 12;
			ps1.eat();
			ps1.sleep();
		
		Student ss1 = new Student_sub();   // 업캐스팅
			// person 과 Student 의 필드와 메소드 사용가능
		//Person
		ss1.name = " ttt";
		ss1.age = 11 ;
		ss1.eat();
		ss1.sleep();
		// Student
		ss1.studentId = 11567;
		ss1.goToScool();
		
		Student_sub ss2 = new Student_sub();  // Person , Student , Student_sub 의 필드와 메소드 모두 사용
		//Person
		ss2.name = "ghh";
		ss2.age = 57;
		ss2.eat();
		ss2.sleep();
		// Student
		ss2.studentId = 612512;
		ss2.goToScool();
		// Student_sub
		ss2.sub1 = "ddf";
		ss2.sub1();
		
	// 상속 관계에서 객체 생성시 부모 데이터 타입으로 업캐스팅 가능
		// 부모 데이터 타입으로 업캐스팅 된 경우 부모의 필드와 메소드만 사용가능
		
		// Person <==  Student <== Student_sub
		
		Person ps4  = new Student_sub();
			// Student_sub 객체 생성시 Person 타입으로 업캐스팅
		    // Student_sub 는 Person과 Student 와 Student_sub의 모든 필드와 메소드를 포함하고 있다
			// 그중에서 Person 클래스의 필드와 메소드만 접근 가능 
		Student ss4  = new Student_sub();
		// Student_sub 객체 생성시 Student 타입으로 업캐스팅
	    // Student_sub 는 Person과 Student 와 Student_sub의 모든 필드와 메소드를 포함하고 있다
		// 그중에서 Person , Student 클래스의 필드와 메소드만 접근 가능 
		Student_sub ss5  = new Student_sub();
		// Student_sub 객체 생성시 Student_sub 타입으로 업캐스팅
	    // Student_sub 는 Person과 Student 와 Student_sub의 모든 필드와 메소드를 포함하고 있다
		// 그중에서 Person , Student , Student_sub 클래스의 필드와 메소드만 접근 가능
	
		
		// 다운 캐스팅 : 부모 데이터 타입으로 업캐스팅된것을 자식 데이터 타입으로 변환 ( 수동으로 변환 )
		
		Student ps5 = (Student) ps4 ;    // ps4( Person , Student , Student_sub ) 의 데이터 타입은 Person
					 // ps5 는 Person , Student 의 필드와 메소드 접근 가능
		ps5.name = " 다운 캐스팅";
		ps5.age = 33;
		ps5.studentId = 2214;
		ps5.goToScool();
		
		Student_sub ps6 = (Student_sub) ps4 ;     // ps4를 Person 데이터 타입에서 Student_sub로 다운캐스팅
		ps6.name = "eeee";
		ps6.age = 11;
		ps6.studentId = 75623;
		ps6.goToScool();
		ps6.sub1 = " hhhh";
		ps6.sub1();
		
		
	
	
	
	
	
	
	}

}
