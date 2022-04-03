package chap16.EX11;

// 제너릭 클래스의 상속 : 자식 클래스는 부모 클래스의 제너릭 변수 (K,V,T,E)와 같거나 더 많아야 함.
// 

class Parent<T>{
	T t; // default
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}
class Child1 <T> extends Parent<T>{
	
}
class Child2 <T, V> extends Parent<T>{
	V v;

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}
	
}


public class InheritanceGenericClass {
	public static void main(String[] args) {

		//1. 부모 제네릭 클래스 생성
		
		//
		
		Parent<String> p = new Parent<>(); //앞 뒤에 생성자를 호출할 경우 생략 가능
		// Parent<String> p = new Parent<String>(); // 원래 윗 문장의 완전한 형태이지만, 우변의 String이 중복으로 생략됨 
		p.setT("부모 제너릭 클래스");
		System.out.println(p.getT());
		Parent<Integer> il = new Parent();
		il.setT(1);
		System.out.println(il.getT());
		
		//2. 자식 클래스 1
		Child1<String> c1 = new Child1<String>();
		c1.setT("자식1 제네릭 클래스"); // 부모에서 상속되어서 내려옴
		System.out.println(c1.getT());
		
		//2. 자식 클래스 2
		Child2<String, Integer> c2 = new Child2<String, Integer>();
		c2.setT("자식2 제네릭 클래스");
		c2.setV(122);
		System.out.println(c2.getT() + c2.getV());
		
		
		
		
	// 문서의 끝
	}
}
