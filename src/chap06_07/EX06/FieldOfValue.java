package chap06_07.EX06;

// 객체의 필드에 값을 할당 하는 방식 : 3가지
// 1 . 필드에 직접 값을 부여 하는 방식						<== 객체를 생성후
// 2. setter 를 통해서 객체의 필드 값을 부여  (컨트롤 가능)   <== 객체를 생성후  
// 3.  생성자를 통해서 객체의 필드 값을 부여    (컨트롤 가능)	<== 객체를 생성할떄 초기값으로 필드에 값을 할당


class Aa{   // 1. 객체 생성후 직접 필드에 값 할당
	String name ;
	int age ;
	String mail;
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("mail : " + mail);
		
	}
}

class Bb{   // 2. setter를 통해서 객체의 필드에 값을 할당
	
	String name ;
	int age ;
	String mail;
	
	void setname(String a) {
		name = a;
	}
	
	void setage(int a) {
		age = a;
	}
	void setmail(String a) {
		mail = a;
	}
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("mail : " + mail);
		
	}
}

class Cc{   //  3. 생성자를 통해서 객체의 필드에 값을 할당
	
	String name ;
	int age ;
	String mail;
	
	Cc (String a , int b , String c){
		name = a;
		age = b;
		mail = c;
	}
	
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("mail : " + mail);
		
	}
}


public class FieldOfValue {

	public static void main(String[] args) {
		
		// 1 .필드에 직접 값 
		
		Aa aa = new Aa();
		
		aa.name = "강성민";
		aa.age = 25;
		aa.mail = "cosy2222@naver.com";
		
		aa.print();
		System.out.println("=======================");
		
		
		
		// 2.  setter 사용
		Bb bb = new Bb();
		
		bb.setname("내이름");
		bb.setage(15);
		bb.setmail("bbb@bbb.com");
		
		bb.print();
		System.out.println("=======================");
		
		
		// 3 . 생성사를 사용해서 필드의 값 
		Cc cc = new Cc("나의이름" , 35 , "ccc@ccc.com");
		
		cc.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
