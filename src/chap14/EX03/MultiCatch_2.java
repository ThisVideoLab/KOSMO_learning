package chap14.EX03;

public class MultiCatch_2 {

	public static void main(String[] args) {

		//1. catch ������� ������ �߸��� ���
		
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}catch (Exception e){ // ����ó������ �ֻ��������� Exception
		System.out.println("����ó�� (Exception)");
		}
	
		System.out.println("���α׷� ����");
		
		//2. catch ����� ������ �߸��� ��쿡 �߻��ϴ� ����
		
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}catch (Exception e){ //3. ����ó������ �ֻ��������� Exception�� �տ��� �� �Ծ����.
		System.out.println("����ó�� (Exception)");
		}
/* 4. ���� �ڵ�鿡 ���� ����
		catch{ (ArithmeticException e) { // Exception�� ��� ����ó���� �Ծ����. �׷��� �� �ڿ� �������� �Դ� ����ó�� �ڵ尡 ����
		}catch (NumberFormatException e){ // ������ ���ѷ����� ���� ���ڵ忡 ���� �Ұ� ����ó�� �ڿ� �ִ� ����ó�� �ڵ���� ������ ��.   
		}                                 // ��� �̰��� �����ϱ� ���� Exception�� ���� �ڿ� �;� ��
*/
		System.out.println("���α׷� ����");
		
		//5. catch ���� �ùٸ� ���� 
		
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}catch (ArithmeticException | NumberFormatException e) { 
		
		}catch (Exception e){ //6. �ֻ��� �θ��� Exception�� �������� ��ġ
		System.out.println("����ó�� (Exception)");
		}
		
		//7. �������� Exception�� �����ؼ� ������.
		
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}catch (ArithmeticException e) { 
		
		}catch (NumberFormatException e){ //    
		
		}catch (Exception e){ 
		System.out.println("����ó�� (Exception)");
		}
		
	// ������ ��
	}

}
