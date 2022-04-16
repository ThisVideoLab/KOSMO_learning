package chap19.EX08;
/*

조건------------------------------
1. 현재 파일의 default charset은 MS949인데, Reader와 Writer를 사용
2. 콘솔에서 한글을 넣으면 그것을 읽음
3. 읽은 내용을 C:\\Temp\a\aaa.txt (949);
			 C:\\Temp\b\bbb.txt (utf-8);
   의 두가지 포맷의 각기 다른 파일로 저장함.
4. 이 때 폴더 생성은 이클립스에서 생성할 것
5. 이 때 있으면 다시 저장안하는 기능을 추가할 것.
6. 다시 이 두 파일을 읽어들이기
7. 콘솔창에서 읽은 내용을 깨짐없이 출력하기.

제출 시간: 
완료시간:

*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class EX_Reader_Writer {
	public static void main(String[] args) { 

		//1. 폴더 생성
		System.out.println("=========================================");
		System.out.println("1. 폴더 생성");System.out.println();
		
		System.out.println("폴더의 유무를 확인합니다.");
		File forder = new File("C:\\temp\\a");
		if (!forder.exists()) {
			forder.mkdir();
			System.out.println("지정 경로에 폴더 a를 생성합니다.");
		}else {
			System.out.println("지정 경로에 이미 폴더 a가 존재합니다.");
		}System.out.println();
		
		//2. 파일 생성
		System.out.println("=========================================");
		System.out.println("2. 파일 생성");System.out.println();
				
		File exFile1 = new File("C:\\temp\\a\\aaa.txt");
		File exFile2 = new File("C:\\temp\\a\\bbb.txt");
		
		//3. Writer를 사용해 콘솔창의 내용을 쓰기
		
		System.out.println("<<한글을 입력하세요>>");
		
		try {
	         OutputStream os1 = new FileOutputStream(exFile1);
	         OutputStream os2 = new FileOutputStream(exFile2);
	         OutputStreamWriter ms = new OutputStreamWriter(os1 , "MS949");
	         OutputStreamWriter ut = new OutputStreamWriter(os2 , "UTF-8");
	         InputStreamReader is = new InputStreamReader(System.in);
	         int data;
	         while((data = is.read()) != '\n') {
	            ms.write(data);
	            ut.write(data);
	            
	            ms.flush();
	            ut.flush();
	         }
	      }catch(Exception e) {}
		
		
		//4. FileReader로 읽기
		System.out.println("4. FileReader로 읽기");
		
		//a) aaa 파일 읽기
		System.out.println("aaa 파일 읽기");
		try (Reader reader1 = new FileReader(exFile1);){ //FileReader는 인코딩이 안됨. default Encording만 사용함.
			int data;
			while((data = reader1.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {}
		
		//b) bbb 파일 읽기
		System.out.println("b) bbb 파일 읽기");
		try(InputStream is1 = new FileInputStream(exFile2);
				InputStreamReader isr2 = new InputStreamReader(is1, "UTF-8");){
			int data;
			while ((data = isr2.read()) != -1) {
				System.out.print((char)data);
			}
		}catch (Exception e) {}
		
		
	//문서의끝
	}
}
