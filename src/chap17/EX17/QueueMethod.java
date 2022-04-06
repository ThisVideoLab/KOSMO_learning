package chap17.EX17;

import java.util.LinkedList;
import java.util.Queue;

// Queue: First In, First Out) : ó�� �� ���� õ�� 


public class QueueMethod {
	public static void main(String[] args) {

		
		Queue<Integer> queue1 = new LinkedList<Integer>();
		
		//1. ����ó���� �������� �޼��� (add(),element())
		System.out.println("=====================");
		System.out.println("//1. ����ó���� �������� �޼��� (add(),element())");System.out.println();
			//1. add(): ť�� ���� �߰��� ��
				//System.out.println(queue1.element()); // ����� ���� �߻�, ����ó���� ���� �ȵǾ� ����.
				queue1.add(3);
				queue1.add(4);
				queue1.add(5);
				
				//2. element();
				System.out.println(queue1.element());
				System.out.println();
				
				//3. E remove(): ť�� ���� ������ ���� ��� �� �Ŀ� ������.
				System.out.println(queue1.remove()); // 3
				System.out.println(queue1.remove()); // 4
				System.out.println(queue1.remove()); // 5
				System.out.println();
				
				//System.out.println(queue1.remove()); // ��� ���� �Ŀ� �� ����ϸ� ���ܹ߻��ϸ鼭 ȭ��
		
		//2. ����ó���� ������ �޼��� (offer(),peek())
		System.out.println("=====================");
		System.out.println("//2. ����ó���� ������ �޼��� (offer(),peek())");System.out.println();
		
		Queue<Integer> queue2 = new LinkedList<Integer>();
		
			System.out.println(queue2.peek()); // ����ó���� �Ǿ ���� �߻����� ����.
			System.out.println();
		
			//1. offer(E item): ���� �߰�
			queue2.offer(3);
			queue2.offer(3);
			queue2.offer(3);
			
			//2. E peek(): ����� ���� �̸� ���� �� 
			System.out.println(queue2.peek());
			System.out.println();

			//3. poll(): ���� ������ ����
			System.out.println(queue2.poll()); // 3
			System.out.println(queue2.poll());
			System.out.println(queue2.poll());
			System.out.println(queue2.poll()); // ���̻� ���� ��� null ��µ�
			
			
	// �����ǳ�
	}
}
