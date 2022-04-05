package chap17.EX08;

import java.util.HashSet;
import java.util.Set;

//set: �ߺ����� �ʴ� ���� ���� (euals(), hashcode() �޼��带 ������), Wrapper Ŭ������ ��� ������
	// 1. hashSet : ��µǴ� ���� �����ϰ� ��µ�.
	// 2. LinkedHeshSet : �ԷµǴ� ��� ��µ�.
	// 3. TreeSet : �Է°��� ������ ���������� ����. ������������ ���ĵǾ� �����. �ٸ� �������̵��ؾ� ��.

public class SetSummary {
	public static void main(String[] args) {

		//1. HashSet
		System.out.println("=====hashSet=====");
		
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		
		System.out.println(hashSet);
		
		//2. LinkedHeshSet
		System.out.println("=====LinkedHeshSet=====");
		
		Set<String> LinkedHeshSet = new HashSet<String>();
		LinkedHeshSet.add("��");
		LinkedHeshSet.add("��");
		LinkedHeshSet.add("��");
		LinkedHeshSet.add("��");
		
		System.out.println(LinkedHeshSet);
		
		//3.TreeSet
		System.out.println("=====TreeSet=====");
		
		Set<String> ts1 = new HashSet<String>();
		ts1.add("��");
		ts1.add("��");
		ts1.add("��");
		ts1.add("��");
		
		System.out.println(ts1);
		
	// �����ǳ�
	}
}
