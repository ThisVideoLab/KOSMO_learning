package chap17.EX03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedMethod_1 {

	public static void main(String[] args) {
		//List의 메소드 : 13개 정도의 메소드,
			//1.ArrayList
			//2.Vector
			//3.LinkedList
		
		List<Integer> linkedList1 = new LinkedList<>();
		
		//1.add(E element) : 마지막 값에 값을 추가하기
		linkedList1.add(3); linkedList1.add(4); linkedList1.add(5);
		System.out.println(linkedList1.toString());	//값출력
		System.out.println(linkedList1.size());		//값의 갯수
		
		//2.add(int index , E element)
		linkedList1.add(1, 6);	//방번호 1번에 6을 추가
		System.out.println(linkedList1.toString());	//값출력
		System.out.println(linkedList1.size());		//값의 갯수
		
		//3. addAll(또다른 리스트의 객체를 복사해서 추가)
		List<Integer> linkedList2 = new LinkedList<>();
		linkedList2.add(1);
		linkedList2.add(2);
		linkedList2.addAll(linkedList1);
		System.out.println(linkedList2);
		
		//4. addAll(int index,또 다른 객체)
		List<Integer> linkedList3= new LinkedList();
		linkedList3.add(1);
		linkedList3.add(2);
		linkedList3.addAll(1,linkedList3);
		System.out.println(linkedList3);//자신의 값에 다른 객체를 추가
		
		//5.set(int index, E element): 특정 방번호의 값을 수정
		linkedList3.set(1, 5);	//1번 방번호에 값을 5로 수정
		linkedList3.set(3, 6);
		//aList3.set(4, 7);	//오류 발생 ,IndexOutOfBoundsException
		System.out.println(linkedList3);
		
		//6.remove(int index): 특정 방번호의 값을 삭제.
		linkedList3.remove(1);	//방번호 1번 방에 있는 값을 삭제
		
		System.out.println(linkedList3);
		
		//7.remove(Object o): 값으로 삭제
		linkedList3.remove(new Integer(2));	//값으로 삭제를 할 수 있다.
		
		System.out.println(linkedList3);
		
		//8.clear() : 모두 삭제
		linkedList3.clear();
		System.out.println(linkedList3);
		
		//9.isEmpty() : 값이 비어 있으면 True, 비어 있지 않으면 false
		System.out.println(linkedList3.isEmpty());
		
		//10.size() : 방의 갯수 , 값의 갯수
		System.out.println(linkedList3.size());
		linkedList3.add(1); linkedList3.add(2); linkedList3.add(3);
		System.out.println(linkedList3);
		System.out.println(linkedList3.size());
		
		System.out.println("========================");
		
		//11.get(int index): 방번호의 값을 출력
		System.out.println(linkedList3.get(0));
		System.out.println(linkedList3.get(1));
		System.out.println(linkedList3.get(2));
		
		System.out.println("=======================");
		
		System.out.println(linkedList3); 		//List 일때 객체를 출력하면 객체의 값을 출력함
		
		//12.toArray()  : List(리스트) ---> Array(배열)로 변화
		Object[] object = linkedList3.toArray();	//기본적으로 toArray() 메소드는 Object 타입으로 리턴이 됨
			//다운 캐스팅이 필요하다.
		System.out.println(Arrays.toString(object)); //배열일때는 Arrays.toString() 사용.
		
		//13-1 toArray(T[] t)    ====>t[] : Integer로 바로 캐스팅
		Integer[] integer1 = linkedList3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integer1));
		
		System.out.println("=============================");
		//13-1 toArray(T[] t)    ====>t[] : Integer로 바로 캐스팅
		Integer[] integer2 = linkedList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
	}

}
