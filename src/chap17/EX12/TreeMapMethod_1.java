package chap17.EX12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

//TreeMap <K,V> : ����ÿ� KEY�� �������� ������������ ���ĵǾ� ������
	//��½ÿ� �����������ĵǾ� ���
	//Key�� �Ϲ� ��ü�� ������ �� Comprable<E> compraeTo()�� ��������. ��ü ���� �� ��������,
	//Comprarator<E> comprare()�� ��������. ��ü ���� ���� ������

//Map<K,V> <==sortedMap<K,V> (���� �޼��� ����) <= NavigableMap<K,V> (�˻� �޼��� ����) <= TreeMap<K,V>
	//TreeMap�� ����Ҷ��� Ÿ���� TreeMap���� �����ؼ� �˻�, ������ �޼��带 ����� �� ����.

public class TreeMapMethod_1 {
	public static void main(String[] args) {

		//TreeMap <K,V>�� Map <K,V> �޼��带 ��� �����. �߰������� SortedMap, NavigableMap�� �߰����� �޼��带 ����� �� ����.
		TreeMap <Integer,String> treeMap = new TreeMap();
		
		for(int i = 20; i >0; i-=2 ) {
			treeMap.put(i, i + "��°  data");
		}
		
		//1. firstKey() : ���� ù��° ���� �����
		System.out.println("=====================");
		System.out.println("1. firstKey()");System.out.println();
		
		System.out.println(treeMap.firstKey()); // 2
		
		//2. firstEntry() : ���� ù��° entry�� �����
		System.out.println("=====================");
		System.out.println("2. firstEntry()");System.out.println();
		
		System.out.println(treeMap.firstEntry()); // 2=2��°������
		
		//3. lastKey() : ���� ������ Ű���� ���
		System.out.println("=====================");
		System.out.println("3. lastKey()");System.out.println();
		
		System.out.println(treeMap.lastKey()); // 20

		//4. lastEntry() : ���� ������ entry���� ���
		System.out.println("=====================");
		System.out.println("lastEntry()");System.out.println();
		
		System.out.println(treeMap.lastEntry()); // 20=20��°  data
		
		//5. lowerKey() : �Է¹��� Ű���� �Ѵܰ� ���� Ű���� ��µ�.
		System.out.println("=====================");
		System.out.println("5. lowerKey()");System.out.println();
		
		System.out.println(treeMap.lowerKey(11)); //10�� ��µ�
		
		//6. higerKey() : �Է¹��� Ű���� �Ѵܰ� ���� Ű���� ��µ�.
		System.out.println("=====================");
		System.out.println("6. higerKey()");System.out.println();
		
		System.out.println(treeMap.higherKey(11)); //12�� ��µ�
		
		//7. pollFristEntry() : ù��° Entry�� ���� ��� �� �ڿ� ��� ��ü set ��Ͽ��� ������.
		System.out.println("=====================");
		System.out.println("7. pollFristEntry()");System.out.println();
		
		System.out.println(treeMap.pollFirstEntry()); // 2=2��° data�� ����� �ڿ� ��Ͽ��� ������
		// System.out.println(treeMap); // ���� 2=2�� �������� �� �� ������ �̰��� ���� �ʾ� ������
		
		//8. pollLastEntry() : ������ Entry�� ���� ��� �� �ڿ� ��� ��ü set ��Ͽ��� ������.
		System.out.println("=====================");
		System.out.println("8. pollLastEntry()");System.out.println();
		
		System.out.println(treeMap.pollLastEntry()); // 20=20��° data�� ����� �ڿ� ��Ͽ��� ������
		// System.out.println(treeMap); // ���� 20=20�� �������� �� �� ������ �̰��� ���� �ʾ� ������
		
		//9. sortedMap<K,V> headMap(K toKey) : ��ǲ���� Ű�� head������ ó����.
		System.out.println("=====================");
		System.out.println("9. sortedMap<K,V> headMap(K toKey)");System.out.println();
		
		SortedMap<Integer, String> sMap =treeMap.headMap(8);
		System.out.println(sMap);
		
		//10. NavigableMap<K,V> headMap(K toKey, boolean inclusive) 
		System.out.println("=====================");
		System.out.println("10. NavigableMap<K,V> headMap(K toKey, boolean inclusive)");System.out.println();
		
		NavigableMap <Integer, String> nMap = treeMap.headMap(8,true); // key 8�� �����ϸ鼭 head������ ��� ����� �����
		System.out.println(nMap);
		
		//11. SortedMap<K,V> tailMap(K toKey) 
		System.out.println("=====================");
		System.out.println("11. SortedMap<K,V> tailMap(K toKey)");System.out.println();
		
		SortedMap <Integer,String> sMap2 = treeMap.tailMap(14);
		System.out.println(sMap2);
		
		//12. NavigableMap<K,V> tailMap(K toKey, boolean inclusive) 
		System.out.println("=====================");
		System.out.println("12. NavigableMap<K,V> tailMap(K toKey, boolean inclusive) ");System.out.println(); // ������ ������ �⺻, ���� �������� �⺻
		NavigableMap<Integer,String> nMap2 = treeMap.tailMap(14, false);
		System.out.println(nMap2);
		
		//13. sortedMap<K,V> subMap(K fromKey, K toKey) : Ư�� ������ ���� ������ 
		System.out.println("=====================");
		System.out.println("13. sortedMap<K,V> subMap(K fromKey, K toKey) ");System.out.println(); // ������ ���� �⺻, ���� �������� �⺻
		
		SortedMap<Integer,String> subMap = treeMap.subMap(6, 10);
		System.out.println(subMap);
		
		//14. NavigableMap<K,V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive) 
		System.out.println("=====================");
		System.out.println("14. NavigableMap<K,V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)");System.out.println();
		
		NavigableMap<Integer,String> nSubMap = treeMap.subMap(6, true,10, true);
		System.out.println(nSubMap);
		
		//15. NavigableSet<K> descendingKeySet(): ���� Ű ������ �ݴ�� ��� 
		System.out.println("=====================");
		System.out.println("15. NavigableSet<K> descendingKeySet()");System.out.println();
		
		NavigableSet<Integer> nSet = treeMap.descendingKeySet(); 
		System.out.println(nSet);
		
		//16. NavigableMap<K,V> descendingKeySet(): ���� ���ĵ� ��Ʈ�� ������ �������� �������
		System.out.println("=====================");
		System.out.println("16. NavigableMap<K,V> descendingKeySet()");System.out.println();
		
		NavigableMap<Integer, String> nvMap = treeMap.descendingMap();
		System.out.println(nvMap);
		System.out.println(nvMap.descendingMap()); // �ش� �¿� ��ɾ �־ �ٽ� ���������� �����⵵ ������.
		
		
	//�����ǳ�
	}
}
