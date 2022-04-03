package chap13.EX10.EX1;

class A {
	B b;   // B는 인터페이스 타입, b는 참조 변수 일 때 값을 할당 하는 방법 
			// b의 초기값을 null 상태. 이 때 값을 할당하는 방법은 3가지 
				//1. 객체생성후 값을 할당. 
				//2. 생성자를 통해서 값을 할당. 
				//3. setter를 통해서 값을 할당. 
	
	A () {}	//기본 생성자 
	
	A(B b){
		this.b = b;
	}
	
	public void setB (B b) {
		this.b = b; 
	}
	interface B {
		void play();
		void stop();	
	}
	void abc () {	//play()재정의, stop() 재정의 
		b.play();
		b.stop();
	}
}
public class InnerInterface1_1 {
	public static void main(String[] args) {
		
		//1. 객체 생성후 필드의 값을 할당. 
		A a1 = new A(); 
		
		a1.b = new A.B() { //a1 객체의 b 값을 직접 할당
			@Override
			public void play() {System.out.println("짹짹");};
			@Override
			public void stop() {System.out.println("새는 하늘을 납니다.");};
		};		//인터페이스 : A.B의 내부 메서드 값을 재정의해줌
		a1.abc();
		
		System.out.println("========================");
		
		//2. 생성자를 이용해서 값을 할당
		A a2 = new A( 
			new A.B() {	
				@Override
				public void stop() {
					System.out.println("어흥 중지");				
				}			
				@Override
				public void play() {
					System.out.println("어흥 플레이 중지 ");				
				}
			}				
				);     //생성자 내부에 A.B 타입의 객체 생성후 주입 
		a2.abc();

		System.out.println("===================");
		//3. setter를 통해서 값을 할당. 
		A a = new A(); // 먼저 대상 인스턴스 객체를 생성해 줌 
		a.setB(new A.B() { // 인스턴스 a에 대해서 이너 인터페이스 B를 매개변수로 넣고 그 안에 오버라이딩으로
			               // play()와  stop()의 메서드 값을 재정의 해줌.
			@Override
			public void play() {
				System.out.println("동영상을 플래이 합니다. ");				
			}
			@Override
			public void stop() {
				System.out.println("동영상을 중지 합니다. ");
			}
		});
		a.abc(); //인스턴스 a에서 재정의된 abc()메서드를 출력함
		
	// 문서의 끝
	}

}
