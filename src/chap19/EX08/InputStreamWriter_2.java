package chap19.EX08;

import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 Reader / Writer : 추상 클래스, char를 처리함, 문자 (0), 이미지(x), MP3(x)  등등
 FileReader  / FileWriter : 추상 클래스인 Reader와 Writer를 상속받아 완성된 클래스. default charset만 사용
 InputStreamReader / OutputStreamWriter : 읽을 때 인코딩 (MS949, UTF-8) 지정해서 읽기, 쓰기도 인코딩 (MS949,UTF-8) 지정해서 쓰기 가능함.
 
 주의: System.in & System.out : 콘솔에서 입출력을 담당하는 코등인데, 한번 close()되면 더이상 기능을 하지 못함. 또한  close()안된 상태라도,
	  						   여러개의 System.in & System.out을 중복되게 깔아놓으면 입력 순서가 꼬여서 원하는 바대로 값을 입출력 할 수 없게 됨.
 
 */

public class InputStreamWriter_2 {
	public static void main(String[] args) {
		
	//1. 콘솔 출력 (Default: MS949) (application Default : MS949 -> MS949)
	System.out.println("=========================================");
	System.out.println("1. 콘솔 출력 (Default: MS949) (application Default : MS949 -> MS949)");System.out.println();
		
	try (OutputStreamWriter osw1 = new OutputStreamWriter(System.out,"MS949");){

		osw1.write("outputStreamWriter1 예제파일입니다. \n".toCharArray()); // String을  char 배열에 저장함.
		osw1.write("한글과 영문이 모두 포함되어 있습니다.\n"); //String 그대로 표기
		osw1.write("Good Bye!!!\n\n");
		osw1.flush();
		
	} catch (IOException e) {}
	
	//2. 콘솔 출력 (Default: MS949) (application Default : MS949 -> UTF-8)
	System.out.println("=========================================");
	System.out.println("2. 콘솔 출력 (Default: MS949) (application Default : MS949 -> UTF-8)");System.out.println();
	
	try (OutputStreamWriter osw2 = new OutputStreamWriter(System.out,"MS949");){

		osw2.write("outputStreamWriter1 예제파일입니다. \n".toCharArray()); // String을  char 배열에 저장함.
		osw2.write("한글과 영문이 모두 포함되어 있습니다.\n"); //String 그대로 표기
		osw2.write("Good Bye!!!\n\n");
		osw2.flush();
		
	} catch (IOException e) {}
		
		
		
		
		
		
		
		
		
		
	//문서의끝
	}
}
