package chap10.EX07.EX04;

class A{
	String name;
	A(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}

public class String_Ex {

	public static void main(String[] args) {

		String s0 = new String();
		
		String s1 = "¾È³ç";	// stringÀº ÂüÁ¶º¯¼ö
		System.out.println(s1);
		
		System.out.println(s0);
		System.out.println(s1);
		
		A a = new A ("¾È³ç");
		System.out.println(a);
	}

}
