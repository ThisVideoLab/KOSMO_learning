package chap17.EX06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//1. Set: 중복된 값을 넣을 수 없다.
	// equals () 메서드, hashCode() 메서드가 정의되어 있어야 하나, 안되어 있는 상태가 기본값임.
	// String, Integer 와 같은 클래스들은 equals() 메서드와 hashCode() 메서드가 이미 재정의 되어있는것과는 대조됨.
	// 특정 객체를 set에 저장할 경우에 중복 저장을 막으려면 equals()와 hashCode() 메서드를 재정의해야 함.
	// Object 클래스(모든 클래스의 부모격)의 equals()와 hashCode()에 존재함. 
		//object 클래스의 equals() 메소드는 ==과 같은 기능을 함.


class A{ //2. 당장은 equals()와 hashCode()가 재정의되지 않은 상태
	int data;  
	public A(int data) {
		this.data = data;
	}
}

//11. equals()만 재정의의한 상태

class B{
	int data; // 14. 비교하는 두 객체의 data 필드 값이 같을때, 동일하라고 식별자를 넣어줘야 한다.
		      //     그 식별자 2개는 equals()와 hashCode() 식별자임.
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { //12. 객체의 주소를 비교하는 것이 기본 설정임. 이것을 객체 내부의 특정 필드값을 비교하도록 설정해줘야 함.
		
		if (obj instanceof B) {
			if(this.data == ((B)obj).data) //13. 주의점: 잘못 다운캐스팅을 할 경우, Exception이 발생할 수 있음. 
										   //14. equals의 통해서 필드를 비교하도록 재정의함. 
			return true;	
		}
		return false;
	}
}
class C{
	int data; // 14. 비교하는 두 객체의 data 필드 값이 같을때, 동일하라고 식별자를 넣어줘야 한다.
		      //     그 식별자 2개는 equals()와 hashCode() 식별자임.
	public C(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { //12. 객체의 주소를 비교하는 것이 기본 설정임. 이것을 객체 내부의 특정 필드값을 비교하도록 설정해줘야 함.
		
		if (obj instanceof C) {
			if(this.data == ((C)obj).data) //13. 주의점: 잘못 다운캐스팅을 할 경우, Exception이 발생할 수 있음. 
										   //14. equals의 통해서 필드를 비교하도록 재정의함. 
			return true;	
		}
		return false;
	}
	@Override
	public int hashCode() { // Obhects.hash(필드명,필드명,필드명)과 같은 형태로 다중 해쉬코드 지정이 가능함.
		//return Objects.hash(data); 
		return data; // 위에 주석 처리한거랑 편한대로 챙겨쓰면 됨.
	}
}

public class HashSetMachanism {
	public static void main(String[] args) {
		
		//3. equals()와 hashCode() 메서드가 재정의되지 않은 상태로 출력해보기
		System.out.println("=====================");
		System.out.println("1. equals()와 hashCode() 메서드가 재정의되지 않은 상태");System.out.println();
		
		Set<A> hashset1 = new HashSet();
		A a1 = new A(3);
		A a2 = new A(3); 
		System.out.println(a1 == a2 ); //4. false가 출력됨. == 연산자는 stack 메모리의 값을 비교함.
		
		System.out.println(a1); //5. 객체명을 출력하면 패키지명.클래스명@ 해쉬코드(16진수)가 출력됨.
		System.out.println(a2); //6. a1과 a2의 해쉬코드가 상이함을 알 수 있음.
		
		System.out.println(a1.equals(a2)); //7. false, Object equals()는 ==과 같다.
		System.out.println(a1.hashCode() + " , " + a2.hashCode()); //8. 10진수로 표현함.
		
		hashset1.add(a1);
		hashset1.add(a2);
		System.out.println(hashset1.size()); //9. set<E>는 중복을 허용하지 않는데 2가 출력됨. 고로 a1과 a2는 다른 객체임이 밝혀짐.
											 //10. 이는 equals()와 hashCode() 메서드가 재정의되어 있지 않아서 벌어지는 일.
		
		//15. equals()만 재정의 된 상태로 출력해보기 : 객체의 data 필드의 값을 비교함. hashCode()는 재정의되지 아니함.
		System.out.println("=====================");
		System.out.println("15. equals()만 재정의 된 상태로 출력해보기");System.out.println();
		Set<B> hashSet2 = new HashSet();
		
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2); //16. stack 메모리의 값을 비교함 // 주소값 비교이기 때문에 false 출력
		System.out.println(b1.equals(b2)); //17. 의도대로 data 필드값만을 비교해 true가 출력됨.
		
		hashSet2.add(b1);
		hashSet2.add(b2);
		
		System.out.println(hashSet2.size()); //18. 여전히 2개로 출력됨. 즉 서로 다른 객체라고 인식한다는 것.
											 //19. 이는 hachCode()를 재정의하지 않아서 그런 것임
		System.out.println(b1.hashCode() + " , " + b2.hashCode());
		
		//20. equals()d와 hashCode() 모두 재정의 후 출력;
		System.out.println("=====================");
		System.out.println("20. equals()d와 hashCode() 모두 재정의 후 출력");System.out.println();
		
		Set<C> hashSet3 = new HashSet<>();
		C c1 =new C(3);
		C c2 =new C(3);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode() + " , " + c2.hashCode()); // data 필드를 기준으로 네이버 지수 올라가여
		
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size()); //21. 드디어 1이 출력됨. 드디어 둘이 중복이라고 1개는 생략하는 단계까지 옴
											 //data 필드에 대해 equals(), hashCode() 모두 재정의 시켜줌 
		
		
	// 문서의 끝
	}
}
