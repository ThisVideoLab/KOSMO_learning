package chap19.EX02;

import java.io.File;

public class FileMethod {
	public static void main(String[] args) {

		//1. C:\에 작업 폴더 생성 (temp)
		File tempDir = new File("C:/temp");
		if(!tempDir.exists()) {tempDir.mkdir();}
		
		//2. 파일 객체 생성 (C:\windows)
		File file = new File("C:/windows");
		
		//3. 파일 객체의 여러 메서드 사용
		System.out.println("절대 경로 출력: " + file.getAbsolutePath());
		System.out.println("폴더의 존재 유무 (?): " + file.isDirectory());
		System.out.println("파일의 존재 유무 (?): " + file.isFile());
		System.out.println("파일/폴더의 이름 출력: " + file.getName()); // 파일, 폴더 이름 출력
		System.out.println("부모 폴더 출력: " + file.getParent()); // 부모 폴더를 출력
		System.out.println("=======================================");
		
		File newFile1 = new File("C:/temp01/abc");
		System.out.println(newFile1.mkdir()); // 폴더가 잘 생성된 경우: true; 폴더가 존재해서 생성되지 못한 경우 false
											  // 여러 이유로 인해 false: 생성을 못했다. (해당 폴더가 존재하는 경우, 권한 문제로 만들 수 없는 경우)
		
		System.out.println(newFile1.exists());
		System.out.println("=======================================");
		
		File newFile2 = new File("C:/temp01/abc/bcd/cde"); // 이렇게 하위 폴더를 한꺼번에 생성하는 것도 가능함
		System.out.println(newFile2.mkdir()); // /false, 하위 폴더까지 한번에 생성이 안됨.
		System.out.println(newFile2.mkdirs()); // true, 하위 폴더까지 한방에 생성 가능함
		System.out.println("=======================================");
		
		File newFile3 = new File("C:/temp01/def/hjk/klm");
		System.out.println(newFile3.mkdirs());
		
		//4. file 객체를 사용해서 하위 폴더의 정보를 추출함
		
		File[] fname = file.listFiles(); //file: "C:\windows" 하위의 모든 폴더나, 파일의 이름을 file 배열에 저장함
		
		for (File k: fname) {
			System.out.println(k.isDirectory() ? "폴더: " : "파일 :" + k.getName());
		}
		
		
	//문서의 끝
	}
}
