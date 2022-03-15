package chap04;

public class Switch_Ex02 {

	public static void main(String[] args) {

		
		// Switch 코드 - break 처리를 하지 않았을 때
		//              브레끼 처리 안하모 찝은 숫자 아래로 있는 케이스들은 죄다 쭉 출력해버림. 
		
		int value1 = 2;
		switch (value1) {
			case 1:
				System.out.println("A 학점");
			case 2:
				System.out.println("B 학점");
			case 3:
				System.out.println("C 학점");
			case 4:
				System.out.println("D 학점");
			case 5:
				System.out.println("F 학점");
			case 6:
				System.out.println("PASS");
			case 7:
				System.out.println("FAIL");
		}
		
		
		System.out.println("==========");
		
		// Switch 코드 - break 처리를 했을 때
		//              브레끼 처리 안하모 말한 케이스 말고도 다음 케이스들을 쭉쭉쭉 출력해버림.
		int value2 = 10;
		switch (value2) {
			case 1:
				System.out.println("A 학점");
				break;
			case 2:
				System.out.println("B 학점");
				break;
			case 3:
				System.out.println("C 학점");
				break;
			case 4:
				System.out.println("D 학점");
				break;
			case 5:
				System.out.println("F 학점");
				break;
			case 6:
				System.out.println("PASS");
				break;
			case 7:
				System.out.println("FAIL");
				break;
			default:
				System.out.println("올바른 값을 입력하세요"); // 디폴트는 케이스 외에 다른 값을 넣을때 기본으로 출력되는 값. 보통 여기는 값 잘못 입력했을때 보이니까 똑띠해라 이런 메시지 넣는게 좋아 보임.
		}
									            	// 맨 마지막은 어차피 더 불러올 케이스도 없으니 브레이크 없어도 됨. 오히려 있으면 간지 떨어짐.
				
	
	
	System.out.println("==========");
		
		int value3 = 5;
		
		if ( value3 == 1 ) {
				System.out.println("A 학점(if)");
			} else if (value3 == 3) {
				System.out.println("B 학점(if)");
			} else {
				System.out.println("C 학점(if)");
		}
		
		
	System.out.println("==========");
		
	// switch 문을 사용해서 점수가 7점 이상은 pass, 7점 이하는 fail을 출력 (점수는 1~10점)
	
	int value4 = 11;
	
	switch (value4) {
	case 10:
	case 9:
	case 8:
	case 7:
		System.out.println("pass");
	break;
	case 6:
	case 5:
	case 4:
	case 3:
	case 2:
	case 1:
		System.out.println("fail");
	break;
	default:
		System.out.println("올바른 값을 입력하세요");
	}
	
		
	}

}
