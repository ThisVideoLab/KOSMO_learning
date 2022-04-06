package chap17.EX17;

import java.util.LinkedList;
import java.util.Queue;

// Queue: First In, First Out) : 처음 들어간 값이 천다 


public class QueueMethod {
	public static void main(String[] args) {

		
		Queue<Integer> queue1 = new LinkedList<Integer>();
		
		//1. 예외처리를 미포함한 메서드 (add(),element())
		System.out.println("=====================");
		System.out.println("//1. 예외처리를 미포함한 메서드 (add(),element())");System.out.println();
			//1. add(): 큐에 값을 추가할 때
				//System.out.println(queue1.element()); // 실행시 오류 발생, 예외처리가 따로 안되어 있음.
				queue1.add(3);
				queue1.add(4);
				queue1.add(5);
				
				//2. element();
				System.out.println(queue1.element());
				System.out.println();
				
				//3. E remove(): 큐의 값을 끄집어 내서 출력 한 후에 제거함.
				System.out.println(queue1.remove()); // 3
				System.out.println(queue1.remove()); // 4
				System.out.println(queue1.remove()); // 5
				System.out.println();
				
				//System.out.println(queue1.remove()); // 모두 꺼낸 후에 또 출력하면 예외발생하면서 화냄
		
		//2. 예외처리를 포함한 메서드 (offer(),peek())
		System.out.println("=====================");
		System.out.println("//2. 예외처리를 포함한 메서드 (offer(),peek())");System.out.println();
		
		Queue<Integer> queue2 = new LinkedList<Integer>();
		
			System.out.println(queue2.peek()); // 예외처리가 되어서 오류 발생하지 않음.
			System.out.println();
		
			//1. offer(E item): 값을 추가
			queue2.offer(3);
			queue2.offer(3);
			queue2.offer(3);
			
			//2. E peek(): 출력할 값을 미리 보는 것 
			System.out.println(queue2.peek());
			System.out.println();

			//3. poll(): 값을 끄집어 내기
			System.out.println(queue2.poll()); // 3
			System.out.println(queue2.poll());
			System.out.println(queue2.poll());
			System.out.println(queue2.poll()); // 더이상 값이 없어서 null 출력됨
			
			
	// 문서의끝
	}
}
