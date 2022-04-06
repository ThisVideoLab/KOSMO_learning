package chap17.EX17;

import java.util.Stack;

// Stack 자료 구조: LIFO (Last In First Out);
// 스택은 깊은 다라이 설거지통에 접시를 쌓아 넣는 것과 같음. 아래 접시를 빼려면 윗접시부터 들어내야 함.


public class StackMethod {
	public static void main(String[]args) {

		
	//1. E push (E element) : 스택에 값을 넣을 때 사용함.
	System.out.println("=====================");
	System.out.println("1. E push (E element)");System.out.println();	
	
	Stack<Integer> stack = new Stack<Integer>();
	stack.push(2);
	stack.push(5);
	stack.push(3);
	stack.push(7);
	System.out.println(stack);
	
	//2. E peak (E element) : 가져올 값을 위에서 쳐다봐서 파악함.
	System.out.println("=====================");
	System.out.println("2. E peak (E element)");System.out.println();
	System.out.println(stack.peek()); // 7이 출력됨. 이때 7은 stack 객체에 마지막으로 넣은 값이라 맨 위 접시에 해당하기 때문에 7이 보이는 것.
	System.out.println(stack.size()); //  4출력됨. 그래도 접시 프린팅이 구체적으로 보이진 않아도 몇장 쌓여있는지는 알 수 있음
	System.out.println();
	
	
	//3. search(Object o): 검색 (값을 넣었을 때 index 번호를 출력함, 다만 방번호는 위에서부터 1번부터 차례대로 할당됨을 주의
	System.out.println("=====================");
	System.out.println("3. search(Object o)");System.out.println();
	
	System.out.println(stack.search(7));  // 방번호1
	System.out.println(stack.search(3));  // 방번호2
	System.out.println(stack.search(5));  //3
	System.out.println(stack.search(2));  //4
	System.out.println(stack.search(9)); // 값이 존재하지 않을 경우에는 -1을 리턴함

	//4. E pop(): 스택의 값을 가져오기, 제일 마지막에 넣은 값부터 가져올 수 있음.
	System.out.println("=====================");
	System.out.println("4. E pop()");System.out.println();
	
	System.out.println(stack.pop()); //7
	System.out.println(stack.pop()); //3
	System.out.println(stack.pop()); //5
	System.out.println(stack.pop()); //2
	
	//5. Boolean empty(): 비어있을 때  ture를 리턴함
	System.out.println("=====================");
	System.out.println("5. Boolean empty()");System.out.println();
	
	System.out.println(stack.empty()); // 4.번에서 다 비워놓은 덕에 true;
		
	// 문서의끝
	}
}
