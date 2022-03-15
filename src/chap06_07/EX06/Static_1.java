package chap06_07.EX06;

class Aaa{
	int m = 3;            // 필드 (인스턴스 필드)   객체 생성후에 사용가능
	static int n = 4;	  //필드 ( static 필드 )  객체 생성없이 사용가능 , 객체 생성후에도 사용가능
	   					  // 모든 객체가 공유하는 변수 

	void print1(){          // 메소드 (인스턴스 메소드)   객체 생성후에 사용가능
							// 인스턴스 메소드 에서는 인스턴스 필드  static 필드 사용가능 
		System.out.println("인스턴스 메소드 출력 ");
	}
	
	static void print2() {	//메소드 ( static 메소드 )  객체 생성없이 사용가능 , 객체 생성후에도 사용가능
							// static 메소드 에서는 인스턴스 필드가 올수 없다  static 필드만 와야한다 
		
		System.out.println("static 메소드 출력");
	}

}




public class Static_1 {
	

	public static void main(String[] args) {
		
		Aaa a = new Aaa();

		//    인스턴스     객체명으로 호출   클래스명으로 호출 불가능
		System.out.println(a.m);
		a.print1();
		System.out.println("======================");
		
		
		//     static         객체명 과 클래스명 둘다 호출가능
		
		
		System.out.println(Aaa.n);
		Aaa.print2();
		System.out.println(a.n);
		a.print2();
		System.out.println("=====================");
		
		// static 필드가 적용된 필드는 모든 객체에서 공동으로 바라보는 변수 
		Aaa.n = 100;
		
		System.out.println(a.n);

		Aaa aa = new Aaa();
		System.out.println(aa.n);
		
		Aaa aaa = new Aaa();
		System.out.println(aaa.n);
		
		
		
		
		
	}

}
