package chap04;

public class Contineu_Ex05 {
	public static void main(String[] args) {
		
		//1. ���� �������� continue - ��Ƽ���� ���� �ڵ带 �þ ���ֹ���. �翬������ ���� �ڵ尡 ������ ��������
		
		for (int i = 0; i < 10 ; i++) {
			continue; 
		//	System.out.println("��� ���� ����");  ==>> ���� ������ ���ٰ� ���� ��. ���� ���� ��Ƽ���� ���� �ڵ��� ������ �Ұ���.	
		}
		
		
		for (int i = 0; i < 10 ; i++) {
		System.out.print(i + " ");
			continue; // ��ġ�� �������������� �ڵ尡 ���� ������ �ǹ̰� ����.
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		// 2. ������ ����ؼ� continue ó��
		System.out.println("====continue======");
		
		for (int i = 0; i < 10 ; i++) {
				if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}		
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		// 2. ������ ����ؼ� break ó��
		System.out.println("====break======");
		
		for (int i = 0; i < 10 ; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i + " ");
		}		
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		//3. ���� ���������� continue�� ���
		for (int i = 0; i < 5 ; i++) {
			for (int j = 1; j <5; j++) {
				if (j % 3 == 0) { // �� 3�� ����϶��� ����� ���ع���
					System.out.println("j==3�� �±Ⱑ ���� �����ֽ��ϴ�.");
					continue;
				}
				System.out.println(i + ", " + j);
			}
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		System.out.println("=====�극��ũ=====");

		//4. ���� ���������� break�� ��� - �ٷ� �� 3���� ���� �ڵ带 Ȱ���ؼ� continue��  break�� ��� ���̸� �ľ���
				for (int i = 0; i < 5 ; i++) {
					for (int j = 1; j <5; j++) {
						if (j % 3 == 0) { // �� 3�� ����϶��� ����� ���ع���
							System.out.println("j==3�� �±Ⱑ ���� �����ֽ��ϴ�.");
							break; // ��Ƽ���� �ش� ���� ���ุ �����ϰ� �������� ���δµ��� ���ؼ� �극���� 3���� �׳�
							       // �� �������ƻ԰� ������ �ٶ��� 4�� �����ϴ� ���� �ֵ� ����� ���� ���� ����
						}
						System.out.println(i + ", " + j);
					}
				}
	
				
		//5.  continue���� �� ���
			System.out.println();
			System.out.println("==== ��Ƽ������ �� ���======");
			
POS2:		for (int i = 0; i < 5 ; i++) {
				for (int j = 0; j < 5 ; j++) {
					if ( j ==3) {
						continue POS2;
					}
				System.out.println(i + " , " + j);
				}
			}

System.out.println("");
System.out.println("=====�����Ѱ輱=====");
				
	}
}
