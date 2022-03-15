package chap05;

import java.util.Arrays;

public class CreateStringObject02 {

	public static void main(String[] args) {
		
		// 객체의 값을 복사한 후에 수정했을의 변화
		//1. 문자열 수정 (객체 내의 내용은 변경이 불가 ---> 새로운 객체가 생성
		String str1 = new String("안녕");
		String str2 = str1; // 새로 스트링 str2 변수를 만들면서 str1을 대입함. 이때 Str은 참조 자료형이므로 Stack의 주소값을 복사함.
		//int 같은 기본 자료형 친구들은 변수의 이름과 함께 변수의 값(ex: int = 3, 여기서 3이 값)이 stack 영역에 함께 저장됨.
		
		str1= "안녕하세요"; // 기존에 선언한 값 "안녕"의 위치와 별도의 메모리 공간에 안녕하세요가 만들어짐.
		
		System.out.println(str1); // "안녕하세요"라고 새로 할당된 메모리 값에서 불러옴.
		System.out.println(str2); // "안녕" 이 출력됨. 이말인 즉슨 다른 변수값을 대입한다고해서 계속 링크되는 것이 아니라, String str2= str1을 선언한 시점에서
		                          // "안녕하세요"의 힙영역 메모리 주소를 복사해 온 뒤에 독립적으로 자신의 주소로 삼는다는 것임. 그러므로 후행 코드로 str1의 값을
								  // 재설정한다고 해도 이미 독립해서 주소를 사용하고 있는 str2의 값은 변하지 않는다는 의미.
		
		System.out.println("==========");
		
		//배열인 경우 - 출처가 되는 변수의 값을 목표로 한 변수에 한번 대입한 후에, 다시 출처 변수의 값을 변경하면 목표 변수에도 값의 변경이 발생함.

		int[] arr1 = new int[]{3,4,5};
		int[] arr2 = arr1;
		
		arr1[0] =6;
		arr1[1] =7;
		arr1[2] =8;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
