package chap05;

import java.util.Arrays;

public class ReadArrayData_Ex05 {

	public static void main(String[] args) {

		
		// 배열의 방(index)의 길이를 구하는 여러가지 방법
		
		// 1. index의 길이를 구하기
		int[] array = new int[] {3,4,5,6,7};
		System.out.println("방의 갯수를 출력: " + array.length);
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		// 2. index의 방 번호를 직접 입력해서 출력
		
		System.out.print(array[3] + " " + array[2]);
		// System.out.print(array[5]); // 5번 방(index)가 없으므로 오류 출력 : Index 5 out of bounds for length 5
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		// 3. for문을 활용하여 특정 범위를 지정해서 출력
		for(int i = 0;i< array.length ; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		System.out.println("=====향상=====");
		System.out.println();
		
		// 4. 출력하기 3 : 향상된 for, 처음 방부터 마지막 방깢 ㅣ순환하면서 출력, 범위를 지정해서 출력할 수 없음. 구문은 for문에 비해서 짧음.
		               // 굳이 그 길이를 조절하고 싶다면, 기존 for문을 만들고 for문 안의 초기식에서 변수의 시작점과, 조건식을 조절하는 방식으로 만들어야 함.

		for(int k : array) {              // for (자로형 + 변수 : 배열변수){ 실행문, k를 출력} 
			System.out.print(k + " ");
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		// 5. toString을 활용하여 출력하기 :  array.toString -> 배열 변수의 모든 값을 출력함
		
		System.out.println(Arrays.toString(array)); // 대괄호를 사용해서 출력해주기때문에 조금 더 간지가 난다
		
		
	}

}
