package chap19.EX05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// InputStream는 추상 클래스임. 이것을 구체화 시킨 클래스가 FileInputStream
// InputStream는 추상 클래스임. 이것을 구체화 시킨 클래스가 FileOutputStream
// FileInputStream : byte() 단위의 데이터 읽기
// FileOutputStream : byte() 단위의 데이터 쓰기

// window에서 콘솔이나 메모장에서 enter 키를 누르면 \r\n

public class FileOutputStream_1 {
	public static void main(String[] args) throws IOException {
		
		//1. 입력 파일 생성 (존재하지 않음)
		File outfile = new File ("src/chap19/EX05/FileOutputStream_1.txt");

		//2. 1 -byte 읽기
		OutputStream os1 = new FileOutputStream(outfile);
			// FileOutputStream에 존재하지 않는 파일을 넣으면 실행시 생성됨.
			// FileOutputStream 경로에 존재해야 하고, 아니면 예외가 발생함.
		
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r'); // 13 엔터 // 생략가능
		os1.write('\n'); // 10 엔터
		
		// 중요 : write() 메서드는 버퍼(RAM)에 쓰기,
		//       flush() 메서드는 버퍼에 저장된 내용을 파일에 강제로 씀.
		os1.flush(); // 버퍼가 꽉차지 않더라도 강제로 파일에 쓰기를 함 <= 생략 가능함 write()와 flush() 함께 사용할 것을 권장함.
		os1.close(); // close() 호출시 flush()가 먼저 작동됨.
		
		//2. n- byte 단위 쓰기 (byte []의 offset부터 length개의 byte 데이터 쓰기
		
		OutputStream os2 = new FileOutputStream(outfile); // 덮어쓰기와 같은 효과가 발생함.
							// FileOutputStream(file o, Boolean append); // append = true : 이어쓰기, append = false(기본값) : 덮어쓰기 
		byte [] byeArr1 = "Hello!".getBytes(); // String => byte 로 변환하는 것이 getByte()
		
		os2.write(byeArr1);
		os2.write('\n'); // \r은 생략 가능 \n만 넣어도 windows에서 enter가 처리됨.
		
		os2.flush(); // 버퍼가 꽉차지 않더라도 강제로 파일에 쓰기를 함 <= 생략 가능함 write()와 flush() 함께 사용할 것을 권장함.
		os2.close(); // close() 호출시 flush()가 먼저 작동됨.
		
		//3. n- byte 단위 쓰기 (byte []의 offset부터 length개의 byte 데이터 쓰기
		
		OutputStream os3 = new FileOutputStream(outfile, true); // 덮어쓰기와 같은 효과가 발생함. // 이어쓰기
		byte[] byteArr2 = "Better the last smile than the first laughter".getBytes();
		os3.write(byteArr2,3,8); // write일때는 3바이트 뒤에서 8byte를 읽어서 저장 
								 // read일때는 반대로 처리함.
		os3.flush();
		os3.close();
		
	// 문서의 끝
	}
}
