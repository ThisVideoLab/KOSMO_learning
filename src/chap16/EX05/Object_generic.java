package chap16.EX05;

class Apple{
	String name;
	int price;

	Apple(String name, int price){ // ������
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {   // ��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ �����
		return "�̸� : " + name + " , ���� : " + price;
	}
}

class Pencil { // ���� Ŭ����
	String name;
	int price;
	Pencil(String name, int price){ // ������
		this.name = name;
		this.price = price;
	}
	public void bcd() {
		
	}
	
	@Override
	public String toString() {  // ��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ �����
		return "�̸� : " + name + " , ���� : " + price;
	}
}

//���ʸ��� ����ؼ� ��ü���� ������ ���� �о����

//���ʸ� Ŭ����

class Goods<T>{
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

class Goods2<T>{
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class Object_generic {
	public static void main(String[] args) {

		Goods<Apple> goods1 = new Goods<Apple>(); // goods1�� apple ������ Ÿ�Դϴ�.
		goods1.setT(new Apple ("���1", 1000));
		System.out.println(goods1.getT()); // ���׸������� �ٿ� ĳ������ �� �ʿ䰡 ���� �׳� �ҷ��� ���� ���� ����.
		
		Goods<Pencil> goods2 = new Goods<Pencil>();
		goods2.setT(new Pencil ("����1", 2000));
		System.out.println(goods2.getT());
		
	// ������ ��
	}
}
