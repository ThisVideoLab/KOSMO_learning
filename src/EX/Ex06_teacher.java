package EX;

public class Ex06_teacher {

	public static void main(String[] args) {
		int[] array = {4, 5, 1, 2,200, 3, 100 };
		int max = 0; 	//�ִ� ���� �����ϴ� ���� 
		
		 for ( int i =0 ; i < array.length; i++) {		//������ ���� ��ȯ �ϸ鼭 ������ �´�. 
			if ( array[i] > max) {		// ���� ���� max ������ ����Ÿ Ŭ�� 
				max = array[i];			// max ������ ū���� ���� 
			}
		}
		System.out.println("�ִ� ���� : " + max);
		
	}

}
