package chap10;

// super. 키워드 : 부모클래스를 지칭, 메소드 내부에서 사용이 됨.

// super : 생성자 내부에서만 사용하는 코드 , 부모 생성자를 호출할 때 사용함.
//		   반드시 첫 라인에 위치해야 함.

// this. 키워드 : 자신의 객체를 지칭, 메소드 내부에서 사용, 생성자 내부에서도 사용.

// this : 생성자 내부에서만 사용함. 자기 클래스 내부의 다른 생성자를 호출할 때 쓰임.
//		  반드시 첫 라인에 위치해야 함.


class AAA{
	AAA(){
		System.out.println("AAA 기본 생성자");
	}
	
}
class BBB extends AAA{
	BBB(){
		super();
		System.out.println("BBB 기본 생성자");
	}
	
}

class CCC extends BBB{
	CCC(){
		System.out.println("CCC 기본 생성자");
	}
	CCC(int a){
		System.out.println("CCC int a 생성자");
	}
}
class DDD extends CCC{
	DDD(){
		super();
		System.out.println("DDD 기본 생성자");
	}
	DDD(int a){
		super(3);
		System.out.println("DDD 생성자 정수 1 : " + a);
	}
}

public class SuperMethod_1 {

	public static void main(String[] args) {
		
		//1. 객체 생성
		AAA aaa = new AAA(); // 기본 생성자 호출
		System.out.println("==========");
		
		BBB bbb = new BBB(); // 기본 생성자 호출
		System.out.println("==========");
		
		DDD ddd = new DDD(5); // 생성자에 5값을 던져주면 이 5값이 먼저 DDD 클래스의 int a 조건의 생성자를 부름. 그리고 이 안에는 super(3); 이 있어서 
		                      // 이 3이 다시 부모 클래스인  CCC에 들어가서 int a의 매개변수가 달린 생성자를 호출함.
							  // 그 위로는 그냥 아무 값도 안 들어가기 때문에 시조까지 올라가서 차례대로 기본, 기본, int a, int a가 출력됨.
		System.out.println("==========");

	}

}
