package chap17.EX09;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//Map: key는 중복되지 않아야 함. equals(), hashCode()를 재정의 시켜야 중복을 피할 수 있음.
	// 다만 value는 중복되어도 됨.

//equals(), hascode()를 재정의하지 않는 클래스

class A{
	int data;
	public A(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return data + " " ;
	}
	
}

//equals() 만 재정의함
class B {
	int data;
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { // obj는 Object 타입으로 캐스팅
		if(obj instanceof B){	// obj가 B타입을 내포할 때 true라서 조건문 발동
			if(this.data == ((B) obj).data) { // 이 클래스의 data 필드 == 입력받은 obj의 B타입형 내부의 data 클래스 
				return true;	
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return data + " " ;
	}
}

//equals(), hashCode() 모두 재정의함
class C {
	int data;
	public C(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { // obj는 Object 타입으로 캐스팅
		if(obj instanceof C){
			if(this.data == ((C) obj).data) {
				return true;	
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(data); // 권장하는 방법
	}
	@Override
	public String toString() {
		return data + " " ;
	}
}

public class HashMapMechanism {
	public static void main(String[] args) {
		
		
		//1. 두 메서드 모두 오버리이딩하지 않는 경우
		System.out.println("=====================");
		System.out.println("1. 두 메서드 모두 오버리이딩하지 않는 경우");System.out.println();
		Map<A, String> hashMap1 = new HashMap();
		
		A a1 = new A(3);
		A a2 = new A(3);
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		hashMap1.put(a1,  "첫번째");
		hashMap1.put(a2,  "두번째");
		
		System.out.println(hashMap1.size());
		System.out.println(hashMap1);
		

		//2. equals() 메서드만 오버라이딩
		System.out.println("=====================");
		System.out.println("2. equals() 메서드만 오버라이딩");System.out.println();
		
		Map<B, String> hashMap2 = new HashMap<>();
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2); //false
		System.out.println(b1.equals(b2)); // true
		
		hashMap2.put(b1,  "첫번째");
		hashMap2.put(b2,  "두번째");
		
		System.out.println(hashMap2.size()); // 2
		System.out.println(hashMap2);
		
		//3. equals(), hashCode() 모두 오버라이딩
		System.out.println("=====================");
		System.out.println("3. equals(), hashCode() 모두 오버라이딩");System.out.println();
		
		Map<C, String> hashMap3 = new HashMap<>();
		C c1 = new C(3);
		C c2 = new C(3);
		
		System.out.println(c1 == c2); //false
		System.out.println(c1.equals(c2)); // true
		
		hashMap3.put(c1,  "첫번째");
		hashMap3.put(c2,  "두번째");
		
		System.out.println(hashMap3.size()); // 2
		System.out.println(hashMap3);
		
		
		
	// 문서의끝
	}
}
