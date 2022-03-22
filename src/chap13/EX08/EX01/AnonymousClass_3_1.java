package chap13.EX08.EX01;

//1. 매서드의 매개 변수로 전달하기:

//2. a) 객체 생성 후 매개 변수로 전달하는 방법
//3. b) 

interface AA{ //4. 인터 페이스, 추상 메소드를 정의함
	public abstract void cry(); //5. 추상 메소드, public abstract가 붙어있음.
	void fly();
}

class BB implements AA{ //6. BB는 AA 인터페이스를 구현한 클래스

	public void cry() {
		System.out.println("멍멍: 매개 변수 전달 후 출력");
	}

	public void fly() {
		System.out.println("개는 날지 못합니다: 매개 변수 전달 후 출력");
	} 
}

class CC{ //7. 객체의 abc 메서드 호출 시 AA 타입을 매개변수로 받음.
	void abc(AA aa){ // 하위 자식 클래스가 매개변수로 들엉로 경우 A 타입으로 자동 업캐스팅이 됨.
		aa.cry();
		aa.fly();
	}
}


public class AnonymousClass_3_1 {

	public static void main(String[] args) {
		
		//8. 클래스가 구현된 경우에 참조변수 생성해서 그 참조변수를 매개변수로 던져줌  
		
		CC cc = new CC();
		AA aa = new BB(); // BB를 객체화해서 AA 타입으로 생상험. 이 때 aa는 참조 변수임.
		 
		cc.abc(aa);
		
		System.out.println("==========================");
		
		//9. 클래스가 구현된 경우에 참조변수를 성생하지 않고 그냥 매개변수로 던짐
		
		 cc.abc(new BB());
		
		
		// 문서의 끝
	}

}
