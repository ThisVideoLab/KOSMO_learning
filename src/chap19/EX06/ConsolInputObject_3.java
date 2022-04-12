package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

// 콘솔에 인풋되는 한글을 처리해보자
// 1-byte씩 읽으면 한글을 처리할 수 없음. 고로 배열로 읽는 것을 권장함.
// InputStream System.in

public class ConsolInputObject_3 {
	public static void main(String[] args) throws IOException {

		InputStream is =  System.in;  // 한번만 선언 가능함. 물론 2번째도 되긴 하는데 입력이 엄청 꼬여버림.
									  // is.close()로 닫으면 더이상 인풋값을 받지 못하니, 마지막에 처리할 것
		
		
		
		//1. n-byte 배열 열기 (byte[] 처음 위치에서 읽은 데이터를 저장함)
		System.out.println("============================================================");
		System.out.println("1. n-byte 배열 열기 (byte[] 처음 위치에서 읽은 데이터를 저장함)");System.out.println();
		
		System.out.println("<< 한글을 입력하세요 >>");
		
		byte[] byteArr1 = new byte[100];
		int count1 = is.read(byteArr1); // count1 : byteArr1에 저장된 값의 갯수 
										// 			\n \r이 이 포함됨. 왜? 마지막에 enter 치니까.
		
		String str1 = new String(byteArr1, 0, count1, Charset.defaultCharset());
								// (읽을 데이터, offset, length, 문자 타입)
		System.out.println(str1);
		System.out.println("\\r\\n을 포함한 배열 방의 총 갯수: " + count1); // \r\n을 포함한 수
		System.out.println();
		
		//2. n-byte 단위 열기 (length만큼 읽어와서 byte[] 배열의 offset[index]위치에 저장하라)
		System.out.println("============================================================");
		System.out.println("2. n-byte 단위 열기 (length만큼 읽어와서 byte[] 배열의 offset[index]위치에 저장하라)");System.out.println();
		
		byte[] byteArr2 = new byte[9];
		int offset = 3;
		int length = 6;
		int count2 = is.read(byteArr2,offset,length);
		
		String str2 =new String(byteArr2,0,offset + count2, Charset.defaultCharset());
		System.out.println(str2); // 오프셋 3이므로, 앞부터 3개방을 비운 후에, 6byte를 읽어들임. 한글 하나당 2byte이므로, 3글자를 저장함.
								  // 이 때 만약 1-byte만 읽어들이는 경우에는 글자가 깨지게 됨.
		
		
		
	// 문서의 끝
	}
}
