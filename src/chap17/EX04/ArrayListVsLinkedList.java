package chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList vs LinkedList
// ArrayList : 값에 대해서 index값을 가지고 있음.
		//단점: 중간에서 값을 추가/삭제 시 부하가 굉장히 많이 걸림
// LinkedList: 각각의 값은 앞뒤의 연결고리만 가지고 있다. 검색시에 index 번호가 할당된다. 검색에 ArrayList에 비해서 느리다.
		// 장점: 중간에 값을 추가/삭제 시 부하가 걸리지 않는다.
	
public class ArrayListVSLinkedList {
	public static void main(String[] args) {

		
		//1. 데이터를 추가한 후 시간을 비교해보자
		List<Integer> aList1 = new ArrayList<Integer>();
		List<Integer> linkedList1 = new LinkedList<Integer>();
		long startTime = 0, endTime = 0;
		
		//1-1 Array List에서 데이터 추가 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			aList1.add(0,i); // 0번째 방에서 계속해서 10만번째까지, 꼐속뒤로 밀리면서 갑ㅎ이 추가됨.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 10만번 추가한 시간: " + (endTime - startTime) + "ns");
		
		//1-2 LinkedList에서의 데이터 추가 시간
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			linkedList1.add(0,i); // 0번째 방에서 계속해서 10만번째까지, 꼐속뒤로 밀리면서 갑ㅎ이 추가됨.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 10만번 추가한 시간: " + (endTime - startTime) + "ns");
		
		System.out.println("=============================================");
		
		//2. 검색시 비교 : Array list가 LinkedList보다 빠르다.
		//2-1. ArrayList의 검색시간
		startTime = System.nanoTime();  
		for( int i = 0; i <10000; i++) {
			aList1.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 데이터 검색 시간:: " + (endTime - startTime) + "ns");
		
		//2-2. LinkedList의 검색시간
		startTime = System.nanoTime();  
		for( int i = 0; i <10000; i++) {
			linkedList1.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에서 데이터 검색 시간: " + (endTime - startTime) + "ns");
		
		
		System.out.println("=============================================");
		System.out.println();
		//3.데이터 삭제시 실행 시간 비교: LinkedList가 훨씬 빠름
		//3-1. ArrayList
		startTime = System.nanoTime();
		for( int i = 0; i <10000; i++) {
			aList1.remove(0);
		}
		
		System.out.println("ArrayList t에서 데이터 삭제시간: " + (endTime - startTime) + "ns");
		
		//3-2. LinkedList
				startTime = System.nanoTime();
				for( int i = 0; i <10000; i++) {
			 		linkedList1.remove(0);
				}
		endTime = System.nanoTime();
		System.out.println("LinkedList에서 데이터 삭제 시간: " + (endTime - startTime) + "ns");
		
	// 문서의 끝
	}

}
