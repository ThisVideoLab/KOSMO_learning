package chap19.EX06;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

// 한글을 콘솔에 출력해보자 2편
// 1-byte로 출력하면 한글은 깨져서 출력이 되어버림. n-byte로 출력해야 함.

public class ConsolOutputObject_2 {
	public static void main(String[] args) throws IOException {
		
		OutputStream os = System.out;
		
		//1. n-byte 출력 (byte[] 배열에 처음부터 끝까지 데이터를 쓰기)
		System.out.println("============================================================");
		System.out.println("1. n-byte 출력 (byte[] 배열에 처음부터 끝까지 데이터를 쓰기)");System.out.println();
		
		byte[] byteArr1 = "안녕하세요".getBytes();
		
		os.write(byteArr1); 
		os.write('\n'); // 버퍼에 쓰기
		os.flush(); // 버퍼의 내용을 콘솔창에 출력함.
		
		System.out.println();

		//2. n-byte 출력 (byte[] offset부터 length개의 byte 데이터 쓰기)
		System.out.println("============================================================");
		System.out.println("2. n-byte 출력 (byte[] offset부터 length개의 byte 데이터 쓰기)");System.out.println();
		
		byte[] byteArr2 = "반갑습니다.".getBytes(Charset.defaultCharset());
		
		os.write(byteArr2,6,4); // 오프셋 6: 반갑습 / 랭쓰 4: 니다
		os.flush();
		os.close();

	//문서의끝
	}
}
