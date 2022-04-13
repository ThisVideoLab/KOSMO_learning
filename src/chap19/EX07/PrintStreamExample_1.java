package chap19.EX07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

//PrintStream : filterStream 중 하나로, 추가기능을 제공하는 stream으로 기반 스트림이 필요함.
//				다양한 출력에 특화된 스트림으로, flush()를 호출하지 않아도 자동으로 flush해줌
//              print(), println(), printf() 등을 지원함
//              파일 출력 , 콘솔 출력등에 이동됨.

public class PrintStreamExample_1 {
	public static void main(String[] args) {
		
		//1. File 객체 생성.
		File outFile1 = new File("src/chap19/EX07/printstream1.txt");
		File outFile2 = new File("src/chap19/EX07/printstream2.txt");
		
		//2. PrintStream (FileOutputStream(File)) : 파일 아웃 스트림을 사용해서 파일에 출력
		
		try (OutputStream os1 = new FileOutputStream(outFile1);
			PrintStream ps1 = new PrintStream(os1);){ // FilterStream으로 추가기능을 제공하는 스트림, 반드시 기반 스트림이 필요함
			ps1.println(7); // int 출력
			ps1.println(5.8);  // double 출력, println() <== 출력 후 라인 개행
			ps1.print(3 + "안녕" + 12345 + '\n'); // 복합 출력, print() 출력 후 라인 미개행 => 그러나 '\n'을 넣어서 별도 개행처리
			ps1.printf("%d 이 호출되었습니다.\n", 7 ); // "%d"의 위치에 뒤의 정수 7을 출력함
			ps1.printf("%s %f", "안녕", 5.8); // %s : 후행 string 값을 호출함. / %f 후행 double값을 호출함
		} catch (IOException e) {}
		
		//3. PrintStream(File) : 파일에 직접 출력
		
		try (PrintStream ps2 = new PrintStream(outFile2);){ // FilterStream으로 추가기능을 제공하는 스트림, 반드시 기반 스트림이 필요함
			 ps2.println(7); // int 출력
			 ps2.println(5.8);  // double 출력, println() <== 출력 후 라인 개행
			 ps2.print(3 + "안녕" + 12345 + '\n'); // 복합 출력, print() 출력 후 라인 미개행 => 그러나 '\n'을 넣어서 별도 개행처리
			 ps2.printf("%d 이 호출되었습니다.\n", 7 ); // "%d"의 위치에 뒤의 정수 7을 출력함
			 ps2.printf("%s %f", "안녕", 5.8); // %s : 후행 string 값을 호출함. / %f 후행 double값을 호출함
		} catch (IOException e) {}
		
		//4. PrintStream ps = System.out < == 콘솔에 출력
			 // 
		try(
		OutputStream os2 = System.out;
		PrintStream ps3 = new PrintStream(os2);){
			 ps3.println(7); // int 출력
			 ps3.println(5.8);  // double 출력, println() <== 출력 후 라인 개행
			 ps3.print(3 + "안녕" + 12345 + '\n'); // 복합 출력, print() 출력 후 라인 미개행 => 그러나 '\n'을 넣어서 별도 개행처리
			 ps3.printf("%d 이 호출되었습니다.\n", 7 ); // "%d"의 위치에 뒤의 정수 7을 출력함
			 ps3.printf("%s %f", "안녕", 5.8); // %s : 후행 string 값을 호출함. / %f 후행 double값을 호출함
		}catch (IOException e) {}
		
		//5. PrintStream ps = System.out < == 콘솔에 출력
		
		try(
			PrintStream ps4 = System.out;){
			 ps4.println(7); // int 출력
			 ps4.println(5.8);  // double 출력, println() <== 출력 후 라인 개행
			 ps4.print(3 + "안녕" + 12345 + '\n'); // 복합 출력, print() 출력 후 라인 미개행 => 그러나 '\n'을 넣어서 별도 개행처리
			 ps4.printf("%d 이 호출되었습니다.\n", 7 ); // "%d"의 위치에 뒤의 정수 7을 출력함
			 ps4.printf("%s %f", "안녕", 5.8); // %s : 후행 string 값을 호출함. / %f 후행 double값을 호출함
		}catch (Exception e) {}
		
	//문서의끝
	}
}
