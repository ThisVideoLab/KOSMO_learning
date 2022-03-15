package chap05;

import java.util.Arrays;

public class Submit_01 {
	
	public static void main(String[] args) {

		System.out.println();
		System.out.println("===== for문 활용 =====");
		System.out.println();
		
		int k;	
					
		int[] array1 = new int[100];
		for (k= 0; k < array1.length ; k++) {
			array1[k] = k+1;
		}
		
		
		for (k= 0; k < array1.length ; k++) {
			System.out.println(array1[k] + "번째방의 출력값: " + array1[k] + " ");
		}

		System.out.println();
		System.out.println("===== 향상된 for문 활용 =====");
		System.out.println();
		
		for(int k1 : array1) {           
			System.out.println(k1 + "번째방의 출력값: " +k1 + " ");
		}
		
		System.out.println();
		System.out.println("===== to do 스트링 활용 =====");
		System.out.println();
		
		System.out.println(Arrays.toString(array1)); // 여기서 3반 출력되게 바꾸는 없이 없을까?

	}	
}
