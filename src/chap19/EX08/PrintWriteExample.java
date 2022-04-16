package chap19.EX08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//PrintWriter : 자동 flush() 기능이 있지만, 활성화해줘야함.
//              close()가 호출될 때 flush가 호출 된 후에 close()가 돌아감.

public class PrintWriteExample {
	public static void main(String[] args) {
		
			
		//1. 파일 객체 생성
			
		File pw1 = new File("src/chap19/EX08/pw1.txt");
		File pw2 = new File("src/chap19/EX08/pw2.txt");
		File pw3 = new File("src/chap19/EX08/pw3.txt");
		
		//2. PrintWriter (File file)
		System.out.println("=========================================");
		System.out.println("2. PrintWriter (File file)");System.out.println();
		
		try (PrintWriter prw1 = new PrintWriter(pw1);){
			prw1.println("PrintWriter 예제 #1");
			prw1.println(13);
			prw1.println(5.8);
			prw1.println("안녕하세요");
			prw1.println("반갑습니다. ");
			prw1.printf("%d, %s", 7, "안녕").printf("%d, %s", "안녕", 7);
			
		} catch (Exception e) {}
		
		//3. PrintWriter(OutputStream os)
		System.out.println("=========================================");
		System.out.println("3. PrintWriter(OutputStream os)");System.out.println();
		
		try (PrintWriter prw2 = new PrintWriter(new FileOutputStream(pw2));){
			prw2.println("PrintWriter 예제 #2");
			prw2.println(13);
			prw2.println(5.8);
			prw2.println("안녕하세요");
			prw2.println("반갑습니다. ");
			prw2.printf("%d, %s", 7, "안녕").printf("%d, %s", "안녕", 7);
			
		} catch (Exception e) {}	
	
		//4. PrintWriter(System.out을 통해 콘솔창에 출력)
		System.out.println("=========================================");
		System.out.println("4. PrintWriter(System.out을 통해 콘솔창에 출력)");System.out.println();

		PrintWriter prw3 = new PrintWriter(System.out,true);
			prw3.println("PrintWriter 예제 #3");
			prw3.println(13);
			prw3.println(5.8);
			prw3.print("안녕하세요");
			prw3.println("반갑습니다. ");
			prw3.printf("%d, %S", 7, "안녕").printf("%s, %f", "감사", 3.7);
			
			prw3.flush();
			prw3.close();
		
	//문서의끝
	}
}
