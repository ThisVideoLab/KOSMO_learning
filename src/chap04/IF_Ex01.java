package chap04;

public class IF_Ex01 {

	public static void main(String[] args) {

			// if ��:
		    //if  (����){���� ���϶� ����Ǵ� �ڵ�}

		int value1 = 4;
		if (value1>6) {
		System.out.println("����1");}
		else if (value1 == 5) {System.out.println("�츰 ����ڳ�");}
		else {System.out.println("��� �����մϴ�. �� �ȵ��ݾ�?");}
		
		System.out.println("==========");
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		if (bool1) {
			System.out.println("����3");
		}else{
			System.out.println("����4");
		}
		
		if (bool2) {
			System.out.println("����5");
		}else{
			System.out.println("����6");
		}
		
		System.out.println("==========");
		
		// if ~ else�� ���� �����ڷ� ��ȯ�� ������
		
		System.out.println((bool1) ? "����7" : "����8");
		System.out.println((bool2) ? "����7" : "����8");
		
		/* if�� ������ �������� ��
		  if(����1){
		  	���� 1�� ���϶� ���� �ڵ�;
		  	}else if(����2){
		  	���� 2�� ���϶� ���� �ڵ�;
		  	}else if(����3){
		  		����3�� ���϶� ���� �ڵ�;
		  	}else{
		  	��� ���� ��� ������ �������� ���� �� ���� �ڵ�;
			}

		- ������������������������ �ڵ�� ���� �����ڷ� ��ȯ�ϱ⿡�� �ʹ� �����ؼ� ���� 
		*/
		
		System.out.println("==========");
		
		int value3 = 85;

		System.out.print("����� ������ " + value3 +"�� �̹Ƿ� " );
		
		if (value3>=90) {
			System.out.print("A ����");
		}else if(value3>=80) {
			System.out.print("B ����"); // value3�� 85�ϱ� ���⼭ �ɷ��� ���� �� if ���� �������´�. �� �Ʒ��� �������
		}else if(value3>=70) {
			System.out.print("C ����");
		}else if(value3>=60) {
			System.out.print("D ����");
		}else{
			System.out.print("F ����");
		}
		System.out.println("�Դϴ�");

		System.out.println("==========");

		// if������ ������ ������ �ٲ���� ��� - �������� ���� ������ �߿伺
		
		value3 = 84; // ���� �缳��
		
System.out.print("����� ������ " + value3 +"�� �̹Ƿ� " );
		
		if (value3>=90) {
			System.out.print("A ����"); // ���3�� ���Ǻ��� ������ ���� => false �Ǹ鼭 ���� �������� �̵�
		}else if(value3>=70) {
			System.out.print("C ����"); // ���� ������ �������� ��ĭ �÷��༭ �Ϻη� ������ ������ �ٲ㺽. value3�� ������ �����ϱ� ������ �� ����ϰ� if ����.
		}else if(value3>=80) {
			System.out.print("B ����"); // �� ������ �����ӿ��� �̹� value3�� �����ϴ� ������ ���� �������� ���� ������� ���ϰ� ������. -> �������� ���� ������ �߿伺 
		}else if(value3>=60) {
			System.out.print("D ����");
		}else{
			System.out.print("F ����");
		} 
		System.out.println("�Դϴٸ� ���� ������ �߸��Ȱ� ������");
		
		System.out.println("==========");

		// ������ �����ϰ� ������ ���
		
		value3 = 85;
		
		if(value3 <= 100 && value3 >= 90){
			System.out.println("A �����Դϴ�. ���� �������");
		}else if(value3 < 90 && value3 >= 80) {
			System.out.println("B �����Դϴ�. ���߽��ϴ�.");
		}else if(value3 < 80 && value3 >= 70) {
			System.out.println("C �����Դϴ�. ���� �й��ϼ���.");
		}else if(value3 < 70 && value3 >= 60) {
			System.out.println("D �����Դϴ�. �����ϽŰǰ���?");
		}else{
			System.out.println("F �����Դϴ�. ���⿡ �˰ڽ��ϴ�");
		}

		System.out.println("==========");
		
		// if ������ �߰�ȣ{}�� ������ ��� - ���๮�� �ϳ��϶��� �߰�ȣ�� �����ؼ� ó���� �� ����.
		
		if (3 < 5) System.out.println("����1"); // ���๮�� �ϳ����̶� �׳� �߱�� �ٿ�����
		
		System.out.println("==========");
		
		if (3 > 5) System.out.println("����2"); else System.out.println("����2"); // �̷��� ���� �Ȱ� �ٷ� �߰�ȣ ���� �����ھƵ� ��. �ٵ� �����ڵ� ���� �� ������.
		
//		if (6 > 5) System.out.println("����2"); else if System.out.println("����2"); else System.out.println("������2"); // �׷��� �̷��� 3�� �̻�Ǹ� ���� �ջ�.
		
		System.out.println("==========");
		
		if (6 > 5) System.out.println("����3"); System.out.println("����3"); // �̷��� ������ ����3�� ���϶��� ��µǰ�, �����϶��� �׳� ��� �ȵ�.
																		   // �׷��� �̰Ŷ� �����ϰ� ����3 ������ ���� 3��� �� ����ع���.
		
		
		
		
		
	}

}
