package chap17.EX05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {
	public static void main(String[] args) {
		
		// 메서드의 사용법, 구성 결과는 일견 같아보임. 다만 쓰임에 차이가 있음.
		
		//1. ArrayList
		
		List<String> arrayList = new ArrayList();
		arrayList.add("다");
		arrayList.add("마");
		arrayList.add("나");
		arrayList.add("가");
		System.out.println(arrayList);
		
		//2. Vector
		
		List<String> vector = new Vector();
		vector.add("다");
		vector.add("마");
		vector.add("나");
		vector.add("가");
		System.out.println(vector);
		
		//3. LinkedList
		
		List<String> linkedList = new LinkedList();
		linkedList.add("다");
		linkedList.add("마");
		linkedList.add("나");
		linkedList.add("가");
		System.out.println(	linkedList);
		
		
		
		
		
		
	// 문서의 끝
	}
}
