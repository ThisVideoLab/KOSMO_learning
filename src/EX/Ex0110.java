package EX;
import java.util.Scanner;
public class Ex0110 {
	public static void main(String[] args) {
		
	System.out.println("369 ���ӿ� �����ϴ� ����� �̸��� ���ʴ�� �����ּ���.");
		System.out.println("�ۼ��� ������ [�׸�] �� �Է��Ͻø� ������ ���۵˴ϴ�");
		System.out.println();
		
		Scanner scan = new Scanner (System.in);
		String [] nameArr= new String [2];
		String [] tempArr= new String [999];
		String name;
		
		
		int nameCnt = 1; // ���� �Է� ī���� 
		int nAri; // �̸� �迭 ���Է�
		int	tAcp; //�ӽ� �迭�� ���� 
		int nl;
		int odr = 0;
		    while(true){
			name = scan.next();
			if(name.equals("�׸�")){
				System.out.println();
				System.out.println("�Է��� �����մϴ�.");
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
		System.out.println("<������ ���>");
		
		for(nl = 0; nl < nameArr.length; nl++) {
			System.out.print(nameArr[nl] + " ");
		}
		System.out.println();
		System.out.println();
		// ����� �Է�  - ��ĵ �ڵ� �޾Ƽ� 
		// ���ϴ� ����ŭ - for �� Ȱ�� / " �׸� " ���� �극��ũ �����
		// ���Ӻ��� ���� - ���Ⱑ ������ ���� �迭 ������ �����ϰ� �׳��ع����� str ��ǲ���� �޾ƿ� �� ���ٰ� ��. ũ����������ٴ� new int �� �κ��� �����ε���.
		// ��� ¦¦ �տ� ��� - ��� ���� Ȱ���ؼ� ¥�� �ɵ�
		for(int clapCnt = 1; clapCnt <100; clapCnt++) {
			int sgDigt = clapCnt%10;
			int dbDigt = clapCnt/10; 
			
				
			if (dbDigt == 3||dbDigt == 6||dbDigt == 9) {
				if (sgDigt == 3||sgDigt == 6||sgDigt == 9) {
					System.out.print(nameArr[odr] + " ����: ");
					System.out.println(clapCnt + " �ڼ�¦¦");
				}else {
					System.out.print(nameArr[odr] + " ����: ");
					System.out.println(clapCnt + " �ڼ�¦");
					}
			}else{
				if (sgDigt == 3||sgDigt == 6||sgDigt == 9) {
					System.out.print(nameArr[odr] + " ����: ");
					System.out.println(clapCnt + " �ڼ�¦");
				}
			}
			odr++;	
			if (odr == (nameArr.length)) {
				odr = 0;
			}
		
		}
	System.out.println();
	System.out.println("���α׷��� �����մϴ�.");
	}

}
