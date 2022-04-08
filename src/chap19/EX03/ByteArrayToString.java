package chap19.EX03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ByteArrayToString {
	public static void main(String[] args) throws UnsupportedEncodingException {

	//1. String getBytes(): String을 바이트로 분해해서 배열로 만들어줌. 즉 문자를 바이트로 변환해서 배열에 담는 것.
	//   다양한 방법으로 케릭터 셋을 적용할 수 있음.	
	byte[] arr1 = "안녕".getBytes(); // charset을 지정하지 않음. -> String.getBytes()의 형태
	byte[] arr2 = "땡큐".getBytes(Charset.defaultCharset()); // charset을 지정하지 않음. -> String.getBytes()의 형태
	byte[] arr3 = "베리".getBytes(Charset.forName("MS949"));  // 예외 발생 : 실행시 예외
	byte[] arr4 = "베리".getBytes("UTF-8"); // 예외처리 필요 // 일반예외 ->  UnsupportedEncodingException에다가 throws
		
	//2. 각 인코딩의 바이트 수 출력
	
	System.out.println(arr1.length);  // 4
	System.out.println(arr2.length);  // 4
	System.out.println(arr3.length);  // 4
	System.out.println(arr4.length);  // 6
	
	//3. new String() : byte[] => String으로 변환 , byte -> 문자로 변환
	System.out.println("======================");
	
	String str1 = new String(arr1);
	String str2 = new String(arr2, Charset.defaultCharset());
	String str3 = new String(arr3, Charset.forName("MS949")); // 이때 케릭터셋을 기존 배열에서 지정한 케릭터셋과 일치시켜야 함. 여기에 MS949를 대신
	String str4 = new String(arr4, Charset.forName("UTF-8")); // 넣으면 컴파일 에러 발생함. 생략시에는 이클립스의 기본 설정 케릭터셋이 반영되는데
															  // 현재 이클립스의 기본 세팅이 MS949이기 때문임.
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	
	//4. 한글이 깨지는 경우: 내보내는 인코딩 타입과 가져오는 인코딩 타입이 불일치할 경우
	
	String str5 = new String(arr1, Charset.forName("UTF-8")); // arr1은 내보내는 타입이 생략된 상태. 이걸 받아서 UTF-8로 내보내
	System.out.println(str5);                                 // ???로 에러가 발생함
	
	String str6 = new String(arr1, Charset.forName("MS949")); // arr1의 생략된 기본 설정은 이클립스의 설정과 같은 MS949 케릭터 셋
	System.out.println(str6);                                 // 정상출력이 됨.
	
	String str7 = new String(arr3, Charset.forName("UTF-8")); // arr1의 캐릭터셋과 str7 의 캐릭터셋이 달라서 오류 발생
	System.out.println(str7);                               
	
	//문서의끝
	}
}
