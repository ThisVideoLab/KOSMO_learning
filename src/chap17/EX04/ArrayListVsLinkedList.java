package chap17.EX04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ArrayList vs LinkedList
// ArrayList : ���� ���켭 index ���� ������ �ִ�. �˻� �ӵ��� ������.
			//���� : �߰����� ���� �߰�/���� �� ���ϰ� ������ ���� �ɸ���.
//LinkedList : �� ���� ���� �յ��� ������� ������ �ִ�. �˻��ÿ� index��ȣ�� �Ҵ�ȴ�. �˻��� ArrayList�� ���ؼ� ������.
			//���� : �߰��� ���� �߰�/���� �� ���ϰ� �ɸ��� �ʴ´�.




public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		//1. �����͸� �߰��ð� ��.
		List<Integer> aList = new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();
		long startTime =0, endTime=0;
		
		//1-1 ArrayList���� ������ �߰� �ð�
		startTime =System.nanoTime();	//System.nanoTime();
		for(int i =0; i<100000; i++) {
			aList.add(0,i);
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList ������ �߰� �ð�: " +(endTime-startTime)+"ns");
		
		//1-2 LinkedList���� ������ �߰� �ð�
		startTime =System.nanoTime();	//System.nanoTime();
		for(int i =0; i<100000; i++) {
			linkedlist.add(0,i);
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList ������ �߰� �ð�: " +(endTime-startTime)+"ns");
		
		System.out.println("================================================");
		
		
		//2. �˻��� �� : Array List�� LinkedList���� ������.
		//2-1 ArrayList���� ������ �˻� �ð�
		startTime =System.nanoTime();	//System.nanoTime();
		for(int i =0; i<100000; i++) {
			aList.get(i);
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList ������ �˻� �ð�: " +(endTime-startTime)+"ns");
		
		//2-2 LinkedList���� ������ �߰� �ð�
		startTime =System.nanoTime();	//System.nanoTime();
		for(int i =0; i<100000; i++) {
			linkedlist.get(i);
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList ������ �߰� �ð�: " +(endTime-startTime)+"ns");
		
		System.out.println("================================================");		
		
		//3. ������ ������ ���� �ð� �� : LinkedList�� �ξ� ������.
		//3-1 ArrayList���� ������ ���� �ð�
		startTime =System.nanoTime();	//System.nanoTime();
		for(int i =0; i<100000; i++) {
			aList.remove(0);
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList ������ ���� �ð�: " +(endTime-startTime)+"ns");
		
		//3-2 LinkedList���� ������ ���� �ð�
		startTime =System.nanoTime();	//System.nanoTime();
		for(int i =0; i<100000; i++) {
			linkedlist.remove(0);
		}
		
		endTime = System.nanoTime();
		
		System.out.println("LinkedList ������ ���� �ð�: " +(endTime-startTime)+"ns");
		
	
		
		
	}

}
