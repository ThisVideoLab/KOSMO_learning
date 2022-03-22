package chap13.EX10;

class Button{
	OnClickListener ocl; //1. 일단 변수 선언해줌.  OnClickListener : 객체 타입, ocl: 참조변수
	
	//3. setter를 통해서 OnClickListenerdml ckawhqustn ocl에 객체 주소를 담게 됨.
	void setOnClickListener (OnClickListener ocl) { //2. ocl의 기본값은 null 값이 들어가있음. this로 변수값을 받아서 넣어줌.
		this.ocl = ocl;
	}
	
	interface OnClickListener{ // # 이너 인터페이스 앞에는 static이 생략되어 있음에 주의할 것
		void onClick(); //5. 메소드 선언만 해둠. 하위에서 오버라이딩으로 재정의해줘야 함
		}
	
		void click() { //5.실행했을 때 내부의 onClick 메서드를 호출함.
		ocl.onClick(); //10. ocl이라는 참조변수에 기본적으로는 null값이 들어가있음. 이를 활성화시키기 위해서는
					   //11. setOnClickListener가 값을 받아서 ocl에 던져주도록 만들어야 함.
		System.out.println(ocl);
	}
	//6. 인터페이스만 존재하고 구현한 자식 클래스가 존재하지는 않음.
	//7. 호출하는 곳에서 onClick() 메서드를 재정의해서 호출함.
}


public class buttonAPIExample {
	public static void main(String[] args) {

		//8. 개발자 1: 클릭시 음악 재생
		
		Button button1 = new Button(); //9. button1 객체 생성. 
		button1.setOnClickListener(new Button.OnClickListener() { //12. OnClickListener 객체 타입으로 객체를 생성해서 매개변수로 전달해 줘야함.
																  // A.B = new A.B(){이너 인터페이스 B의 메소드를 구현한 코드} 에 해당함.
			@Override
			public void onClick() {
				System.out.println("개발자 1: 음악 재생");
			}
		}); 
		
		button1.click();
		
		//13. 개발자 2: 클릭시 네이버 접속
		Button button2 = new Button();
		// setOnClickListener 메소드에 매개변수로 OnClickListener의 하위 익명객체를 생성 후 데이터 타입을 OnClickListener로 설정함.
		
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자 2: 네이버 접속");
			}
		});
		button2.click();
		
		
	}

}
