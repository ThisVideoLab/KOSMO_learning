package private_work;
import java.util.Arrays; 
import java.util.Scanner;
public class Java_dose_not_like_me_at_all {
	static void math (String...people) {
		int sum = 0;
		double avg;
			for(int i = 0; i < people.length; i++) {
				if (i%2 != 0) {
				sum += Integer.parseInt(people[i]);
				}
			}	
		avg = ((double)sum/people.length)*2; // ����� �ݵ�� double������ ����� �ǳ� ��Դ´� �����̾�
		
		System.out.println("��ü ������ ��: " + sum);
		System.out.println("����� ��� ������ �� " + avg);
	}
	public static void main(String[] args) {
		System.out.println("������ � ���� �̸���, �ش� ��� �����ϴ� �ο����� ����� ������ �Է����ּ���.");
		System.out.println("����) �� 11 �౸ 12");
		System.out.println("���ϴ� ��ŭ �Է��Ͻ� �Ŀ� ���͸� ������ �Է°��� ��µ˴ϴ�.");
		while(true) {
			Scanner scan = new Scanner(System.in);
			String num;
			num = scan.nextLine(); // ������ ���Ƿ�, ��ü �������� String���� �޾ƾ� ��. �׷��� ��ǲ���� ��ü �ް� ���ø����� ©�� ������ ������ �����ϸ� ��.
			if(num.equals("�׸�")) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			String[] arr1;
			arr1 = num.split(" "); // �̷��� ¥������ splite�� �����ڸ� �������� ���ڸ� �߶� �迭�� ������.
			System.out.println("[��ü ���� �� ���� �ο��� ��Ȳ]");
			for(int i = 0; i < arr1.length; i++) { // ��ü ���� �� �� ����� �ο��� ��� for �� ���� 
				if(i%2 != 0) { // arr1[i]�� ¦�� ��°�� ���̶��
					System.out.print(arr1[i] + "]");
				}
				if(i%2 == 0) { // arr1[i]�� Ȧ�� ��°�� ���̶��
					System.out.print("[" + arr1[i] + ": ");
				}
			} // ��ü ���� �� �� ����� �ο��� ��� for �� ���� 
			System.out.println();
			math(arr1); // �������� �޼ҵ� math�� ȣ���ϸ鼭 �Ű������� arr1�� �־��ְ� ��.
			
		}
	}
		
}
