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
	String age;
	
	abc(String name, int studentID, int kor, int eng, int math, double avg){ //생성자의 매개변수로 String 값을 받아서 메모리로 로딩함.
		this.name = name; this.studentID = studentID; this.kor =kor;
		this.eng = eng; this.math = math; this.avg = avg;
	}
	
	@Override
	public void close() throws Exception { 
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
		
		try(abc abc1 = new abc("철수", 1111, 72, 83, 99, (72+83+99)/3)){ // String name, int studentID, int kor, int eng, int math, double avg
		}catch (Exception e){
			System.out.println("예외가 발생되었습니다.");
		}finally { // 블락에 a.close() 메소드를 자동으로 호출됨.
		}
		System.out.println("자동 초기화 종료");
		
		
		System.out.println("===================");
		
		
		//2. 수동 close (), finally 블럭에서 close() 직접 호출
		
		System.out.println("문자를 입력하세요 !");
	
		abc a2 = null;
		
		
		 try {
			 a2 = new abc ("철수", 1111, 72, 83, 99, ((72+83+99)/3)){
		 }catch (IOException e){
			 e.printStackTrace(); // try {} 블락에서 예외가 발생될 경우에 자세한 정보를 출력함
		 }finally { //객체를 사용 후에 메모리 영역에서 삭제시켜 줌.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
			 //              리소스 해제: isr2.close(); 을 넣어줘야 함. 
			 if (name != null){  	// 선생님 방법 if (name !=null | studentID !=null | 이런식으로 or를 사용함
									// name = null, studentID = 0; kor = 0; 이런식으로 만듦.
				try {
					a2.close(); // 일반예외 : IOException	 
				}catch (IOException e){
					e.printStackTrace();                                                                                                                                                                                                                                    
				}
			 }
		 }
		 

				
		
		
		
		
		
		// 문서의 끝
	}

}
