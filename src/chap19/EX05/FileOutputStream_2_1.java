package chap19.EX05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutputStream_2_1 {

	public static void main(String[] args) throws IOException {


		//1. 저장할 파일 생성.
		File outFile = new File("src/chap19/EX05/FileOutPutStream_2_1.txt"); // 기본적인 저장은 이클립스의 default charactorSet으로 저장.
		
		//2. n-byte 단위 쓰기 처리 (byte[] 배열의 처음부터 끝까지 쓰기)
		OutputStream os2 = new FileOutputStream(outFile, true);
		byte[] byteArr1 = "안녕하세요".getBytes(Charset.defaultCharset()); // String을 byte 배열에 저장함.
			  // 한글자에 2byte씩 처리 됨. 총 10byte
		os2.write(byteArr1);
		os2.write('\n');
		
		os2.flush();
		os2.close();
		
		//2. n-byte 단위 쓰기 처리 (byte[]의 offset부터 length개의 바이트 데이터 쓰기
		OutputStream os3 = new FileOutputStream(outFile,true);
		// byte[] byteArr2 = "반갑습니다.".getBytes(Charset.forName("MS949")); // MS949 케릭터셋으로 가져오기
		byte[] byteArr2 = "반갑습니다".getBytes(Charset.defaultCharset()); // 기본 케릭터 셋으로 가져오기
			//write(byte 배열, offset, length)
			//영어, 숫자, 특수문자 < == ASCII 코드로 1byte
		
		System.out.println(Charset.defaultCharset());
		
		os3.flush();
		os3.flush();

	//문서의 끝
	}
}
