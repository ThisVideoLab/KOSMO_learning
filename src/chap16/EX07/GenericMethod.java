package chap16.EX07;

/*
/ ���ʸ� �޼ҵ� :
 �ڹٿ��� �����ϴ� �پ��� ������ Ŭ������ �������̽���, ���� ���� ���� ���� ��ȵ� ���ο� ���� ���.
 ���� �ֱٿ� ������ ���� ��� �� �ϳ��ν�, ���� �����ε��� �־ �پ��� Ÿ���� �Է¸Ű������� ������
 �����ε��� �����ϱ� ���ؼ��� �Է�  �Ű����� Ÿ���� ����ŭ��������� �ϴ� ���ŷο��� �ذ��� �����.
 
 Ŭ���� ���ο��� ����� �������� Ÿ���� �ܺο��� �����ϴ� ����� �ǹ���. ���� Ŭ������ �Ű����� Ÿ����
 ���ϵ� ī��� �����س���, ���߿� ��ü�� ������ �� �� ���ϵ� ī�忡 ���� �Ű����� Ÿ���� �����ؼ�
 �ش� �ν��Ͻ����� ����ϴ� ��.



 */             
 

class Genericmethod1{ // �Ϲ� Ŭ������ �����ϰ�
	public <T> T method1 (T t) { // ���ʸ� �޼��� 1���� ��������. �Ű������� ���ϵ�ī�� T�� ������. 
		return t;
	}
	
	public <T> boolean method2 (T t1, T t2) { // ���ʸ� �޼��� 1�� ����. ��? ���ϵ� ī�尡 �������ϱ�.
		return t1.equals(t2); 				// �ΰ��� �� true, false ����			       
	}										// �⺻ �ڷ����϶��� ���� ��, ���� �ڷ����϶��� ��ü�� �ּҸ� ��
											// String�϶��� ���� ����. Integer, Double equals�� ������ �Ǿ��ִ�.
	
	public <K,V> void method3 (K k, V v) { // ���ʸ� �޼��� : 2��. ���ϵ� ī�尡 2������ ���� ���δ�.
		System.out.println(k + " : " + v); 
	}
	public <K,V> void method4() {
		System.out.println("�Ű������� ��ǲ���� ���� ��쿡�� ������ �Ұ�����. ���� �߻�!");
	}
}

public class GenericMethod {
	public static void main(String[] args) {

		//1. �Ϲ� Ŭ���� ��ü�� ���� �� ���ʸ� �޼ҵ� ȣ��
		Genericmethod1 gm1 = new Genericmethod1(); // ���ο� �ν��Ͻ��� ������ ��.
		
		String str1 = gm1.<String>method1("�ȳ�"); // �ڵ��� ����. ���ϵ�ī�� T �ڸ��� �Ű����� Ÿ���� String���� ������.
		String str2= gm1.method1("�ȳ�"); // �ڵ��� �����. Ÿ���� �տ��� ������ ������ ("�ȳ�") �տ� �� <String>�̶�� ���ʸ� Ÿ���� ������ ������. 
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("=========================");
		Integer i1 = gm1.<Integer>method1(100); // �ڵ��� ����. ���ϵ�ī�� .T �ڸ��� �Ű����� Ÿ���� Integer�� ������.
		Integer i2 = gm1.method1(200); // ���������� Ÿ���� �� ���ִ� ��쿡�� �Ű����� �տ� ���� ���׸� Ÿ���� ���� ������.
		System.out.println(i1);
		System.out.println(i2);
		
		// ��ó�� �ϳ��� �޼ҵ带 �������, ���� �������� ���ź��� Ÿ���� �޸��� ���� �ڷ����� �Է¹��� �� ����.
		
		System.out.println("=========================");
		Boolean b1 = gm1.<Boolean>method1(true);
		Boolean b2 = gm1.method1(false); // ���������� Ÿ���� �� ���ִ� ��쿡�� �Ű����� �տ� ���� ���׸� Ÿ���� ���� ������.
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println("=========================");
		Boolean d1 = gm1.<Double>method2(2.55, 2.55); // ���Ϲ��� Ÿ���� Boolean
		Boolean d2 = gm1.<Double>method2(2.55, 2.45); // ���Ϲ��� Ÿ���� Boolean
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("=========================");
		gm1.<String,Integer>method3("����",90);
		gm1.<String,Integer>method3("����",80); // �Ű������� ��ǲ�Ǵ� ������ Ÿ���� ������ �� �ִ� ��� ���� ���� 
		
		gm1.<Integer,String>method3(404,"����� Ȩ�������� ������ ���Ҵ�.");
		gm1.method3(402,"������ ã�� �� �����ϴ�");
	
	// ������ ��
	}
}
