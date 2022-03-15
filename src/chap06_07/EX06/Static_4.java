package chap06_07.EX06;

class Cde{
	String name;
	int age;
	
	static String mail ;
	static int num;
	
}


public class Static_4 {

	public static void main(String[] args) {
		
		Cde cde = new Cde ();
		
		cde.name = "강성민" ; 
		cde.age = 25 ;
		
		cde.mail = "asdf";
		cde.num = 123;
		
		Cde.mail = "sdfasdf";
		Cde.num = 1234 ;
		
		
		Cde cde2 = new Cde();
		Cde cde3 = new Cde();
		Cde cde4 = new Cde();
		
		
		cde2.name = "ㅁㄴㅇㄹ";
		cde2.age = 35;
		
		cde3.name = "안녕";
		cde3.age = 45;
				
		cde4.name = "잘가";
		cde4.age = 55;
		
		// 인스턴스 필드 값 출력
		System.out.println(cde2.name + " , " + cde2.age );
		System.out.println(cde3.name + " , " + cde3.age );
		System.out.println(cde4.name + " , " + cde4.age );
		
		// static 필드의 값을 변경하면 모든 객체에서 변경됨
		cde2.mail = "aaa@aaa.aaa" ;
		cde2.num = 124;
		
		System.out.println(cde2.mail + " , " + cde2.num);
		System.out.println(cde3.mail + " , " + cde3.num);
		System.out.println(cde4.mail + " , " + cde4.num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
