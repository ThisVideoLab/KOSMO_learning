package chap04;

public class Break_Ex04 {
	public static void main(String[] args) {
		
		//1. ���� loop�� ����� ������ break Ż��
		for (int i = 0; i < 10 ; i++){
			System.out.println(i);
		break; //  break�� ������ �ش� ������ ���� ���´�.
		} // 0���� ��µ�
		
		//2. for�� ������ if ������ ����ؼ� break�� �־� �ش� ������ �������´�.
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		 
		for (int i = 0; i < 10 ; i++){
			if(i == 5) {
				System.out.println("");
				System.out.print("��� �극��ũ ���� �� Ż��");
				break;
			}
			System.out.print(i + " ");
		}
		
		System.out.println("");
		System.out.println("==========");
		System.out.println();
		
		// 3 ���� loop ���϶� break Ż��
		for (int i = 0; i < 5 ; i++){
			System.out.print(i + "��Ʈ ���� ===== ");
			for (int j = 0; j < 5 ; j++){
				System.out.print(i + " , " + j + " / ");
			if (i == 2 ) {
				System.out.print("(break �������� ���� �ߴ�)");
				break;
					}
				}
			System.out.println("");
			}
			
		
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
		
		// 4. ���� loop �ݺ������� �Ѳ����� Ż��
		
POS1:		for (int i = 0; i < 5 ; i++){ // FOR �� �տ� ���� �־ ��ġ�� Ư������
			for (int j= 0; j < 5 ; j++){
				if(i == 2) {
					System.out.println("POS1 �󺧷� break");
					break POS1; // �극��ũ �ڿ� ���� �̸��� ������ �����ص� ���� ��ġ�� �̵��ؼ� ������ �����.
				}
				System.out.println(i + " , " + j);
			}
		}
	
		System.out.println("");
		System.out.println("==========");
		System.out.println("");

		// 4. ���� Loop���� �Ѳ����� Ż�� <<2, ���� ������ false�� ���� ��������
		
		for (int i = 0; i < 5 ; i++){
			System.out.println("");
			for (int j = 0; j < 5 ; j++){
				if (i == 2) {
					i = 100; 
					break; // �� �� �극��ũ�� ���� ������ i = 100 ���� ������ ������ ��ƾ�� ������ �����ϱ� ������ 100���� �����ϴ� ���� �ָ��� ������ ����.
				}
				System.out.print(i + " , " + j + " / ");
			}
		}	
		
		System.out.println("");
		System.out.println("==========");
		System.out.println("");
			
		// �̰Ŵ� �󺧸����� ��ƻ��°�
		
		for (int i = 0; i < 5 ; i++){
			System.out.println("");
POS11:		for (int j = 0; j < 5 ; j++){
				if (i == 2) {
			    	i = 100; 
			    	break POS11; // �� �� �극��ũ�� ���� ������ i = 100 ���� ������ ������ ��ƾ�� ������ �����ϱ� ������ 100���� �����ϴ� ���� �ָ��� ������ ����.
				}
				System.out.print(i + " , " + j + " / ");
			}
		}				
	}
}
