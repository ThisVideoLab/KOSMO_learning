package chap05;

public class CreateStringObject {

	public static void main(String[] args) {
		
		//1. String 객체 생성 1: new 키를 사용해서 객체 생성 : Heap 영역의 별도의 공간에 저장이 된다.
			// RAM의 값을 절대 공유하지 않는다.
		
		String str1 = new String("안녕"); // new 키 객체를 생성하는 키워드 (heap 메모리에 저장)
										// String은 객체를 출력햇을 때 객체의 값이 출력됨. 이는 스트링만 가지는 특수한 기능.
										// 객체 자체를 출력하면 heap 메모리의 번지가 나옴. 객체의 값을 출력할때는 객체명.toString()을 재정의함.
		
		String str11 = new String("안녕"); // 뉴라고 지정해줬기 때문에 굳이 따로 만들어서 str1과 str2는 별도의 메모리 공간에 저장(Heap)
		
		if(str1 == str11) { // == 연산자는 참조 자료형일 때, 참조하는 주소를 비교함. 반대로 기본 자료형일때는 기본적인 값 자체를 비교함.
			System.out.println(true);
		}
		else { // == 별도의 주소를 가리킴
			System.out.println(false);
		}
		
		System.out.println("==========");
		
		
		
		
		
		//2. 리터럴 값을 바로 할당: 같은 값일 경우 RAM의 값을 공유하게 된다.
		
		String str2 = "안녕하세요"; // 이 리터럴의 값을 바로 할당하는 방법. 참고로 변수에 들어가는 값들을 총칭하는 표현이 리터럴.
		String str22 = "안녕하세요"; // 이미 힙영역에 같은 리터럴이 있다면 동일한 메모리 공간을 공유하게 됨 (Heap영역)
		
		
		
		
		
	}

}
