package chap17.EX03;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;

//LinkedList ArrayList와 동일하게 사용.
// LinkedList는 모든 메서드가 동기화처리가 되어있다. 멀티 쓰레드 환경에서 사용되도록 되어있음.
// 동시에 돌아간다는건 즉 무겁게 돌아간다는 것임. 멀티일때는 좋은 효율을 보이지만 싱글 쓰레드일때는 오히려 성능이 저하됨.
// 고로 싱글 쓰레드 환경에서는 ArrayList를 사용 , 멀티 쓰레드 환경에서는 LinkedList를 사용하길 ㄱ ㅝㄴ함


public class LinkedListMethod_1 {
	public static void main(String[] args) {
	// list의 세머드 : 13개 정도의 메서드,
		//1 LinkedList
		//2 LinkedList
		//3 LinkedList
		
	List<Integer> linkedlist1 = new LinkedList<Integer>(); 
	
	System.out.println("1===========================");
	//1. add(E element) : 마지막 값에 값 하나를 더 추가하기
	linkedlist1.add(3); linkedlist1.add(4); linkedlist1.add(5);
	System.out.println(linkedlist1); // linkedlist1의 값 출력
	System.out.println(linkedlist1.size()); // 값의 갯수
	
	System.out.println("2===========================");
	//2. add(int index, E element)
	linkedlist1.add(1, 6); // 방번호 1번에 6을 추가하는 것 ==> 그 방 뒤에 방들은 한칸씩 다 밀려남
	System.out.println(linkedlist1);
	
	System.out.println("3===========================");
	//3. add all (또다른 리스트의 객체를 복사해서 추가함)
	List <Integer> linkedlist2 = new LinkedList();
	linkedlist2.add(1); // 현재 linkedlist2 = {1}
	linkedlist2.add(2); // 현재 linkedlist2 ={[1,2}
	
	linkedlist2.addAll(linkedlist1); // linkedlist1 저장된 값을 복사해서 linkedlist2에 추가함.
						   //현재 linkedlist2 ={[1,2,3, 6, 4, 5}
	System.out.println(linkedlist2);
	
	System.out.println("4===========================");
	//4. addAll(int indes, 또 다른 객체)
	List<Integer> linkedlist3 = new LinkedList();
	linkedlist3.add(1);
	linkedlist3.add(2);
	
	linkedlist3.addAll(1, linkedlist3); // 자신의 값에 추가해서 다른 객체를 추가함
	System.out.println(linkedlist3);// 방 뒤로 자기 자신의 값들을 추가해서 늘어남
	
	System.out.println("5===========================");
	// 5. set (int index, E element) : 특정 방번호의 값을 수정
	linkedlist3.set(1, 5) ; // 1번 방번보의 값을 5롤 수정함
	linkedlist3.set(3, 6) ; // 
	// linkedlist3.set(4,7)// 오류발생 방 번호가 3번까지라...
	System.out.println(linkedlist3);
	
	System.out.println("6===========================");
	//6.remove(int index): 특정 방번호의 값을 삭제함.
	linkedlist3.remove(1); // 방 번호 1번방에 있는 값을 삭제함
	System.out.println(linkedlist3); // 
	
	System.out.println("7===========================");
	//7. remove (Object o ) : 방 번호가 아닌 값으로 삭제하는 명령어
	System.out.print(linkedlist3); // 먼저 linkedlist3을 출력해서 2값이 있는걸 확인해주고
	linkedlist3.remove(new Integer(2)); // 2 값을 삭제함
	System.out.println(linkedlist3); // 2가 사라짐
	
	System.out.println("8===========================");
	//8. clear() : 모두 삭제
	 linkedlist3.clear();
	 System.out.println(linkedlist3);
	 
	 System.out.println("9===========================");
	 //9. isEmpty();  값이 비어 있으면 True, 비어있지 않으면 false
	 System.out.println(linkedlist3.isEmpty());
     
	 System.out.println("10==========================");
	 //10. size(): 방의 갯수, 값의 갯수
	 System.out.println(linkedlist3.size());
	 linkedlist3.add(1); linkedlist3.add(2); linkedlist3.add(3); // 다시 값 추가
	 System.out.println(linkedlist3 + " = 다시 값 추가");
	 System.out.println(linkedlist3.size());
	 
	 System.out.println("11==========================");
	 //11. get(int index) : 방 번호의 값을 출력함
	 System.out.print(linkedlist3.get(0) + " ");
	 System.out.print(linkedlist3.get(1) + " ");
	 System.out.print(linkedlist3.get(2) + " ");
	 System.out.println();
	 System.out.println(linkedlist3);// List일때 객체를 출력하면 객체의 값을 출력함
	 
	 System.out.println("12==========================");
	 //12. toArray() : List(리스트) ---> Array (배열)로 전환
	 
	 Object[] object = linkedlist3.toArray(); // toArrays() 메서드는 Object 타입으로 리텀이 됨
	 // 다운 캐스팅이 필요한 시점
	 System.out.println(Arrays.toString(object)); // 배열일때는 Arrays.toString() 사용 
	 
	 
	 System.out.println("13-1=======================");
	 //13-1 toaRRAR(t[]t) ==> t[] : Inter로 바로 캐스팅
	 Integer[] integer1 = linkedlist3.toArray(new Integer[0]); // 실제 있는 방번호보다 작게 입력하면 전체 방 번호 출력
	 System.out.println(Arrays.toString(integer1));
	 
	 System.out.println("13 -2=======================");
	 //13-1 toaRRAR(t[]t) ==> t[] : Inter로 바로 캐스팅
	 Integer[] integer2 = linkedlist3.toArray(new Integer[5]); // 실제 있는 방 번호보다 크게 입력하면 일단 전체 방 번호 출력 + 나머지 빈 방은 null값으로 처리함
	 System.out.println(Arrays.toString(integer2));
		
	// 문서의 끝
	}
}
