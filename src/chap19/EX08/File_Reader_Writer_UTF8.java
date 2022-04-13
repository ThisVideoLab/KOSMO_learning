package chap19.EX08;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class File_Reader_Writer_UTF8 {
	public static void main(String[] args) {

		//1. 파일 객체 생성
		File rwFile = new File("src/chap19/EX08/rwFile_uft8.txt");
		
		try {Writer writer1 = new FileWriter(rwFile);
		// Writer: char 단위의 출력, FileWriter로 구현함. 문자를 특화해서 처리함.
		// OutputStream: byte 단위 출력, 추상 클래스, FileOutputStream으로 구현함. 문자, 데이터, MP3, JPGM AVG 등의 모든 처리가 가능함.
		
		writer1.write("안녕하세요\n".toCharArray()); // 
		writer1.write("Hello\n");
		writer1.write('A');
		writer1.write('\r');
		writer1.write('\n');
		writer1.write("반갑습니다",2,3);
		writer1.flush();
		
		} catch (IOException e) {} // Writer : 추상 클래스, FileWriter: Writer를 구현한 자식 클래스
		
		//2. FileReader를 이용한 파일 읽기 (Default Charset : UTF8) < == 별도의 Charset 지정 옵션이 없어서 디폴트를 따라감
		
		try (Reader reader1 = new FileReader(rwFile);){
			int data;
			while ((data = reader1.read()) != -1) {
				System.out.println((char)data);
			}
		} catch (Exception e) {}
		
	//문서의끝
	}
}
