package chap16.EX12;

// ���׸� �޼����� ���: �Ϲ� Ŭ������ ���ʸ� �޼���

class Parent{ // �Ϲ� Ŭ����
	//Number : Boolean, Charactor�� ������ Wrapper(�⺻ ������ Ÿ���� ��ü������ ��ȯ�� ��) Ÿ���� Ŭ������ �� �� ����.
				//Byte, Short, Integer, Long, Float, Double
	
	<T extends Number> void print(T t) { // ���׸� �޼���
		System.out.println(t);
	}
}

class Child extends Parent{ // �Ϲ� Ŭ������ ��� �޾Ƽ� ���׸� �޼��� ���
	
}

public class InheritanceGenericMethod {
	public static void main(String[] args) {
		//1. �θ� Ŭ������ ���׷� �޼��� ���
		Parent p = new Parent();
		p.<Integer>print(100);
		p.<Double>print(100.00);
		//p.<String>print("�ȳ�"); // �ѹ� Ÿ�Ը� �� �� ����.
		p.print(300); // �Ű������� �ڷ����� Ȯ���� ���� ������ �����, �����ص� ������ �������� �ڵ����� �־���
		p.print(3000.333);
		
		//2. �ڽ� Ŭ�������� ���ʸ� �޼��� ���
		Child c = new Child();
		c.<Integer>print(200);
		c.<Double>print(2000.12345);
	}
}
