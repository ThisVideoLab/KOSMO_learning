package chap10.EX07.EX04;

class AA{
	String name;
	AA(String name){
		this.name = name;
	}
}

class BB{
	String name;
	BB(String name){
		this.name = name;
	}
	@Override
	public String toString() { // 패키지명.클래스명@해쉬코드 ==> name 필드의 값을 리턴
		return name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((BB)obj).name){
			return true;
		}else {
			return false;
		}
		
	}
	
	
}

public class String_Ex02 {

	public static void main(String[] args) {
		String s1 = new String("안녕"); // String 클래스는 toString()으로 재정의 됨.
		String s2= "안녕";
		
		System.out.println(s1);
		System.out.println(s1.equals(s2)); // toString으로 재정의해서 둘 다 "안녕"이 나오므로 true 가 뜸
		
		AA aa1 = new AA("안녕");
		AA aa2 = new AA("안녕");
		
		System.out.println(aa1);
		System.out.println(aa2); // 서로 해쉬값이 다름
		
		System.out.println(aa1.equals(aa2)); // 이건 객체 주소를 비교하기 때문에 false가 뜸.
		
		System.out.println("======================");
		
		BB bb1 = new BB("안녕");
		BB bb2 = new BB("안녕");
		
		System.out.println(bb1);
		System.out.println(bb2); // 서로 해쉬값이 다름
		
		System.out.println(bb1.equals(bb2));
		
		
	}

}
