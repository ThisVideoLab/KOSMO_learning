package chap19.EX04;

public class Charactor_EX2 {
	public static void main(String[] args) {

		//65부터 시작 // 90까지 // 97부터 시작 // 122
		
		System.out.println("A~Z까지 아스키 코드 값 출력");
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
		System.out.println("a~z까지 아스키 코드 값 출력");
		System.out.println();
		
		int[] arr2 = new int[26];
		for (int i = 0; i < 26; i++) {
			arr2[i] = 97+i; 
		} 
		
		for (int i = 0; i < 26; i++) {
			System.out.print((char)arr2[i]+" ," + arr2[i] + " | ");
		}
		
	// 문서의끝
	}
}
