package chap19.EX06;

import java.io.IOException;
import java.io.OutputStream;

// 한글을 콘솔에 출력해보자2

public class ConsolOutputObject_1 {
	public static void main(String[] args) throws IOException {

		OutputStream os = System.out; // System.out 콘솔창에 출력하는 코드. 기본적으로 byte로 출력함. 
		
		//1. 1-byte 출력
		System.out.println("============================================================");
		System.out.println("1. 1-byte 출력");System.out.println();
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r');
		os.write('\n');
		
		os.flush(); // 버퍼의 내용을 콘솔에 출력함.
		System.out.println();
		
		//2. n-byte 출력 // byte를 콘솔에 출력함.
		System.out.println("============================================================");
		System.out.println("2. n-byte 출력");System.out.println();
		
		byte[] byteArr1 = "hello!".getBytes(); // String을 byte로 변환해서 배열로 저장.
		
		os.write(byteArr1);
		os.write('\n');
		os.flush();
		System.out.println();
		
		//3. n-byte 출력
		System.out.println("============================================================");
		System.out.println("3. n-byte 출력");System.out.println();
		
		byte[] byteArr2 = "Better the last smile than the first laughter".getBytes();
		os.write(byteArr2,7,8); // (byte배열,offset,length)
		os.flush();
		os.close();
		
		
		
	//문서의 끝
	}
}
