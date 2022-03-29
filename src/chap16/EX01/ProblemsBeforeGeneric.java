package chap16.EX01;


// Generice1�� ������ - ��ǰ�� ������ ������ �Ź� ��������� ��
// ��ü�� ���� Ŭ������ ����� ���, �Ź� ��ü�� ������ ������ �� ��ü�� ���� Ŭ������ �������� ��.
// ��ü�� ������ Ŭ������ �����ؼ� ��ü ������ ���� �� �ִ�, �̴� ���ο� ��ǰ�� �߰��� �x������ �� ��ǰ�� ���� Ŭ������ ������ ��� �Ѵٴ� ��. ��� �ڵ尡 ������ ��������.

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

class Goods2{  // object�� ����ؼ� ��� ��ǰ�� ������ �� ����
	private Pencil pencil = new Pencil("����",3000); 
	
	public Pencil getPencil() {
		return pencil;
	}	
	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	
}


public class ProblemsBeforeGeneric {
	public static void main(String[] args) {
		
		//1. Goods1�� ��ǰ�� ����Ǿ� ���� -> Apple ��ü �߰� �� ��������
		
		Goods1 goods1 = new Goods1(); // �⺻ ������ ȣ��
		goods1.setApple(new Apple("���", 1000));
		System.out.println(goods1.getApple());
	
		//2. goods2�� ��ǰ�� ����Ǿ� ���� -> Pencil ��ü �߰� �� ��������
		
		Goods2 goods2 = new Goods2(); // �⺻ ������ ȣ��
		goods2.setPencil(new Pencil("����", 3000));
		System.out.println(goods2.getPencil());
		
	// ������ ��
	}

}
