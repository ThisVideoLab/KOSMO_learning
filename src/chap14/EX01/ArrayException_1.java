package chap14.EX01;

// ����ó���� ù��° ���: try ~ catch ���� �⺻ ������ ���� �˾ƺ���

public class ArrayException_1 {
	public static void main(String[] args) {

		int [] arr = new int[5]; // arr �迭�� �迭�� 5���� ����, �� �� index�� 0, 1, 2, 3, 4
		
		try {
			for (int i = 0; i <= 5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
			
		}catch (ArrayIndexOutOfBoundsException e) { // �迭�� ���� ��ȣ�� ������ �ʰ��� ��쿡 ����ó��
			e.printStackTrace(); // ����ÿ� ������ ������ �������.
			System.out.println("�迭�� �ε��� ���ȣ�� �Ѱ���ϴ�.");
		}finally{ 
			System.out.println("���(finally)");
		}
		System.out.println("���α׷��� �����մϴ�");
		
	// ������ ��
	}
}
