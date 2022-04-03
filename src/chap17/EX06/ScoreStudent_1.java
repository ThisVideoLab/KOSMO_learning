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
	int score;

}

public class ScoreStudent_1 {

	public static void main(String[] args) {
		
		
		ArrayList<Student> arr = new ArrayList<Student>();
        
        List<Integer> studentscore =new ArrayList<Integer>();
        
    
        boolean run = true;
        int studentNum = 0;
        Scanner scanner = new Scanner(System.in);
        
        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt();

            if(selectNo == 1) {
                System.out.println("학생수를 입력하세요 : ");
                	//코드 작성  // 학생수에 따라서 capacity 할당해줄 것
                studentNum = scanner.nextInt();
                System.out.println("입력완료");
                for(int i = 0; i<studentNum; i++) {
                	arr.add(new Student());
                }
            } else if(selectNo == 2) {
            		//코드작성 // 10명 값을 , 으로 입력함
            	System.out.println("학생수 만큼 점수를 입력하시오 : ");
            	for(int i=0; i<studentNum; i++) {
            		System.out.println((i+1)+"번 학생 점수를 입력하세요");
            		int inputScore =scanner.nextInt();
            		studentscore.add(inputScore);
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
        			if ( studentscore.get(i) > max) {		// 방의 값이 max 변수의 값보다 클때 
        				max = studentscore.get(i);			// max 변수에 큰값을 저장 
        			}
        		}
            	
            	for ( int i =0 ; i < arr.size(); i++) {	
            		sum += studentscore.get(i);
            		avg =(double) sum/arr.size();
            	}
            	System.out.println("최고점수: " + max);
          	  System.out.println("평균점수: " + avg);
            	
            } else if(selectNo == 5) {
            	//코드작성
            	run = false;
				System.out.println("프로그램 종료");
              }
         }
	}
}
