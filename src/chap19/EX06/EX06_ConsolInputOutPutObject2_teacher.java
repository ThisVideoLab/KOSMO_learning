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

public class EX06_ConsolInputOutPutObject2_teacher {
	public static void main(String[] args) throws IOException { // 6번 조건 충족

		//1. 콘솔에서 한글을 인풋 받는다 (System.in) < == byte[]배열을 생성해서 처리: 한글을 처리
		InputStream is =  System.in; // new로 생성하지 않고 연결만 설정해 콘솔에서 인풋값을 받음.
		System.out.println("<<한글을 입력하시오>>");
		
		byte[] byteArr1 = new byte[100]; // 5번 조건 충족
		//int data = is.read(); // 영어는 문제 없이 읽을 수 있으나, 한글을 읽지 못함 => 한글은 배열에 넣어서 읽어야 재대로 처리됨 
								// data는 1-byte씩 읽은 값이 저장되기 때문임. 그래서 2-byte 이상인 한글은 무조건 깨짐
		int count = is.read(byteArr1); // byteArr1에 byte로 \r\n, count1 배열에 값이 들어온 갯수
		
		//2. 인풋받은 한글을 절대경로로 파일에 저장함.
		File f1 = new File("src/chap19/EX06/input.txt");
		OutputStream os = new FileOutputStream(f1); 
		
		String str1 = new String(byteArr1, 0, count, Charset.defaultCharset()); 
		byteArr1= str1.getBytes(Charset.defaultCharset()); // 4번 조건 충족
		
		os.write(byteArr1); // 버퍼(RAM)에만 쓰여짐.  
		os.flush(); // 2번 조건 충족
		
		//3. 저장한 파일에서 값을 읽어옴.
		InputStream fis = new FileInputStream(f1);
		byte[] byteArr2= new byte[100];
		
		int count2 =fis.read(byteArr2);// read(byte[]) : 한글처리
		//int count2 = fis.read()'; // read() : 1-byte씩 처리하므로 한글이 깨져서 출력됨.
		 
		System.out.println("읽어들인 내용을 콘솔에 출력합니다.");
		System.out.println();
		
		//4. 읽어들인 배열을 콘솔에 출력한다 (System.out)
		OutputStream fos = System.out;
		
		fos.write(byteArr2);
		fos.flush();
		
		fos.close();
		fis.close();
		is.close();
		os.close();
		
	// 문서의끝
	}
}
