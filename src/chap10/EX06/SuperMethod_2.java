package chap10.EX06;

class AAAA {
	AAAA(){
		this(3); // �ڱ� �ڽ��� �����ڸ� �θ��� �޼���. �ݵ�� ù ���ο� ��ġ�ؾ� ��. ��� ���� �ҷ����ϱ� �Ʒ� int a �� ���
		System.out.println("AAAA �⺻ ������"); // �� �ڿ� �̰� ���
	}
	AAAA(int a){
		System.out.println("AAAA (int a) ������ " + a);
	}
}
class BBBB extends AAAA{
	BBBB(){
		// super(); �� ������ ������ ���� AAAA Ŭ������ AAAA()�����ڸ� �ҷ���. AAAA() ��±����� 2���� 2�� ���. 
		this(4); // �� ������ �̳༮�� �ڱ� �ڽ��� int a�� �ҷ���. 
		System.out.println("BBBB �⺻ ������"); // �� ������ ���������� �״�� ������
	}
	BBBB(int a){
		System.out.println("BBBB (int a) ������ " + a);
	}
	
}

public class SuperMethod_2 {

	public static void main(String[] args) {
		
		//1. ��ü ����
		AAAA aaaa1 = new AAAA();
		System.out.println("===================");
		
		AAAA aaaa2 = new AAAA(3); // int a ������ �ҷ��ͼ� �ٷ� ���
		System.out.println("===================");
		
		//2. �ڽ��� ��ü ����
	
		BBBB bbbb1 =new BBBB();
		System.out.println("===================");
		
		
	}	

}
