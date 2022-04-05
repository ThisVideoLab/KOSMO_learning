package chap17.EX08;

import java.util.HashSet;
import java.util.Set;

//set: 중복되지 않는 값을 저장 (euals(), hashcode() 메서드를 재정의), Wrapper 클래스는 모두 재정의
	// 1. hashSet : 출력되는 것이 랜덤하게 출력됨.
	// 2. LinkedHeshSet : 입력되는 대로 출력됨.
	// 3. TreeSet : 입력값을 넣으면 내부적으로 정렬. 오름차순으로 정렬되어 출력함. 다만 오버라이드해야 함.

public class SetSummary {
	public static void main(String[] args) {

		//1. HashSet
		System.out.println("=====hashSet=====");
		
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("다");
		hashSet.add("마");
		hashSet.add("나");
		hashSet.add("가");
		
		System.out.println(hashSet);
		
		//2. LinkedHeshSet
		System.out.println("=====LinkedHeshSet=====");
		
		Set<String> LinkedHeshSet = new HashSet<String>();
		LinkedHeshSet.add("다");
		LinkedHeshSet.add("마");
		LinkedHeshSet.add("나");
		LinkedHeshSet.add("가");
		
		System.out.println(LinkedHeshSet);
		
		//3.TreeSet
		System.out.println("=====TreeSet=====");
		
		Set<String> ts1 = new HashSet<String>();
		ts1.add("다");
		ts1.add("마");
		ts1.add("나");
		ts1.add("가");
		
		System.out.println(ts1);
		
	// 문서의끝
	}
}
