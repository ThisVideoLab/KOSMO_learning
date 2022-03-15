package EX;
import java.util.Scanner;
public class Ex0110 {
	public static void main(String[] args) {
		
	System.out.println("369 게임에 참가하는 사람의 이름을 차례대로 적어주세요.");
		System.out.println("작성이 끝나고 [그만] 을 입력하시면 게임이 시작됩니다");
		System.out.println();
		
		Scanner scan = new Scanner (System.in);
		String [] nameArr= new String [2];
		String [] tempArr= new String [999];
		String name;
		
		
		int nameCnt = 1; // 네임 입력 카운팅 
		int nAri; // 이름 배열 재입력
		int	tAcp; //임시 배열에 복사 
		int nl;
		int odr = 0;
		    while(true){
			name = scan.next();
			if(name.equals("그만")){
				System.out.println();
				System.out.println("입력을 종료합니다.");
				System.out.println();
				break;
			}
			if(nameArr.length<nameCnt) {
				for(tAcp = 0; tAcp <nameArr.length ; tAcp++) {
					tempArr[tAcp] = nameArr[tAcp];
			 	}
				nameArr= new String[nameArr.length+1];
				for(nAri = 0; nAri < nameArr.length; nAri++) {
					nameArr[nAri] = tempArr[nAri];
				}
				nameArr[nameCnt-1] = name; 
			}
			nameArr[nameCnt-1] = name;
			nameCnt++;
		}
		System.out.println("<참가자 명단>");
		
		for(nl = 0; nl < nameArr.length; nl++) {
			System.out.print(nameArr[nl] + " ");
		}
		System.out.println();
		System.out.println();
		// 사람값 입력  - 스캔 코드 받아서 
		// 원하는 수만큼 - for 문 활용 / " 그만 " 으로 브레이크 만들기
		// 네임베열 만들어서 - 여기가 문제임 네임 배열 사이즈 안정하고 그냥해버리면 str 인풋값을 받아올 수 없다고 뜸. 크기미지정보다는 new int 이 부분의 문제인듯함.
		// 모든 짝짝 앞에 출력 - 어레이 랭쓰 활용해서 짜면 될듯
		for(int clapCnt = 1; clapCnt <100; clapCnt++) {
			int sgDigt = clapCnt%10;
			int dbDigt = clapCnt/10; 
			
				
			if (dbDigt == 3||dbDigt == 6||dbDigt == 9) {
				if (sgDigt == 3||sgDigt == 6||sgDigt == 9) {
					System.out.print(nameArr[odr] + " 차례: ");
					System.out.println(clapCnt + " 박수짝짝");
				}else {
					System.out.print(nameArr[odr] + " 차례: ");
					System.out.println(clapCnt + " 박수짝");
					}
			}else{
				if (sgDigt == 3||sgDigt == 6||sgDigt == 9) {
					System.out.print(nameArr[odr] + " 차례: ");
					System.out.println(clapCnt + " 박수짝");
				}
			}
			odr++;	
			if (odr == (nameArr.length)) {
				odr = 0;
			}
		
		}
	System.out.println();
	System.out.println("프로그램을 종료합니다.");
	}

}
