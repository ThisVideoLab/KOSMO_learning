package chap05;

import java.util.Arrays;

public class Submit_02 {

	public static void main(String[] args) {
		
		int[] array2 = new int[300];
		for (int k= 0; k < array2.length ; k++) {
			array2[k] = 3*(k+1);
		}
		
		System.out.println();
		System.out.println("===== for�� Ȱ�� =====");
		System.out.println();
		
		for (int k= 0; k < array2.length ; k++) {
				System.out.println(array2[k]);	
		}

		System.out.println();
		System.out.println("===== ���� for�� Ȱ�� =====");
		System.out.println();

	
		for(int g: array2) {
			System.out.println(g);
		}
	

		System.out.println();
		System.out.println("===== to do ��Ʈ�� Ȱ�� =====");
		System.out.println();
		
		System.out.println(Arrays.toString(array2));
		
	}

}
