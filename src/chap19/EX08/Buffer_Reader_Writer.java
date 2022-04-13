package chap19.EX08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Buffer_Reader_Writer {

	public static void main(String[] args) {

	//1. 파일 객체 생성
	File rwFile1 = new File("src/chap19/EX08/BufferedFile.txt");
	
	//2. FileWriter를 사용해서 파일 쓰기 (MS949 모드)
	
	try (Writer writer1 = new FileWriter (rwFile1);) {
		BufferedWriter bw1 = new BufferedWriter(writer1); // 성능을 향상하기 위한 Filter, 마찬가지로 기본 Writer를 필요로 함.
		
		bw1.write("안녕하세요\n");
		bw1.write("Hello");
		bw1.write("\r");
		bw1.write("\n");
		bw1.write("반갑습니다",2,3); // String, offset, length
		bw1.flush();
		
	} catch (IOException e) {}
	
	//3. FileReader를 이용한 파일 읽기 (Charset default: MS949 모드) 
	
	try(Reader reader1 = new FileReader(rwFile1);
		BufferedReader br1 = new BufferedReader(reader1);){
		// BufferedReader에 추가된 메서드 String readLine() : 한 라인씩 읽어나감. 더이상 읽을 수 없는 상태를 null로 구분함.
		// read()는 데이터 타입이 int인 점과 다름. 1-byte 씩 읽어나감. 더이상 읽을 수 없는 상태를 -1로 구분함.
		
		String data;
		
		while ((data = br1.readLine()) != null) {
			System.out.println(data);
		}
		
	}catch (IOException e) {}
	
	
		
	//문서의끝
	}
}
