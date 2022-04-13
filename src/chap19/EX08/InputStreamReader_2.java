package chap19.EX08;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReader_2 {
	public static void main(String[] args) {

	//1. 콘솔 입력 (MS949): default charset, byte 스트림.
	System.out.println("=========================================");
	System.out.println("1. 콘솔 입력 (MS949): default charset, byte 스트림");System.out.println();

	System.out.println("<<한글을 입력하세요>>");
	
	try  {
		InputStreamReader isr1 = new InputStreamReader(System.in, "MS949");
		//InputStreamReader: 콘솔에서 input받는 문자는 byte로 들어옴. 이것을 MS949로 읽어 들이면, char로 반환해서 출력이 가능해짐.
		//System.in : 콘솔 입력은 byte 형태로 입력됨.
		//isr1은 변환된 char 타입을 가지게 됨.
		int data1;
		while((data1 = isr1.read()) != '\r') {
			System.out.print((char)data1);
		}
	System.out.println();
	System.out.print("이 문장은 "+  isr1.getEncoding() + " 형식으로 출력되었습니다.");
	} catch (IOException e) {}
	System.out.println();System.out.println();
	
	//2. 콘솔 입력 (UTF-8)
	System.out.println("=========================================");
	System.out.println("2. 콘솔 입력 (UTF-8)");System.out.println();

	System.out.println("<<한글을 입력하세요>>");
	
	try {
		InputStreamReader isr2 = new InputStreamReader(System.in, "UTF-8");
		//InputStreamReader: 콘솔에서 input받는 문자는 byte로 들어옴. 이것을 MS949로 읽어 들이면, char로 반환해서 출력이 가능해짐.
		//System.in : 콘솔 입력은 byte 형태로 입력됨.
		//isr1은 변환된 char 타입을 가지게 됨.
		int data2;
		while((data2 = isr2.read()) != '\r') {
			System.out.print((char)data2);
		}
	System.out.println();
	System.out.print("이 문장은 "+  isr2.getEncoding() + " 형식으로 출력되었습니다.");
	} catch (IOException e) {}
	
		
	//문서의끝
	}
}
