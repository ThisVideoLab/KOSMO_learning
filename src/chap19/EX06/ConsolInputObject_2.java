package chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

//Windows의 콘솔과 메모장에서 enter를 치면 \r\n이 입력되어 우리가 아는 엔터의 역할을 하게 됨.
//다만 \r은 생략될 수 있어서, \n만으로도 설명이 가능함. write('\n')

public class ConsolInputObject_2 {
	public static void main(String[] args) throws IOException {
		
		
		
		
		
		
		InputStream is = System.in; // System.in 한 페이지 내에서 딱 하나만 만들 수 있음. 중간에 받으면 다시는 입력을 받을 수 없음.
		//InputStream is2 = System.in; // 이대로 입력하면 에러는 안나는데 콘솔창에 인풋 스트림들이 꼬여버림.
		
		//1. 1-byte 단위 읽기
		System.out.println("============================================================");
		System.out.println("1-byte 단위 읽기");
		System.out.println();
		
		System.out.println("<<영문을 입력하세요>>");
		
		int data;
		while ((data = is.read()) != '\r') { //  콘솔에서  input을 기다리다가 is.read()가 호출 될 때 돌아감.  
			System.out.print((char)data);
		}
		is.read(); // 10이 출력됨. 이는 '\n'에 해당함 // 이 후에는 버퍼에 \n이 남아있으므로 그것을 처리하는 문구. 안넣으면 다음 read()에서 남아있던 \n이 들어가게 됨.
					// 실제로 처리하지 않고 2번째 is.read() 를 불러오면 남아있는 \n이 다음 리드에 걸려서 엉뚱한 값이 출력됨. 뿐만 아니라 2번째 리드도 끝나버림.
		System.out.println();
		System.out.println();
		
		
		//2. a) n-byte 단위 읽기 (byte[]의 처음 위치에서 읽은 데이터를 저장함)
		System.out.println("============================================================");
		System.out.println("2. a) n-byte 단위 읽기 (byte[]의 처음 위치에서 읽은 데이터를 저장함)");
		System.out.println();
		
		byte[] byteArr1 = new byte [100]; // 콘솔에서 배열이 저장될 때는 \r 과 \n이 들어감.
		int count1 = is.read(byteArr1); // couunt1 은 100, 100, 30, -1 이런 식으로 들어감.

		for (int i = 0; i < count1; i++) {
			 System.out.print((char)byteArr1[i]); // (char)을 지우면 각각 문자의 바이트 코드를 확인 가능함.
			 System.out.println(" : count1 =  " + count1);
		}
		
		// 2. b) n-byte 단위 읽기 (byte[]의 처음 위치에서 읽은 데이터를 저장함)
		System.out.println("============================================================");
		System.out.println("2. b) while문으로 new String 으로 작성해보기");
		System.out.println();
		
		/*
		 
		 이 부분은 선생님께서 해결하지 못한채로 주석처리로만 남아있음. 나중에 쩔고수가 되어 열어보거든 처리해보시게나
		
		int count2;
		
		while ((count2 = is.read(byteArr1)) != '\r') { // 콘솔에서는 -1을 사용하지 않고 '\n'이나 '\r'을 사용하는 것을 권장함.
			System.out.println(new String (byteArr1));
		}
		is.read();
		
		*/
		
		// 3. n-byte 단위 읽기 (length만큼 읽어와서 byte[] offset 위치에 저장함) // offset 만큼 띄우고 저장함
		System.out.println("============================================================");
		System.out.println("3. n-byte 단위 읽기 (length만큼 읽어와서 byte[] offset 위치에 저장함)");
		System.out.println();
		
		byte[] byteArr2 = new byte[8];
		int offset = 3;
		int length = 5;
		int count3 = is.read(byteArr2, offset, length);
		
		for(int i = 0; i < offset + length; i++) {
		System.out.print((char)byteArr2[i]);
		}
		is.close();
		
	//문서의끝
	}
}

