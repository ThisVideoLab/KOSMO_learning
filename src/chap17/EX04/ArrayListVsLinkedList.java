package chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList vs LinkedList
// ArrayList : ���� ���ؼ� index���� ������ ����.
		//����: �߰����� ���� �߰�/���� �� ���ϰ� ������ ���� �ɸ�
// LinkedList: ������ ���� �յ��� ������� ������ �ִ�. �˻��ÿ� index ��ȣ�� �Ҵ�ȴ�. �˻��� ArrayList�� ���ؼ� ������.
		// ����: �߰��� ���� �߰�/���� �� ���ϰ� �ɸ��� �ʴ´�.
	
public class ArrayListVSLinkedList {
	public static void main(String[] args) {

		
		//1. �����͸� �߰��� �� �ð��� ���غ���
		List<Integer> aList1 = new ArrayList<Integer>();
		List<Integer> linkedList1 = new LinkedList<Integer>();
		long startTime = 0, endTime = 0;
		
		//1-1 Array List���� ������ �߰� �ð�
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			aList1.add(0,i); // 0��° �濡�� ����ؼ� 10����°����, ���ӵڷ� �и��鼭 ������ �߰���.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ������ 10���� �߰��� �ð�: " + (endTime - startTime) + "ns");
		
		//1-2 LinkedList������ ������ �߰� �ð�
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			linkedList1.add(0,i); // 0��° �濡�� ����ؼ� 10����°����, ���ӵڷ� �и��鼭 ������ �߰���.
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ������ 10���� �߰��� �ð�: " + (endTime - startTime) + "ns");
		
		System.out.println("=============================================");
		
		//2. �˻��� �� : Array list�� LinkedList���� ������.
		//2-1. ArrayList�� �˻��ð�
		startTime = System.nanoTime();  
		for( int i = 0; i <10000; i++) {
			aList1.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList���� ������ �˻� �ð�:: " + (endTime - startTime) + "ns");
		
		//2-2. LinkedList�� �˻��ð�
		startTime = System.nanoTime();  
		for( int i = 0; i <10000; i++) {
			linkedList1.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� ������ �˻� �ð�: " + (endTime - startTime) + "ns");
		
		
		System.out.println("=============================================");
		System.out.println();
		//3.������ ������ ���� �ð� ��: LinkedList�� �ξ� ����
		//3-1. ArrayList
		startTime = System.nanoTime();
		for( int i = 0; i <10000; i++) {
			aList1.remove(0);
		}
		
		System.out.println("ArrayList t���� ������ �����ð�: " + (endTime - startTime) + "ns");
		
		//3-2. LinkedList
				startTime = System.nanoTime();
				for( int i = 0; i <10000; i++) {
			 		linkedList1.remove(0);
				}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� ������ ���� �ð�: " + (endTime - startTime) + "ns");
		
	// ������ ��
	}

}
