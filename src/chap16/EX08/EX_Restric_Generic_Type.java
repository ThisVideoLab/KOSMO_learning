package chap16.EX08;

// ���ʸ� Ŭ������ �����ؼ�, Ÿ�� ���� (���Ϸ�) �ҽ��� ���� ������ �� ������ ������.
abstract class Fruit{
	public abstract void print();
}

class edible<T extends Fruit>{ // ���� �� �ִ� ���׸� �޼��� // DTO, VO 
							   // DTO (Data Tranfer Object) - getter, setter,
							   // VO (Value Object) -getter
							   // �����͸� �޾Ƽ� �����ϴ� �߰��� ������ ��.
							   // �������� ���� �޾Ƽ� ����, �߰��� ����
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

class inedible<T>{ // ���� �� ���� ���׸� �޼���
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}



class Strawberry extends Fruit{ // ���� ���
	String name;
	int price;
	Strawberry (String name, int price){
		this.name = name;
		this.price = price;
	}
	public void print() {};
	@Override
	public String toString() {
		return name + "�� ������ " + price + "�޷��Դϴ�.";
	}
}
class Bananan extends Fruit{ // ���� ���
	String name;
	int price;
	Bananan (String name, int price){
		this.name = name;
		this.price = price;
	}
	public void print() {};
	@Override
	public String toString() {
		return name + "�� ������ " + price + "�޷��Դϴ�.";
	}
}
class Apple extends Fruit{ // ���� ���
	String name;
	int price;
	Apple (String name, int price){
		this.name = name;
		this.price = price;
	}
	public void print() {};
	@Override
	public String toString() {
		return name + "�� ������ " + price + "�޷��Դϴ�.";
	}
}

class Pencil { // ��Ӿ���
	String name;
	int price;
	Pencil(String name, int price){ 
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {  
		return name + "�� ������ " + price + "�޷��Դϴ�.";
	}
}
public class EX_Restric_Generic_Type {
	public static void main(String[] args) {
		edible<Apple> e1 = new edible<Apple>();
		edible<Strawberry> e2 = new edible<Strawberry>();
		edible<Bananan> e3 = new edible<Bananan>();
		//edible<Pencil> e4 = new edible<Pencil>(); // ���� �߻�
		
		e1.setT(new Apple ("apple",1000));
		e2.setT(new Strawberry("strawberry",2000));
		e3.setT(new Bananan ("banana",3000));
		System.out.println(e1.getT());
		System.out.println(e2.getT());
		System.out.println(e3.getT());
		
		
		System.out.println("===================");
		inedible<Pencil> e4 = new inedible<Pencil>();
		e4.toString();
		e4.setT(new Pencil("pencil",10000));
		System.out.println(e4.getT());
		
		
		
		
		// ������ ��
	}
}
