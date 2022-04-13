package chap19.EX08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStreamReader: byte 데이터를 char 포멧으로 변환하는 객체.
// byte 포맷은 인코딩을 잘 지정해줘야 하나, char 포맷으로 바꾸면 인코딩 타입을 신경 쓸 필요가 없음.

public class InputStreamReader_1 {
	public static void main(String[] args) {

	//1. 파일 객체 생성
	File isr1 = new File("src/chap19/EX08/isr1.txt");
	
	//2. FileReader로 읽기 (MS949 -> UTF8 읽기 : 깨짐)
	System.out.println("=========================================");
	System.out.println("2. FileReader로 읽기 (MS949 -> UTF8 읽기 : 깨짐)");System.out.println();
	
	try (Reader reader1 = new FileReader(isr1);){ //FileReader는 인코딩이 안됨. default Encording만 사용함.
		int data;
		while((data = reader1.read()) != -1) {
			System.out.print((char)data);
		}
	} catch (Exception e) {} 
	System.out.println();System.out.println();
		
	//3. FileInputStream + InputStreamReader를 이용한 파일 읽기
	//   InputStreamReader(is1, "UTF-8") => byte 형태의 is1 객체 -> UTF8 형태로 전환하는 것이 핵심.
	System.out.println("=========================================");
	System.out.println("3. FileInputStream + InputStreamReader를 이용한 파일 읽기");System.out.println();
	try(InputStream is1 = new FileInputStream(isr1);
			InputStreamReader isr2 = new InputStreamReader(is1, "UTF-8");){
		int data;
		while ((data = isr2.read()) != -1) {
			System.out.print((char)data);
		}
	}catch (Exception e) {}
	
	//문서의끝
	}
}
