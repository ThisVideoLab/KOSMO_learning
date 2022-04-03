package chap17.EX06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//set<E> " 인터페이스의 형태에 제네닉 타입으로 구현됨. 방번호(index)가 없다. 중복된 값을 넣을 수 없다.
	// HashSet : 중복된 값을 넣을 수 없다. 값을 꺼내면 순서대로 꺼내지지 않는다. 랜덤으로 출력됨.
    // LinkedHashSet : 중복된 값을 넣을 수 없음. 출력시는 순서대로 출력됨. HashSet의 단점을 약간 보완한 느낌인가?
				      // 약간 구슬꿰듯 이라는 것 봐서는 평소에는 흩어져있다 순서대로 출력되면서 index 번호를 받는듯 함
    // TreeSet : 저장되는 시점에 정렬되어서 저장됨. ascending(오름차순 정렬) 0 → 9, a → z, ㄱ → ㅎ (descending: 내림차순)

public class HashSetMethod {
	public static void main(String[] args) {

		Set<String> hset1 = new HashSet(); // set은 Interface이므로 타입만 지정 가능, 실체인 객체는 정의 불가능함.
		
		
		//1. add(E element): 방번호가 없기 때문에, 커다란 포대라고 생각하면 편함.
		System.out.println("=====================");
		System.out.println("1. add(E element)");System.out.println();
		
		
		hset1.add("가");hset1.add("나");hset1.add("가"); // 3개를 넣었으나, 가를 중복 입력함
		System.out.println(hset1); // 출력 순서는 랜덤. 중복입력한 "가"에 대해 1개만 입력되고 1개는 생략됨. 
		System.out.println(hset1.toString() ); // toString 메서드가 기본적으로 재정의되어 있음.
		System.out.println();
		
		//2. addAll(다른 set 객체) : 자신의 Set에서 다른 set에 저장한 값을 추가함, 다만 중복된 값은 제거함
		System.out.println("=====================");
		System.out.println("2. addAll(다른 set 객체)");System.out.println();
		
		
		Set<String> hset2 = new HashSet();
		hset2.add("나"); hset2.add("다"); // 기본적으로 2개 정도 추가해 준 뒤
		hset2.addAll(hset1); // hset1을 그대로 hset2넣음
		System.out.println(hset2);
		System.out.println();
		
		//3. remove (Object o) : 값으로 직접 삭제함, list가 index 번호로 삭제하는 경우와 대조됨
		System.out.println("=====================");
		System.out.println("3. remove (Object o)");System.out.println();
		
		
		hset2.remove("나");
		System.out.println(hset2);
		System.out.println();
		
		//4. clear() : 모두 삭제
		System.out.println("=====================");
		System.out.println("4. clear() : 모두 삭제");System.out.println();
		
		
		hset2.clear();
		System.out.println(hset2);
		System.out.println();
		
		//5. isEmpty() : 비어있으면 true, 차있으면 false
		System.out.println("=====================");
		System.out.println("5. isEmpty()");System.out.println();
		
		
		System.out.println(hset2.isEmpty()); // 비어있으므로 true
		System.out.println();

		//6. contains(Object o) : 입력한 object 값이 set 안에 존재하면 true; 없으면 false 
		System.out.println("=====================");
		System.out.println("6. contains(Object o)");System.out.println();
		
		Set<String> hset3 = new HashSet<>();
		hset3.add("가");hset3.add("나");hset3.add("다");
		System.out.println(hset3); // 출력 순서는 뒤죽박죽
		System.out.println(hset3.contains("나"));// true
		System.out.println(hset3.contains("라이라이차차차야야야야")); // false 
		
		//7. size() : Set에 포함된 값의 개수 
		System.out.println("=====================");
		System.out.println("7. size() : Set에 포함된 값의 개수");System.out.println();
		
		System.out.println(hset3.size());
		
		
		
		//8. iterator() : set은 index 번호가 없음. 헌데 for문은 index 번호를 필요로 하므로 사용 불가능. 그러나 향상된 for문은 사용이 가능함.
		//                순회자라고 불림. 순회하면서 set 내부의 값들을 전부 출력함.
		//                hasNext() : set의 값이 존재하면 true, 존재하지 않으면 false
		//                next() : 현재 값을 출력하고 다음값으로 이동함.
		System.out.println("=====================");
		System.out.println("8. iterator()");System.out.println();

		Iterator<String> iterator = hset3.iterator(); // 클래스 <E> 참조객제 = set객체.itorator(); 
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "  ");
		}
		System.out.println();System.out.println();
		
		System.out.println("enhanced for문을 통한 출력");System.out.println();
		for(String k : hset3) {
			System.out.print(k + "  ");
		}
		System.out.println();System.out.println();
		
		//9. toArray() : Set의 값들을 배열로 보낸다. object 타입으로 리턴, 다운 캐스팅이 필요함.
		System.out.println("=====================");
		System.out.println("9. toArray()");System.out.println();
		
		Object [] obArr = hset3.toArray();
		for(int i = 0; i < obArr.length; i++) {
			System.out.print(obArr[i] + " ");
		}
		System.out.println();
		for(Object k : obArr) { // 다른 자료형으로 뽑으려면 다운 캐스팅이 별도로 필요함
			System.out.print(k + " ");
		}
		System.out.println();
		
		//10. toArray(T[]t) : 바로 다운 캐스팅을 한 후에 출력하는 기능
		System.out.println("=====================");
		System.out.println("9. toArray()");System.out.println();
		
		String[] strArr1 = hset3.toArray(new String[0]); // 0: 방의 크기를 나타냄. 작아도 자동으로 컴파일러가 필요한만큼 지정해줘서 괜찮음.
		System.out.println(Arrays.toString(strArr1));
		
		
		//11. 실제 set 내부값의 갯수보다 방의 크기를 크게 한 경우: null이 들어갈 수 있음.
		System.out.println("=====================");
		System.out.println("11. 실제 set 내부값의 갯수보다 방의 크기를 크게 한 경우");System.out.println();
		
		String[] strArr2 = hset3.toArray(new String[5]); // 크게 만들면 빈 방마다 null값이 들어가버림.
		System.out.println(Arrays.toString(strArr2)); 
		
		//12. 직접 풀어보기 
		System.out.println("=====================");
		System.out.println("12. 직접 풀어보기");System.out.println();
		Set<Integer> intset1 = new HashSet();
		intset1.add(30);intset1.add(50);intset1.add(100);intset1.add(10);
		
		// intset1에 대해 iterator 출력, enhanced for문 출력 
		Iterator<Integer> intset1Iter = intset1.iterator(); // 클래스 <E> 참조객제 = set객체.itorator(); 
		while(intset1Iter.hasNext()) {
			System.out.print(intset1Iter.next() + "  ");
		}
		System.out.println();
		for(int k : intset1) {
			System.out.print(k + "  ");
		}
		
	// 문서의끝
	}
}
