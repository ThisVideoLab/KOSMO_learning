package chap17.EX11;

//Map<K,V> : K <= Key, V < = Value �� �������� �����͸� ������
	// key�� �ߺ��� �� ����, Set���� �����ϹǷ� ���ʿ� �ߺ��� �Ұ���. ���� index�� ����.  
	// value�� �ߺ��� ���� ���� �� ����.

	//HashMap: ����� �����ϰ� ���, ���� ������ Ȳ�߿� ������. ��� �޼��尡 ����ȭ�Ǿ����� �ʾƼ� �ʿ��Ѷ��� �������� ����� ��.
	//HashTable: ��� �޼��尡 ����ȭ�Ǿ� ����. ��Ƽ ������ ȯ�濡 ������.
		// ��� �޼���� HashMap�� ������


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap {
	public static void main(String[] args) {

		Map<Integer, String> lhMap1 = new Hashtable<>();
		
		//1. put(K key, V value) : ���� ���� ��System.out.println("=====================");
		System.out.println("=====================");
		System.out.println("1. put(K key, V value)");System.out.println();
		lhMap1.put(2, "���ٶ�");
		lhMap1.put(1, "���ٶ�");
		lhMap1.put(3, "���ٶ�");
		lhMap1.put(3, "������");//  Ű�� �ߺ������ �� ����. ������ ���� ���� ��쿡�� �������� ����� ���������
		
		System.out.println(lhMap1);
		
		//2. putAll(�ٸ��ʰ�ü) : �ٸ� ���� �����ؼ� ���
		System.out.println("=====================");
		System.out.println("2. putAll(�ٸ��ʰ�ü) ����");System.out.println();
		Map<Integer, String> hMap2 = new HashMap<>();
		hMap2.putAll(lhMap1);
		System.out.println(hMap2);
		
		//3. replace(K Key, V value); key�� ����� ���� value�� ����
		System.out.println("=====================");
		System.out.println("3. replace(K Key, V value)");System.out.println();
		hMap2.replace(1, "������");
		hMap2.replace(4, "����"); // hMap2������ key3������ �ְ� key4�� �������� �ƴ���. �׷��� ���ܴ� �߻� ���ϰ� �۵��� �ȵ�.
		System.out.println(hMap2);
		
		//4. replace(K key, V oldValue, V newValue) : oldValue�� newValue�� ������ 
		System.out.println("=====================");
		System.out.println("4. replace(K key, V oldValue, V newValue)");System.out.println();
		hMap2.replace(1, "������", "��������");
		hMap2.replace(2, "�߸��Ȱ�", "������"); // �õ����� ��ġ���� �ʾƼ� ������� �ƴ���.
		System.out.println(hMap2);
		
		//5. get(Object key) : Map�� ���� ������ ��, key�� �־���� key�� �Ҵ�� value�� ����� �� ����.
		System.out.println("=====================");
		System.out.println("5. et(Object key)");System.out.println();
		
		for(int i = 1; i<hMap2.size()+1; i++) {
			System.out.print(hMap2.get(i) + " ");
		}
		
		//6. containsKey(Object key) : �ʿ� �ش� Ű�� �����ϴ��� Ȯ���� => true / false ������ ��µ�
		System.out.println("=====================");
		System.out.println("6. containsKey(Object key)");System.out.println();
		System.out.println(hMap2.containsKey(1)); // true
		System.out.println(hMap2.containsKey(5)); // false
		
		//7. containsValue(Object value) : �ʿ� �ش� ���� �����ϴ��� Ȯ���� => true / false ������ ��µ�
		System.out.println("=====================");
		System.out.println("7. containsValue(Object value)");System.out.println();
		System.out.println(hMap2.containsValue("��������")); // true
		System.out.println(hMap2.containsValue("���ϴ��ϴ�")); // false
		
		//8. Set<K> keySet() : Ű�� �����ϴ� ���
		System.out.println("=====================");
		System.out.println("8. Set<K> keySet()");System.out.println();
		Set<Integer> keySet = hMap2.keySet();
		System.out.println(keySet);
		
		//9. Set<Map.Entry<k,v>> entrySet() : Ű�� ���� ��� ������
		System.out.println("=====================");
		System.out.println("9. Set<Map.Entry<k,v>> entrySet()");System.out.println();
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		
		//10. size(): �� ����
		System.out.println("=====================");
		System.out.println("10. size()");System.out.println();
		System.out.println(hMap2.size()); // 3�� ���
		
		//11. remove(Object key): Ű���� �־ �ش� key�� entry ��ü�� ����
		System.out.println("=====================");
		System.out.println("11. remove(Object key)");System.out.println();
		hMap2.remove(1); // 1�� ���� - �� ������
		hMap2.remove(4); // 4���� ��� ���۸� ���ϰ� ������ �ȳ� 
		System.out.println(hMap2);
		
		//12. remove(Object key, Object value): Ű�� ����� ��Ȯ�� ��ġ�ϴ� ��쿡 �� ��Ʈ���� ������
		System.out.println("=====================");
		System.out.println("12. remove(Object key, Object value)");System.out.println();
		hMap2.remove(2, "���ٶ�"); // Ű���� ����� ��Ȯ�� ��ġ�� = ����
		hMap2.remove(4,"����������"); // 4���� ��� ���۸� ���ϰ� ������ �ȳ� 
		System.out.println(hMap2);
		
		//13. clear(): ��� ����Ʈ ����
		System.out.println("=====================");
		System.out.println("13. clear()");System.out.println();
		hMap2.clear();
		System.out.println(hMap2);
	// �����ǳ�
	}
}
