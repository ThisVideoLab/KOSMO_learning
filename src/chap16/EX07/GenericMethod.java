package chap16.EX07;

// ���ʸ� �޼ҵ� : Ŭ������ ������ �� Ÿ�� ������ ���� <T>�� ���� ������. �� �� ��ü�� ������ T�� ������ Ÿ���� ������.
// ���ʸ� �޼ҵ� : �Ϲ� Ŭ���� ����� �޼��� ����� ���ʸ� Ÿ�� ������ �����.
//             

class Genericmethod1{ // �Ϲ� Ŭ����
	public <T> T method1 (T t) { // ���ʸ� �޼��� 1��
		return t;
	}
	
	public <T> boolean method2 (T t1, T t2) { // ���ʸ� �޼��� 1��
		return t1.equals(t2); 				// �ΰ��� �� true, false ����			       
	}										// �⺻ �ڷ����϶��� ���� ��, ���� �ڷ����϶��� ��ü�� �ּҸ� ��
											// String�϶��� ���� ����. Integer, Double equals�� ������ �Ǿ��ִ�.
	
	public <K,V> void method3 (K k, V v) { // ���ʸ� �޼��� : 2��
		System.out.println(k + " : " + v); 
	}
	public <K,V> void method4() {
		System.out.println("�Ű������� ��ǲ���� ���� ��쿡�� ������ �Ұ�����. ���� �߻�!");
	}
}

public class GenericMethod {
	public static void main(String[] args) {

		//1. �Ϲ� Ŭ���� ��ü�� ���� �� ���ʸ� �޼ҵ� ȣ��
		Genericmethod1 gm1 = new Genericmethod1();
		
		String str1 = gm1.<String>method1("�ȳ�");
		String str2= gm1.method1("�ȳ�"); // Ÿ���� �� �� �ִ� ��쿡�� ("�ȳ�") �տ� �� <String>�̶�� ���ʸ� Ÿ���� ������ ������. 
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("=========================");
		Integer i1 = gm1.<Integer>method1(100);
		Integer i2 = gm1.method1(200); // ���������� Ÿ���� �� ���ִ� ��쿡�� �Ű����� �տ� ���� ���׸� Ÿ���� ���� ������.
		System.out.println(i1);
		System.out.println(i2);
		
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
