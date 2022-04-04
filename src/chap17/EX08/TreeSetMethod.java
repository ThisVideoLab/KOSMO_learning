package chap17.EX08;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

//1. TreeSet: 출력하면 정렬된 상태로 출력됨. (오름차순 정렬(ascending)  : 1--> 9, a --> z, 가 --> 하
//            출력시 검색의 메서드가 지원됨. 임의의 값을 넣으면 Set에 정렬되어서 저장됨. 출력시에 오름차순으로 정렬됨.

// Set(set 중에서 가장 상위 개념)
// sortedSet(정렬 메서드) 
// NavigalbeSet (검색메서드 정의)
// TreeSet (  )

//TreeSet<String> treeSet = new TreeSet<String>(); // 타입을 TreeSet으로 정렬/검색 기능을 사용함.
//Set 인터페이스의 모든 메서드 사용, 추가적으로 정렬 메서드 / 검색 메서드 사용 가능

public class TreeSetMethod {
	public static void main(String[] args) {

		//TreeSet은 set의 모든 메서드 사용
		
		//TreeSet에 값을 넣었을 경우 오름차순 정렬되어 값이 set에 저장, 출력시 오름차순 정렬로 출력.
		TreeSet<Integer> treeSet = new TreeSet(); // Type을 TreeSet으로 지정해야 정렬(sort)과 검색을 사용할 수 있음.
		
		for(int i = 50; i>0; i-=2) { // 50, 48, 46, 44, 42 ... 0까지
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		//TreeSet에서만 사용 가능한 메서드 (1. ~ 15)
		
		//1. first() : 제일 처음 값을 리턴
		System.out.println("=====================");
		System.out.println("1. first()");System.out.println();
		
		System.out.println(treeSet.first()); // 2 출력
		
		//2. last() :제일 마지막 값을 리턴
		System.out.println("=====================");
		System.out.println("2. last()");System.out.println();
		
		System.out.println(treeSet.last()); // 50을 리턴 
		
		//3. lower(E element) : element보다 작은 값을 출력함.
		System.out.println("=====================");
		System.out.println("3. lower(E element)");System.out.println();
		
		System.out.println(treeSet.lower(26)); // 24 출력
		
		//4. higher(E element) : element보다 큰 값을 출력함
		System.out.println("=====================");
		System.out.println("4. higher(E element)");System.out.println();
		
		System.out.println(treeSet.higher(26)); // 28
		
		//5. floor (E element) : element보다 작은 값을 출력함.
		System.out.println("=====================");
		System.out.println("5. floor (E element)");System.out.println();
		
		System.out.println(treeSet.floor(25)); // 24 출력
		
		//6. ceiling (E element) : element를 포함해서 큰 값을 출력
		System.out.println("=====================");
		System.out.println("6. ceiling (E element)");System.out.println();
		
		System.out.println(treeSet.ceiling(25)); // 26 출력 // 25가 없으므로 가장 가까운 26을 불러냄
		System.out.println(treeSet.ceiling(26)); // 26 출력 
		
		//7. PollFirse()  : 제일 처음 값 꺼내기, 말 그대로 Set 주머니에서 밖으로 빼 제거함
		System.out.println("====================="); 
		System.out.println("7. PollFirse()  :");System.out.println();
		
		int treeSetSize = treeSet.size();
		
		System.out.println("현재 treeSet의 길이: " + treeSetSize);
		System.out.println();
		for(int i = 0; i <treeSet.size(); i++) {
			System.out.print(treeSet.pollFirst() + "  "); // for 문으로 25번 루프 돌면서 첫번째 값만 꺼내와서 출력함.
		}System.out.println();
		System.out.println("PollFirse()로 다 꺼내고 난 뒤의 set 바구니 상태");
		System.out.println(treeSet.size());
		
		//8. PollLast()  : 제일 마지막 값 꺼내기, 말 그대로 Set 주머니에서 밖으로 빼 제거함
		System.out.println("====================="); 
		System.out.println("8. PollLast()");System.out.println();
			
		for (int i =50; i > 0; i -=2){
			treeSet.add(i);
		}
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize); // 25
		System.out.println(treeSet);
		System.out.println();
				
		for(int i = 0; i < treeSetSize; i++) {
			System.out.println(treeSet.pollLast());
		}
		
		System.out.println(treeSet.size());
		System.out.println();
		
		//9. sortedSet<E> headSet(E element) : 정렬을 사용하기 위해 sortedSet <E>e 객체를 생성
			//sortedSet<E> 정렬된 데이트터를 저장하는 Set
			  // headSet(E element) : element의 head쪽으로 값을 저장함
		System.out.println("========== 반대로 정렬하기 ==========="); 
		System.out.println("9. sortedSet<E> headSet(E element)");System.out.println(); 
		
		for (int i =50; i > 0; i -=2){ 
			treeSet.add(i);
		}
		System.out.println(treeSet);
		SortedSet<Integer> sSet = treeSet.headSet(20);
		//set<Integer> sSet = treeSet.hadet(ELEF DD);
		
		System.out.println(sSet);
		
		//10. NavigalbeSet<E> headSet(E element, boolean inclusive) 정렬을 사용하기 위해 sortedSet <E>e 객체를 생성 
											    //sortedSet<E> 정렬된 데이트터를 저장하는 Set
											    // headSet(E element) : element의 head쪽으로 값을 저장함
		System.out.println("====================="); 
		System.out.println("10. sortedSet<E> headSet(E element)");System.out.println();
		
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);        
		System.out.println(nSet);
		
		//11. SortedSet<E> tailset(E element) : : 
		System.out.println("====================="); 
		System.out.println("11. SortedSet<E> tailset(E element)");System.out.println();
		
		SortedSet<Integer> sSet2 = treeSet.tailSet(20); // 시작값은 포함이 기본, 끝 값은 미포함이 기본, 이는 모든 언어에서 동일한 내용임.
		// Set<Integer> sSet2 = treeSet.tailSet(20); //이런 식으로도 받을 수 있음. 근데 왠지 에러남
		System.out.println(sSet2);
		
		//12. NavigableSet<E> tailSet(E element, boolean inclusive) : element를 포함 (true), 미포함 ( false)해서 tail쪽으로 출력함.
		System.out.println("====================="); 
		System.out.println("12. NavigableSet<E> tailSet(E element, boolean inclusive)");System.out.println();
		
		NavigableSet nSet2 = treeSet.tailSet(20, false);
		// Set nSet22 = treeSet.tailSet(20,true); 이런식으로도 받아짐. 그런데 왜 오류나는거지 잘 성명안해주심
		System.out.println(nSet2);
		
		//13. sortedSet<E> subSet(E element, E element); 특정 범위의 값을 set으로 담을 때 사용함
		System.out.println("====================="); 
		System.out.println("13. sortedSet<E> subSet(E element, E element)");System.out.println();
		
		SortedSet sSet3 = treeSet.subSet(10, 20);
		System.out.println(sSet3); // 10, 12 ,14, 16, 18 이 출력됨. 언제나 시작값은 포함, 끝값은 미포함이 프로그래밍언어의 국룰
		
		//14. NavigableSet<E> subSet (E element, boolean inclusive, E element, boolean inclusive)
		NavigableSet<Integer> nSet4 = treeSet.subSet(10, false, 20, false);
		//Set<Integer> nSet4 = treeSet.subSet(10, false, 20, false); // 이것도 된다고는 하는데 왜 오류남
		
		//15. NavigableSet<E> descendingSet() : 현재 정렬을 기준으로 반대로 정렬함 << descending의 원래 뜻은 내림차순 정렬 >>
		System.out.println(treeSet); // 오름차순 정렬
		
		NavigableSet<Integer> descendingSet = treeSet.descendingSet(); // 내림차순으로 뒤집기
		System.out.println(descendingSet);
		
		NavigableSet<Integer> dscendingSet2 = descendingSet.descendingSet(); // 다시 뒤집기 -> 오름차순
		System.out.println(dscendingSet2);
		
		
		
		
	//문서의 끝
	}
}
