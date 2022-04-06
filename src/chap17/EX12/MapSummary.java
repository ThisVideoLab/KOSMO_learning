package chap17.EX12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Map<K,V> 정리 : K는 중복될 수 없음.
	//1. HashMap : Key를 기준으로 랜덤하게 출력됨. 메서드가 동기화 안 됨, 싱글쓰레드환경에 사용하기 적합함 
	//2. HashTable : 모든 메서드가 동가회되어 있음. 멀티 쓰레드 환경에서 사용됨.
	//3. LinkedHashMap: 입력 순서대로 출력
	//4. TreeMap: 오름차순으로 정렬되어 입력됨, comparable<E>, comparator<E>

public class MapSummary {
	public static void main(String[] args) {

		
		

		//1. HashMap: 입력 순서와 출력 순서가 다름.
		System.out.println("=====================");
		System.out.println("1. HashMap:");System.out.println();
		
		Map <String, Integer> hashMap = new HashMap<>();
		hashMap.put("다", 30);
		hashMap.put("마", 40);
		hashMap.put("나", 50);
		hashMap.put("가", 60);
		System.out.println(hashMap);
		
		
		//2. HashTable: 입력순서와 출력 순서가 다르다. <동기화가 되어있다> 멀티쓰레드 환경에 적합함
		System.out.println("=====================");
		System.out.println("2. HashTable:");System.out.println();
		
		Map <String, Integer> hashTable = new Hashtable<>();
		hashTable.put("다", 30);
		hashTable.put("마", 40);
		hashTable.put("나", 50);
		hashTable.put("가", 60);
		System.out.println(hashTable);
		
		//3. LinkedHashMap: 입력순서와 출력 순서가 같다. 손에 손을 잡는 형태와 같음
		System.out.println("=====================");
		System.out.println("2. HashTable:");System.out.println();
		
		Map <String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("다", 30);
		linkedHashMap.put("마", 40);
		linkedHashMap.put("나", 50);
		linkedHashMap.put("가", 60);
		System.out.println(linkedHashMap);
		
		//4. TreeMap: 오름차순 정렬되어 저장 (Map <K,V> :key를 기준으로 오름차순 정렬
		System.out.println("=====================");
		System.out.println("4. TreeMap:");System.out.println();
		
		Map <String, Integer> treeMap = new TreeMap<>();
		treeMap.put("다", 30);
		treeMap.put("마", 40);
		treeMap.put("나", 50);
		treeMap.put("가", 60);
		System.out.println(treeMap);
		

		
	//문서의끝
	}
}
