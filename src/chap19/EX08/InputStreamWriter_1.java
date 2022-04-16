package chap19.EX08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//InputStreamReader: byte => char
//OutputStreamReader: byte => char (Charset을 지정해서 파일을 저장할 수 있음)

public class InputStreamWriter_1 {
	public static void main(String[] args) {
		
	//1. FileWriter를 통해서 데이터 쓰기 (Default: MS949)
	System.out.println("=========================================");
	System.out.println("1. FileWriter를 통해서 데이터 쓰기 (Default: MS949)");System.out.println();
	
	File osw1 = new File ("src/chap19/EX08/osw1.txt");
	File osw2 = new File ("src/chap19/EX08/odw2.txt");
	
	try (Writer writer1 = new FileWriter(osw1);){
		
		writer1.write("outputStreamWriter1 예제파일입니다. \n".toCharArray()); // String을  char 배열에 저장함.
		writer1.write("한글과 영문이 모두 포함되어 있습니다.\n"); //String 그대로 표기
		writer1.write("Good Bye!!!\n\n");
		writer1.flush();
		
	} catch (IOException e) {}

	//2. FileWriter를 통해서 데이터 쓰기 (Default: MS949에서 UTF8로 작성)
	System.out.println("=========================================");
	System.out.println("2. FilㅈeWriter를 통해서 데이터 쓰기 (Default: MS949에서 UTF8로 작성)");System.out.println();
	
	try (OutputStream os1 = new FileOutputStream(osw2);
		OutputStreamWriter osw3 = new OutputStreamWriter(os1, "UTF-8");){ 
		// OutputStreamWriter: byte 타입을 char 타입으로 변경함
		
		osw3.write("outputStreamWriter1 예제파일입니다. \n".toCharArray()); // String을  char 배열에 저장함.
		osw3.write("한글과 영문이 모두 포함되어 있습니다.\n"); //String 그대로 표기
		osw3.write("Good Bye!!!\n\n");
		osw3.flush();
		
	} catch (IOException e) {}
	
	
		
	//문서의끝
	}
}
