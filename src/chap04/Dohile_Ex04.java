package chap04;

public class Dohile_Ex04 {

	public static void main(String[] args) {

		System.out.println("-----북방한계선-----");
		System.out.println("");
		
		//1. While문과 Do while문의 비교
		
		
		System.out.print("여기 숫자가 안나오는 이유는 주석 참조");
		{int a= 0; // 이 파일 모든 변수를 지역변수로 만들어 봄. 그냥 해보고 싶엇음. 이렇게 하면 클래스도 계속 할당되고, 코드 수도 늘어나서 안좋음.
			while (a < 0) {
				System.out.print(a + " "); // 조건이 false일때는 실행 안되서 출력도 안됨
				a++;
			}
		System.out.println();
		}

		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		{int a = 0;
			do { System.out.print(a + " ");
			a++;
			} while (a < 0); // 조건이 false 이지만 do가 처음 돌아가는 그 순간엔 아직 while을 안돌렸으므로 최초 1회 한정으로 do가 돌아감.
		}
		
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		// 반복횟수가 1번인 경우
		
		{int a = 0;
			while (a<1) {
				System.out.print(a + " "); // while문은 일단 돌아가야 뭐가 찍히는 차이가 있음.
				a++;
			}
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		{int a = 0;
			do {
				System.out.print(a + " "); // 마찬가지로 while과 독립적, 순차적 시행이기 때문에 일단 한 번 돌아가긴 함. 근데 한번 돌고 와일한테 걸리면 블락 당해서 엎어짐.
				a++;
			}while (a < 1);
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		// 반복 횟수가 10번인 경우
		
		{int a = 0;
			while (a < 10) {
				System.out.print(a + " ");
				a++;
			}
		}
		
		System.out.println("");
		
		{int a = 0;
			do {
				System.out.print(a + " ");
				a++;
			}while (a < 10);
		
		}
		
		
		System.out.println("");
		System.out.println("-----남방한계선-----");
		
	}

}
