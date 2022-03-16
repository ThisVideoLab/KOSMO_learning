package chap10.EX06;

class AAAA {
	AAAA(){
		this(3); // 자기 자신의 생성자를 부르는 메서드. 반드시 첫 라인에 위치해야 함. 요거 먼저 불러오니까 아래 int a 값 출력
		System.out.println("AAAA 기본 생성자"); // 그 뒤에 이거 출력
	}
	AAAA(int a){
		System.out.println("AAAA (int a) 생성자 " + a);
	}
}
class BBBB extends AAAA{
	BBBB(){
		// super(); 이 생략된 에들이 먼저 AAAA 클래스의 AAAA()생성자를 불러냄. AAAA() 출력구문이 2개라 2줄 출력. 
		this(4); // 그 다음에 이녀석이 자기 자신의 int a를 불러냄. 
		System.out.println("BBBB 기본 생성자"); // 그 다음에 마지막으로 그대로 프린팅
	}
	BBBB(int a){
		System.out.println("BBBB (int a) 생성자 " + a);
	}
	
}

public class SuperMethod_2 {

	public static void main(String[] args) {
		
		//1. 객체 생성
		AAAA aaaa1 = new AAAA();
		System.out.println("===================");
		
		AAAA aaaa2 = new AAAA(3); // int a 생성자 불러와서 바로 출력
		System.out.println("===================");
		
		//2. 자식의 객체 생성
	
		BBBB bbbb1 =new BBBB();
		System.out.println("===================");
		
		
	}	

}
