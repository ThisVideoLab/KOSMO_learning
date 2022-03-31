package chap16.EX08;

// 제너릭 클래스를 생성해서, 타입 제한 (과일류) 팬슬을 따로 접근할 수 없도록 설정함.
abstract class Fruit{
	public abstract void print();
}

class edible<T extends Fruit>{ // 먹을 수 있는 제네릭 메서드 // DTO, VO 
							   // DTO (Data Tranfer Object) - getter, setter,
							   // VO (Value Object) -getter
							   // 데이터를 받아서 전송하는 중간자 역할을 함.
							   // 계층간에 값을 받아서 전송, 중간자 역할
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

class inedible<T>{ // 먹을 수 없는 제네릭 메서드
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}



class Strawberry extends Fruit{ // 과일 상속
	String name;
	int price;
	Strawberry (String name, int price){
		this.name = name;
		this.price = price;
	}
	public void print() {};
	@Override
	public String toString() {
		return name + "의 가격은 " + price + "달러입니다.";
	}
}
class Bananan extends Fruit{ // 과일 상속
	String name;
	int price;
	Bananan (String name, int price){
		this.name = name;
		this.price = price;
	}
	public void print() {};
	@Override
	public String toString() {
		return name + "의 가격은 " + price + "달러입니다.";
	}
}
class Apple extends Fruit{ // 과일 상속
	String name;
	int price;
	Apple (String name, int price){
		this.name = name;
		this.price = price;
	}
	public void print() {};
	@Override
	public String toString() {
		return name + "의 가격은 " + price + "달러입니다.";
	}
}

class Pencil { // 상속없음
	String name;
	int price;
	Pencil(String name, int price){ 
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {  
		return name + "의 가격은 " + price + "달러입니다.";
	}
}
public class EX_Restric_Generic_Type {
	public static void main(String[] args) {
		edible<Apple> e1 = new edible<Apple>();
		edible<Strawberry> e2 = new edible<Strawberry>();
		edible<Bananan> e3 = new edible<Bananan>();
		//edible<Pencil> e4 = new edible<Pencil>(); // 오류 발생
		
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
		
		
		
		
		// 문서의 끝
	}
}
