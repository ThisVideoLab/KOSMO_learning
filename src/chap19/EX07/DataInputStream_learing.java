package chap19.EX07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
// InputStream: 기반 스트림
	// int 5555를 입력하면 한 byte 단위로 읽어서 전송  한 후에 그걸 다시 조립한 뒤에 int 5555로 출력함
// DataInputStream: 추가기능을 제공하는 스트림, 기반 스트림이 반드시 존재, 단독으로 사용할 수 없음.
   // 다양한 포멧의 데이터를 빠르게 전송할 때 사용함.
   // int  ==> int, double => double 식으로 바로바로 가져오고 내보냄.


public class DataInputStream_learing {
	public static void main(String[] args) {
		
		//1. 파일 생성
		File dataFile = new File ("src/chap19/EX07/file1.data");
		
		//2. 데이터 쓰기
		
		try (OutputStream os = new FileOutputStream(dataFile);
			DataOutputStream dos = new DataOutputStream(os);) // 이 DataOutputStream은 추가기능으로, 반드시 OutputStream과 같은 기반 스트림이 필요함.
		{
			dos.write(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
			dos.close();
			
		} catch (Exception e) {} // 모든 예외의 최상위 클래스 Exception : 거의 모든 예외 처리 가능
		
		
		//3. 데이터 읽기
		
		try (InputStream is = new FileInputStream(dataFile);
			DataInputStream dis = new DataInputStream(is);)
			{
			System.out.println(dis.read());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {

		}

	// 문서의끝
	}
}
