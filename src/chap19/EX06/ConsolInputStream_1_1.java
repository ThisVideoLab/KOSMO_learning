package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

public class ConsolInputStream_1_1 {

	public static void main(String[] args) throws IOException {
		//1. console에서 인풋받기 위한 객체 생성.
		
				InputStream is1 = System.in; // is1은 콘솔에서 인풋을 받아 처리하는 객체
				
				System.out.println("영문을 입력하세요. >>>");
				
				int data;
				
				while ((data = is1.read()) != '\n') { // 1byte씩 읽어서 int data 변수에 할당함. 이 때 \n 이 입력되면, 즉 더이상 읽을 것이 없다면 빠져나온다는 것.
					                         // 조건문 자리에 '\n'이나 '\r'을 넣으면 enter를 입력할 때 까지, 즉 \r \n  이 입력될 때까지 돌아간다는 것.
											 // 그 후에 마지막 값이 \n 이었으므로, is1.read()에 \n에 해당하는 10이 출력됨
											 // 그러나 read()값이 -1일때까지 읽는 조건에서는, 더이상 읽을 값이 없으므로 아래 행에 is1.read()를 출력해도 값이 뜨지 않음.
					System.out.print((char)data);
					// 한글자 읽고, 처리하고, 저장하고, 반복함. 조건이 false가 될 때까지
				}
				
				System.out.println(data); // 10이 나옴 \n
				System.out.println(is1.read()); // 더이상 read할 대상이 없음

	// 문서의끝
	}
}
