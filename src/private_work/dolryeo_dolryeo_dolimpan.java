package private_work;

import java.util.Scanner;

public class dolryeo_dolryeo_dolimpan  {

	public static void main(String[] args) {
		
		
		String classA[] = {"�ǿ���", "�躴��", "������", "������", "������", "������", "�Ⱥ���", "������","������", "���ػ�", "������", "�����", "������", "������"};
		String classB[] = {"������", "�Ǽ���", "��ܿ�", "�蹮��", "���繬", "��ä��", "���μ�", "������","�̱Կ�", "�̴���", "�̿���", "������", "�ӱԹ�", "���¿�", "������"};
		String prsOrderA[] = new String[14];
		String prsOrderB[] = new String[15];
		
		// �йݺ� ���, ���ǻ� ���� ��ǥ�ϴ� �й��� A�й��̶� Ī��.
		
		System.out.println("��ǥ���� 28�Ϻ��� �Դϴ�. ���Ͽ� �⼮�ϴ� ���� ���Ƿ� A�й��̶� ��Ī�մϴ�.");
		System.out.println("��ǥ �ð��� ���ɽĻ� �� ������ ���� �δ� 15�о�, �Ϸ�� �� 4���� 1�ð� ���� ��ǥ�մϴ�.");
		System.out.println("��ǥ���� 28�Ϻ��� �Դϴ�. ���Ͽ� �⼮�ϴ� ���� ���Ƿ� A�й��̶� ��Ī�մϴ�.");
		System.out.println("�� �й� �� �ο��� ������ �����ϴ�.");
		System.out.println();
		
		System.out.print("A �й�: ");
		for(int a=0; a<14; a++) {
			System.out.print(classA[a] + " ");
		}
		System.out.println("��â��");
		
		System.out.println();
		System.out.println();
		
		System.out.print("B �й�: ");
		for(int b=0; b<15; b++) {
			System.out.print(classB[b] + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("�ƹ� Ű�� ������ ������ ������ �����ϼ���. ==============================================");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		String lottojoa = scan.next(); // ���� ���� ���� puase ����
		

		int pan1[] = new int [14]; // �� �й��� �ο��� �ش��ϴ� �迭 ����
		int pan2[] = new int [15];
		
		for(int i=0; i<14; i++) { // 14���� �����ؼ� ����
			pan1[i] = (int)(Math.random() * 14); 
			for(int j=0; j<i; j++) { // �ߺ��Ǵ� ��쿡 �ߺ��Ǵ� �ش� ������ ����� �Ŀ� �ٽ� ��÷
				if(pan1[i] == pan1[j]) {
					i--; break; // ��� ������ ȸ���� ��ȿ�� ������ ���ư��� �ٽ� ��÷
				}
			}
		} 
		for(int o=0; o<15; o++) { // 15���� �����ؼ� ����
			pan2[o] = (int)(Math.random() * 15); 
			for(int t=0; t<o; t++) { // �ߺ��Ǵ� ��쿡 �ߺ��Ǵ� �ش� ������ ����� �Ŀ� �ٽ� ��÷
				if(pan2[o] == pan2[t]) {
					o--; break; // ��� ������ ȸ���� ��ȿ�� ������ ���ư��� �ٽ� ��÷
				}
			}
		} 
		System.out.println();
		System.out.println("<===== A�� ��ǥ ���� ��÷ ��� =====> "); // ��ȣ ���
		//for(int i=0; i<15; i++) { System.out.print(pan[i] + " "); }
		for(int i=0; i<14; i++) {
			System.out.print(classA[pan1[i]] + " ");  // ���� ������ ���ڿ� �ش��ϴ� �濡 �Ҵ�� �̸� ���
			prsOrderA[i] = classA[pan1[i]]; // ����ǥ ����� ���� �迭�� �� ������ ���� �ο��� �̸��� �Է�
		}
		System.out.println();
		
		System.out.println();
		System.out.println("<===== B�� ��ǥ ���� ��÷ ��� =====> "); // ��ȣ ���
		for(int K=0; K<15; K++) {
			System.out.print(classB[pan2[K]] + " "); // ���� ������ ���ڿ� �ش��ϴ� �濡 �Ҵ�� �̸� ���
			prsOrderB[K] = classB[pan2[K]]; // ����ǥ ����� ���� �迭�� �� ������ ���� �ο��� �̸��� �Է�
		}
		System.out.println();
		System.out.println();
		
		System.out.println();
		System.out.println("�ƹ� Ű�� ������ ������ ������ ���� ��ǥ ������ ����մϴ�. ==================================");
		String schedule = scan.next();

		System.out.println();
		
		System.out.println("==================");
		System.out.println("3�� 28�� ������ ��ǥ��");
		System.out.println("==================");
		
		System.out.println(prsOrderA[0]);
		System.out.println(prsOrderA[1]);
		System.out.println(prsOrderA[2]);
		System.out.println(prsOrderA[3]);
		System.out.println();
		
		System.out.println("==================");
		System.out.println("3�� 29�� ȭ���� ��ǥ��");
		System.out.println("==================");
		
		System.out.println(prsOrderB[0]);
		System.out.println(prsOrderB[1]);
		System.out.println(prsOrderB[2]);
		System.out.println(prsOrderB[3]);
		System.out.println();
		
		System.out.println("==================");
		System.out.println("3�� 30�� ������ ��ǥ��");
		System.out.println("==================");
		
		System.out.println(prsOrderA[4]);
		System.out.println(prsOrderA[5]);
		System.out.println(prsOrderA[6]);
		System.out.println(prsOrderA[7]);
		System.out.println();
		
		System.out.println("==================");
		System.out.println("3�� 31�� ����� ��ǥ��");
		System.out.println("==================");
		
		System.out.println(prsOrderB[4]);
		System.out.println(prsOrderB[5]);
		System.out.println(prsOrderB[6]);
		System.out.println(prsOrderB[7]);
		System.out.println();
		
		System.out.println("==================");
		System.out.println("4�� 01�� �ݿ��� ��ǥ��");
		System.out.println("==================");
		
		System.out.println(prsOrderA[8]);
		System.out.println(prsOrderA[9]);
		System.out.println(prsOrderA[10]);
		System.out.println(prsOrderA[11]);
		System.out.println();
		
		System.out.println("-----------------");
		System.out.println("�ָ� �ָ� �ָ� �ָ� �ָ�");
		System.out.println("-----------------");
		System.out.println();
		
		System.out.println("==================");
		System.out.println("4�� 04�� ������ ��ǥ��");
		System.out.println("==================");
		
		System.out.println(prsOrderB[8]);
		System.out.println(prsOrderB[9]);
		System.out.println(prsOrderB[10]);
		System.out.println(prsOrderB[11]);	
		System.out.println();
		
		System.out.println("==================");
		System.out.println("4�� 05�� ȭ���� ��ǥ��");
		System.out.println("==================");
		
		System.out.println(prsOrderA[12]);
		System.out.println(prsOrderA[13]);
		System.out.println("A�й� ��ǥ ����");
		System.out.println();
		
		System.out.println("==================");
		System.out.println("4�� 06�� ������ ��ǥ��");
		System.out.println("==================");
		
		System.out.println(prsOrderB[12]);
		System.out.println(prsOrderB[13]);
		System.out.println(prsOrderB[14]);
		System.out.println("B�й� ��ǥ ����");
		
		// ������ ��
	}
}
