package chap04;

public class While_Ex03 {

	public static void main(String[] args) {

		// 1. while의 기본 문법
		
		System.out.println("포와일문으로 만드는 반복 증가문");
		System.out.println();
		
		int a1 = 0; // 초기식, 구문 밖에서 선언 -> 전역 변수
		
		while (a1 < 10) { // 조건식, a1 < 10이 true이라면 뒤에 증감식을 계속 반복함
			System.out.println("포와일문 " + (a1+1) + " 바퀴 결과값: "  + a1); // 가시성 개선을 위해서 ln이랑 문자열 넣어서 구분해줌
			a1++; // 넣어서 결과 출력값을 내고 난 뒤에 a에 1을 더함
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		System.out.println("포와일문으로 만드는 반복 증가문 - 내가 변형해보기");
		System.out.println();
		
		System.out.println("포와일문 " + (a1) + " 바퀴 총합: "  + a1); // 치다가 진도나가서 마무리 못함
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		//for문으로 변환
		
		System.out.println("포문으로도 요로코롬 증가문 만듦");
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("포문 " + (i+1) + " 바퀴 결과값: "  + i);
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		System.out.println("포와일문으로 만드는 반복 감소문");
		System.out.println();
		
		int b = 10;
		while (b > 0) {
			System.out.print(b + " ");
			b--;
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		System.out.println("포문으로 만드는 반복 감소문");
		System.out.println();
		
		for (int i= 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		/*
		System.out.println("와일문의 무한 루프");
		
		System.out.println();
		
		while (true) {
			System.out.println("＠☆☆☆☆");
			System.out.println("☆＠☆☆☆");
			System.out.println("☆☆＠☆☆");
			System.out.println("☆☆☆＠☆");
			System.out.println("☆☆☆☆＠");
			System.out.println("☆☆☆＠☆");
			System.out.println("☆☆＠☆☆");
			System.out.println("☆＠☆☆☆");
			
			// 반짝반짝 이쁘다이
		}
		*/
		int k1 = 0;
		while (true) {
			
			if (k1 > 10) {
				break;
			}
			System.out.println(k1 + "☆" + "☆" + "☆" + "☆");
			System.out.println("☆" + k1 + "☆" + "☆" + "☆");
			System.out.println("☆" + "☆" + k1 + "☆" + "☆");
			System.out.println("☆" + "☆" + "☆" + k1 + "☆");
			System.out.println("☆" + "☆" + "☆" + "☆" + k1);
			System.out.println("☆" + "☆" + "☆" + k1 + "☆");
			System.out.println("☆" + "☆" + k1 + "☆" + "☆");
			System.out.println("☆" + k1 + "☆" + "☆" + "☆");
			k1++;
			
			}
			
			// 반짝반짝 이쁘다이
		}
		
		
	}