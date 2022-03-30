package chap16.EX08;

class A{}
class B extends A{}
class C extends B{}

// 제네릭 타입의 클래스 : 제네릭 타입의 들어오는 객체를 제한함.

class D <T extends B>{
	private T t;
	
	public T get() {
		return t;
	}


	public void set(T t) {
		this.t = t;
	}
}

public class BoundedTypeOfGeneric {
	public static void main(String[] args) {

	//D<A> d1 = new D<A>(); // 불가능: <T>에 들어갈 객체에 제한을 둠. B class, C class만 타입 지정 가능
	D<B> d2 = new D<B>(); // B, C 타입으로 설정 가능
	D<C> d3 = new D<C>(); // C 타입만 설정 가능
	
	D d4 = new D(); //이렇게 타입을 지정하지 않고 만들면 D(B) D(C)도 올수가 있음.
		
	d2.set(new B()); // B 객체 저장. // 본인
	d2.set(new C()); // 상속관계
	//d2.set(new A()); // 오류 바로 발생함 // A는 들어갈 수 없기 때문에
	
	//d3에는 C 타입만 넣을 수 있다. 자식도 가능하긴 하나 C에겐 현재 자식이 없음
	// d3.set(new A()); // 바로 오류 뱉음
	// d3.set(new B()); // 바로 오류 뱉어냄
	d3.set(new C());
	
	//d4에는 D와 그 자식들만 들어갈 수 있다.
	// d4.set(new A()); // 오류 발생
	d4.set(new B()); // 상속관계
	d4.set(new C()); // 상속관계
	
	// 문서의 끝
	}
}

