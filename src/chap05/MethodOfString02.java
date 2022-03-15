package chap05;

import java.util.Arrays;

public class MethodOfString02 {

	public static void main(String[] args) {
		
		//5 문자열 수정
		
		//toLowerCase(): 소문자로 변환, toUpperCase(): 대문자로 변환
		
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase()); // java study 와 같이 소문자로 다 내려버림
		System.out.println(str1.toUpperCase()); // 대문자로 다 올려버림
		System.out.println();
		
		System.out.println("====================");
		
		//replace(old,new) : old를 new로 바꾸는 것. 바꾸고 싶은 대상 -> 바꿔 넣고 싶은 목표
		System.out.println(str1.replace("Study", "공부")); // 앞의 값에 뒤의 값을 넣어서 그 결과를 출력하는 것.
		
			//substring(a,b): a번째방부터 시작해서 b번째 방까지의 문자열을 잘라서 출력
		System.out.println(str1.substring(0,5)); //Java
		System.out.println(str1.substring(3,8));
		
		System.out.println("====================");
		
		//spilt : 특정 문자를 기준으로 잘라서 String[] 배열에 저장.
		
		String str11 = "abc/def-ghi jkl"; // 해당 문장을 기준점을 잡아서 잘라줄꺼임.
		String[] arr11 = str11.split("/|-| "); // 괄호 안에 절단 기준점을 제시함. 이 때 |를 구분자로 사용함. 예컨데 이 코드는 / 나 - 또는 공백을 만나면 자르라는 코드임.
		System.out.println(Arrays.toString(arr11));
		
		String str111 = "오늘의 날씨는 흐립니다.";
		String[] arr2 = str111.split(" "); // 더블 쿼토 빼먹지 말 것
		System.out.println(Arrays.toString(arr2)); // 보면 공백도 다 포함하는 것이 보임. 애초에 짤 때 공백 포함해도 이쁘게 나오도록 하거나 다른 방법을 쓸 것.
		
		String str1111 = "이름, 나이, 성별, 전화번호, 메일주소";
		String[] arr3 =str1111.split(",");
		System.out.println(Arrays.toString(arr3));
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("====================");
		
		//trim
		
		System.out.println("원본: " + "       abc       ".trim()); // 원본
		System.out.println("앞뒤 공백 제거: " + "       abc       ".trim()); // 앞뒤 공백 제거
		System.out.println("중간 공백 제거 불가능: " + "    a   b   c    ".trim()); // 중간 공백은 살아있음.
		
		System.out.println("====================");
		
		//6. 문자열의 내용 비교.equals() : 대소문자를 구분하여 값을 비교함.
		// 				 , equalsIgnoreCase() : 대소문자 구분 없이 값을 비교함.
		
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		System.out.println();
		//메모리 주소 값의 비교 (==)
		
		System.out.println(str2==str3);  // 다 메모리값을 새로 할당해서 만들었으므로 주소가 다름.
		System.out.println(str2==str4);
		System.out.println(str3==str4);
		
		System.out.println();
		//출력 값의 비교 .equals(), .equalIgnoreCase()
		
		System.out.println(str2.equals(str3)); // 출력 값을 비교하는 것. 이때 equals는 대소문자를 비교하는데 대소문자도 같아서 true 출력
		System.out.println(str3.equals(str4)); // 출력 값을 비교하는 것. 이때 equals는 대소문자를 비교하는데 대소문자가 상이해서 false 출력
		System.out.println(str3.equalsIgnoreCase(str4)); // true, 대소문자 구분 안함
		
		
		
	}   

}

