package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

// System.in : 자바에서 제공하는 객체로 console에서 인풋을 받아줌, InputStream 하위에 존재함.
               // windows: 콘솔에서 enter: \n\r
          	   // windows: 콘솔에서 enter: \r
// System.out : 자바에서 제공하는 객체로 console에 아웃풋을 출력함, OutputStream 하위에 존재함.

public class ConsolInputObject_1 {
	public static void main(String[] args) throws IOException {
		
		//1. console에서 인풋받기 위한 객체 생성.
		
		InputStream is1 = System.in; // is1은 콘솔에서 인풋을 받아 처리하는 객체
		
		System.out.println("영문을 입력하세요. >>>");
		
		int data;
		
		while ((data = is1.read()) != '\r') { // 1byte씩 읽어서 int data 변수에 할당함. 이 때 \r 이 입력되면, 즉 엔터를 치면 빠져나온다는 것.
			System.out.println("읽은 데이타 : " + (char)data + " 남은 바이트 수: " + is1.available());
			// 한글자 읽고, 처리하고, 저장하고, 반복함. 조건이 false가 될 때까지
		}
		
		System.out.println(data); // 실행 후에 콘솔창에 enter만 치면 // 13 이 출력됨. 이는 \r에 해당함
		System.out.println(is1.read()); // 실행 후에 콘솔창에 enter만 치면 // 10이 출력됨. 이는 \n에 해당함
		
	// 문서의 끝
	}
}
