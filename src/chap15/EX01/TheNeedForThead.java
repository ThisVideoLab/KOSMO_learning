package chap15.EX01;

public class TheNeedForThead {
	public static void main(String[] args) {

		//1. ���� ������ : 1 ~ 5
		int [] intArr = {1,2,3,4,5};
		
		//2. �ڸ� ������ : �ϳ�~ �ټ�
		String [] strArr = {"�ϳ�","��","��","��","�ټ�"};
		
		//3. ���� ������ ���
		for (int i = 0; i< intArr.length; i++) {
			System.out.println("(���� ������" + intArr[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //0.2�� ���� �Ͻ�����
		}
		
		//4. �ڸ� ������ ���
		for (int i = 0; i< intArr.length; i++) {
			System.out.println("(�ڸ���ȣ)" + strArr[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			} //0.2�� ���� �Ͻ�����
		}
		
	// ������ ��
	}
}