package chap10.EX03;

//instanceof : 객체 내부의 캐스팅이 가능여부를 알 수 있도록 하는 키워드
	// 업캐스팅한 객체 내부에 어떤 타입이 존재하는지 True / false로 리턴해줌
	// 다운 캐스팅시 런타임 오류가 발생될 수 있다. 런타임 오류를 방지시켜 준다
	// 다운 캐스팅시 해당 타입이 객체에 존재할 때 다운 캐스팅을 하도록 설정

class A{
	int m;
	void a() { //
		System.out.println(m);
	}
}

class B extends A{
	int n;
	void b(){
		System.out.println("n의 값을 출력합니다 :" + n);
	}
}

public class InstaceOf {

	public static void main(String[] args) {
		
		//1. insteadof
		
		A aa = new A(); // aa는 A 타입만 가진다.
		A ab = new B(); // ab는 부모 A를 상속받은 B형식이므로, A와 B의 모든 필드와 메서드를 사용한다.
		
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);
		System.out.println(aa instanceof B);
		
		if (aa instanceof B) { // 객체 aa에 b 타입(클래스)가 포함되어 있을 경우에만 캐스팅 함.
			B b = (B)aa;
			System.out.println("객체 aa를 B타입으로 캐스팅했습니다");
		}else {
			System.out.println("aa는 B타입으로 캐스팅이 불가능합니다");
		}
		if (ab instanceof B) {
			B b = (B)ab; // 이렇게 구문만 보면 정상적이라서, 이클립스에서는 오류를 발견못해도 막상 돌려보면
						// 런타임 오류가 나는 경우가 있음. 이럴 때 인스턴스오브를 써서 판별함.
			System.out.println("ab를 B타입으로 캐스팅했습니다");
		}else {
			System.out.println("ab는 B타입으로 캐스팅 불가능");
		}
		
		if("안녕" instanceof String) { // 객체의 데이터 타입을 확인함
			System.out.println("\"안녕\"은 String 클래스입니다.");	
		}else {
			System.out.println("\"안녕\"은 String 클래스가 아닙니다");
		}
		
	// 문서의 끝
	}
}

