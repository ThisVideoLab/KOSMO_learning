package chap19.EX07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

// PrintStream으로 UTF-8 형식을 입출력해보자

public class PrintStreamExample_2 {
	public static void main(String[] args) {

		//1. 파일객체 생성
		File outFile1 = new File("src/chap19/EX07/printstream3.txt");
		File outFile2 = new File("src/chap19/EX07/printstream4.txt");
		
		//2. PrintStream 사용해서 파일을 생성하면서 출력하기
		// 다만 이렇게 파일을 만들 때 해당 파일이 생성되는 dfault 속성을 따라가므로, 최소 패키지의 전역 설정을 바꿔서 실행해야지
		// 원하는 타입으로 저장됨.
		
		try (PrintStream ps1 = new PrintStream(outFile1);){
			ps1.println(7); 
			ps1.println(5.8); 
			ps1.print(3 + "안녕" + 12345 + '\n'); 
			ps1.printf("%d 을 호출합니다. \n", 7 ); 
			ps1.printf("%s %f", "안녕", 5.8); 
		} catch (FileNotFoundException e) {}

		try (InputStream is1 = new FileInputStream(outFile1)){
			int count;
			byte[] byteArr1 = new byte[100];
			count = is1.read(byteArr1);
			System.out.println(new String(byteArr1,0,0,"UTF-8"));
			
		}catch (IOException e){}
		
	//문서의끝
	}
}
