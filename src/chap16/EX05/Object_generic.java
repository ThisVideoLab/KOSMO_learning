package chap16.EX05;

class Apple{
	String name;
	int price;

	Apple(String name, int price){ // 생성자
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {   // 객체 자체를 출력시 객체의 주소가 아니라 필드의 정보를 출력함
		return "이름 : " + name + " , 가격 : " + price;
	}
}

class Pencil { // 연필 클래스
	String name;
	int price;
	Pencil(String name, int price){ // 생성자
		this.name = name;
		this.price = price;
	}
	public void bcd() {
		
	}
	
	@Override
	public String toString() {  // 객체 자체를 출력시 객체의 주소가 아니라 필드의 정보를 출력함
		return "이름 : " + name + " , 가격 : " + price;
	}
}

//제너릭을 사용해서 객체를ㄹ 저장후 값을 읽어오기

//제너릭 클래스

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

		Goods<Apple> goods1 = new Goods<Apple>(); // goods1는 apple 데이터 타입니다.
		goods1.setT(new Apple ("사과1", 1000));
		System.out.println(goods1.getT()); // 제네릭에서는 다운 캐스팅을 할 필요가 없이 그냥 불러다 쓰는 것이 가능.
		
		Goods<Pencil> goods2 = new Goods<Pencil>();
		goods2.setT(new Pencil ("볼펜1", 2000));
		System.out.println(goods2.getT());
		
	// 문서의 끝
	}
}
