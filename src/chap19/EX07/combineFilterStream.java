package chap19.EX07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


//하나의 기반 스트림에 Filter 스트림을 여러개 혼합해서 사용이 가능함
//제일 마지막에 처리하는 스트림의 메서드 사용여부에 따라 순서를 정할 수 있음.

//기반스트림 1: FileOutputStream : 기반 스트림, 파일에 쓰는 역할을 담당
//FilterStream 1: BufferedOutputStream : 버퍼를 사용한 속도 향상
//FilterStream 1: DataOutputStream : 다양한 포맷 방식으로 처리

public class combineFilterStream {
	public static void main(String[] args) {
		
		//1. 파일 생성
		File dataFile = new File ("src/chap19/EX07/file2.data");
		
		//2. 데이터 쓰기
		try (OutputStream os = new FileOutputStream(dataFile);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			DataOutputStream dos = new DataOutputStream(bos);)
		{
			dos.write(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
			
		} catch (Exception e) {} // 모든 예외의 최상위 클래스 Exception : 거의 모든 예외 처리 가능
		
		//3. 데이터 읽기
		
		try (InputStream is = new FileInputStream(dataFile);
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(bis);)
			{
			System.out.println(dis.read());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {}
		
	// 문서의끝
	}
}
