package chap03;

import java.util.Scanner;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		int data1 = 13;
		System.out.println("2진수로 변환 : " + Integer.toBinaryString(data1)); // 2진수로 변환
		System.out.println("8진수로 변환 : " + Integer.toOctalString(data1)); // 8진수 변환
		System.out.println("16진수로 변환 : " + Integer.toHexString(data1)); // 16진수 변환
		
		System.out.println("==========");
		
		System.out.println("2 to 10진수로 변환 : " + Integer.parseInt("1101",2)); // 2진수의 값 1101을 10진수로 변환
		System.out.println("8 to 10진수로 변환 : " + Integer.parseInt("15",8)); // 8진수의 값 15를 10진수로 변환
		System.out.println("8 to 10진수로 변환 : " + Integer.parseInt("0D",16)); // 1진수의 값 0d를 10진수로 변환
		
		/* NOT 연산자 
		   NOT 연산자는 입력값을 바이너리 코드로 바꾼 후에, 0을 1로, 1을 0으로 반전시켜 그 값을 출력하는 연산자임. 바이너리 코드는 양수 앞에
		   있는 무수한 0들을 보통 생략하고 4자리 단위로만 표시하는데 예를 들어 3같은 경우에는, 0011로 표기함. 그러나 실제로는 앞에 무수한
		   0이 있기 때문에 00..0011 의 형태임.
		   그런데 이 0011을 치환하게 되면 11..1100이 되고, 앞에는 무한대의 1이 펼쳐짐. 고로 이렇게 11이 무한대로 붙는 수가 음수이며,
		   유의미한 부분인 0을 읽어서 그 값을 계산함. 다만 이때 바뀐 자리수로 인해 찐빠가 나는데, 이걸 보정하기 위해서 절대값 1을 추가한 후에
		   마이너스 부호를 붙여줌. 가령 00..0011의 음수값인 11..1100은 두번째 자리(2^1)와 첫번째 자리(2^0)를 계산해 절대값 3이 되지만
		   여기에 보정치 1을 더해줘서 -|2^1+2^0+| = -4가 됨. 물론 보정치가 왜 붙는지는 나도 모름. 김기한테 따지던가. 
		   
		   즉, NOT 연산을 하면 양수 - 음수간의 반전이 일어나게 되긴 하나, 붙는 보정치는 음수값을 읽는 과정에서 국룰로 붙는 것이지,
		   따로 연산자의 힘에 의한 결과물임을 유념할 것.
		*/
		
		System.out.println(~3); // 
		System.out.println(~7); // 양수를 ~를 하면 음수가된 후에 0을 기준으로 정수 한단위 더 멀어짐
		
		System.out.println("==========");
		
		// 다양한 진법 표현
		
		System.out.println(13); 
		System.out.println(0b1101); // 0b 이진수 표현 
		System.out.println(015); // 0 8진법 표현
		System.out.println(0x0D); // 0x 16진수 표현  
		System.out.println();
		
		
		System.out.println("===== 자작 파트1 ====="); // 걍 때려 넣어서 만들기
		
		int ip1 = 192;
		int ip2 = 168;
		int ip3 = 0;
		int ip4 = 23;
		
		// 여기다 스캐너 넣으면 입력해서 출력하기 가능할듯?
		
		System.out.println("ip값 각각 넣어서 나온 2진수값 병렬해서출력하는 파트:");
		System.out.println(Integer.toBinaryString(ip1) + "." + Integer.toBinaryString(ip2) + "." + Integer.toBinaryString(ip3) + "." + Integer.toBinaryString(ip4)); // 2진수로 변환
		
		// 스캐너 넣어서 해보자
		
		System.out.println("===== 자작 파트2 ====="); // ip 값을 2진수로 변환시켜보기
		
		System.out.println("ip 주소를 띄어쓰기로 구분해 입력해 주세요.");
		Scanner scn = new Scanner(System.in);
		
		int first = scn.nextInt(); // 정수를 인풋받도록 함.
		System.out.print(Integer.toBinaryString(first) + ".");
		
		int second = scn.nextInt();
		System.out.print(Integer.toBinaryString(second) + ".");
		
		int third = scn.nextInt(); // 정수값을 인풋받아서 읽어 들임
		System.out.print(Integer.toBinaryString(third) + ".");
		
		int fourth = scn.nextInt(); // 실수값을 인풋 받아서 읽어 들임
		System.out.print(Integer.toBinaryString(fourth) + ".");
		scn.close();
		
		
	}

}