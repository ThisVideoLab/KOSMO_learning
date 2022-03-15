package chap04;

public class Switch_Ex02 {

	public static void main(String[] args) {

		
		// Switch �ڵ� - break ó���� ���� �ʾ��� ��
		//              �극�� ó�� ���ϸ� ���� ���� �Ʒ��� �ִ� ���̽����� �˴� �� ����ع���. 
		
		int value1 = 2;
		switch (value1) {
			case 1:
				System.out.println("A ����");
			case 2:
				System.out.println("B ����");
			case 3:
				System.out.println("C ����");
			case 4:
				System.out.println("D ����");
			case 5:
				System.out.println("F ����");
			case 6:
				System.out.println("PASS");
			case 7:
				System.out.println("FAIL");
		}
		
		
		System.out.println("==========");
		
		// Switch �ڵ� - break ó���� ���� ��
		//              �극�� ó�� ���ϸ� ���� ���̽� ���� ���� ���̽����� ������ ����ع���.
		int value2 = 10;
		switch (value2) {
			case 1:
				System.out.println("A ����");
				break;
			case 2:
				System.out.println("B ����");
				break;
			case 3:
				System.out.println("C ����");
				break;
			case 4:
				System.out.println("D ����");
				break;
			case 5:
				System.out.println("F ����");
				break;
			case 6:
				System.out.println("PASS");
				break;
			case 7:
				System.out.println("FAIL");
				break;
			default:
				System.out.println("�ùٸ� ���� �Է��ϼ���"); // ����Ʈ�� ���̽� �ܿ� �ٸ� ���� ������ �⺻���� ��µǴ� ��. ���� ����� �� �߸� �Է������� ���̴ϱ� �ȶ��ض� �̷� �޽��� �ִ°� ���� ����.
		}
									            	// �� �������� ������ �� �ҷ��� ���̽��� ������ �극��ũ ��� ��. ������ ������ ���� ������.
				
	
	
	System.out.println("==========");
		
		int value3 = 5;
		
		if ( value3 == 1 ) {
				System.out.println("A ����(if)");
			} else if (value3 == 3) {
				System.out.println("B ����(if)");
			} else {
				System.out.println("C ����(if)");
		}
		
		
	System.out.println("==========");
		
	// switch ���� ����ؼ� ������ 7�� �̻��� pass, 7�� ���ϴ� fail�� ��� (������ 1~10��)
	
	int value4 = 11;
	
	switch (value4) {
	case 10:
	case 9:
	case 8:
	case 7:
		System.out.println("pass");
	break;
	case 6:
	case 5:
	case 4:
	case 3:
	case 2:
	case 1:
		System.out.println("fail");
	break;
	default:
		System.out.println("�ùٸ� ���� �Է��ϼ���");
	}
	
		
	}

}
