package chap04;

public class Overlap_Ex04 {

	public static void main(String[] args) {

		//1. if 문 안의 if 문
		
		int value1 = 6;
		int value2 = 3;
		
		if (value1 >5) { // 이때 조건이 true이면 if 문 내부의 구문이 실행되고, false이면 if문 내의 구문을 건너 뛰고 바로 else를 실행함.
			if (value2 < 2) {
				System.out.println("실행1");
			}else {
				System.out.println("실행2");
			}
		}else{
			System.out.println("실행3");
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		// 2. switch 내의 for 문
		
		int value3 = 1;
		switch (value3) {
		case 1:
			for (int k = 10; k > 0 ; k-- ) {
				System.out.print(k + " ");
			}
			break;
		case 2:
			for (int k = 0; k < 10 ; k ++ ) {
				System.out.println(k + " ");
			}
			break;
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		//3. for문 내의 for 문
		
		for (int i = 0; i < 3; i++) { // i = 0부터 2까지 1씩 증가
			for(int j = 0; j < 5; j++) { // j = 0부터 4까지 1씩 증가
				
				if (i == j) {
					System.out.println(i+" = " + j);
				}else {
					System.out.println(i + " , " + j);
				}
				
			}
			
		}
		
		System.out.println("-----남방한계선-----");
	}

}
