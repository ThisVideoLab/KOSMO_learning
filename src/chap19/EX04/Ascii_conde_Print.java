package chap19.EX04;

//Ascii �ڵ��� �� ��� : 1byte = 8bit, ���� ó�� ��Ʈ�� ��ȣ ��Ʈ�̰� ���� ���� 7 bit�� �������
//                    ���߿��� 1 ~ 32 ��Ʈ������ ����� �� �� ���� ������ �ڵ���. ��) null, ����� ����, �����, ���� ���
//                    127��Ʈ : delete ���
//                    -> ���� ��� ������ ��Ʈ�� 33�� ��Ʈ ~ 126�� ��Ʈ������ ����. �̴� ����, ����, Ư�� ���ڸ� ������.

public class Ascii_conde_Print {

	public static void main(String[]args) {
		
		//1. 1��° ���
		System.out.println("=====================");
		System.out.println("1��° ���");
		System.out.println("=====================");System.out.println();
		
		System.out.println("=====================================");
		System.out.println("ASCII	����		ASCII	����");
		System.out.println("=====================================");
		int[] arr1 = new int[94];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = 33+i;
		} 
		
		for (int i = 0; i < (arr1.length/2) ; i++) {
			System.out.print(arr1[(2*i)] + "	" + (char)arr1[(2*i)] + "		" +arr1[(2*i)+1] + "	" + (char) arr1[(2*i)+1]);
			System.out.println();
		}
		
		//1. 2��° ���
		System.out.println(); System.out.println("=====================");
		System.out.println("2��° ���");
		System.out.println("=====================");System.out.println();
		
		System.out.println("=====================================");
		System.out.println("ASCII	����		ASCII	����");
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
		
		// ������ ���� : �迭�� �ȸ������. �ƹ����� ���� �߸� �˾Ƶ����� ��. �� �ܿ� ����Ҹ��� ����
		//             i �� 2�� �������״ٴ� ��. ������ �̰� �ôµ��� ������� i�� 1�� �����Ѵٴ�
		//             �������信 ��������� �ϴ�. 
		
	    for(int i = 33; i < 127; i+=2) {
	    	System.out.println(i + "\t" + (char)i + "\t\t" + (i+1) + (char)(i+1));
	    }
	// ������ ��
	}
}
