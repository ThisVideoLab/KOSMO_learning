package EX;
import java.util.Scanner;
public class Ex0112 {

	public static void main(String[] args) {
		
		
		String rsp[] = {"����", "����", "��"}; // rock scissors paper array
		int[] scrBrd= new int[] {0,0,0}; // Score Board / �迭�� ���m��� ��/��/��
		int mc = 0; // match count ���������� �º� �� ī��Ʈ
		String ipt; // user input ������� �Է°�
		int ui; // ������ �Է°��� �����ϴ� �迭�� �ڸ���
		int ci; // ��ǻ�Ͱ� �� ������ ������, �迭�� ������ ������������ ���Ƿ� ���
		String player = "���";

		System.out.println("��ǻ�Ϳ� ���������� ������ �����մϴ�!");
		for (int temp = 0; temp <10; temp++) {
		}
		Scanner scan = new Scanner(System.in); 
		
		while(true) { // ���ݺ� till break ����
			ipt = scan.next(); // ���� �Է°�
			switch (ipt) {
				case "����":
					ui = 0;
					break;
				case "����":
					ui = 1;
					break;
				case "��":
					ui = 2;
					break;
				case "â��������":
					ui = (int)((Math.random()*3)+0);
					player = "â����";
					break;
				default:
					System.out.println("�߸��� �Է°��Դϴ�. ����, ����, �� �� �ϳ��� �Է��Ͻʽÿ�.");
					continue;
			}
			scan.close();
			ci = (int)(Math.random()*3);
			System.out.println();
			System.out.print("(" + player + ") " + rsp[ui]+ " vs " + rsp[ci] + " (��ǻ��) == ");
			if((ui == 0 && ci == 2)||(ui == 1 && ci == 0)||(ui == 2 && ci == 1)) { // �̱�� ����� ��
				scrBrd[0]++;
				System.out.println("�¸�!");
			}
			else if(ui == ci){ // ���� ����� ��
				scrBrd[1]++;
				System.out.println("���º�!");
			}
			else{ // ���� ����� ��, �̱�ų� ����� �ʴ� ������ ��� ����� ���� �ش�
				scrBrd[2]++;
				System.out.println("�й�!");
			}
			mc++;
			System.out.println("��������� ������ " + mc + "�� " + scrBrd[0] +"�� " + scrBrd[1] + "�� " + scrBrd[2] + "�� �Դϴ�.");
			System.out.println();
		}
		
	}
}
