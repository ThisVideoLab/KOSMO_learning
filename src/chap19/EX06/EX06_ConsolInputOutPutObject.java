package chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

//1. 콘솔에서 한글을 인풋 받고
//2. 인풋받은 값을 파일에 저장해보자.
//3. 저장경로 - EX06 패키지 내에 input.txt에 저장하도록
//4. 저장된 파일의 delimiter는 Charset.default 
//5. 배열의 크기는 100 byte 이하로 설정할 것.
//6. 예외처리는 쓰루로 통일
//7. 파일을 불러와서 출력하고 마무리

// 12:34분 시작 01:04분까지 제출할 것
// 12:43분에 완료함

public class EX06_ConsolInputOutPutObject {
	public static void main(String[] args) throws IOException { // 6번 조건 충족
		
		
		
		System.out.println("<<한글을 입력하시오>>");
		InputStream is =  System.in; // 1번 조건 충족
		
		byte[] byteArr1 = new byte[100]; // 5번 조건 충족
		int count = is.read(byteArr1);
		
		String str1 = new String(byteArr1, 0, count, Charset.defaultCharset()); 
		
		File outFile = new File("src/chap19/EX06/input.txt"); // 3번 조건 충족 
		OutputStream os = new FileOutputStream(outFile); 
		
		byteArr1= str1.getBytes(Charset.defaultCharset()); // 4번 조건 충족
		
		os.write(byteArr1);  
		os.flush(); // 2번 조건 충족
		os.close();
		
		File inFile = new File("src/chap19/EX06/input.txt");
		InputStream fis = new FileInputStream(inFile);
		
		int data;
		
		byte[] byteArr2= new byte[100]; 
		while((data = fis.read(byteArr2)) != -1){ 
				System.out.print(new String(byteArr2,Charset.defaultCharset())); //7번 충족
		}
		
	// 문서의끝
	}
}
