package chap14.EX08;

//1. Method�� throws�� ��� ������ main method���� �����ϴ� ����� ���� �˾ƺ���
//2. main method���� ���ܰ� ���� �� ��쿡�� ������ ��� â�� ���� ���α׷��� ������.
//3. �� main method�� ����ó������ �ʰ� �޽����� ����ְ� ���α׷��� ������ѹ���.

class AA{
	public void abc() throws NumberFormatException {
		bcd();
	}
	public void bcd() throws NumberFormatException {
		cde();
	}
	public void cde() throws NumberFormatException { //5. ������ ���ڸ� ������
		int num = Integer.parseInt("10A"); // 4. Exception �߻�, ����� ���ÿ� NumberFormatException �߻�
	}
}	

public class ExceptionMethod {

	public static void main(String[] args) {
		//6. ��ü ����
		AA aa = new AA();
		
		//7. �޼��� ȣ��
		try {
			aa.abc();	
		}catch (NumberFormatException e) {
			System.out.println("���ܰ� �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
		System.out.println("���α׷��� �����մϴ�.");
		
	
		//������ ��
	}

}
