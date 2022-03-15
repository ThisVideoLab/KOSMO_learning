package chap06_07.EX06;

  // import chap06_07.EX05.B;       default 라서 사용 불가능

import chap06_07.EX05.Bb;



public class ExternalClass_2 {

	public static void main(String[] args) {
		
		// 다른 패키지의 클래스에서 Bb클래스를 접근 하는 경우 
		// 1 . import 를 먼저 사용
		// 2. Bb 클래스의 접근 제한자는 public
		// 3. 필드 , 메소드의 접근 제한자에 따라서 접근이  가능(protected , public ) OR 불가능(private , default) 
		
		Bb b = new Bb();
		
		// b.a = 10;    private
		// b.b = 20;    default
		// b.c = 30;     // protected
		 b.d = 40;     // public
		
		// b.print1();    private
		// b.print2();       // default
		// b.print3();	   // protected
		b.print4();       // public

	}

}
