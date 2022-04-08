package chap19.EX01;

import java.io.File;
import java.io.IOException;

// 주의 : 이클립스에서 파일을 생성시 C:// 에 생성할 때 권한 문제로 인한 오류가 발생할 수 있음.
// 해결책 : a) 이클립스를 관리자 권한으로 실행하기
// 폴더 내부에 파일을 생성함

// File 객체 내의 폴더 식별자를 적용할 경우
// C:\abc\abc.txt


//1. window인 경우: String path ="C:\\abc\\abc.txt"  "" 내에 특수문자를 처리하기 위한 기호. \
//2. MAC인 경우 : String path = "C:\abc\abc.txt"

// 맥과 윈도우 호환을 위한 공통 사용 코드의 작성 
// String path = "C:"+ File.seperator + "abc" + File.seperator + "abc.txt"


public class CreateFIleObject {
	public static void main(String[] args) throws IOException {
		
		//1. File 객체를 사용해서 폴더 생성
		System.out.println("=====================");
		System.out.println("1. File 객체를 사용해서 폴더 생성");System.out.println();
		
		File tempDir = new File("C:\\temp01");
		if (!tempDir.exists()) {
			tempDir.mkdir();}
		
		System.out.println(tempDir.exists());
		
		
		//2. File 객체를 사용해서 파일 생성
		System.out.println("=====================");
		System.out.println("2. File 객체를 사용해서 파일 생성");System.out.println();
		
		File tempTxt = new File("C:\\temp01\\tmepTxt.txt"); // 
		if (!tempTxt.exists()) {
			tempTxt.createNewFile();  // 파일을 생성할 때 예외가 발생할 수 있음. 고로 예외처리가 필요함.
		}
		
		//3. 파일 구분자
		System.out.println("=====================");
		System.out.println("3. 파일 구분자");System.out.println();
		
		File newFile2 = new File ("C:\\temp01\\newfile01.txt");
		File newFile3 = new File ("C:/temp01/newfile02.txt");
		
		if(!newFile2.exists()) {newFile2.createNewFile();}
		if(!newFile3.exists()) {newFile3.createNewFile();}
		
		File newFile4 = new File("C:" + File.separator + "temp01" + File.separator + "newfile03.txt");
		if(!newFile4.exists()) {newFile4.createNewFile();}
		
		//4. 절대 경로 지정 : 다른 시스템으로 이동된 경우 그 시세틈 환경에 맞도록 세팅이 필요함
		System.out.println("=====================");
		System.out.println("4. 절대 경로 지정");System.out.println();
		
		File newFile5 = new File ("C:/temp01/newfile05.txt"); // 절대경로로 처리
		System.out.println(newFile5.getAbsolutePath()); // file 객체에 저장된 파일의 절대경로를 출력함.
		
		//5. 상대 경로로 처리 : 현재 내가 작업하는 폴더의 위치를 알아야 함.보통 이걸 권장함
		System.out.println("=====================");
		System.out.println("5. 상대 경로로 처리");System.out.println();
		
		File newFile6 = new File("newFile06.txt");
		if (!newFile6.exists()) {newFile6.createNewFile();}
		System.out.println(newFile6.getAbsolutePath()); // file 객체에 저장된 파일의 절대경로를 출력함.
		
	// 문서의 끝
	} 
}
