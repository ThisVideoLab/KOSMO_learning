package chap16.EX02;


//Object 는 모든 객체를 저장할 수 있음.
// 상품을 저장하는 클래스에 Object 타입으로 저장하면, 모든 객체를 담을 수 있게 됨.
// Object의 장점 : 모든 객체를 다 담을 수 있음 (casting으로 왔다 갔다 가능)
//			단점 : 매번 다운 캐스팅을 해줘야하는 번거로움 발생
//				: 약한 타입 체크 : 실행시 ClassCastExcpetion이 발생될 수 있음.
//


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

//1. Apple을 담을 수 있는 클래스 생성.
class Goods1{ // 상품1: 사과 상품을 담은 클래스
	private Apple apple = new Apple("사과", 1000);
	
	public Apple getApple() {
		return apple;
	}	
	public void setApple(Apple apple) {
		this.apple = apple;
	}
	
}


class Pencil { // 연필 클래스
	String name;
	int price;
	Pencil(String name, int price){ // 생성자
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {  // 객체 자체를 출력시 객체의 주소가 아니라 필드의 정보를 출력함
		return "이름 : " + name + " , 가격 : " + price;
		
	}
}

class Goods{  // object를 사용해서 모든 상품을 저장할 수 있음
	private Object object = new Object();
	
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) { // object 타입으로 업캐스팅됨.
		this.object = object; 
	}
}


public class Using_Object {
	public static void main(String[] args) {
		
		//1. Apple을 저장 후 출력. Object
		Goods goods1 = new Goods(); 
		goods1.setObject(new Apple("사과3",4000)); // seeter로 값 할당.
		System.out.println((Apple) goods1.getObject()); // getter로 객체를 출력 // Object에서 Apple로 다운캐스팅 실시함.

		//2. Pencil을 저장후 출력.Object
		Goods goods2 = new Goods(); 
		goods2.setObject(new Pencil("연필3",8000)); // seeter로 값 할당.
		System.out.println((Pencil) goods2.getObject()); // getter로 객체를 출력 // Object에서 Pencil로 다운캐스팅 실시함.
		
		
		//3. 잘못된 캐스팅을 할 수 있다 (약한 타입 체크) : Object의 문제점.
		Goods goods4 = new Goods(); 
		goods4.setObject(new Apple("사과4",4000)); // seeter로 값 할당.
		System.out.println((Apple) goods4.getObject()); // getter로 객체를 출력 // Object에서 Apple로 다운캐스팅 실시함.
		
		
		
		
	// 문서의 끝
	}

}
