package chap16.EX07;

/*
/ 제너릭 메소드 :
 자바에서 제공하는 다양한 종류의 클래스와 인터페이스를, 보다 쉽게 쓰기 위해 고안된 새로운 문법 요소.
 가장 최근에 등장한 문법 요소 중 하나로써, 기존 오버로딩에 있어서 다양한 타입의 입력매개변수를 가지는
 오버로딩을 수행하기 위해서는 입력  매개변수 타입의 수만큼설정해줘야 하는 번거로움을 해결한 방법임.
 
 클래스 내부에서 사용할 데이터의 타입을 외부에서 지정하는 기법을 의미함. 먼저 클래스의 매개변수 타입을
 와일드 카드로 지정해놓고, 나중에 객체를 생성할 때 이 와일드 카드에 오는 매개변수 타입을 설정해서
 해당 인스턴스에서 사용하는 것.



 */             
 

class Genericmethod1{ // 일반 클래스를 생성하고
	public <T> T method1 (T t) { // 제너릭 메서드 1개를 지정해줌. 매개변수는 와일드카드 T로 지정함. 
		return t;
	}
	
	public <T> boolean method2 (T t1, T t2) { // 제너릭 메서드 1개 지정. 왜? 와일드 카드가 한종류니까.
		return t1.equals(t2); 				// 두값을 비교 true, false 리턴			       
	}										// 기본 자료형일때는 값을 비교, 참조 자료형일때는 객체의 주소를 비교
											// String일때는 값을 비교함. Integer, Double equals가 재정의 되어있다.
	
	public <K,V> void method3 (K k, V v) { // 제너릭 메서드 : 2개. 와일드 카드가 2종류인 것이 보인다.
		System.out.println(k + " : " + v); 
	}
	public <K,V> void method4() {
		System.out.println("매개변수가 인풋값이 없는 경우에는 생략이 불가능함. 오류 발생!");
	}
}

public class GenericMethod {
	public static void main(String[] args) {

		//1. 일반 클래스 객체를 생성 후 제너릭 메소드 호출
		Genericmethod1 gm1 = new Genericmethod1(); // 새로운 인스턴스를 생성해 줌.
		
		String str1 = gm1.<String>method1("안녕"); // 코드의 원형. 와일드카드 T 자리의 매개변수 타입을 String으로 지정함.
		String str2= gm1.method1("안녕"); // 코드의 축약형. 타입을 앞에서 밝혔기 때문에 ("안녕") 앞에 올 <String>이라는 제너릭 타입의 생략이 가능함. 
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("=========================");
		Integer i1 = gm1.<Integer>method1(100); // 코드의 원형. 와일드카드 .T 자리에 매개변수 타입을 Integer로 지정함.
		Integer i2 = gm1.method1(200); // 마찬가지로 타입을 알 수있는 경우에는 매개변수 앞에 오는 저네릭 타입을 생략 가능함.
		System.out.println(i1);
		System.out.println(i2);
		
		// 이처럼 하나의 메소드를 기반으로, 선언 과정에서 개매변수 타입을 달리해 여러 자료형을 입력받을 수 있음.
		
		System.out.println("=========================");
		Boolean b1 = gm1.<Boolean>method1(true);
		Boolean b2 = gm1.method1(false); // 마찬가지로 타입을 알 수있는 경우에는 매개변수 앞에 오는 저네릭 타입을 생략 가능함.
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println("=========================");
		Boolean d1 = gm1.<Double>method2(2.55, 2.55); // 리턴받을 타입이 Boolean
		Boolean d2 = gm1.<Double>method2(2.55, 2.45); // 리턴받을 타입이 Boolean
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("=========================");
		gm1.<String,Integer>method3("국어",90);
		gm1.<String,Integer>method3("영어",80); // 매개변수로 인풋되는 데이터 타입을 저장할 수 있는 경우 생략 가능 
		
		gm1.<Integer,String>method3(404,"당신의 홈페이지는 터지고 말았다.");
		gm1.method3(402,"파일을 찾을 수 없습니다");
	
	// 문서의 끝
	}
}
