package chap19.EX03;

import java.nio.charset.Charset;

public class CreateCharsetObject {
	public static void main(String[] args) {
		
	// 문자 엔코딩을 설정하는 방법
    //1. ch

	Charset cs1 = Charset.defaultCharset(); // 정적 메서드, 시스템의 기본 설정도니 charset을 로드함
	System.out.println("1. " + cs1); // MS949 ->> X-Windows 949 (ms 949의 확장)
							// UTF-8
	
	//2. Charset.forName("MS949"); < == 직접 할당해서 사용
	Charset cs2 = Charset.forName("MS949");
	System.out.println("2. " + cs2);
	
	//3. Charset.forName("UTF-8"); < == 직접 할당해서 사용
	Charset cs3 = Charset.forName("UTF-8");
	System.out.println("3. " + cs3);
	
	//4. Charset.forName("EUK-KR"); < == 직접 할당해서 사용 // 존재하지 않는 인코딩을 넣으면 예외가 발생할 가능성이 있음.
	Charset cs4 = Charset.forName("EUC-KR");
	System.out.println("4. " + cs4);
	
	System.out.println();
	
	System.out.println(Charset.isSupported("MS949"));
	System.out.println(Charset.isSupported("UTF-8"));
	System.out.println(Charset.isSupported("EUC-KR"));
	
	// 문서의끝
	}
}
