package chap05;

import java.util.Arrays;

public class Submit_01 {
	
	public static void main(String[] args) {

		System.out.println();
		System.out.println("===== for�� Ȱ�� =====");
		System.out.println();
		
		int k;	
					
		int[] array1 = new int[100];
		for (k= 0; k < array1.length ; k++) {
			array1[k] = k+1;
		}
		
		
		for (k= 0; k < array1.length ; k++) {
			System.out.println(array1[k] + "��°���� ��°�: " + array1[k] + " ");
		}

		System.out.println();
		System.out.println("===== ���� for�� Ȱ�� =====");
		System.out.println();
		
		for(int k1 : array1) {           
			System.out.println(k1 + "��°���� ��°�: " +k1 + " ");
		}
		
		System.out.println();
		System.out.println("===== to do ��Ʈ�� Ȱ�� =====");
		System.out.println();
		
		System.out.println(Arrays.toString(array1)); // ���⼭ 3�� ��µǰ� �ٲٴ� ���� ������?

	}	
}
