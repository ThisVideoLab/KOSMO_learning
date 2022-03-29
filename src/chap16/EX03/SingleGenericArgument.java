package chap16.EX03;

//Object: ��� ��ü�� ������ �� ������.. �ٿ� ĳ������ �ʿ���. ĳ���v�� ���ܰ� �߻��� �� ����. (���� Ÿ�� üũ
//���׸� Ŭ���� : �ϳ��� Ŭ�������� �پ��� ������ Ÿ���� ó���� �� �ִ�.
	// ���ʸ� Ÿ�� ���� " T(Ÿ��), K(KEY��), V(Value), N(Number, ����), E (Element, ����)
		// A ~ Z�� ���Ƿ� �ִ� �͵� ������.
			// Wrapper Ŭ���� : �⺻ Ÿ���� ��üȭ ���ѳ��� Ŭ����


// �ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�

// ���ʸ� Ÿ�Կ����� �⺻ Ÿ���� �״�� ���� �ȵ�! �̷��� �ٲ� ������� �˾Ƶ� ��

				// int (�⺻Ÿ��) ==> integer (��ü), boolean => Boolean, char => Char
				// double ==> Double, float ==> Float

//�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�


//���ʸ� Ŭ���� : �ϳ��� ���׸� Ÿ�� ������ ���� ������ Ÿ�� ������ �Ű� ������ ������ ��» ó���� �����ϴٴ� ������ ����.
class MyClass<T>{
	private T t;
	public T get() { //getter �ʵ��� ���� �������� ����
		return t;
	}
	public void set(T t) { //setter �ʵ��� ���� �Ҵ���
		this.t = t;
	}
}


public class SingleGenericArgument {
	public static void main(String[] args) {
		
		// ���ʸ� Ŭ���� ��ü ���� <String> �� �Է�
		MyClass<String> mc1 = new MyClass<String>(); 
		mc1.set("�ȳ�from mc1");
		System.out.println(mc1.get());
		
		//2 ���ʸ� Ŭ���� ��ü ���� <Integer > �� �Է�
		MyClass<Integer> mc2 = new MyClass<Integer>(); // Wrapper Ŭ������ �Ҵ��ؾ� �Ѵ�.  
		mc2.set(100);
		System.out.println(mc2.get());
		
		//3. ���׸� Ŭ���� ��ü ������ <interger>�� �Է�
		MyClass<Double> mc3 = new MyClass(); // �������� �ڷ����� ������ ������. 
		mc3.set(333.33);
		System.out.println(mc3.get());
		
		//4. ���� ������ üũ�� (������ �ܰ迡�� ������ �������)
		MyClass<Boolean> mc4 = new MyClass<Boolean> ();
		// mc4.set(sdf); // ���� ���� �������
		System.out.println(mc4.get());
	}

}
