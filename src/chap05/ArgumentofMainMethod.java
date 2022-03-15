package chap05;

public class ArgumentofMainMethod {

	public static void main(String[] ar) { // 메인 메소드 [함수]	
		
		// 메소드의 기본구조
		/*
		 
		 void main(String[] args){ // void 공허:리턴값이 없음을 의미함.
		 메소드 호출시 실행할 코드;       // main 메소드 명. 메인페이지 뭐 이런 뜻
		 						  //( ) 괄호 안에는 인풋 매개변수
		 						 // { } 실행부
		 */
		String a = ar[0]; // ar 배개변수에서 0번째방의 값을 a에 할당함
		String b = ar[1];
		String c = ar[2];
		
		// 우클릭 - run as - configuration에 main 탭에 해당 클래스 이름 입력 - arguement 탭에 안녕하세요 3 A3.8B 입력 - RUN 실행
		
		System.out.println(a+b); 
		System.out.println(b);
		System.out.println(c); // 3문장 모두 스트링 타입으로 출력됨
		
		System.out.println();
		
		System.out.println(b+1); // 31
		System.out.println(c+1); // 3.81
		System.out.println();
		
		int d = Integer.parseInt(b); // b String = > int 형변환
		double e = Double.parseDouble(c); //c String = > double 형변환
		
		System.out.println(d+1);
		System.out.println(e+1);
		
		
	}

}
