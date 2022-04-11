package chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
   1. is1 <== InputStream 객체 (절대경로로 접근) (일반 try catch 구문)
   2. is2 <== InputStream 객체 (상대경로로 접근) (try with resource 구문으로 처리)
   한글은 깨짐. 그냥 Exception으로 처리하라고 하심.
 */

public class EX3_Exception1  {
	public static void main(String[] args)  {

		File inFileAbsolute = new File("C:\\Users\\WEICHANG-PC45\\Desktop\\SI\\eclipse\\ThisVideoLab\\src\\chap19\\EX04\\exception-ms949.txt");
		File inFileRelative = new File("src\\chap19\\EX04\\exception-utf8.txt");
		
		
		// 12. is1를 절대 경로로 접근해서 처리하기
		System.out.println("==========================================================");
		System.out.println("is2를 상대 경로로 접근해서 try ~ with resource 구문으로 처리하기");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		InputStream is1 = null;
		
		try {
			is1 = new FileInputStream(inFileAbsolute);
			byte[] arr1 = new byte[is1.available()];
			
			while((is1.read(arr1))!=-1) {
			System.out.println(new String(arr1,Charset.forName("MS949")));
			}
		}
			catch(IOException E) { 
				System.out.println("예외상황 발생, 파일을 읽을 수 없습니다");
		}
		
		try {
			if(is1 != null) {
				is1.close();	
			}
		} catch (IOException e) {}
		
		// 2. is2를 상대 경로로 접근해서 try ~ with resource 구문으로 처리하기
		System.out.println("==========================================================");
		System.out.println("is2를 상대 경로로 접근해서 try ~ with resource 구문으로 처리하기");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		InputStream is2 = null ;
		
		try {
			is2 = new FileInputStream(inFileRelative);
			byte[] arr2 = new byte[is2.available()];
			while((is2.read(arr2))!=-1) {
			System.out.println(new String(arr2,Charset.forName("UTF-8")));
			}
        } catch (IOException e) {}
		
	//문서의끝
	}
}
