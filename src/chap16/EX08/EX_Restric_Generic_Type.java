package chap16.EX08;

// 제너릭 클래스를 생성해서, 타입 제한 (과일류) 팬슬을 따로 접근할 수 없도록 설정함.

abstract class Fruit{ // 상속한 클래스만 접급할 수 있도록 해주는 카테고리 역할을 수행함.
}

class edible<T extends Fruit>{ // 먹을 수 있는 제네릭 메서드 // DTO역할을 담당함.
// DTO (Data Tranfer Object) - 계층 간 데이터 교환을 하기 위해 사용하는 객체로, 로직을 가지지 않는 순수한 데이터 객체(getter & setter 만 가진 클래스)
//							   데이터를 받아서 전송하는 중간자 역할을 함. 굳이 따지자면 값을 받아서 저장했다가 제공하는 일종의 저장고의 기능과도 같음.	
// 좀 더 알아보기	
// VO (Value Object) -getter - 값 오브젝트로써 값을 읽는데만 쓰는 read-Only 특징(사용하는 도중에 변경 불가능하며 오직 읽기만 가능). 즉 setter만 있다는 뜻.
//                             그래서 DTO는 가변적 성격, VO는 불변적 성격을 가졌다고 표현하기도 함.
							   
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
