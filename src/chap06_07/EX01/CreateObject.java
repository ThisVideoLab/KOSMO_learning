package chap06_07.EX01;

class AA{
	String name;       // 필드(멤버) : 인스턴스화 시켜야 사용이 가능    (Heap 공간에 값이 저장)
	int age;
	String email;

	AA(){	}   // 기본 생성자, 생략이 가능하다     다른 생성자가 존재할 경우 기본생성자를 생략할 경우 오류
	
	
	public String getName() {     //메소드   (멤버)  : 인스턴스화 시켜야 사용이 가능
		return name;              // Heap 공간에 주소만 저장,      클래스영역내의 메소드영역에 저장
								  // return : 메소드를 호출하는 곳으로 변수의 값을 던져주다 
	}
	public void setName(String name) {         // void : 리턴값이 없다를  알려주는 식별자
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}


public class CreateObject{
	
	public static void main(String[] args) {
		
		AA aa = new AA();          // AA클래스(설계도) 를 aa(객체)로 생성
		// AA : 클래스 이름 ,   aa : 객체명 (인스턴스명) , new : Heap 영역에 필드와 메소드
		// AA() : 생성자 : 객체의 필드값을 초기화 , 생성자도 하나의 메소드
						// 1 . 생성자 이름이 클래스 이름과 동일 메소드
						// 2 . 리턴타입이 없다
		       			// 3 . 생성자중 매개변수가 없는 생성자를 기본 생성자
						// 4 . 기본생성자는 생략이 가능하다
						// 5 . 객체를 생성 할떄 반드시 생성자를 호출 
	
		
		//객체의 메소드 호출
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		System.out.println("====================");
		
		//객체의 필드 호출
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		System.out.println("====================");
		// =================================================
		
		// 메소드 호출
		
		// setters : 객체의 메모리에 값을 할당 할떄 
		aa.setName("강성민");        // 객체의 변수에 값을 할당
		aa.setAge(25);
		aa.setEmail("cosy2222@naver.com");
		
		// getters : 객체의 메모리의 값을 가지고 올떄
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		System.out.println("=======================");
		
		AA bb = new AA();
		bb.setName("민성강");
		bb.setAge(52);
		bb.setEmail("cosy3333@gmail.com");
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		System.out.println("========================");
		
		AA cc = new AA();
		cc.setName("내이름");
		cc.setAge(12);
		cc.setEmail("myname@naer.com");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
