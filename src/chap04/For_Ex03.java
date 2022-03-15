package chap04;

public class For_Ex03 {

	public static void main(String[] args) {

	System.out.println("-----북방한계선-----");
	System.out.println("");
		
		//for 기본 작동
		
		int a; // 전역 변수, 블락 밖에서 선언된 변수, 선언 (0), 초기값 (x)
		for ( a = 0; a <= 3; a++) { // 이때 a++과 ++a은 결과값은 최종 2까지 출력하는 것으로 같지만, 연산 순서에서는 묘한 차이가 있음.
			System.out.print(a + " "); // 이 때 프린트를 밖으로 빼면 포문이 정지될 때까지 계속 연산을 한 후에 출력값이 정해지고, 
									   //그 값만을 가져와서 뽑기 때문에 깔끔하게 한번만 최종값이 나옴. 이거 절어서 문제 못풀었다 꼭 외워둘 것.
		}
		
		System.out.println(a);
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		for (int b = 0; b <= 10 ; b++ ) { 
			System.out.print(b + " ");
		}
		
//		System.out.println(b); // 변수 b 는 for문 내에서만 선언된 지역변수이기 때문에 for 문 밖에서 적용이 안됨.
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		int c;
		for ( c= 10; c > 0 ; c--) {
		System.out.println((11-c) + "번째 연산 :"+ c + " ");
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		// 2의 배수를 출력하는 for문 
		
		int i;
		
		for (i = 0 ; i < 100; i += 2 )
			System.out.println((( i+2)/2) + "번째 연산: " + i);
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		//  for문 내에서 초기값과 증가값은 여러 변수를 할당할 수 있음.
		
		int j;
			
		for ( i = 0, j = 0; i < 9; i++ , j++) {
			System.out.println((i+1) +  "번째 i * j 연산 : " + (i * j)); 
			
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		// for문을 사용해서 1부터 100까지 더한 값을 출력
		
		int sum = 0;
		for (  i = 1;  i <= 100; i++)  {
			sum += i ;
		}
		System.out.println("1부터 10까지 더한 값 :" + sum);
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		//for문을 사용해서 1부터 100까지 곱한 값을 출력
		
		int multi = 1;
		for( i = 1; i<= 10; i++ ) {
			
			multi *= i;
		}
		System.out.println(multi);
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		// 이중 for문 : 1단 ~ 9단까지 구구단 출력
		
		for ( i = 1; i <=9; i++) { // i는 단을 출력하는 변수
			
			System.out.println("-----");
			System.out.println(i + "단 시작");
			System.out.println("-----");
			
			int d;
			int k;
			for (d = 1; d <= 9; d++) {
				k = i*d;
				System.out.println(i + " * " + d + " = "+ k);
			}
		}
		
		/* for문의 무한 루프 발생
		
		for (i = 0; ; i++) {
			System.out.println(i + " ");
		}
		
		이렇게 짜두면 계속해서 돌아가므로 일단 컴퓨터가 맛탱이가 가기 시작함. 또한 끝나질 않으므로 뒷코드를
		출력할 수가 없어서 뒷 코드에 unreachable code 에러가 뜸.
		
		for (;;) { // 보면 초기식 조건식, 증감식을 안적어줘서 언리밋 포문으로 만들어버림
			System.out.println("☆무한루프☆");
			System.out.println("★무한루프★");
		}
		
		이렇게 초기식 조건식 증감식이 없기 때문에 무한루프로 출력값을 번갈아가면서 보여줌. 반짝 반짝 이쁘다이
		
		*/
		
		// 무한 루프를 위한 브레이크 패달 설치
		
		for (i = 0; ; i++) {
			System.out.println(i + " ");
			if (i > 2) {
				break;
			}
		}
		
		System.out.println("");
		System.out.println("-----남방한계선-----");		

	}

}
