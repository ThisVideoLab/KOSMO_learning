package chap19.EX01;

public class System_getProperty {
	public static void main(String[] args) {
	
		//System.getProperty() 메서드의 유용한 정보들
		
		System.out.println(System.getProperty("user.dir")); // 현재 작업 디렉토리를 출력함
		System.out.println(System.getProperty("java.version")); // 현재 java의 버전 출력
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.println(System.getProperty("java.home")); // java 설치 홈폴더
		System.out.println(System.getProperty("java.class.version"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("user.name")); // 로그온한 계정
		System.out.println(System.getProperty("user.home")); // 홈폴더
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("file.seperator"));
		System.out.println(System.getProperty("path.separator"));
		System.out.println(System.getProperty("line.separator"));
		
    //문서의끝
	}
}
