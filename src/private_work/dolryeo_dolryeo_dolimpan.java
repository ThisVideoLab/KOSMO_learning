package private_work;

import java.util.Scanner;

public class dolryeo_dolryeo_dolimpan  {

	public static void main(String[] args) {
		
		
		String classA[] = {"권용희", "김병현", "김진수", "김태형", "박은비", "서주현", "안병욱", "여원준","유민정", "유준상", "조현서", "조흥권", "주진선", "하지승"};
		String classB[] = {"강성민", "권수향", "김겨울", "김문준", "김재묵", "김채록", "박인수", "신장현","이규영", "이다은", "이영상", "이준형", "임규민", "전승연", "조승현"};
		String prsOrderA[] = new String[14];
		String prsOrderB[] = new String[15];
		
		// 분반별 명단, 편의상 먼저 발표하는 분반을 A분반이라 칭함.
		
		System.out.println("발표일은 28일부터 입니다. 당일에 출석하는 반을 임의로 A분반이라 지칭합니다.");
		System.out.println("발표 시간은 점심식사 후 순번에 따라 인당 15분씩, 하루당 총 4인이 1시간 동안 발표합니다.");
		System.out.println("발표일은 28일부터 입니다. 당일에 출석하는 반을 임의로 A분반이라 지칭합니다.");
		System.out.println("각 분반 별 인원은 다음과 같습니다.");
		System.out.println();
		
		System.out.print("A 분반: ");
		for(int a=0; a<14; a++) {
			System.out.print(classA[a] + " ");
		}
		System.out.println("이창준");
		
		System.out.println();
		System.out.println();
		
		System.out.print("B 분반: ");
		for(int b=0; b<15; b++) {
			System.out.print(classB[b] + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("아무 키나 눌러서 무작위 배정을 시작하세요. ==============================================");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		String lottojoa = scan.next(); // 배정 전에 전에 puase 역할
		

		int pan1[] = new int [14]; // 각 분반의 인원에 해당하는 배열 생성
		int pan2[] = new int [15];
		
		for(int i=0; i<14; i++) { // 14명을 랜덤해서 배정
			pan1[i] = (int)(Math.random() * 14); 
			for(int j=0; j<i; j++) { // 중복되는 경우에 중복되는 해당 슬롯을 취소한 후에 다시 추첨
				if(pan1[i] == pan1[j]) {
					i--; break; // 방금 배정한 회차를 무효로 돌리고 돌아가서 다시 추첨
				}
			}
		} 
		for(int o=0; o<15; o++) { // 15명을 랜덤해서 배정
			pan2[o] = (int)(Math.random() * 15); 
			for(int t=0; t<o; t++) { // 중복되는 경우에 중복되는 해당 슬롯을 취소한 후에 다시 추첨
				if(pan2[o] == pan2[t]) {
					o--; break; // 방금 배정한 회차를 무효로 돌리고 돌아가서 다시 추첨
				}
			}
		} 
		System.out.println();
		System.out.println("<===== A반 발표 순서 추첨 결과 =====> "); // 번호 출력
		//for(int i=0; i<15; i++) { System.out.print(pan[i] + " "); }
		for(int i=0; i<14; i++) {
			System.out.print(classA[pan1[i]] + " ");  // 랜덤 배정한 숫자에 해당하는 방에 할당된 이름 출력
			prsOrderA[i] = classA[pan1[i]]; // 일정표 출력을 위한 배열에 각 순서별 배정 인원의 이름을 입력
		}
		System.out.println();
		
		System.out.println();
		System.out.println("<===== B반 발표 순서 추첨 결과 =====> "); // 번호 출력
		for(int K=0; K<15; K++) {
			System.out.print(classB[pan2[K]] + " "); // 랜덤 배정한 숫자에 해당하는 방에 할당된 이름 출력
			prsOrderB[K] = classB[pan2[K]]; // 일정표 출력을 위한 배열에 각 순서별 배정 인원의 이름을 입력
		}
		System.out.println();
		System.out.println();
		
		System.out.println();
		System.out.println("아무 키나 눌르면 배정된 순서에 맞춰 발표 일정을 출력합니다. ==================================");
		String schedule = scan.next();

		System.out.println();
		
		System.out.println("==================");
		System.out.println("3월 28일 월요일 발표자");
		System.out.println("==================");
		
		System.out.println(prsOrderA[0]);
		System.out.println(prsOrderA[1]);
		System.out.println(prsOrderA[2]);
		System.out.println(prsOrderA[3]);
		System.out.println();
		
		System.out.println("==================");
		System.out.println("3월 29일 화요일 발표자");
		System.out.println("==================");
		
		System.out.println(prsOrderB[0]);
		System.out.println(prsOrderB[1]);
		System.out.println(prsOrderB[2]);
		System.out.println(prsOrderB[3]);
		System.out.println();
		
		System.out.println("==================");
		System.out.println("3월 30일 수요일 발표자");
		System.out.println("==================");
		
		System.out.println(prsOrderA[4]);
		System.out.println(prsOrderA[5]);
		System.out.println(prsOrderA[6]);
		System.out.println(prsOrderA[7]);
		System.out.println();
		
		System.out.println("==================");
		System.out.println("3월 31일 목요일 발표자");
		System.out.println("==================");
		
		System.out.println(prsOrderB[4]);
		System.out.println(prsOrderB[5]);
		System.out.println(prsOrderB[6]);
		System.out.println(prsOrderB[7]);
		System.out.println();
		
		System.out.println("==================");
		System.out.println("4월 01일 금요일 발표자");
		System.out.println("==================");
		
		System.out.println(prsOrderA[8]);
		System.out.println(prsOrderA[9]);
		System.out.println(prsOrderA[10]);
		System.out.println(prsOrderA[11]);
		System.out.println();
		
		System.out.println("-----------------");
		System.out.println("주말 주말 주말 주말 주말");
		System.out.println("-----------------");
		System.out.println();
		
		System.out.println("==================");
		System.out.println("4월 04일 월요일 발표자");
		System.out.println("==================");
		
		System.out.println(prsOrderB[8]);
		System.out.println(prsOrderB[9]);
		System.out.println(prsOrderB[10]);
		System.out.println(prsOrderB[11]);	
		System.out.println();
		
		System.out.println("==================");
		System.out.println("4월 05일 화요일 발표자");
		System.out.println("==================");
		
		System.out.println(prsOrderA[12]);
		System.out.println(prsOrderA[13]);
		System.out.println("A분반 발표 종료");
		System.out.println();
		
		System.out.println("==================");
		System.out.println("4월 06일 수요일 발표자");
		System.out.println("==================");
		
		System.out.println(prsOrderB[12]);
		System.out.println(prsOrderB[13]);
		System.out.println(prsOrderB[14]);
		System.out.println("B분반 발표 종료");
		
		// 문서의 끝
	}
}
