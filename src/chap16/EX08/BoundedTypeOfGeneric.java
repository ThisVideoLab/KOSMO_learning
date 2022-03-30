package chap16.EX08;

class A{}
class B extends A{}
class C extends B{}

// ���׸� Ÿ���� Ŭ���� : ���׸� Ÿ���� ������ ��ü�� ������.

class D <T extends B>{
	private T t;
	
	public T get() {
		return t;
	}


	public void set(T t) {
		this.t = t;
	}
}

public class BoundedTypeOfGeneric {
	public static void main(String[] args) {

	//D<A> d1 = new D<A>(); // �Ұ���: <T>�� �� ��ü�� ������ ��. B class, C class�� Ÿ�� ���� ����
	D<B> d2 = new D<B>(); // B, C Ÿ������ ���� ����
	D<C> d3 = new D<C>(); // C Ÿ�Ը� ���� ����
	
	D d4 = new D(); //�̷��� Ÿ���� �������� �ʰ� ����� D(B) D(C)�� �ü��� ����.
		
	d2.set(new B()); // B ��ü ����. // ����
	d2.set(new C()); // ��Ӱ���
	//d2.set(new A()); // ���� �ٷ� �߻��� // A�� �� �� ���� ������
	
	//d3���� C Ÿ�Ը� ���� �� �ִ�. �ڽĵ� �����ϱ� �ϳ� C���� ���� �ڽ��� ����
	// d3.set(new A()); // �ٷ� ���� ����
	// d3.set(new B()); // �ٷ� ���� ��
	d3.set(new C());
	
	//d4���� D�� �� �ڽĵ鸸 �� �� �ִ�.
	// d4.set(new A()); // ���� �߻�
	d4.set(new B()); // ��Ӱ���
	d4.set(new C()); // ��Ӱ���
	
	// ������ ��
	}
}

