package chap17.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod_1 {
	public static void main(String[] args) {
	// list의 세머드 : 13개 정도의 메서드,
		//1 ArrayList
		//2 Vector
		//3 LinkedList
		
	List<Integer> aList1 = new ArrayList<Integer>();
	
	System.out.println("1===========================");
	//1. add(E element) : 마지막 값에 값 하나를 더 추가하기
	aList1.add(3); aList1.add(4); aList1.add(5);
	System.out.println(aList1); // aList1의 값 출력
	System.out.println(aList1.size()); // 값의 갯수
	
	System.out.println("2===========================");
	//2. add(int index, E element)
	aList1.add(1, 6); // 방번호 1번에 6을 추가하는 것 ==> 그 방 뒤에 방들은 한칸씩 다 밀려남
	System.out.println(aList1);
	
	System.out.println("3===========================");
	//3. add all (또다른 리스트의 객체를 복사해서 추가함)
	List <Integer> aList2 = new ArrayList();
	aList2.add(1); // 현재 aList2 = {1}
	aList2.add(2); // 현재 aList2 ={[1,2}
	
	aList2.addAll(aList1); // aList1 저장된 값을 복사해서 aList2에 추가함.
						   //현재 aList2 ={[1,2,3, 6, 4, 5}
	System.out.println(aList2);
	
	System.out.println("4===========================");
	//4. addAll(int indes, 또 다른 객체)
	List<Integer> aList3 = new ArrayList();
	aList3.add(1);
	aList3.add(2);
	
	aList3.addAll(1, aList3); // 자신의 값에 추가해서 다른 객체를 추가함
	System.out.println(aList3);// 방 뒤로 자기 자신의 값들을 추가해서 늘어남
	
	System.out.println("5===========================");
	// 5. set (int index, E element) : 특정 방번호의 값을 수정
	aList3.set(1, 5) ; // 1번 방번보의 값을 5롤 수정함
	aList3.set(3, 6) ; // 
	// aList3.set(4,7)// 오류발생 방 번호가 3번까지라...
	System.out.println(aList3);
	
	System.out.println("6===========================");
	//6.remove(int index): 특정 방번호의 값을 삭제함.
	aList3.remove(1); // 방 번호 1번방에 있는 값을 삭제함
	System.out.println(aList3); // 
	
	System.out.println("7===========================");
	//7. remove (Object o ) : 방 번호가 아닌 값으로 삭제하는 명령어
	System.out.print(aList3); // 먼저 aList3을 출력해서 2값이 있는걸 확인해주고
	aList3.remove(new Integer(2)); // 2 값을 삭제함
	System.out.println(aList3); // 2가 사라짐
	
	System.out.println("8===========================");
	//8. clear() : 모두 삭제
	 aList3.clear();
	 System.out.println(aList3);
	 
	 System.out.println("9===========================");
	 //9. isEmpty();  값이 비어 있으면 True, 비어있지 않으면 false
	 System.out.println(aList3.isEmpty());
     
	 System.out.println("10==========================");
	 //10. size(): 방의 갯수, 값의 갯수
	 System.out.println(aList3.size());
	 aList3.add(1); aList3.add(2); aList3.add(3); // 다시 값 추가
	 System.out.println(aList3 + " = 다시 값 추가");
	 System.out.println(aList3.size());
	 
	 System.out.println("11==========================");
	 //11. get(int index) : 방 번호의 값을 출력함
	 System.out.print(aList3.get(0) + " ");
	 System.out.print(aList3.get(1) + " ");
	 System.out.print(aList3.get(2) + " ");
	 System.out.println();
	 System.out.println(aList3);// List일때 객체를 출력하면 객체의 값을 출력함
	 
	 System.out.println("12==========================");
	 //12. toArray() : List(리스트) ---> Array (배열)로 전환
	 
	 Object[] object = aList3.toArray(); // toArrays() 메서드는 Object 타입으로 리텀이 됨
	 // 다운 캐스팅이 필요한 시점
	 System.out.println(Arrays.toString(object)); // 배열일때는 Arrays.toString() 사용 
	 
	 
	 System.out.println("13-1=======================");
	 //13-1 toaRRAR(t[]t) ==> t[] : Inter로 바로 캐스팅
	 Integer[] integer1 = aList3.toArray(new Integer[0]); // 실제 있는 방번호보다 작게 입력하면 전체 방 번호 출력
	 System.out.println(Arrays.toString(integer1));
	 
	 System.out.println("13-2=======================");
	 //13-1 toaRRAR(t[]t) ==> t[] : Inter로 바로 캐스팅
	 Integer[] integer2 = aList3.toArray(new Integer[5]); // 실제 있는 방 번호보다 크게 입력하면 일단 전체 방 번호 출력 + 나머지 빈 방은 null값으로 처리함
	 System.out.println(Arrays.toString(integer2));
		
	// 문서의 끝
	}
}
