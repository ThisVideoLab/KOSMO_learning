package chap19.EX07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// BufferdInputStream : InputStream의 필터를 장착해서 읽기 성능을 아주 빠르게 한 스트림. 단독으로 사용이 불가능해 기반 스트림에 추가해서 써야함.
// BufferdOuntputStream : OutputStream의 필터를 장착해서 읽기 성능을 아주 빠르게 한 스트림. 단독으로 사용이 불가능해 기반 스트림에 추가해서 써야함.

public class BufferdInput_BufferdOuntput {
	public static void main(String[] args) {
		
		//1. 두 파일을 복사해서 Bufferd를 사용하지 않고 처리하는 경우, Bufferd를 사용한 경우를 비교해보자
		
		
		File orgfile1 = new File ("src/chap19/EX07/mycat_origin.jpg"); // 원본파일
		File copyfile1 = new File ("src/chap19/EX07/mycat_copy1.jpg"); // Bufferd를 사용하지 않고 처리하는 경우
		File copyfile2 = new File ("src/chap19/EX07/mycat_copy2.jpg"); //Bufferd를 사용한 경우

		// 성능 측정을 하기 위한 변수 선언
		long start, end, time1, time2; // time1: Buffered 적용 / time2 : Buffered 미적용
		
		
		//2. Bufferd를 사용하지 않고 처리하는 경우
		System.out.println("====================================");
		System.out.println("2. Bufferd를 사용하지 않고 처리하는 경우");System.out.println();
		
		start = System.nanoTime(); // 시작시간
		
		try (InputStream is = new FileInputStream(orgfile1);
			OutputStream os = new FileOutputStream(copyfile1);
				) {
			//데이타 복사 코드 생성
			
			int data;
			while ((data = is.read()) != -1) { // is에서 1-byte씩 읽어서 불러들인 후 
				os.write(data);  // os에 1-byte씩 써 넣는다. 다만 이는 buffer 영역 (RAM) 임.
			}
		} catch (IOException e) {}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without Buffered Input & Output Stream : " + time1); // 버퍼를 사용하지 않고 복사 -> 그 결과 copy1.jpg 파일이 만들어짐.
		
		
		//3. Bufferd를 사용해서 처리하는 경우
		System.out.println("====================================");
		System.out.println("3. Bufferd를 사용해서 처리하는 경우");System.out.println();
		
		
		start = System.nanoTime(); // 시작시간
		
		try (InputStream is = new FileInputStream(orgfile1);
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream(copyfile2);
			BufferedOutputStream bos = new BufferedOutputStream(os);
				){ 
			// 복사할 코드 생성
			int data;
			while ((data = bis.read()) != -1) { // is에서 1-byte씩 읽어서 불러들인 후 
				bos.write(data);  // bos에 1-byte씩 써 넣는다. 다만 이는 buffer 영역 (RAM) 임.
			}
		} catch (IOException e) {}
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With Buffered Input & Output Stream : " + time2); // 버퍼를 사용하지 않고 복사 -> 그 결과 copy1.jpg 파일이 만들어짐.
		
		//4. Buffered 사용한 경우 (time2), 사용하지 않는 경우 (time1)의 비교
		System.out.println("====================================");
		System.out.println("4. Buffered 사용한 경우 (time2), 사용하지 않는 경우 (time1)의 비교");System.out.println();
		
		System.out.println("buffer 사용 효율 : " + (time1/time2) +"배 속도 향상");
		
		
		
		
		
		
		
		System.out.println("===================================================");
		
		//5. 두 파일을 복사해서 Bufferd를 사용하지 않고 처리하는 경우, Bufferd를 사용한 경우를 비교해보자
		
		
		File orgfile2 = new File ("src/chap19/EX07/동영상1.mp4"); // 원본파일
		File copyfile3 = new File ("src/chap19/EX07/동영상1copy1.mp4"); // Bufferd를 사용하지 않고 처리하는 경우
		File copyfile4 = new File ("src/chap19/EX07/동영상1copy2.mp4"); //Bufferd를 사용한 경우

		// 성능 측정을 하기 위한 변수 선언
		
		//6. Bufferd를 사용하지 않고 처리하는 경우
		System.out.println("====================================");
		System.out.println("6. Bufferd를 사용하지 않고 처리하는 경우");System.out.println();
		
		start = System.nanoTime(); // 시작시간
		
		try (InputStream is = new FileInputStream(orgfile2);
			OutputStream os = new FileOutputStream(copyfile3);
				) {
			//데이타 복사 코드 생성
			
			int data;
			while ((data = is.read()) != -1) { // is에서 1-byte씩 읽어서 불러들인 후 
				os.write(data);  // os에 1-byte씩 써 넣는다. 다만 이는 buffer 영역 (RAM) 임.
			}
		} catch (IOException e) {}
		end = System.nanoTime();
		time1 = end - start;
		System.out.println("Without Buffered Input & Output Stream : " + time1); // 버퍼를 사용하지 않고 복사 -> 그 결과 copy1.jpg 파일이 만들어짐.
		
		
		//7. Bufferd를 사용해서 처리하는 경우
		System.out.println("====================================");
		System.out.println("7. Bufferd를 사용해서 처리하는 경우");System.out.println();
		
		
		start = System.nanoTime(); // 시작시간
		
		try (InputStream is = new FileInputStream(orgfile2);
			BufferedInputStream bis = new BufferedInputStream(is);
			OutputStream os = new FileOutputStream(copyfile4);
			BufferedOutputStream bos = new BufferedOutputStream(os);
				){ 
			// 복사할 코드 생성
			int data;
			while ((data = bis.read()) != -1) { // is에서 1-byte씩 읽어서 불러들인 후 
				bos.write(data);  // bos에 1-byte씩 써 넣는다. 다만 이는 buffer 영역 (RAM) 임.
			}
		} catch (IOException e) {}
		end = System.nanoTime();
		time2 = end - start;
		System.out.println("With Buffered Input & Output Stream : " + time2); // 버퍼를 사용하지 않고 복사 -> 그 결과 copy1.jpg 파일이 만들어짐.
		
		//8. Buffered 사용한 경우 (time2), 사용하지 않는 경우 (time1)의 비교
		System.out.println("====================================");
		System.out.println("8. Buffered 사용한 경우 (time2), 사용하지 않는 경우 (time1)의 비교");System.out.println();
		
		System.out.println("buffer 사용 효율 : " + (time1/time2) +"배 속도 향상");
		
	//문서의끝
	}
}
