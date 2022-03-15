package chap04;

public class Break_Ex04 {
	public static void main(String[] args) {
		
		//1. 단일 loop가 적용된 곳에서 break 탈출
		for (int i = 0; i < 10 ; i++){
			System.out.println(i);
		break; //  break를 만나면 해당 구문을 빠져 나온다.
		} // 0값이 출력됨
		
		//2. for문 내에서 if 조건을 사용해서 break를 넣어 해당 구문을 빠져나온다.
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		 
		for (int i = 0; i < 10 ; i++){
			if(i == 5) {
				System.out.println("");
				System.out.print("비상 브레이크 가동 및 탈출");
				break;
			}
			System.out.print(i + " ");
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println();
		
		// 3 다중 loop 문일때 break 탈출
		for (int i = 0; i < 5 ; i++){
			System.out.print(i + "세트 시작 ===== ");
			for (int j = 0; j < 5 ; j++){
				System.out.print(i + " , " + j + " / ");
			if (i == 2 ) {
				System.out.print("(break 구문으로 인한 중단)");
				break;
					}
				}
			System.out.println("");
			}
			
		
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		// 4. 다중 loop 반복문에서 한꺼번에 탈출
		
POS1:		for (int i = 0; i < 5 ; i++){ // FOR 문 앞에 라벨을 넣어서 위치를 특정해줌
			for (int j= 0; j < 5 ; j++){
				if(i == 2) {
					System.out.println("POS1 라벨로 break");
					break POS1; // 브레이크 뒤에 라벨의 이름을 넣으면 지정해둔 라벨의 위치로 이동해서 연산을 계속함.
				}
				System.out.println(i + " , " + j);
			}
		}
	
		System.out.println("");
		System.out.println("==========");
		System.out.println("");

		// 4. 다중 Loop에서 한꺼번에 탈출 <<2, 변수 조건을 false로 만들어서 빠져나옴
		
		for (int i = 0; i < 5 ; i++){
			System.out.println("");
			for (int j = 0; j < 5 ; j++){
				if (i == 2) {
					i = 100; 
					break; // 이 때 브레이크를 넣지 않으면 i = 100 값을 가지고 최후의 루틴을 돌리기 시작하기 때문에 100으로 시작하는 줄이 주르륵 나오고 끝남.
				}
				System.out.print(i + " , " + j + " / ");
			}
		}	
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
			
		// 이거는 라벨링으로 잡아빼는거
		
		for (int i = 0; i < 5 ; i++){
			System.out.println("");
POS11:		for (int j = 0; j < 5 ; j++){
				if (i == 2) {
			    	i = 100; 
			    	break POS11; // 이 때 브레이크를 넣지 않으면 i = 100 값을 가지고 최후의 루틴을 돌리기 시작하기 때문에 100으로 시작하는 줄이 주르륵 나오고 끝남.
				}
				System.out.print(i + " , " + j + " / ");
			}
		}				
	}
}
