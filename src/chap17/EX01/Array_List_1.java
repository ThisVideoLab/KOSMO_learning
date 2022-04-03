package chap17.EX01;

// java.lang 패키지의 클래스들은 import가 필요 없으나 그외 친구들은 전부 임포트가 필요함

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
   컬렉션:
   배열: 톨일한 자료형을 저장, 방의 크기가 고정되어 있음. 배열 생성시 방의 크기를 지정.
   방의 크기는 수정 불가능함.
   list<E> : 인터페이스, 제너릭 인터페이스 : 다양한 데이터 타입을 사용 가능함.
   : 인덱스(index)를 가지고 있음.  
   - ArrayList<E> : 싱글 쓰레드 환경에서 사용함
   - Vacrtor<E> : 멀티 쓰레드 환경에서 사용함
   - LinkedList<E> : 검색은 느리지만, 값을 추가하거나 삭제하는 동작이 빠름
*/

public class Array_List {
	public static void main(String[] args) {
		
		//1. 배열 
		String[]arr = new String[] {"가","나","다","라","마","바","사"};
		System.out.println(arr.length);
		arr[2] = null;
		arr[3] = null;
		System.out.println(arr.length);
		
		System.out.println("=============================");
		//2. Arrays.toString (배열변수)
		System.out.println(Arrays.toString(arr));
		
		//3. for 문을 사용한 출력
		for(int i = 0; i < arr.length ; i++ ) {
			if (i == 0) { // 첫 방 앞에 대괄호를 붙여라
				System.out.print("[" + arr[i]+", ");
			}else if (i == arr.length -1 ) { // 마지막 방번호에서는 , 출력하지 말고 방번호를 붙여라
				System.out.println(arr[i]+"]");
			}else {
				System.out.print(arr[i] + ", ");	
			}
		}
		
		
		System.out.println("=============================");
		//4 enhanced for 문을 사용해서 출력
		for(String k: arr) {
			System.out.print(k + ", ");
		}System.out.println();
		
		System.out.println("=============================");
		//5. List : 인터페이스이기 때문에 객체 생성이 불가능. list 
		
		List<String> aList1 = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();
		List<String> aList3 = new ArrayList();
		
		// List에서 방의 갯수 출력 : aList.size(); <== List, length(): 배열
		System.out.println(aList1.size()); //
		
		//List에 값 할당하기 : aList1.add("값"); // 제일 마지막에 값을 추가함.
		aList1.add("가");aList1.add("나");aList1.add("다");aList1.add("라");aList1.add("마");aList1.add("바");aList1.add("사");
		
		// List에 저장된 데이터의 갯수 구하기 : aList1.size();                                                                                                          
		System.out.println("aList1의 길이: " + aList1.size()); // 7
		
		// List에 저장된 값을 제거 : aList1.remove("삭제할 내용")
		aList1.remove("나");
		aList1.remove("바");
		System.out.println("aList1의 길이: " + aList1.size()); // 5
		
		//List는 index를 가지고 있다 (for)
		for (int i = 0; i < aList1.size(); i++) { // aList1.size() 방의 갯수 출력 
			System.out.print(aList1.get(i) + ", "); // 방마다의 값을 전부 출력
		}System.out.println();
		
		System.out.println("=============================");
		//2. Enhanced for 문을 사용해서 출력함
		
		
		System.out.println("=============================");
		//3. 객체의 toString()을 이용해서 출력
		System.out.println(aList1);
		System.out.println(aList1.toString());
		
		
	// 문서의 끝
	}

}
