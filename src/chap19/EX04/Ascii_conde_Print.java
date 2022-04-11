package chap19.EX04;

//Ascii 코드의 값 출력 : 1byte = 8bit, 제일 처음 비트는 부호 비트이고 실질 값은 7 bit에 담겨있음
//                    개중에서 1 ~ 32 비트까지는 출력을 할 수 없는 툭수한 코드임. 예) null, 헤더의 시작, 경고음, 개행 등등
//                    127비트 : delete 기능
//                    -> 실제 출력 가능한 비트는 33번 비트 ~ 126번 비트까지만 사용됨. 이는 영문, 숫자, 특수 문자를 포함함.

public class Ascii_conde_Print {

	public static void main(String[]args) {
		
		//1. 1번째 방법
		System.out.println("=====================");
		System.out.println("1번째 방법");
		System.out.println("=====================");System.out.println();
		
		System.out.println("=====================================");
		System.out.println("ASCII	문자		ASCII	문자");
		System.out.println("=====================================");
		int[] arr1 = new int[94];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = 33+i;
		} 
		
		for (int i = 0; i < (arr1.length/2) ; i++) {
			System.out.print(arr1[(2*i)] + "	" + (char)arr1[(2*i)] + "		" +arr1[(2*i)+1] + "	" + (char) arr1[(2*i)+1]);
			System.out.println();
		}
		
		//1. 2번째 방법
		System.out.println(); System.out.println("=====================");
		System.out.println("2번째 방법");
		System.out.println("=====================");System.out.println();
		
		System.out.println("=====================================");
		System.out.println("ASCII	문자		ASCII	문자");
		System.out.print("=====================================");
		int[] arr2 = new int[94];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 33+i;
		} 
		
		for (int i = 0; i <arr2.length ; i++) {
			if(i%2 == 0) {
				System.out.println();
			}
			System.out.print(arr2[(i)] + "	" + (char)arr1[(i)] + "		");
		} 
		
		// 선생님 버전 : 배열을 안만드셨음. 아무래도 내가 잘못 알아들은듯 함. 그 외에 상기할만한 점은
		//             i 를 2씩 증가시켰다는 점. 전에도 이걸 봤는데도 어느샌가 i는 1씩 증가한다는
		//             고정관념에 사로잡힌듯 하다. 
		
	    for(int i = 33; i < 127; i+=2) {
	    	System.out.println(i + "\t" + (char)i + "\t\t" + (i+1) + (char)(i+1));
	    }
	// 문서의 끝
	}
}
