package chap16.EX01;


// Generice1의 문제점 - 상품을 저장할 공간을 매번 생성해줘야 함
// 객체를 담을 클래스를 만드는 경우, 매번 객체를 생성할 때마다 그 객체를 담을 클래스를 만들어줘야 함.
// 객체를 저장할 클래스를 생성해서 객체 정보를 담을 수 있다, 이는 새로운 상품이 추가될 땨ㅐ마다 그 상품을 담을 클래스를 생성해 줘야 한다는 것. 고로 코드가 굉장히 복잡해짐.

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

class Goods2{  // object를 사용해서 모든 상품을 저장할 수 있음
	private Pencil pencil = new Pencil("연필",3000); 
	
	public Pencil getPencil() {
		return pencil;
	}	
	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	
}


public class ProblemsBeforeGeneric {
	public static void main(String[] args) {
		
		//1. Goods1에 상품이 저장되어 있음 -> Apple 객체 추가 및 가져오기
		
		Goods1 goods1 = new Goods1(); // 기본 생성자 호출
		goods1.setApple(new Apple("사과", 1000));
		System.out.println(goods1.getApple());
	
		//2. goods2에 상품이 저장되어 있음 -> Pencil 객체 추가 및 가져오기
		
		Goods2 goods2 = new Goods2(); // 기본 생성자 호출
		goods2.setPencil(new Pencil("연필", 3000));
		System.out.println(goods2.getPencil());
		
	// 문서의 끝
	}

}
