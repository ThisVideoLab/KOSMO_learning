package chap19.EX04;

public class Charactor_EX2 {
	public static void main(String[] args) {

		//65���� ���� // 90���� // 97���� ���� // 122
		
		System.out.println("A~Z���� �ƽ�Ű �ڵ� �� ���");
		System.out.println();
		int[] arr1 = new int[26];
		for (int i = 0; i < 26; i++) {
			arr1[i] = 65+i; 
		} 
		
		for (int i = 0; i < 26; i++) {
			System.out.print((char)arr1[i]+" ," + arr1[i] + " | ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("=======================");
		System.out.println("a~z���� �ƽ�Ű �ڵ� �� ���");
		System.out.println();
		
		int[] arr2 = new int[26];
		for (int i = 0; i < 26; i++) {
			arr2[i] = 97+i; 
		} 
		
		for (int i = 0; i < 26; i++) {
			System.out.print((char)arr2[i]+" ," + arr2[i] + " | ");
		}
		
	// �����ǳ�
	}
}
