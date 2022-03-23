package chap14.EX03;

public class MultiCatch_2 {

	public static void main(String[] args) {

		//1. catch 블락에서 순서가 잘못된 경우
		
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}catch (Exception e){ // 예외처리계의 최상위포식자 Exception
		System.out.println("예외처리 (Exception)");
		}
	
		System.out.println("프로그램 종료");
		
		//2. catch 블락의 순서가 잘못된 경우에 발생하는 오류
		
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}catch (Exception e){ //3. 예외처리계의 최상위포식자 Exception이 앞에서 다 먹어버림.
		System.out.println("예외처리 (Exception)");
		}
/* 4. 후행 코드들에 대한 설명
		catch{ (ArithmeticException e) { // Exception은 모든 예외처리를 먹어버림. 그런데 그 뒤에 한종류만 먹는 예외처리 코드가 오면
		}catch (NumberFormatException e){ // 일전에 무한루프로 인한 뒷코드에 접근 불가 에러처럼 뒤에 있는 예외처리 코드들이 에러가 뜸.   
		}                                 // 고로 이것을 방지하기 위해 Exception은 가장 뒤에 와야 함
*/
		System.out.println("프로그램 종료");
		
		//5. catch 블럭의 올바른 순서 
		
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}catch (ArithmeticException | NumberFormatException e) { 
		
		}catch (Exception e){ //6. 최상위 부모의 Exception은 마지막에 위치
		System.out.println("예외처리 (Exception)");
		}
		
		//7. 여러개의 Exception을 통합해서 적용함.
		
		try {
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}catch (ArithmeticException e) { 
		
		}catch (NumberFormatException e){ //    
		
		}catch (Exception e){ 
		System.out.println("예외처리 (Exception)");
		}
		
	// 문서의 끝
	}

}
