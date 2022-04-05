package chap17.EX12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

//TreeMap <K,V> : 저장시에 KEY를 기준으로 오름차순으로 정렬되어 저장힘
	//출력시에 오름차순저렬되어 출력
	//Key에 일반 객체를 저장할 때 Comprable<E> compraeTo()를 재정의함. 객체 수정 및 재컴파일,
	//Comprarator<E> comprare()를 재정의함. 객체 수정 없이 새용함

//Map<K,V> <==sortedMap<K,V> (정렬 메서드 정의) <= NavigableMap<K,V> (검색 메서드 정의) <= TreeMap<K,V>
	//TreeMap을 사용할때는 타입을 TreeMap으로 지정해서 검색, 정렬의 메서드를 사용할 수 있음.

public class TreeMapMethod_1 {
	public static void main(String[] args) {

		//TreeMap <K,V>은 Map <K,V> 메서드를 모두 사용함. 추가적으로 SortedMap, NavigableMap의 추가적인 메서드를 사용할 수 있음.
		TreeMap <Integer,String> treeMap = new TreeMap();
		
		for(int i = 20; i >0; i-=2 ) {
			treeMap.put(i, i + "번째  data");
		}
		
		//1. firstKey() : 제일 첫번째 값을 출력함
		System.out.println("=====================");
		System.out.println("1. firstKey()");System.out.println();
		
		System.out.println(treeMap.firstKey()); // 2
		
		//2. firstEntry() : 제일 첫번째 entry를 출력함
		System.out.println("=====================");
		System.out.println("2. firstEntry()");System.out.println();
		
		System.out.println(treeMap.firstEntry()); // 2=2번째데이터
		
		//3. lastKey() : 제일 마지막 키값을 출력
		System.out.println("=====================");
		System.out.println("3. lastKey()");System.out.println();
		
		System.out.println(treeMap.lastKey()); // 20

		//4. lastEntry() : 제일 마지막 entry값을 출력
		System.out.println("=====================");
		System.out.println("lastEntry()");System.out.println();
		
		System.out.println(treeMap.lastEntry()); // 20=20번째  data
		
		//5. lowerKey() : 입력받은 키보다 한단계 낮은 키값이 출력됨.
		System.out.println("=====================");
		System.out.println("5. lowerKey()");System.out.println();
		
		System.out.println(treeMap.lowerKey(11)); //10이 출력됨
		
		//6. higerKey() : 입력받은 키보다 한단계 낮은 키값이 출력됨.
		System.out.println("=====================");
		System.out.println("6. higerKey()");System.out.println();
		
		System.out.println(treeMap.higherKey(11)); //12가 출력됨
		
		//7. pollFristEntry() : 첫번째 Entry의 값을 출력 한 뒤에 대상 객체 set 목록에서 제거함.
		System.out.println("=====================");
		System.out.println("7. pollFristEntry()");System.out.println();
		
		System.out.println(treeMap.pollFirstEntry()); // 2=2번째 data를 출력한 뒤에 목록에서 제거함
		// System.out.println(treeMap); // 찍어보면 2=2가 없어짐을 알 수 있지만 미관상 좋지 않아 생략함
		
		//8. pollLastEntry() : 마지막 Entry의 값을 출력 한 뒤에 대상 객체 set 목록에서 제거함.
		System.out.println("=====================");
		System.out.println("8. pollLastEntry()");System.out.println();
		
		System.out.println(treeMap.pollLastEntry()); // 20=20번째 data를 출력한 뒤에 목록에서 제거함
		// System.out.println(treeMap); // 찍어보면 20=20가 없어짐을 알 수 있지만 미관상 좋지 않아 생략함
		
		//9. sortedMap<K,V> headMap(K toKey) : 인풋받은 키의 head쪽으로 처리함.
		System.out.println("=====================");
		System.out.println("9. sortedMap<K,V> headMap(K toKey)");System.out.println();
		
		SortedMap<Integer, String> sMap =treeMap.headMap(8);
		System.out.println(sMap);
		
		//10. NavigableMap<K,V> headMap(K toKey, boolean inclusive) 
		System.out.println("=====================");
		System.out.println("10. NavigableMap<K,V> headMap(K toKey, boolean inclusive)");System.out.println();
		
		NavigableMap <Integer, String> nMap = treeMap.headMap(8,true); // key 8을 포함하면서 head쪽으로 모든 목록을 출력함
		System.out.println(nMap);
		
		//11. SortedMap<K,V> tailMap(K toKey) 
		System.out.println("=====================");
		System.out.println("11. SortedMap<K,V> tailMap(K toKey)");System.out.println();
		
		SortedMap <Integer,String> sMap2 = treeMap.tailMap(14);
		System.out.println(sMap2);
		
		//12. NavigableMap<K,V> tailMap(K toKey, boolean inclusive) 
		System.out.println("=====================");
		System.out.println("12. NavigableMap<K,V> tailMap(K toKey, boolean inclusive) ");System.out.println(); // 시작은 포함이 기본, 끝은 미포함이 기본
		NavigableMap<Integer,String> nMap2 = treeMap.tailMap(14, false);
		System.out.println(nMap2);
		
		//13. sortedMap<K,V> subMap(K fromKey, K toKey) : 특정 범위의 값을 저장함 
		System.out.println("=====================");
		System.out.println("13. sortedMap<K,V> subMap(K fromKey, K toKey) ");System.out.println(); // 시작은 포이 기본, 끝은 미포함이 기본
		
		SortedMap<Integer,String> subMap = treeMap.subMap(6, 10);
		System.out.println(subMap);
		
		//14. NavigableMap<K,V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive) 
		System.out.println("=====================");
		System.out.println("14. NavigableMap<K,V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)");System.out.println();
		
		NavigableMap<Integer,String> nSubMap = treeMap.subMap(6, true,10, true);
		System.out.println(nSubMap);
		
		//15. NavigableSet<K> descendingKeySet(): 현재 키 정렬을 반대로 출력 
		System.out.println("=====================");
		System.out.println("15. NavigableSet<K> descendingKeySet()");System.out.println();
		
		NavigableSet<Integer> nSet = treeMap.descendingKeySet(); 
		System.out.println(nSet);
		
		//16. NavigableMap<K,V> descendingKeySet(): 현재 정렬된 엔트리 순서를 역순으로 출력해줌
		System.out.println("=====================");
		System.out.println("16. NavigableMap<K,V> descendingKeySet()");System.out.println();
		
		NavigableMap<Integer, String> nvMap = treeMap.descendingMap();
		System.out.println(nvMap);
		System.out.println(nvMap.descendingMap()); // 해당 셋에 명령어를 넣어서 다시 정방향으로 뒤집기도 가능함.
		
		
	//문서의끝
	}
}
