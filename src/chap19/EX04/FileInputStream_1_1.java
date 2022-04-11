package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1_1 {
	public static void main(String[] args) {
		
		
		//1. 예외처리 a) 예외에 다른 각자 처리
		
		File inFile = new File("src\\chap19\\files\\FileInputStream1.txt"); // 먼저 파일로 불러들인 후에
		
		InputStream is = null;
		try {is = new FileInputStream(inFile);} catch (FileNotFoundException e) {}  // try catch문으로 처리해서 묶어줌
			
		int data = 0;
		
		try {while ((data = is.read()) != -1) { //
			System.out.println(data);
			System.out.print((char)data);
		}} catch(IOException E) { 
			System.out.println("예외상황 발생, 파일을 읽을 수 없습니다");
		}
		
		try {
			if(is != null) {
				is.close();	
			}
		} catch (IOException e) {
		}
		
		System.out.println("=================================");
		
		//2. is2: (상대경로로 접근: -utf-8.txt), 예외처리(try ~ with resource로 예외처리)
		
		InputStream is2 = null;
		int data2 = 0;
		
		try { // with resource : 객체 생성, RAM을 사용핳 <== close()이 자동으로 처리됨. 
			is2 = new FileInputStream(inFile);			
			while ((data2 = is2.read()) != -1) { // IOEception이 필요함
				System.out.print((char)data2);
				}} catch(IOException E) {  // 여기서는 FileNotFoundException이 발생하는데, IOEception이 더 상위개념이라 포괄처리가   가능함.
					System.out.println("예외상황 발생, 파일을 읽을 수 없습니다");
		}finally {
			if(is2 != null ) {
				try {is2.close();} catch (IOException e) {}
			}
				
		}
		

		
	// 문서의끝
	}
}
