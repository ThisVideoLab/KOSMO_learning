package chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList vs LinkedList
// ArrayList : 값에 대헤서 index 값을 가지고 있다. 검색 속도가 빠르다.
			//단점 : 중간에서 값을 추가/삭제 시 부하가 굉장히 많이 걸린다.
//LinkedList : 각 각의 값은 앞뒤의 연결고리만 가지고 있다. 검색시에 index번호가 할당된다. 검색이 ArrayList에 비해서 느리다.
			//장점 : 중간에 값을 추가/삭제 시 부하가 걸리지 않는다.




public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		//1. 데이터를 추가시간 비교.
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();
		long startTime =0, endTime=0;
		
		//1-1 ArrayList에서 데이터 추가 시간
		startTime =System.nanoTime();	//System.nanoTime();
		for(int i =0; i<100000; i++) {
			aList.add(0,i);
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 데이터 추가 시간: " +(endTime-startTime)+"ns");
		
		//1-2 LinkedList에서 데이터 추가 시간
		startTime =System.nanoTime();	//System.nanoTime();
		for(int i =0; i<100000; i++) {
			linkedlist.add(0,i);
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 데이터 추가 시간: " +(endTime-startTime)+"ns");
		
		System.out.println("================================================");
		
		
		//2. 검색시 비교 : Array List가 LinkedList보다 빠르다.
		//2-1 ArrayList에서 데이터 검색 시간
		startTime =System.nanoTime();	//System.nanoTime();
		for(int i =0; i<100000; i++) {
			aList.get(i);
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 데이터 검색 시간: " +(endTime-startTime)+"ns");
		
		//2-2 LinkedList에서 데이터 추가 시간
		startTime =System.nanoTime();	//System.nanoTime();
		for(int i =0; i<100000; i++) {
			linkedlist.get(i);
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 데이터 추가 시간: " +(endTime-startTime)+"ns");
		
		System.out.println("================================================");		
		
		//3. 데이터 삭제시 실행 시간 비교 : LinkedList가 훨씬 빠르다.
		//3-1 ArrayList에서 데이터 삭제 시간
		startTime =System.nanoTime();	//System.nanoTime();
		for(int i =0; i<100000; i++) {
			aList.remove(0);
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 데이터 삭제 시간: " +(endTime-startTime)+"ns");
		
		//3-2 LinkedList에서 데이터 제거 시간
		startTime =System.nanoTime();	//System.nanoTime();
		for(int i =0; i<100000; i++) {
			linkedlist.remove(0);
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 데이터 삭제 시간: " +(endTime-startTime)+"ns");
		
	
		
		
	}

}
