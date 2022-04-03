package chap14.EX04;
// 자동 리소스(객체) 제거
//1. AutoClosable 인터페이스를 구현
//2.


import java.io.IOException;
import java.io.InputStreamReader;

import chap06_07.Ex02.A;

// 필드의 값 할당. 생성자 호출 시 필드에 값을 부여함

class abc implements AutoCloseable{ //5. # 필드, 생성자, 오버라이딩 순으로 일정한 규칙을 두면 좋음.

	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg; // 평균 계산 
	
	abc(String name, int studentID, int kor, int eng, int math, double avg){ //생성자의 매개변수로 String 값을 받아서 메모리로 로딩함.
		this.name = name; this.studentID = studentID; this.kor =kor;
		this.eng = eng; this.math = math; this.avg = avg;
	}
	@Override
	public void close() throws Exception {
		
		System.out.println("========================");
		System.out.println("이   름: " + name ); // 입력이 잘 되었는지 한번 확인차 출력
		System.out.println("학   번: " + studentID );
		System.out.println("국어점수: " + kor );
		System.out.println("영어점수: " + eng );
		System.out.println("수학점수: " + math );
		System.out.println("평   균: " + avg );
		System.out.println();
		System.out.println("========================");
		System.out.println("리소스 해제를 시작합니다.");
		System.out.println("========================");
		System.out.println();
		
		if(name != null) {
			name = null; 
			System.out.println(" name의 리소스가 해제 되었습니다.");
		}
		if(eng != 0); {
			studentID = 0; 
			System.out.println(" eng의 리소스가 해제 되었습니다.");
		}
		if( kor != 0) {
			kor = 0; 
			System.out.println(" kor의 리소스가 해제 되었습니다.");
		}
		if( eng != 0) {
			eng = 0; 
			System.out.println(" eng의 리소스가 해제 되었습니다.");
		}
		if( math != 0) {
			math = 0; 
			System.out.println(" math의 리소스가 해제 되었습니다.");
		}
		if( avg != 0) {
			avg = 0; 
			System.out.println(" avg의 리소스가 해제 되었습니다.");
			
			// 선생님 방법 if (name !=null | studentID !=null | 이런식으로 or를 사용함
			// name = null, studentID = 0; kor = 0; 이런식으로 만듦.
			System.out.println("========================");
		}
	}
}

	


/*
class abc{
	String name;
	int studentID;
	int kor;
	int eng;
	int math;
	double avg; // 평균 계산 

	abc(String name, int studentID, int kor, int eng, int math, double avg){ 생성자의 매개변수로 String 값을 받아서 메모리로 로딩함.
		this.name = name; this.studentID = studentID; this.kor =kor;
		this.eng = eng; this.math = math; this.avg = avg;
	}
	// 클로즈 메소드 자리
}
*/

public class TrywithResource_3 {

	public static void main(String[] args) {
		
		//1. 객체의 모든 필드를 초기화하고 자동으로 close ();
		
		String name = "철수";
		int studentID = 1111;
		int kor = 72;
		int eng = 83;
		int math = 99;
		double avg = (kor + eng + math)/3;
		
		try(abc abc1 = new abc(name, studentID, kor, eng, math, avg)){ // String name, int studentID, int kor, int eng, int math, double avg
		}catch (Exception e){
			System.out.println("예외가 발생되었습니다.");
		}finally { // 블락에 a.close() 메소드를 자동으로 호출됨.
		}
		System.out.println("자동 초기화 종료");
		
		
		System.out.println("========================");
		
		
		//2 수동 리소스 해제 사용
		
		abc abc2 = new abc("영수",1112,73,83,97,(kor+eng+math)); 
		// 자동 리소스 해제 절차와는 다르게 매개변수를 포함한 객체 생성이 반드시 필요한 이유는
		// try 내부에서 새 객체를 생성하면, try문이 종료된 후에 그 객체가 try문 종료와 함께
		// 소멸되기 때문임. 고로 후행의 finally에서 abc2 객체를 찾을 수 없어서 에러가 발생함
			
		try{abc2 = new abc(name, studentID, kor, eng, math, avg);
		}catch (Exception e){
		e.printStackTrace();
		System.out.println("예외가 발생되었습니다.");
		}finally { // 수동 리소스 해제 구문 시작
			if( abc2.name != null|| abc2.studentID != 0|| abc2.kor != 0|| abc2.eng != 0 || abc2.math != 0||abc2.avg != 0.0) {
				
				try {
					System.out.println("변수 중 하나 이상이 초기화되지 않았습니다.");
					abc2.close();
				}catch (Exception e) {
					e.printStackTrace();
				}finally {
					System.out.println("수동 리소스 해제절차를 종료합니다");
				}
			}
		}	
	// 문서의 끝
	}
}