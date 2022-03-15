package chap06_07.Ex02;

public class EffectOfPrimaryDataArgument {

	int abc ;   // 필드 : ( Heap 영역에 저장 , 객체화를 시켜야 사용가능 )
	
	static int twice (int a) {      // 정수를 받아서 *2 값을 return 
		a = a*2;
		return a;       //  a : 변수는 메소드가 종료될때 삭제 
	}
	
	
	public static void main(String[] args) {
		int a = 3;                // 지역변수 ( stack 영역에 변수명과 값이 저장 )
		int result1 = twice(3);
		System.out.println(result1);
		
		int result2 = twice(a);
		System.out.println(result2);     
		System.out.println(a);

	}

}
