package chap16.EX02;


//Object �� ��� ��ü�� ������ �� ����.
// ��ǰ�� �����ϴ� Ŭ������ Object Ÿ������ �����ϸ�, ��� ��ü�� ���� �� �ְ� ��.
// Object�� ���� : ��� ��ü�� �� ���� �� ���� (casting���� �Դ� ���� ����)
//			���� : �Ź� �ٿ� ĳ������ ������ϴ� ���ŷο� �߻�
//				: ���� Ÿ�� üũ : ����� ClassCastExcpetion�� �߻��� �� ����.
//


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

//1. Apple�� ���� �� �ִ� Ŭ���� ����.
class Goods1{ // ��ǰ1: ��� ��ǰ�� ���� Ŭ����
	private Apple apple = new Apple("���", 1000);
	
	public Apple getApple() {
		return apple;
	}	
	public void setApple(Apple apple) {
		this.apple = apple;
	}
	
}


class Pencil { // ���� Ŭ����
	String name;
	int price;
	Pencil(String name, int price){ // ������
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {  // ��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ �����
		return "�̸� : " + name + " , ���� : " + price;
		
	}
}

class Goods{  // object�� ����ؼ� ��� ��ǰ�� ������ �� ����
	private Object object = new Object();
	
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) { // object Ÿ������ ��ĳ���õ�.
		this.object = object; 
	}
}


public class Using_Object {
	public static void main(String[] args) {
		
		//1. Apple�� ���� �� ���. Object
		Goods goods1 = new Goods(); 
		goods1.setObject(new Apple("���3",4000)); // seeter�� �� �Ҵ�.
		System.out.println((Apple) goods1.getObject()); // getter�� ��ü�� ��� // Object���� Apple�� �ٿ�ĳ���� �ǽ���.

		//2. Pencil�� ������ ���.Object
		Goods goods2 = new Goods(); 
		goods2.setObject(new Pencil("����3",8000)); // seeter�� �� �Ҵ�.
		System.out.println((Pencil) goods2.getObject()); // getter�� ��ü�� ��� // Object���� Pencil�� �ٿ�ĳ���� �ǽ���.
		
		
		//3. �߸��� ĳ������ �� �� �ִ� (���� Ÿ�� üũ) : Object�� ������.
		Goods goods4 = new Goods(); 
		goods4.setObject(new Apple("���4",4000)); // seeter�� �� �Ҵ�.
		System.out.println((Apple) goods4.getObject()); // getter�� ��ü�� ��� // Object���� Apple�� �ٿ�ĳ���� �ǽ���.
		
		
		
		
	// ������ ��
	}

}
