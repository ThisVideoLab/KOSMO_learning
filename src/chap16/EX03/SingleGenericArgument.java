package chap16.EX03;

//Object: 모든 객체를 저장할 수 있지만.. 다운 캐스팅이 필요함. 캐스틍시 예외가 발생될 수 있음. (약한 타입 체크
//제네릭 클래스 : 하나의 클래스에서 다양한 데이터 타입을 처리할 수 있다.
	// 제너릴 타입 변수 " T(타입), K(KEY값), V(Value), N(Number, 숫자), E (Element, 원소)
		// A ~ Z를 임의로 넣는 것도 가능함.
			// Wrapper 클래스 : 기본 타입을 객체화 시켜놓은 클래스


// ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆

// 제너릭 타입에서는 기본 타입을 그대로 쓰면 안됨! 이렇게 바꿔 써야함을 알아둘 것

				// int (기본타입) ==> integer (객체), boolean => Boolean, char => Char
				// double ==> Double, float ==> Float

//★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆


//제너릭 클래스 : 하나의 제네릭 타입 변수에 여러 데이터 타입 변수를 매개 변수로 던져서 몽쨩 처리가 가능하다는 장점이 있음.
class MyClass<T>{
	private T t;
	public T get() { //getter 필드의 값을 가져오는 구문
		return t;
	}
	public void set(T t) { //setter 필드의 값을 할당함
		this.t = t;
	}
}


public class SingleGenericArgument {
	public static void main(String[] args) {
		
		// 제너릭 클래스 객체 생성 <String> 을 입력
		MyClass<String> mc1 = new MyClass<String>(); 
		mc1.set("안녕from mc1");
		System.out.println(mc1.get());
		
		//2 제너릭 클래스 객체 생성 <Integer > 을 입력
		MyClass<Integer> mc2 = new MyClass<Integer>(); // Wrapper 클래스를 할당해야 한다.  
		mc2.set(100);
		System.out.println(mc2.get());
		
		//3. 제네릭 클래스 객체 생성해 <interger>를 입력
		MyClass<Double> mc3 = new MyClass(); // 생성자의 자료형은 생략이 가능함. 
		mc3.set(333.33);
		System.out.println(mc3.get());
		
		//4. 강한 오류를 체크함 (컴파일 단계에서 오류를 출력해줌)
		MyClass<Boolean> mc4 = new MyClass<Boolean> ();
		// mc4.set(sdf); // 강한 오류 출력해줌
		System.out.println(mc4.get());
	}

}
