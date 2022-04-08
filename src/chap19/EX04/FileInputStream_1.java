package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {
	public static void main(String[] args) throws IOException{

	//현재 작업 디렉토리 위치 확인
		
		System.out.println(System.getProperty("user.dir"));
		
		//1. 입력파일 생성
		
		//절대 경로 설정 : 해당 파일의 물리적 위치를 직접 기록 - 그러나 프로젝트의 전송 과정에서 위치가 바뀌면 오류가 발생함
		File inFile1 = new File("C:\\Users\\kosmo\\git\\KOSMO_learning\\src\\chap19\\files\\FileInputStream1.txt");
		
		//상대경로로 설정 : 해당 파일을 프로젝트 구조 안에서 설정함. 이는 프로젝트를 옮겨도 상대적으로 안정적인 위치값임
		File inFile = new File("src\\chap19\\files\\FileInputStream1.txt");
		
		//2. InpoutStream 객체를 생성해야 파일의 내용을 읽을 수 있음.
		InputStream is = new FileInputStream(inFile); // InputStream은 추상 클래스로 객체를 직접 생성이 불가능하며, 타입 지정만 가능함.
		
		
		 // 파일의 내용을 출력.
	      
	      // UTF-8 : 영어 : 1byte, 한글은 : 3byte
	      // MS949 : 영어 : 1byte, 한글은 : 2 byte
	      // EUC-KR : 영어 : 1byte, 한글은 : 2byte
	      // UTF-16 : 영어, 한글 : 2byte , 첫번째 BOM 2byte <= 식별자
	      
	      
	      System.out.print(is.read());
	      System.out.print((char)is.read()); // read()로 읽어온 값을 한글자씩 한바이트씩 읽어들임
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      System.out.print((char)is.read());
	      
	      System.out.println();
	      System.out.println();
	      
	      // 스트림은 값을 읽으면 메모리에서 삭제된다. 새로이 쓰기 위해서는 새로운 스트림을 작성해야 한다.
	      
	      //int read(): 한 바이트를 읽어서 정수타입으로 리턴, 읽은 데이터가 존재하지 않을 경우 -1을 리턴해줌 
	      // while문을 사용해서 한번에 출력
	      
	      InputStream is1 = new FileInputStream(inFile);
	      
	      int data;
	      
	      while ((data = is1.read())!= -1) { // is1에 대해 read() 한 값이 -1이 아니라면 출력하는 조건.
	    	  System.out.print((char) data);
	      }
	      
	      System.out.println();
	      System.out.println();
	      
	      InputStream is2 = new FileInputStream(inFile);
	      
	      while ((data = is2.read())!= -1) { // is1에 대해 read() 한 값이 -1이 아니라면 출력하는 조건.
	    	  System.out.println("읽은 데이터: " + (char) data + "  남은 바이트 수: " + is2.available());
	      }
	      
	      
	//문서의끝
	}
}
