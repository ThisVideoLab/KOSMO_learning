package chap16.EX02;

class Student1{
	String name ; 
	String id; 
	int pass; 
	
	Student1(String name, String id, int pass){
		this.name = name;
		this.id = id;
		this.pass = pass; 
	}
	@Override
	public String toString() {
		return "�̸� : " + name + " , id : " + id + " , pass" + pass ; 
	}
}
class Professor1 {
	String name ; 
	int year ; 
	String email; 
	
	Professor1(String name, int year, String email){
		this.name = name; 
		this.year = year;
		this.email =email;		
	}
	@Override
	public String toString() {
		return  name + "�� " + year + "�����̰� �����ּҴ�  : " + email ;
	}
}
class Tiger1 {
	String name; 
	String run; 
	
	Tiger1(String name, String run) {
		this.name = name ; 
		this.run = run ; 	
	}
	@Override
	public String toString() {
		return  name + " �̴�  " + run; 
	}
}
class Banana1 {
	String name;
	String color;
	int price; 
	Banana1 (String name, String color, int price){
		this.name =name;
		this.color = color;
		this.price = price; 
	}
	@Override
	public String toString() {
		return name + "�� ������ " + color + "�̰� ������ " + price + " �Դϴ�. " ; 
	}
}

class Goods11 <T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	} 
	
}

public class EX_Using_Generic {
	public static void main(String[] args) {
		Goods11<Student1> goods1 = new Goods11();
		goods1.set(new Student1 ("ȫ�浿", "aaaa", 1111));
		System.out.println(goods1.get());
		
		Goods11<Professor1> goods2 = new Goods11();
		goods2.set(new Professor1 ("�豳��", 5, "aaa@aaa.com"));
		System.out.println(goods2.get());
		
		Goods11<Tiger1> goods3 = new Goods11();
		goods3.set(new Tiger1 ("ȣ����", "���沱�� �޸��ϴ�. "));
		System.out.println(goods3.get());
	
		Goods11<Banana1> goods4 = new Goods11();
		goods4.set(new Banana1 ("�ٳ���",  "�����" , 5000));
		System.out.println(goods4.get());	
	}

}
