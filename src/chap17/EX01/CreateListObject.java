package chap17.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
	public static void main(String[] args) {

		//1. list 구현 클래스의 생성자를 사용하여 객체를 생성함. list는 인터페이스이므로 new 다음에 올 수 없음.
		//   그러나 자식클래스를 통해서 타입은 생산이 가능함. ArrayList, Vactor, LinkedList
		//capacity: 메모리 방의 크리를 할당, 기본값은 10, 이건 그냥 별로 안 중요함
		//size()": 방에서 저장된 값의 갯수 << =====
		
		List<Integer> aList1 = new ArrayList<>(); // capacity
		List<Integer> aList2 = new ArrayList<>(30); // capacity : 30; 메모리 공간 확보
		
		List<Integer> aList3 = new Vector();
		List<Integer> aList4 = new Vector(30);
		
		List<Integer> aList5 = new LinkedList();
		// List<Integer> aList6 = new LinkedList(30); // LinkedList 저장공간 할당 불가
		
		//2. Arrays 클래스의 정적 메서드를 이용하는 방법: 데이트 크기를 바꿀 수 없다.
				// 요일, 계정, 하루 24. <== 고정된 값을 저장할 때 사용함.
		
		List<Integer> aList7= Arrays.asList(1,2,3,4);
		List<String> aList8 = Arrays.asList("월","화","수","목","금","토","일");
		aList7.set(0, 7); // set(): 기존의 값을 수정 또는 추가할 때 사용함. set(1,7)은 인덱스 1번방의 값을 7로 수정하겠다라는 뜻. 
		// aList7.add(5);// 오류 발생, add() 마지막에서 값을 더 추가할 때 사용함.
		System.out.println(aList7);
		
		aList8.set(0, "일");
		// aList8.add(8); // 추가는 오류가 발생됨
		
		
	// 문서의 끝
	}
}
