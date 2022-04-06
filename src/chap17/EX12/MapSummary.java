package chap17.EX12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Map<K,V> ���� : K�� �ߺ��� �� ����.
	//1. HashMap : Key�� �������� �����ϰ� ��µ�. �޼��尡 ����ȭ �� ��, �̱۾�����ȯ�濡 ����ϱ� ������ 
	//2. HashTable : ��� �޼��尡 ����ȸ�Ǿ� ����. ��Ƽ ������ ȯ�濡�� ����.
	//3. LinkedHashMap: �Է� ������� ���
	//4. TreeMap: ������������ ���ĵǾ� �Էµ�, comparable<E>, comparator<E>

public class MapSummary {
	public static void main(String[] args) {

		
		

		//1. HashMap: �Է� ������ ��� ������ �ٸ�.
		System.out.println("=====================");
		System.out.println("1. HashMap:");System.out.println();
		
		Map <String, Integer> hashMap = new HashMap<>();
		hashMap.put("��", 30);
		hashMap.put("��", 40);
		hashMap.put("��", 50);
		hashMap.put("��", 60);
		System.out.println(hashMap);
		
		
		//2. HashTable: �Է¼����� ��� ������ �ٸ���. <����ȭ�� �Ǿ��ִ�> ��Ƽ������ ȯ�濡 ������
		System.out.println("=====================");
		System.out.println("2. HashTable:");System.out.println();
		
		Map <String, Integer> hashTable = new Hashtable<>();
		hashTable.put("��", 30);
		hashTable.put("��", 40);
		hashTable.put("��", 50);
		hashTable.put("��", 60);
		System.out.println(hashTable);
		
		//3. LinkedHashMap: �Է¼����� ��� ������ ����. �տ� ���� ��� ���¿� ����
		System.out.println("=====================");
		System.out.println("2. HashTable:");System.out.println();
		
		Map <String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("��", 30);
		linkedHashMap.put("��", 40);
		linkedHashMap.put("��", 50);
		linkedHashMap.put("��", 60);
		System.out.println(linkedHashMap);
		
		//4. TreeMap: �������� ���ĵǾ� ���� (Map <K,V> :key�� �������� �������� ����
		System.out.println("=====================");
		System.out.println("4. TreeMap:");System.out.println();
		
		Map <String, Integer> treeMap = new TreeMap<>();
		treeMap.put("��", 30);
		treeMap.put("��", 40);
		treeMap.put("��", 50);
		treeMap.put("��", 60);
		System.out.println(treeMap);
		

		
	//�����ǳ�
	}
}
