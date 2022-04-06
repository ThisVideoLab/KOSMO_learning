package chap17.EX17;

import java.util.Stack;

// Stack �ڷ� ����: LIFO (Last In First Out);
// ������ ���� �ٶ��� �������뿡 ���ø� �׾� �ִ� �Ͱ� ����. �Ʒ� ���ø� ������ �����ú��� ���� ��.


public class StackMethod {
	public static void main(String[]args) {

		
	//1. E push (E element) : ���ÿ� ���� ���� �� �����.
	System.out.println("=====================");
	System.out.println("1. E push (E element)");System.out.println();	
	
	Stack<Integer> stack = new Stack<Integer>();
	stack.push(2);
	stack.push(5);
	stack.push(3);
	stack.push(7);
	System.out.println(stack);
	
	//2. E peak (E element) : ������ ���� ������ �Ĵٺ��� �ľ���.
	System.out.println("=====================");
	System.out.println("2. E peak (E element)");System.out.println();
	System.out.println(stack.peek()); // 7�� ��µ�. �̶� 7�� stack ��ü�� ���������� ���� ���̶� �� �� ���ÿ� �ش��ϱ� ������ 7�� ���̴� ��.
	System.out.println(stack.size()); //  4��µ�. �׷��� ���� �������� ��ü������ ������ �ʾƵ� ���� �׿��ִ����� �� �� ����
	System.out.println();
	
	
	//3. search(Object o): �˻� (���� �־��� �� index ��ȣ�� �����, �ٸ� ���ȣ�� ���������� 1������ ���ʴ�� �Ҵ���� ����
	System.out.println("=====================");
	System.out.println("3. search(Object o)");System.out.println();
	
	System.out.println(stack.search(7));  // ���ȣ1
	System.out.println(stack.search(3));  // ���ȣ2
	System.out.println(stack.search(5));  //3
	System.out.println(stack.search(2));  //4
	System.out.println(stack.search(9)); // ���� �������� ���� ��쿡�� -1�� ������

	//4. E pop(): ������ ���� ��������, ���� �������� ���� ������ ������ �� ����.
	System.out.println("=====================");
	System.out.println("4. E pop()");System.out.println();
	
	System.out.println(stack.pop()); //7
	System.out.println(stack.pop()); //3
	System.out.println(stack.pop()); //5
	System.out.println(stack.pop()); //2
	
	//5. Boolean empty(): ������� ��  ture�� ������
	System.out.println("=====================");
	System.out.println("5. Boolean empty()");System.out.println();
	
	System.out.println(stack.empty()); // 4.������ �� ������� ���� true;
		
	// �����ǳ�
	}
}
