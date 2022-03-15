package chap04;

public class Contineu_Ex05 {
	public static void main(String[] args) {
		
		//1. 단일 루프에서 continue - 컨티뉴는 후행 코드를 씹어서 없애버림. 당연하지만 후행 코드가 없으면 무쓸모임
		
		for (int i = 0; i < 10 ; i++) {
			continue; 
		//	System.out.println("출력 구문 오류");  ==>> 여기 닿을수 없다고 오류 뜸. 조건 없는 컨티뉴는 후행 코드의 완전한 소거임.	
		}
		
		
		for (int i = 0; i < 10 ; i++) {
		System.out.print(i + " ");
			continue; // 설치는 가능하지만후행 코드가 없기 때문에 의미가 없음.
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		// 2. 조건을 사용해서 continue 처리
		System.out.println("====continue======");
		
		for (int i = 0; i < 10 ; i++) {
				if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}		
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		// 2. 조건을 사용해서 break 처리
		System.out.println("====break======");
		
		for (int i = 0; i < 10 ; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i + " ");
		}		
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		//3. 다중 루프문에서 continue의 사용
		for (int i = 0; i < 5 ; i++) {
			for (int j = 1; j <5; j++) {
				if (j % 3 == 0) { // 는 3의 배수일때는 출력은 안해버림
					System.out.println("j==3의 온기가 아직 남아있습니다.");
					continue;
				}
				System.out.println(i + ", " + j);
			}
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		System.out.println("=====브레이크=====");

		//4. 다중 루프문에서 break의 사용 - 바로 위 3번과 같은 코드를 활용해서 continue와  break의 기능 차이를 파악함
				for (int i = 0; i < 5 ; i++) {
					for (int j = 1; j <5; j++) {
						if (j % 3 == 0) { // 는 3의 배수일때는 출력은 안해버림
							System.out.println("j==3의 온기가 아직 남아있습니다.");
							break; // 컨티뉴는 해당 줄의 후행만 생략하고 나머지는 놔두는데에 비해서 브레끼는 3부터 그냥
							       // 다 때려빻아뿔고 끝내는 바람에 4로 시작하는 숫자 쌍도 출력이 되지 않음 개쎔
						}
						System.out.println(i + ", " + j);
					}
				}
	
				
		//5.  continue에서 라벨 사용
			System.out.println();
			System.out.println("==== 컨티뉴에서 라벨 사용======");
			
POS2:		for (int i = 0; i < 5 ; i++) {
				for (int j = 0; j < 5 ; j++) {
					if ( j ==3) {
						continue POS2;
					}
				System.out.println(i + " , " + j);
				}
			}

System.out.println("");
System.out.println("=====남방한계선=====");
				
	}
}
