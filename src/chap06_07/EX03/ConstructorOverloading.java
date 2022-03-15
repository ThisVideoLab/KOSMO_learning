package chap06_07.EX03;

// 생성자 오버로딩 : 하나의 생성자명에 데이터타입 , 갯수에 따라 다른 생성자가 호출 
     // 주의 ) 데이터타입과 갯수가 같은 생성자가 있으면 오류
class Abc {
	
	int a , b , c ;
	String d;
	
	Abc () {      // 기본 생성자 
		System.out.println(a + " " + b + " " + c);
	}   
	
	Abc (int a){                 // 매개변수가 1개
		this.a = a;
		System.out.println(a);
	}
	
	Abc (String d){
		this.d = d;
		System.out.println(d);
	}
	
	Abc (int a , int b){         // 매개변수가 2개 
		this.a = a;
		this.b = b;
		System.out.println(a + " , " + b);
		System.out.println();
	}
	
	Abc (int a , int b , int c){
		this.a = a ;  this.b = b;  this.c=c ;
		System.out.println(a+" , " + b + " , " + c) ;
	}
	
}


public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Abc abc = new Abc();     // 기본 생성자 호출
		
		Abc abc1 = new Abc(1);
		
		Abc abc2 = new Abc(1,2);
		
		Abc abc3 = new Abc(1,2,3);
		
		Abc abc4 = new Abc("안녕");
	}

}
