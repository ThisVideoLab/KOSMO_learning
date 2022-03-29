package chap16.EX07;

// 제너릭 메소드 : 클래스를 선언할 때 타입 변수는 선언 <T>와 같이 정의함. 그 후 객체를 생성시 T에 적용할 타입을 지정함.
// 제너릭 메소드 : 일반 클래스 배부의 메서드 선언시 제너릭 타입 변수를 사용함.
//             

class Genericmethod1{ // 일반 클래스
	public <T> T method1 (T t) { // 제너릭 메서드 1개
		return t;
	}
	
	public <T> boolean method2 (T t1, T t2) { // 제너릭 메서드 1개
		return t1.equals(t2); 				// 두값을 비교 true, false 리턴			       
	}										// 기본 자료형일때는 값을 비교, 참조 자료형일때는 객체의 주소를 비교
											// String일때는 값을 비교함. Integer, Double equals가 재정의 되어있다.
	
	public <K,V> void method3 (K k, V v) { // 제너릭 메서드 : 2개
		System.out.println(k + " : " + v); 
	}
	public <K,V> void method4() {
		System.out.println("매개변수가 인풋값이 없는 경우에는 생략이 불가능함. 오류 발생!");
	}
}

public class GenericMethod {
	public static void main(String[] args) {

		//1. 일반 클래스 객체를 생성 후 제너릭 메소드 호출
		Genericmethod1 gm1 = new Genericmethod1();
		
		String str1 = gm1.<String>method1("안녕");
		String str2= gm1.method1("안녕"); // 타입을 알 수 있는 경우에는 ("안녕") 앞에 올 <String>이라는 제너릭 타입의 생략이 가능함. 
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("=========================");
		Integer i1 = gm1.<Integer>method1(100);
		Integer i2 = gm1.method1(200); // 마찬가지로 타입을 알 수있는 경우에는 매개변수 앞에 오는 저네릭 타입을 생략 가능함.
		System.out.println(i1);
		System.out.println(i2);
		
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
