package chap06_07.EX04;

/*   1.  this 가 키워드로 사용되는 경우 : this.m (필드의 m) , this. init () ( 자신 객체의 메소드 init() )
 * 
 * 	 2.  this 메소드로 사용되는 경우 : 
 * 				this () ;    <==== 생성자 내에서 다른 생성자를 호출 사용
 * 			                 <==== 반드시 생성자 내부의 첫 줄에 와야한다
 * 							 <==== 메소드 내부에서는 사용하면 안된다 
 * 
 * */

class Abc {
	
	Abc () {       // 생성자의 매개변수값이 없는 생성자
		System.out.println("첫번쨰 생성자 입니다");
	}
	
	Abc (int a) {
		this();            // 매개변수가 없는 생성자를 호출  ,   this();는 반드시 생성자의 첫라인에 써야 한다 
		System.out.println("두번쨰 생성자 입니다");
	}
	
	Abc( int a, String b){
		this (30);				
		System.out.println("세번쨰 생성자 입니다");
		
	}
	
	/*     오류 발생 
	 void abc() {
		this();          // this();  메소드 내에서는 사용 불가 
		
	}
	
	*/
	
	
}

public class ThisMethod_1 {

	public static void main(String[] args) {
		Abc a = new Abc();
		System.out.println("=========================");
		
		
		Abc aa = new Abc(1);  
		System.out.println("========================");
		
		Abc aaa = new Abc(1 , " ");
				

	}

}
