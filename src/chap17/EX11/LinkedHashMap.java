package chap17.EX11;

//Map<K,V> : K <= Key, V < = Value 의 형식으로 데이터를 저장함
	// key는 중복될 수 없음, Set으로 관리하므로 애초에 중복이 불가능. 또한 index가 없음.  
	// value는 중복된 값을 넣을 수 없음.

	//HashMap: 출력이 랜덤하게 출력, 단일 쓰레드 황견에 적합함. 모든 메서드가 동기화되어있지 않아서 필요한때에 수동으로 해줘야 함.
	//HashTable: 모든 메서드가 동기화되어 있음. 멀티 쓰레드 환경에 적합함.
		// 모든 메서드는 HashMap과 동일함


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap {
	public static void main(String[] args) {

		Map<Integer, String> lhMap1 = new Hashtable<>();
		
		//1. put(K key, V value) : 값을 넣을 때System.out.println("=====================");
		System.out.println("=====================");
		System.out.println("1. put(K key, V value)");System.out.println();
		lhMap1.put(2, "나다라");
		lhMap1.put(1, "나다라");
		lhMap1.put(3, "나다라");
		lhMap1.put(3, "가가가");//  키는 중복저장될 수 없음. 기존재 값을 넣을 경우에는 기존값에 밸류를 덮어씌워버림
		
		System.out.println(lhMap1);
		
		//2. putAll(다른맵객체) : 다른 맵을 복사해서 사용
		System.out.println("=====================");
		System.out.println("2. putAll(다른맵객체) 주입");System.out.println();
		Map<Integer, String> hMap2 = new HashMap<>();
		hMap2.putAll(lhMap1);
		System.out.println(hMap2);
		
		//3. replace(K Key, V value); key에 저장된 값을 value로 수정
		System.out.println("=====================");
		System.out.println("3. replace(K Key, V value)");System.out.println();
		hMap2.replace(1, "가가가");
		hMap2.replace(4, "라라라"); // hMap2에서는 key3까지만 있고 key4는 존재하지 아니함. 그래도 예외는 발생 안하고 작동만 안됨.
		System.out.println(hMap2);
		
		//4. replace(K key, V oldValue, V newValue) : oldValue를 newValue로 수정함 
		System.out.println("=====================");
		System.out.println("4. replace(K key, V oldValue, V newValue)");System.out.println();
		hMap2.replace(1, "가가가", "가가가가");
		hMap2.replace(2, "잘못된값", "라라라라라"); // 올드밸류가 일치하지 않아서 실행되지 아니함.
		System.out.println(hMap2);
		
		//5. get(Object key) : Map의 값을 가져올 때, key를 넣어줘야 key에 할당된 value를 출력할 수 있음.
		System.out.println("=====================");
		System.out.println("5. et(Object key)");System.out.println();
		
		for(int i = 1; i<hMap2.size()+1; i++) {
			System.out.print(hMap2.get(i) + " ");
		}
		
		//6. containsKey(Object key) : 맵에 해당 키가 존재하는지 확인함 => true / false 값으로 출력됨
		System.out.println("=====================");
		System.out.println("6. containsKey(Object key)");System.out.println();
		System.out.println(hMap2.containsKey(1)); // true
		System.out.println(hMap2.containsKey(5)); // false
		
		//7. containsValue(Object value) : 맵에 해당 값이 존재하는지 확인함 => true / false 값으로 출력됨
		System.out.println("=====================");
		System.out.println("7. containsValue(Object value)");System.out.println();
		System.out.println(hMap2.containsValue("가가가가")); // true
		System.out.println(hMap2.containsValue("뇨니뇨니뇨")); // false
		
		//8. Set<K> keySet() : 키만 추출하는 방법
		System.out.println("=====================");
		System.out.println("8. Set<K> keySet()");System.out.println();
		Set<Integer> keySet = hMap2.keySet();
		System.out.println(keySet);
		
		//9. Set<Map.Entry<k,v>> entrySet() : 키와 셋을 모두 추출함
		System.out.println("=====================");
		System.out.println("9. Set<Map.Entry<k,v>> entrySet()");System.out.println();
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		
		//10. size(): 총 갯수
		System.out.println("=====================");
		System.out.println("10. size()");System.out.println();
		System.out.println(hMap2.size()); // 3이 출력
		
		//11. remove(Object key): 키값을 넣어서 해당 key의 entry 전체를 삭제
		System.out.println("=====================");
		System.out.println("11. remove(Object key)");System.out.println();
		hMap2.remove(1); // 1번 삭제 - 잘 삭제됨
		hMap2.remove(4); // 4번은 없어서 동작만 안하고 오류는 안남 
		System.out.println(hMap2);
		
		//12. remove(Object key, Object value): 키와 밸류가 정확히 일치하는 경우에 그 엔트리를 삭제함
		System.out.println("=====================");
		System.out.println("12. remove(Object key, Object value)");System.out.println();
		hMap2.remove(2, "나다라"); // 키값과 밸류가 정확히 일치함 = 삭제
		hMap2.remove(4,"따따따따따"); // 4번은 없어서 동작만 안하고 오류는 안남 
		System.out.println(hMap2);
		
		//13. clear(): 모든 리스트 삭제
		System.out.println("=====================");
		System.out.println("13. clear()");System.out.println();
		hMap2.clear();
		System.out.println(hMap2);
	// 문서의끝
	}
}
