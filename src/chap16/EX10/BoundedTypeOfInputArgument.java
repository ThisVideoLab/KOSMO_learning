package chap16.EX10;

//제너릭 메서드에서 매개변수에서 값의 제한


class A {}
class B extends A{}
class C extends B{}
class D extends C{}
	
class Goods<T>{
	private T t;

	public T get(){
		return t;
	}
	
	public void set(T t) {
		this.t =t;
	}
}

class Test{ // 일반 메서드 (앞에 인풋으로 받는 타입이 없음) 매개변수로 ☆들어오는 타입☆이 제너릭 타입.
	void method1 (Goods <A>g){} // g를 매개변수로 A 클래스 타입만을 전송함.
	void method2 (Goods <?>g){}  // g의 매개변수로 A,B,C,D, 클래스 타입만 전송 // ? 를 던져주면 아무거나 다 들어간다는 뜻임
	void method3 (Goods <? extends B>g){} //g의 매개변수로 BCD 클래스 타입만 전송
	void method4 (Goods <? super B>g){}   // g의 매개변수로 AB 클래스 타입만 전송
}
	

public class BoundedTypeOfInputArgument {
	public static void main(String[] args) {
		
		Test t = new Test();
		
		//1. method1 (Goods <A>g)
		t.method1(new Goods<A>()); // 정상작동
		//t.method1(new Goods<B>());  // 오류 발생
		//t.method1(new Goods<C>()); // 오류 발생
		//t.method1(new Goods<D>()); //오류 발생
		
		//2. method2 (Goods <?>g)
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		//3. method3 (Goods <? extends B>g)
		// t.method3(new Goods<A>()); 오류 발생
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		//4. method3 (Goods <? super B>g)
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
		//t.method4(new Goods<C>()); // 오류 발생
		//t.method4(new Goods<D>()); // 오류 발생
		
		
	// 문서의 끝
	}
}
