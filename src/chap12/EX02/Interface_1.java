package chap12.EX02;

//1. 인터 페이스 (interface)란 : 외부와 내부를 연결시켜주는 접점... 콘센트 (외부전기장치 >> 콘센트 << 전기 )처럼 작동함.
//2. 리모컨 (사람, TV), API등을 상호 작용할 수 있도록 연결해줌.
//3. 인터페이스의 모든 필드는 반드시 public static field를 생략된 체로 들고 있음.
//4. 또한 인터페이스의 모든 메서드는 public abstract 생략 (1.8 버전 이후 적용)된 체로 들고 있음. 다만 default 메서드는 제외됨.

interface A{
	public static final int A = 3; //5. Interface 필드의 정식 표현 (다 날려도 생략된 체로 달려 있긴 함)
	public abstract void abc(); // 6. Interface 메서드의 정식 표현. 추상 메서드란 점에 주의할 것 (다 날려도 생략된 체로 달려 있긴 함) 
}
interface B{ //7. 생략된 형태로 적어도 a와 같이 생략된체로 달려있음.
	int A = 3;
	void abc();
}
class C {
	// void abc(); //8. Interface 키 빼고 적으면 같은 문구라도 오류 뿜뿜 
}

abstract class D{ // 9. 추상 클래스 abstract 는 생략이 불가능함. 오류 생김.
	abstract void abc();
}

public class Interface_1 {

	public static void main(String[] args) {
		
		//10. 인터페이스는 객체 생성 불가능. 추상 메서드, 즉 구현되지 않은 메소드를 포함하기 때문임.
		//11. 인터페이스의 static 필드의 내용을 출력함. 
		
		System.out.println(A.A); // interface A를 바로 출력함. 이것이 static의 위력. 대소문자를 구분하지 않는 것도 알아두자.
	    System.out.println(B.A); // 마찬가지로 생략된 static이 작동해 바로 불러와짐. 
	    
	    //12. final 태그로 인해 값을 수정 불가능함.
	    
	    // A.A =5; // 13. 바꾸려면 오류남
	    // B.A =6; // 14. 마찬가지로 final이 작용해서 오류 뿜뿜 
	    

	}

}
