package chap17.EX08;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

//1. TreeSet: ����ϸ� ���ĵ� ���·� ��µ�. (�������� ����(ascending)  : 1--> 9, a --> z, �� --> ��
//            ��½� �˻��� �޼��尡 ������. ������ ���� ������ Set�� ���ĵǾ �����. ��½ÿ� ������������ ���ĵ�.

// Set(set �߿��� ���� ���� ����)
// sortedSet(���� �޼���) 
// NavigalbeSet (�˻��޼��� ����)
// TreeSet (  )

//TreeSet<String> treeSet = new TreeSet<String>(); // Ÿ���� TreeSet���� ����/�˻� ����� �����.
//Set �������̽��� ��� �޼��� ���, �߰������� ���� �޼��� / �˻� �޼��� ��� ����

public class TreeSetMethod {
	public static void main(String[] args) {

		//TreeSet�� set�� ��� �޼��� ���
		
		//TreeSet�� ���� �־��� ��� �������� ���ĵǾ� ���� set�� ����, ��½� �������� ���ķ� ���.
		TreeSet<Integer> treeSet = new TreeSet(); // Type�� TreeSet���� �����ؾ� ����(sort)�� �˻��� ����� �� ����.
		
		for(int i = 50; i>0; i-=2) { // 50, 48, 46, 44, 42 ... 0����
			treeSet.add(i);
		}
		System.out.println(treeSet);
		
		//TreeSet������ ��� ������ �޼��� (1. ~ 15)
		
		//1. first() : ���� ó�� ���� ����
		System.out.println("=====================");
		System.out.println("1. first()");System.out.println();
		
		System.out.println(treeSet.first()); // 2 ���
		
		//2. last() :���� ������ ���� ����
		System.out.println("=====================");
		System.out.println("2. last()");System.out.println();
		
		System.out.println(treeSet.last()); // 50�� ���� 
		
		//3. lower(E element) : element���� ���� ���� �����.
		System.out.println("=====================");
		System.out.println("3. lower(E element)");System.out.println();
		
		System.out.println(treeSet.lower(26)); // 24 ���
		
		//4. higher(E element) : element���� ū ���� �����
		System.out.println("=====================");
		System.out.println("4. higher(E element)");System.out.println();
		
		System.out.println(treeSet.higher(26)); // 28
		
		//5. floor (E element) : element���� ���� ���� �����.
		System.out.println("=====================");
		System.out.println("5. floor (E element)");System.out.println();
		
		System.out.println(treeSet.floor(25)); // 24 ���
		
		//6. ceiling (E element) : element�� �����ؼ� ū ���� ���
		System.out.println("=====================");
		System.out.println("6. ceiling (E element)");System.out.println();
		
		System.out.println(treeSet.ceiling(25)); // 26 ��� // 25�� �����Ƿ� ���� ����� 26�� �ҷ���
		System.out.println(treeSet.ceiling(26)); // 26 ��� 
		
		//7. PollFirse()  : ���� ó�� �� ������, �� �״�� Set �ָӴϿ��� ������ �� ������
		System.out.println("====================="); 
		System.out.println("7. PollFirse()  :");System.out.println();
		
		int treeSetSize = treeSet.size();
		
		System.out.println("���� treeSet�� ����: " + treeSetSize);
		System.out.println();
		for(int i = 0; i <treeSet.size(); i++) {
			System.out.print(treeSet.pollFirst() + "  "); // for ������ 25�� ���� ���鼭 ù��° ���� �����ͼ� �����.
		}System.out.println();
		System.out.println("PollFirse()�� �� ������ �� ���� set �ٱ��� ����");
		System.out.println(treeSet.size());
		
		//8. PollLast()  : ���� ������ �� ������, �� �״�� Set �ָӴϿ��� ������ �� ������
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
		
		//9. sortedSet<E> headSet(E element) : ������ ����ϱ� ���� sortedSet <E>e ��ü�� ����
			//sortedSet<E> ���ĵ� ����Ʈ�͸� �����ϴ� Set
			  // headSet(E element) : element�� head������ ���� ������
		System.out.println("========== �ݴ�� �����ϱ� ==========="); 
		System.out.println("9. sortedSet<E> headSet(E element)");System.out.println(); 
		
		for (int i =50; i > 0; i -=2){ 
			treeSet.add(i);
		}
		System.out.println(treeSet);
		SortedSet<Integer> sSet = treeSet.headSet(20);
		//set<Integer> sSet = treeSet.hadet(ELEF DD);
		
		System.out.println(sSet);
		
		//10. NavigalbeSet<E> headSet(E element, boolean inclusive) ������ ����ϱ� ���� sortedSet <E>e ��ü�� ���� 
											    //sortedSet<E> ���ĵ� ����Ʈ�͸� �����ϴ� Set
											    // headSet(E element) : element�� head������ ���� ������
		System.out.println("====================="); 
		System.out.println("10. sortedSet<E> headSet(E element)");System.out.println();
		
		NavigableSet<Integer> nSet = treeSet.headSet(20, true);        
		System.out.println(nSet);
		
		//11. SortedSet<E> tailset(E element) : : 
		System.out.println("====================="); 
		System.out.println("11. SortedSet<E> tailset(E element)");System.out.println();
		
		SortedSet<Integer> sSet2 = treeSet.tailSet(20); // ���۰��� ������ �⺻, �� ���� �������� �⺻, �̴� ��� ���� ������ ������.
		// Set<Integer> sSet2 = treeSet.tailSet(20); //�̷� �����ε� ���� �� ����. �ٵ� ���� ������
		System.out.println(sSet2);
		
		//12. NavigableSet<E> tailSet(E element, boolean inclusive) : element�� ���� (true), ������ ( false)�ؼ� tail������ �����.
		System.out.println("====================="); 
		System.out.println("12. NavigableSet<E> tailSet(E element, boolean inclusive)");System.out.println();
		
		NavigableSet nSet2 = treeSet.tailSet(20, false);
		// Set nSet22 = treeSet.tailSet(20,true); �̷������ε� �޾���. �׷��� �� �������°��� �� ��������ֽ�
		System.out.println(nSet2);
		
		//13. sortedSet<E> subSet(E element, E element); Ư�� ������ ���� set���� ���� �� �����
		System.out.println("====================="); 
		System.out.println("13. sortedSet<E> subSet(E element, E element)");System.out.println();
		
		SortedSet sSet3 = treeSet.subSet(10, 20);
		System.out.println(sSet3); // 10, 12 ,14, 16, 18 �� ��µ�. ������ ���۰��� ����, ������ �������� ���α׷��־���� ����
		
		//14. NavigableSet<E> subSet (E element, boolean inclusive, E element, boolean inclusive)
		NavigableSet<Integer> nSet4 = treeSet.subSet(10, false, 20, false);
		//Set<Integer> nSet4 = treeSet.subSet(10, false, 20, false); // �̰͵� �ȴٰ�� �ϴµ� �� ������
		
		//15. NavigableSet<E> descendingSet() : ���� ������ �������� �ݴ�� ������ << descending�� ���� ���� �������� ���� >>
		System.out.println(treeSet); // �������� ����
		
		NavigableSet<Integer> descendingSet = treeSet.descendingSet(); // ������������ ������
		System.out.println(descendingSet);
		
		NavigableSet<Integer> dscendingSet2 = descendingSet.descendingSet(); // �ٽ� ������ -> ��������
		System.out.println(dscendingSet2);
		
		
		
		
	//������ ��
	}
}
