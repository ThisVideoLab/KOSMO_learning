package EX;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
// 콘솔창에서 보는 것을 권장합니다.
// 일부 입력값이 필요한 예제들은, 본 패키지 내의 다른 클래스를 참고 부탁드립니다.		
		
//문제 1번
		 
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("문항1] 변수 이름으로 사용 가능한 것을 모두 선택하세요.");
		System.out.println();
		System.out.println("1) goodName 2) class 3) 6Minute 4) $Value 5) _name 6) int");
		System.out.println();
		System.out.println("정답) 1, 4, 5");
		System.out.println();

// 문제 2번		
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("[문항2] 1  ~  100 까지합프로그램을작성하시오.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("문제)	public  class  Sum  {");
		System.out.println("		public  static  void  main(String[]  args)  {");
		System.out.println("			int  sum  =  0;");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("풀이)	int sum = 0;");
		System.out.println("	for (int s = 1; s <=100; s++) {");
		System.out.println("		sum += s;");
		System.out.println("	}");
		System.out.println("	System.out.println(\"	정답) 1부터 100까지 모두 더한 값: \" + sum);   // 구문 종료");
		int sum = 0;
		for (int s = 1; s <=100; s++) {
			sum += s;
		}
		System.out.println();
		System.out.println("정답) 1부터 100까지 모두 더한 값: " + sum); // 구문 종료
		System.out.println();
		
// 문제 3번
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("[문항3] 조건문과 반복문의 종류를 괄호 속에 넣어보세요.");
		System.out.println();
		System.out.println("	조건문( if ), ( switch )");
		System.out.println();
		System.out.println("	반복문( do while ), ( while ),( for )");
		System.out.println();
		
// 문제 4번
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("[문항4] for 문을 이용해서 다음 실행 결과와 같은 삼각형을 출력하는 코드를 작성해 보세요.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("문제)	*");
		System.out.println("	**");
		System.out.println("	***");
		System.out.println("	****");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("풀이)	int e = 1;");
		System.out.println("	for (int lnCnt = 0; lnCnt < 4; lnCnt++) {");
		System.out.println("		System.out.print(\"        \"); // 줄 맞춤을 위한 공백 삽입");
		System.out.println("		int i;");
		System.out.println("		e++;");
		System.out.println("		for (i =e; i > 1; i--) {");
		System.out.println("		    System.out.print(\"*\");");
		System.out.println("		}");
		System.out.println("	System.out.println();");
		System.out.println("	}");
		System.out.println();
		System.out.println("정답)");
		System.out.println();
		int stCnt = 1;
		for (int lnCnt = 0; lnCnt < 4; lnCnt++) {
			System.out.print("        "); // 줄 맞춤을 위한 공백 삽입
			int i;
			stCnt++;
				for (i =stCnt; i > 1; i--) {
					System.out.print("*");	
				}
			System.out.println();
		}
		
// 문제 5번
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("[문항5] 배열을 이용해서 1~10까지 합을 출력하시오.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("문제)	public  class  Array  {");
		System.out.println("		public  static  void  main(String[]  args)  {");
		System.out.println("			int[]  scores  =  {1,2,3,4,5,6,7,8,9,10};");
		System.out.println("			}"); // 이부분은 완성된 코드를 문제로 만들기 위해 지우다가 덜 지워진듯 하지만 일단 문제 원형을 표기하기 위해 놔둠. 
		System.out.println("			System.out.println(sum);");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("풀이)	int[] scores = {1,2,3,4,5,6,7,8,9,10};");
		System.out.println("	int sum1 = 0;");
		System.out.println("	for (int g = 0; g <scores.length; g++) {");
		System.out.println("		sum1 += scores[g];");
		System.out.println("	System.out.println(\"정답: \"+ sum1); // 구문 종료}");
		System.out.println();
		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		int sum1 = 0;
		for (int g = 0; g <scores.length; g++) {
			sum1 += scores[g];
		}
		System.out.println("정답: "+ sum1); // 구문 종료
		System.out.println();
		
// 문제 6번		
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("[문항6] 주어진 배열의 항목에서 최대값을 구해보세요 (for 문을 이용하세요.)");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("	public  class  Max  {");
		System.out.println("		public  static  void  main(String[]  args)  {");
		System.out.println("			int  max  =  0;");
		System.out.println("			int[]  array  =  {4,5,1,2,3};");
		System.out.println("			//작성위치");
		System.out.println("			System.out.println(\"max:  \"  +  max);");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("풀이)	int  max  =  0;");
		System.out.println("	int[] array = {4,5,1,2,3};");
		System.out.println("	for (int i = 0; i <array.length; i++) {");
		System.out.println("		if (array[i] > max) {");
		System.out.println("			max = array[i];");
		System.out.println("		}");
		System.out.println("	}");
		int  max  =  0;
		int[] array = {4,5,1,2,3};
		for (int i = 0; i <array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println();
		System.out.println("정답)	max:  "  +  max);
		System.out.println();
		
// 문제 7번		
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("[문항7] 양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서");
		System.out.println("       3의 배수만 출력하는 프로그램을 작성하라.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("풀이)	package Ex;");
		System.out.println("	import java.util.Scanner;");
		System.out.println("	public class Ex0107 {");
		System.out.println("		public static void main(String[] args) {");
		System.out.println("			int[] arr = new int[10];");
		System.out.println("			int a = 1; // 2번째 for문 내부의 while 구문을 최초 1회만 출력하도록 하는 변수");
		System.out.println("			int k = 0; // 2번째 for문 내부의 if 구문을 최후 1회만 출력하도록 하는 변수");
		System.out.println("			System.out.println(\"양의 정수 10개를 입력하십시오.\");");
		System.out.println("			Scanner scn = new Scanner(System.in);");
		System.out.println();
		System.out.println("			int tmpCnt = 0; // 현재 입력 횟수");
		System.out.println();
		System.out.println("			for (tmpCnt = 0; tmpCnt < arr.length; tmpCnt++){");
		System.out.println("				arr[tmpCnt] = scn.nextInt();");
		System.out.println("				if(tmpCnt < (arr.length)) { // 10개 미만의 정수를 입력하여 출력값을 얻지 못하는 경우를 방지");
		System.out.println("					System.out.println(\"정수를 10개의 값을 입력하는 중입니다\" + \"(\" + (tmpCnt+1) + \"/10)\");");
		System.out.println("				}");
		System.out.println("			}");
		System.out.println("			scn.close();");
		System.out.println();
		System.out.println("			System.out.println();");
		System.out.println();
		System.out.println("			for (k = 0; k < arr.length; k++){");
		System.out.println("				while (a == 1) {");
		System.out.println("					System.out.print(\"입력하신 정수들 중에서 3의 배수는 \");");
		System.out.println("					a++;");
		System.out.println("				}");
		System.out.println("				if(arr[k] % 3 == 0) {");
		System.out.println("				System.out.print(arr[k] + \" \");");
		System.out.println("				}");
		System.out.println("			}");
		System.out.println();
		System.out.println("			if(k == arr.length) {");
		System.out.println("				System.out.println(\"입니다.\");");
		System.out.println("			}");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println();
		System.out.println("정답) Ex 패키지에 있는 Ex0107 파일에서 실행해주세요");

// 문제 8번
		System.out.println("=============================================================");
		System.out.println();		
		System.out.println("[문항8] 배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로 된");
		System.out.println("       돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리동전, 100원짜리");
		System.out.println("       동전, 50원짜리동전, 10원짜리동전, 1원짜리 동전이 각각 몇개로 변환되는지");
		System.out.println("       예시와 같이 출력하라. 이 때 반드시 다음 배열을 이용하고 반복문으로 작성하라.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("예시)");
		System.out.println("    int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할돈의종류");
		System.out.println("    금액을입력하시오>> 65123");
		System.out.println("    50000 원짜리: 1개");
		System.out.println("    10000 원짜리: 1개");
		System.out.println("    1000 원짜리: 5개");
		System.out.println("    500 원짜리: 0개");
		System.out.println("    100 원짜리: 1개");
		System.out.println("    50 원짜리: 0개");
		System.out.println("    10 원짜리: 2개");
		System.out.println("    1 원짜리: 3개");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("풀이)	package Ex;");
		System.out.println("	import java.util.Scanner;\r\n");
		System.out.println("	public class Ex0108 {");
		System.out.println("		public static void main(String[] args) {");
		System.out.println("			System.out.println(\"금액을 입력하시오.\");");
		System.out.println("			Scanner scan = new Scanner (System.in);");
		System.out.println("			int money = scan.nextInt();");
		System.out.println();
		System.out.println("			int[][] arr = new int [2][9];");
		System.out.println("			arr[0][0] = 50000; // 50,000원짜리");
		System.out.println("			arr[0][1] = 10000; // 10,000원짜리");
		System.out.println("			arr[0][2] = 5000; // 5,000원짜리");
		System.out.println("			arr[0][3] = 1000; // 1,000원 짜리");
		System.out.println("			arr[0][4] = 500; // 500원짜리");
		System.out.println("			arr[0][5] = 100; // 100원짜리");
		System.out.println("			arr[0][6] = 50; // 50원짜리");
		System.out.println("			arr[0][7] = 10; // 10원짜리");
		System.out.println("			arr[0][8] = 1; // 1원짜리");
		System.out.println();
		System.out.println("			arr[1][0]= money/arr[0][0]; // 50,000원짜리 지폐의 수");
		System.out.println("			arr[1][1]= (money%arr[0][0])/arr[0][1]; // 10,000원짜리 지폐의 수");
		System.out.println("			arr[1][2]= (money%arr[0][1])/arr[0][2]; // 5,000원짜리 지폐의 수");
		System.out.println("			arr[1][3]= (money%arr[0][2])/arr[0][3]; // 1,000원 짜리 지폐의 수");
		System.out.println("			arr[1][4]= (money%arr[0][3])/arr[0][4]; // 500원짜리 동전의 수");
		System.out.println("			arr[1][5]= (money%arr[0][4])/arr[0][5]; // 100원짜리 동전의 수");
		System.out.println("			arr[1][6]= (money%arr[0][5])/arr[0][6]; // 50원짜리 동전의 수");
		System.out.println("			arr[1][7]= (money%arr[0][6])/arr[0][7]; // 10원짜리 동전의 수");
		System.out.println("			arr[1][8]= (money%arr[0][7]); // 1원짜리 동전의 수");
		System.out.println();
		System.out.println("			char[][] arrChar = new char[1][9]; // 원래는 int arr 배열 3행에 코드값으로 넣고 프린트 라인에서 (char)로 글자로 다시 변환하려 했는데 깨져서 따로 글자배열을 만듦.");
		System.out.println();
		System.out.println("			arrChar[0][0] = 51109; // 50,000원짜리");
		System.out.println("			arrChar[0][1] = 51109; // 10,000원짜리");
		System.out.println("			arrChar[0][2] = 51109; // 5,000원짜리");
		System.out.println("			arrChar[0][3] = 51109; // 1,000원 짜리");
		System.out.println("			arrChar[0][4] = 44060; // 500원짜리");
		System.out.println("			arrChar[0][5] = 44060; // 100원짜리");
		System.out.println("			arrChar[0][6] = 44060; // 50원짜리");
		System.out.println("			arrChar[0][7] = 44060; // 10원짜리");
		System.out.println("			arrChar[0][8] = 44060; // 1원짜리");
		System.out.println();
		System.out.println("			System.out.println();");
		System.out.println("			System.out.println(\"입력하신 금액 \" + money +\"원의 권종별 수량은 다음과 같습니다.\");");
		System.out.println("			System.out.println();");
		System.out.println();
		System.out.println("			for(int c = 0; c < arr[1].length; c++) {");
		System.out.println("				if (arr[1][c] >0) { // [0][c]원 권종의 수량이 있는 경우에만 결과값을 출력");
		System.out.println("					System.out.println(arr[0][c] + \"원: \" + arr[1][c] + arrChar[0][c]);");
		System.out.println("				}");
		System.out.println("			}");
		System.out.println("		scan.close();");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println();
		System.out.println("정답) Ex 패키지에 있는 Ex0108 파일에서 실행해주세요");
		
// 문제 9번
		System.out.println("=============================================================");
		System.out.println();
		System.out.println("[문항9] 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게");
		System.out.println("       생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.");
		System.out.println();
		System.out.println("       랜덤한정수들: 3 6 3 6 1 3 8 9 6 9");
		System.out.println("       평균은5.4");
	    System.out.println();
	    System.out.println("       [Hint] 1에서 10까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라.");
	    System.out.println();
	    System.out.println("       int i  = (int)(Math.random()*10+1);");
	    System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
	    System.out.println("풀이)	int i;");
	    System.out.println("	int[] arr = new int[10];");
	    System.out.println("	int sum2 = 0;");
	    System.out.println("	System.out.print(\"정답) \");");
	    System.out.println("	for (i = 0; i < arr.length; i++) {");
	    System.out.println("		arr[i]= (int)(Math.random()*10+1);");
	    System.out.println("		sum2 += arr[i];");
	    System.out.println("		System.out.print(arr[i] + \" \");");
	    System.out.println("	}");
	    System.out.println("	System.out.println(\" / 평균값: \" + sum2/i);");
	    System.out.println("		");
	    int i;
	    int[] arr = new int[10];
	    double sum2 = 0;
	    System.out.print("정답) ");
	    for (i = 0; i < arr.length; i++) {
	    	arr[i]= (int)(Math.random()*10+1);
	    	sum2 += arr[i];
	    	System.out.print(arr[i] + " ");
	    }
	    System.out.println(" / 평균값: " + sum2/i);

 // 문제 10번
 		System.out.println("=============================================================");
 		System.out.println();	    
	    System.out.println("[문항10] 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우를 순서대로 화면에");
	    System.out.println("        출력해보자. 1부터 시작하며 99까지만 한다. 실행 사례는 다음과 같다.");
	    System.out.println();
	    System.out.println("--------------------------------------------------------------");
		System.out.println();
	    System.out.println("예시)	3 박수짝");
	    System.out.println("        6 박수짝");
	    System.out.println("        9 박수짝");
	    System.out.println("        13 박수짝");
	    System.out.println();
	    System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("정답)");
		System.out.println();
		for(int clapCnt = 1; clapCnt <100; clapCnt++) {
			int sgDigt = clapCnt%10;
			int dbDigt = clapCnt/10; 
			if (dbDigt == 3|dbDigt == 6|dbDigt == 9) {
				if (sgDigt == 3|sgDigt == 6|sgDigt == 9) {
					System.out.println("        " + clapCnt + " 박수짝짝");
				}else {
					System.out.println("        " + clapCnt + " 박수짝");
					}
			}else if (sgDigt == 3|sgDigt == 6|sgDigt == 9) {
					System.out.println("        " + clapCnt + " 박수짝");
			}
		}
		
// 문제 11번
 		System.out.println("=============================================================");
 		System.out.println();	
 		System.out.println("[문항11] 다음 코드와 같이 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.");
 		System.out.println();
	    System.out.println("        String course[] = {\"Java\", \"C++\", \"HTML5\", \"컴퓨터구조\", \"안드로이드\"};");
	    System.out.println("        int score[]  = {95, 88, 76, 62, 55};");
	    System.out.println();
	    System.out.println("        그리고 다음 예시와 같이 과목 이름을 입력 받아 점수를 출력하는 프로그램을 작성하라.");
	    System.out.println("        \"그만\"을입력받으면종료한다. (Java는 인덱스 0에 있으므로 score[0]을 출력)");
	    System.out.println();
	    System.out.println("        [Hint] 문자열을 비교하기 위해서는 String 클래스의 equals() 메소드를 이용해야 한다");
	    System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("풀이)	package Ex;");
		System.out.println("	import java.util.Scanner;");
		System.out.println("	ipublic class Ex0111 {");
		System.out.println("		public static void main(String[] args) {");
		System.out.println("			String course[] = {\"Java\", \"C++\", \"HTML5\", \"컴퓨터구조\", \"안드로이드\"};");
		System.out.println("			int score[]  = {95, 88, 76, 62, 55};");
		System.out.println("			Scanner scan = new Scanner(System.in);");
		System.out.println("			System.out.println(\"과목 이름을 입력해 점수를 확인하세요.\");");
		System.out.println("			System.out.print(\"(점수 확인 가능 과목: \");");
		System.out.println("			for(int c = 0; c < course.length; c++) {");
		System.out.println("				System.out.print(course[c] + \" \");");
		System.out.println("			}");
		System.out.println("			System.out.println(\")\");");
		System.out.println("			int i = 0;");
		System.out.println("			String name;");
		System.out.println("POS1:	  	    while(true) {");
		System.out.println("				name = scan.next();");
		System.out.println("				for(i = 0; i < course.length; i++) {");
		System.out.println("					if (course[i].equals(name)) {");
		System.out.println("						System.out.println(\"귀하의 \" + name + \" 점수는 \" + score[i] +\"점입니다.\");");
		System.out.println("						continue POS1;");
		System.out.println("					}");
		System.out.println("				}");
		System.out.println("			if(name.equals(\"그만\")){");
		System.out.println("				System.out.println(\"입력을 종료합니다.\");");
		System.out.println("				break;");
		System.out.println("			}else {");
		System.out.println("				System.out.println(\"'\" + name + \"'\" + \"은(는) 식별 불가능한 과목명입니다. 대소문자를 구분하여 올바른 과목명을 입력하세요.\");");
		System.out.println("			}");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		System.out.println("정답) Ex 패키지에 있는 Ex0111 파일에서 실행해주세요");
		
// 문제 12번
		System.out.println("=============================================================");
		System.out.println();			
		System.out.println("[문항12] 컴퓨터와 독자 사이의 가위 바위 보 게임을 만들어보자. 예시는 다음 그림과 같다.");
		System.out.println("        독자부터 먼저시 작한다. 독자가 가위 바위 보 중 하나를 입력하고 <Enter> 키를");
		System.out.println("        치면,프로그램은 가위 바위 보 중에서 랜덤하게 하나를 선택하고 컴퓨터가 낸 것으로 ");
		System.out.println("        한다. 독자가 입력한 값과 랜덤하게 선택한 값을 비교하여 누가 이겼는지 판단한다. ");
		System.out.println("        독자가 가위 바위 보 대신 \"그만\"을 입력하면 게임을 끝낸다.");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("예시)");
		System.out.println("        컴퓨터와 가위 바위 보 게임을 합니다.");
		System.out.println("        가위 바위 보! >> 바위");
		System.out.println("        사용자 = 바위 , 컴퓨터 = 가위 사용자가 이겼습니다.");
		System.out.println("        가위 바위 보! >> 가위");
		System.out.println("        사용자 = 가위 , 컴퓨터 = 가위 비겼습니다.");
		System.out.println("        가위 바위 보! >> 그만");
		System.out.println("        게임을 종료합니다...");
		System.out.println("--------------------------------------------------------------");
		System.out.println();
		System.out.println("[Hint]");
		System.out.println("        다음과 같은 문자열 배열을 만든다");
		System.out.println("        String str[] = {\"가위\", \"바위\", \"보\"};");
		System.out.println("        컴퓨터가 내는 것을 랜덤하게 선택하기 위해서는 다음 코드를 이용한다.");
		System.out.println("        int n = (int)(Math.random()*3); // n 은 0, 1, 2 중에서 랜덤하게 결정");
		System.out.println("        컴퓨터가 낸 것이 \"바위\" 인지 비교하는 코드는 다음과 같이 한다");
		System.out.println("        if(str[n].equals(\"바위\")) //컴퓨터가 낸 것이 \"바위\"인지 비교하는 문");
		System.out.println("        ");
		System.out.println("--------------------------------------------------------------");
		System.out.println("풀이)	package Ex;");
		System.out.println("        import java.util.Scanner;");
		System.out.println("        public class Ex0112 {");
		System.out.println("        	public static void main(String[] args) {");
		System.out.println("        		String rsp[] = {\"가위\", \"바위\", \"보\"}; // rock scissors paper array");
		System.out.println("        		int[] scrBrd= new int[] {0,0,0}; // Score Board / 배열은 차럐대로 승/무/패");
		System.out.println("        		int mc; // match count 가위바위보 승부 수 카운트");
		System.out.println("        		String ipt; // user input 사용자의 입력값");
		System.out.println("        		int ui; // 유저의 입력값에 대응하는 배열의 자리값");
		System.out.println("        		int ci; // 컴퓨터가 고른 랜덤한 정수값, 배열에 대입해 가위바위보를 임의로 출력");
		System.out.println();
		System.out.println("        		System.out.println(\"컴퓨터와 가위바위보 게임을 시작합니다!\");");
		System.out.println("        		Scanner scan = new Scanner(System.in);");
		System.out.println();
		System.out.println("        		while(true) { // 무반복 till break 실행");
		System.out.println("        			ipt = scan.next(); // 유저 입력값");
		System.out.println("        			switch (ipt) {");
		System.out.println("        				case \"가위\":");
		System.out.println("        					ui = 0;");
		System.out.println("        					break;");
		System.out.println("        				case \"바위\":");
		System.out.println("        					ui = 1;");
		System.out.println("        					break;");
		System.out.println("        				case \"보\":");
		System.out.println("        					ui = 2;");
		System.out.println("        					break;");
		System.out.println("        				default:");
		System.out.println("        					System.out.println(\"잘못된 입력 값입니다. 가위, 바위, 보 중 하나를 입력하십시오.\");");
		System.out.println("        					continue;");
		System.out.println("        			}");
		System.out.println("        			ci = (int)(Math.random()*3);");
		System.out.println("        			System.out.println();");
		System.out.println("        			System.out.print(\"(당신) \" + rsp[ui]+ \" vs \" + rsp[ci] + \" (컴퓨터) == \");");
		System.out.println("        			if((ui == 0 && ci == 2)||(ui == 1 && ci == 0)||(ui == 2 && ci == 1)) { // 이기는 경우의 수");
		System.out.println("        				scrBrd[0]++;");
		System.out.println("        				System.out.println(\"승리!\");");
		System.out.println("        			}");
		System.out.println("        			else if(ui == ci){ // 비기는 경우의 수");
		System.out.println("        				scrBrd[1]++;");
		System.out.println("        				System.out.println(\"무승부!\");");
		System.out.println("        			}");
		System.out.println("        			mc++;");
		System.out.println("        			System.out.println(\"현재까지의 전적은 \" + mc + \"전 \" + scrBrd[0] +\"승 \" + scrBrd[1] + \"무 \" + scrBrd[2] + \"패 입니다.\");");
		System.out.println("        			System.out.println();");
		System.out.println("        		}");
		System.out.println("        	}");
		System.out.println("       	}");
		System.out.println();
		System.out.println("정답) Ex 패키지에 있는 Ex0112 파일에서 실행해주세요");
		System.out.println("=============================================================");
	 // 문서의 끝 
	}

}
