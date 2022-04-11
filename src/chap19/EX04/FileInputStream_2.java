package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_2 {
	public static void main(String[] args) throws IOException { //// 정석은 아니지만 작성의 편의를 위해서 예외처리 -> 3,4번에서 던진거임	 
		

		//1. 입력파일 생성
		File inFile = new File ("src\\chap19\\EX04\\FileInputStream1.txt");
		
		//1. 수동처리
		
		InputStream is1 = null;
		
		try  {
			is1 = new FileInputStream(inFile);
			// try( with resource : 객체 생성 ) < == close() 가 자동으로 이루어짐
			int data;
			while((data = is1.read() )!= -1) { //영문만 있으므로 read() 메서드만 사용. 한글일 경우에는 read (byte 배열)
				System.out.print((char)data);
				try {Thread.sleep(0);} catch (InterruptedException e) {}
			}
			
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} finally {
			if(is1 !=null) {
				try {
					is1.close();
				} catch (IOException E) {}
			}
		}
	
		// 자동 처리
		System.out.println();
		
		try (InputStream is2 = new FileInputStream(inFile);) {
			// try( with resource : 객체 생성 ) < == close() 가 자동으로 이루어짐, FileInputStream는 Closeable 인터페이스를 구현함.
			int data;
			while((data = is2.read() )!= -1) { //영문만 있으므로 read() 메서드만 사용. 한글일 경우에는 read (byte 배열)
				System.out.print((char)data);
				try {Thread.sleep(0);} catch (InterruptedException e) {}
			}
			
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
		}
		
		//3. b) n-byte 단위로 읽기 (byte[]의 처음 위치에서부터 읽은 데이트럴 저장함) -> 여러 바이트를 동시에 읽어서 처리 속도가 빠름.
		//      배열 크기만큼 
		System.out.println();
		System.out.println("=======================");
		System.out.println();
		
		InputStream is3 = new FileInputStream(inFile); // 정석은 아니지만 작성의 편의를 위해서 쓰루로 예외처리
		byte[] byteArr1= new byte[9]; // 배열방 9개, 0~8까지 존재함
		int count1;
		while((count1 = is3.read(byteArr1)) !=-1){ // -1: 더이상 읽을 방이 없을 때까지
				      //is3.read(): 1byte 씩 읽음 // 한글을 처리하지 못함
					  //is3.read(byteArr1): 9byte(배열의 크기) 씩 읽어서 byteArr1에 저장 
			
			
			for(int i = 0; i <count1 ; i++) {
				System.out.print((char)byteArr1[i]);
			}
			System.out.print(" : count1 = " + count1);
			
			System.out.println();
			System.out.println();
			System.out.println("=================");
			String str = new String(byteArr1,Charset.forName("MS949"));
			System.out.println(str);
		}
		
		// 4. b-1_ n-byte (배열크기) 단위로 읽어서 한글 처리. offset, length 사용
		System.out.println("=================");
		
		InputStream is4 = new FileInputStream(inFile); // 정석은 아니지만 작성의 편의를 위해서 쓰루로 예외처리
		byte[] byteArr2= new byte[100];
		
		int count2;
		
		while ((count2 = is4.read(byteArr2)) != -1) { // count2 = 100, -1
			System.out.println(new String(byteArr2,Charset.forName("MS949")));
		}
		is4.close();
		
		// 4. c. n-byte (배열크기) 단위로 읽어서 저장.
		System.out.println("=================");
	
		InputStream is5 = new FileInputStream(inFile); // 정석은 아니지만 작성의 편의를 위해서 쓰루로 예외처리
		byte[] byteArr3= new byte[9];
		
		int offset = 3; // 일종의 들여쓰기. 오프셋 만큼의 방을 비운 뒤에 값을 입력함.
		int length = 6; // 읽어들일 바이트 수
		int count4 = is5.read(byteArr3, offset, length); // length만큼 앞에서 읽어와서
		
		for (int i =0; i < offset + count4; i++) {
			System.out.print((char) byteArr3[i]);
		}
		is5.close();
		
	//문서의 끝
	}
}
