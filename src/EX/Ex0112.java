package EX;
import java.util.Scanner;
public class Ex0112 {

	public static void main(String[] args) {
		
		
		String rsp[] = {"가위", "바위", "보"}; // rock scissors paper array
		int[] scrBrd= new int[] {0,0,0}; // Score Board / 배열은 차럐대로 승/무/패
		int mc = 0; // match count 가위바위보 승부 수 카운트
		String ipt; // user input 사용자의 입력값
		int ui; // 유저의 입력값에 대응하는 배열의 자리값
		int ci; // 컴퓨터가 고른 랜덤한 정수값, 배열에 대입해 가위바위보를 임의로 출력
		String player = "당신";

		System.out.println("컴퓨터와 가위바위보 게임을 시작합니다!");
		for (int temp = 0; temp <10; temp++) {
		}
		Scanner scan = new Scanner(System.in); 
		
		while(true) { // 무반복 till break 실행
			ipt = scan.next(); // 유저 입력값
			switch (ipt) {
				case "가위":
					ui = 0;
					break;
				case "바위":
					ui = 1;
					break;
				case "보":
					ui = 2;
					break;
				case "창식이찬스":
					ui = (int)((Math.random()*3)+0);
					player = "창식이";
					break;
				default:
					System.out.println("잘못된 입력값입니다. 가위, 바위, 보 중 하나를 입력하십시오.");
					continue;
			}
			scan.close();
			ci = (int)(Math.random()*3);
			System.out.println();
			System.out.print("(" + player + ") " + rsp[ui]+ " vs " + rsp[ci] + " (컴퓨터) == ");
			if((ui == 0 && ci == 2)||(ui == 1 && ci == 0)||(ui == 2 && ci == 1)) { // 이기는 경우의 수
				scrBrd[0]++;
				System.out.println("승리!");
			}
			else if(ui == ci){ // 비기는 경우의 수
				scrBrd[1]++;
				System.out.println("무승부!");
			}
			else{ // 지는 경우의 수, 이기거나 비기지 않는 나머지 모든 경우의 수에 해당
				scrBrd[2]++;
				System.out.println("패배!");
			}
			mc++;
			System.out.println("현재까지의 전적은 " + mc + "전 " + scrBrd[0] +"승 " + scrBrd[1] + "무 " + scrBrd[2] + "패 입니다.");
			System.out.println();
		}
		
	}
}
