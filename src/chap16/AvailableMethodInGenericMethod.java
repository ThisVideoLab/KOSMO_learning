package chap16;

// ���ʸ� �޼ҵ� ���ο� ��밡���� �޼��� : Object  Ŭ������ �޼ҵ常 ��� ������.

class A{
	public <T> void method(T t) {
		// System.out.println(t.length()); // t.length() : String Ŭ�������� ���ڼ��� �������� // ���Ұ�
		System.out.println(t.equals("�ȳ�")); // t.equals�� Object Ŭ������ �޼ҵ�� ����� ������ 
	}
	public <T extends Object> void method2 (T t) { // <T extends Object> 
		System.out.println(t.equals("�ݰ����ϴ�")); // Object Ŭ������ �޼ҵ常 ��밡���ϴ�.
	}
	public <T extends String> void method3 (T t) { // <T extends String> ��Ʈ�� Ÿ���� ���� ������ �Ű������� �´�
		System.out.println(t.equals(t.length())); // 
	}
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method("�ȳ�");
	}
}