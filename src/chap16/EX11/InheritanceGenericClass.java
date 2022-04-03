package chap16.EX11;

// ���ʸ� Ŭ������ ��� : �ڽ� Ŭ������ �θ� Ŭ������ ���ʸ� ���� (K,V,T,E)�� ���ų� �� ���ƾ� ��.
// 

class Parent<T>{
	T t; // default
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}
class Child1 <T> extends Parent<T>{
	
}
class Child2 <T, V> extends Parent<T>{
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	
}


public class InheritanceGenericClass {
	public static void main(String[] args) {

		//1. �θ� ���׸� Ŭ���� ����
		
		//
		
		Parent<String> p = new Parent<>(); //�� �ڿ� �����ڸ� ȣ���� ��� ���� ����
		// Parent<String> p = new Parent<String>(); // ���� �� ������ ������ ����������, �캯�� String�� �ߺ����� ������ 
		p.setT("�θ� ���ʸ� Ŭ����");
		System.out.println(p.getT());
		Parent<Integer> il = new Parent();
		il.setT(1);
		System.out.println(il.getT());
		
		//2. �ڽ� Ŭ���� 1
		Child1<String> c1 = new Child1<String>();
		c1.setT("�ڽ�1 ���׸� Ŭ����"); // �θ𿡼� ��ӵǾ ������
		System.out.println(c1.getT());
		
		//2. �ڽ� Ŭ���� 2
		Child2<String, Integer> c2 = new Child2<String, Integer>();
		c2.setT("�ڽ�2 ���׸� Ŭ����");
		c2.setV(122);
		System.out.println(c2.getT() + c2.getV());
		
		
		
		
	// ������ ��
	}
}
