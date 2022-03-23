package chap14.EX02;

//1. 실행예외 (Uncheckd Exception, RumTime Exception) : 컴파일 단계에서는 예외가 발생되지 아니함.
//2. 다만 실행시에는 발생될 수가 있음.

class AA{}
class BB extends AA{}

public class UncheckedException {

	public static void main(String[] args) {

		//3. 실행예외
		
		//4. System.out.println(10/0); // 요로코롬 무턱대고 0으로 나누면 오류가 발생함.
		//5 ArithmaticException : 0으로 어떤 수를 나누면 오류가 발생함.
		
		//6.ClassCastException : 클래스 타입을 변환할 때 변환되지 않는 예외
		
		AA aa = new AA();
		// BB bb = new BB(); // 컴파일 단계에서는 오류가 발생하지 아니함.

		//7.ArrayIndexOutOfBoundException : 배열에서 존재히자 않는 방번호를 출력할 경우에 발생함.
		
		int[]arry = {1,2,3};
		// System.out.println(arry[3]);
		
		//8 . NumberForamtException // 문자형 숫자를 정수 타입으로 변환할 수 없는 예외
		int num = Integer.parseInt("10");
		System.out.println(num);
		
		//
		String str =null;
		System.out.println(str.charAt(num));
		
		
	}

}
