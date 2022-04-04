package chap17.EX06;
/*
 *  1.학생수 : 임의의 값을 입력 했을때 ArrayList의 capacity 크기지정
 *  2.점수 입력 : 입력 받은 학생수에 따라서 점수 입력. ArrayList에 객체를 저장
 *  3.점수 리스트 : ArrayList에 저장된 Student 객체를 가져와서 score 출력
 *  4.분석 : 최고점수 :   . 평균 점수:
 *  5.종료
*/	
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Student{
	int score; // 점수를 입력하면 필드의 값에 할당함. // 객체 생성 후 직접 2. praivate (생성자, setter, getter)
}

public class ScoreStudent_1 {

	public static void main(String[] args) {
		
		
		ArrayList<Student> arr = new ArrayList<Student>();
        
        List<Integer> studentscore =new ArrayList<Integer>();
        
    
        boolean run = true;
        int studentNum = 0;
        Scanner scanner = new Scanner(System.in); // 콘솔을 통해 인풋값을 받겠다
        
        while(run) { //true일 동안 루프가 돌아감. 
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("학생수를 입력하세요 : ");
                	//코드 작성  // 학생수에 따라서 capacity 할당해줄 것
                studentNum = scanner.nextInt(); // 
                System.out.println("입력완료");
                for(int i = 0; i<studentNum; i++) {
                	arr.add(new Student());
                }
            } else if(selectNo == 2) {
            		//코드작성 // 10명 값을 , 으로 입력함
            	System.out.println("학생수 만큼 점수를 입력하시오 : ");
            	for(int i=0; i<studentNum; i++) {
            		System.out.println((i+1)+"번 학생 점수를 입력하세요"); // 객체를 생성해서 인풋받은 값을 학생수만큼 입력함 
            		int inputScore =scanner.nextInt(); // 학생점수를 입력 받아서 필드에 값을 할당
            		studentscore.add(inputScore); //  ArrayList에 필드에 값을 할당한 객체를 ArrayList에 저장
            		System.out.println("입력완료");
            	}
            	
            } else if(selectNo == 3) {
            	for(int i = 0; i <arr.size(); i++) {
            		System.out.println(studentscore.get(i)); 
            	}
            } else if(selectNo == 4) {
            	//코드작성 // 최고점수와 평균점수 구하기
            	int max = 0;
            	int sum = 0;
            	Double avg = 0.0;
            	for ( int i =0 ; i < arr.size(); i++) {		
        			if ( studentscore.get(i) > max) {	// i 방의 값이 max 변수의 값보다 클때 
        			}							//max 변수 최종 적용 후에 
        		}
            	
            	for ( int i =0 ; i < arr.size(); i++) {	
            		sum += studentscore.get(i);
            		avg =(double) sum/arr.size();
            	}
            	System.out.println("최고점수: " + max);
          	  System.out.println("평균점수: " + avg);
            	
            } else if(selectNo == 5) {
            	//코드작성
            	run = false; // run = true일 동안 계속 돌고, false가 되면 while문이 종료됨
				System.out.println("프로그램 종료");
              }
         }
	}
}
