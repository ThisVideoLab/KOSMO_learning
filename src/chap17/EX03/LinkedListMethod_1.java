package chap17.EX03;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;

//LinkedList ArrayList�� �����ϰ� ���.
// LinkedList�� ��� �޼��尡 ����ȭó���� �Ǿ��ִ�. ��Ƽ ������ ȯ�濡�� ���ǵ��� �Ǿ�����.
// ���ÿ� ���ư��ٴ°� �� ���̰� ���ư��ٴ� ����. ��Ƽ�϶��� ���� ȿ���� �������� �̱� �������϶��� ������ ������ ���ϵ�.
// ��� �̱� ������ ȯ�濡���� ArrayList�� ��� , ��Ƽ ������ ȯ�濡���� LinkedList�� ����ϱ� �� �ͤ���


public class LinkedListMethod_1 {
	public static void main(String[] args) {
	// list�� ���ӵ� : 13�� ������ �޼���,
		//1 LinkedList
		//2 LinkedList
		//3 LinkedList
		
	List<Integer> linkedlist1 = new LinkedList<Integer>(); 
	
	System.out.println("1===========================");
	//1. add(E element) : ������ ���� �� �ϳ��� �� �߰��ϱ�
	linkedlist1.add(3); linkedlist1.add(4); linkedlist1.add(5);
	System.out.println(linkedlist1); // linkedlist1�� �� ���
	System.out.println(linkedlist1.size()); // ���� ����
	
	System.out.println("2===========================");
	//2. add(int index, E element)
	linkedlist1.add(1, 6); // ���ȣ 1���� 6�� �߰��ϴ� �� ==> �� �� �ڿ� ����� ��ĭ�� �� �з���
	System.out.println(linkedlist1);
	
	System.out.println("3===========================");
	//3. add all (�Ǵٸ� ����Ʈ�� ��ü�� �����ؼ� �߰���)
	List <Integer> linkedlist2 = new LinkedList();
	linkedlist2.add(1); // ���� linkedlist2 = {1}
	linkedlist2.add(2); // ���� linkedlist2 ={[1,2}
	
	linkedlist2.addAll(linkedlist1); // linkedlist1 ����� ���� �����ؼ� linkedlist2�� �߰���.
						   //���� linkedlist2 ={[1,2,3, 6, 4, 5}
	System.out.println(linkedlist2);
	
	System.out.println("4===========================");
	//4. addAll(int indes, �� �ٸ� ��ü)
	List<Integer> linkedlist3 = new LinkedList();
	linkedlist3.add(1);
	linkedlist3.add(2);
	
	linkedlist3.addAll(1, linkedlist3); // �ڽ��� ���� �߰��ؼ� �ٸ� ��ü�� �߰���
	System.out.println(linkedlist3);// �� �ڷ� �ڱ� �ڽ��� ������ �߰��ؼ� �þ
	
	System.out.println("5===========================");
	// 5. set (int index, E element) : Ư�� ���ȣ�� ���� ����
	linkedlist3.set(1, 5) ; // 1�� ������� ���� 5�� ������
	linkedlist3.set(3, 6) ; // 
	// linkedlist3.set(4,7)// �����߻� �� ��ȣ�� 3��������...
	System.out.println(linkedlist3);
	
	System.out.println("6===========================");
	//6.remove(int index): Ư�� ���ȣ�� ���� ������.
	linkedlist3.remove(1); // �� ��ȣ 1���濡 �ִ� ���� ������
	System.out.println(linkedlist3); // 
	
	System.out.println("7===========================");
	//7. remove (Object o ) : �� ��ȣ�� �ƴ� ������ �����ϴ� ��ɾ�
	System.out.print(linkedlist3); // ���� linkedlist3�� ����ؼ� 2���� �ִ°� Ȯ�����ְ�
	linkedlist3.remove(new Integer(2)); // 2 ���� ������
	System.out.println(linkedlist3); // 2�� �����
	
	System.out.println("8===========================");
	//8. clear() : ��� ����
	 linkedlist3.clear();
	 System.out.println(linkedlist3);
	 
	 System.out.println("9===========================");
	 //9. isEmpty();  ���� ��� ������ True, ������� ������ false
	 System.out.println(linkedlist3.isEmpty());
     
	 System.out.println("10==========================");
	 //10. size(): ���� ����, ���� ����
	 System.out.println(linkedlist3.size());
	 linkedlist3.add(1); linkedlist3.add(2); linkedlist3.add(3); // �ٽ� �� �߰�
	 System.out.println(linkedlist3 + " = �ٽ� �� �߰�");
	 System.out.println(linkedlist3.size());
	 
	 System.out.println("11==========================");
	 //11. get(int index) : �� ��ȣ�� ���� �����
	 System.out.print(linkedlist3.get(0) + " ");
	 System.out.print(linkedlist3.get(1) + " ");
	 System.out.print(linkedlist3.get(2) + " ");
	 System.out.println();
	 System.out.println(linkedlist3);// List�϶� ��ü�� ����ϸ� ��ü�� ���� �����
	 
	 System.out.println("12==========================");
	 //12. toArray() : List(����Ʈ) ---> Array (�迭)�� ��ȯ
	 
	 Object[] object = linkedlist3.toArray(); // toArrays() �޼���� Object Ÿ������ ������ ��
	 // �ٿ� ĳ������ �ʿ��� ����
	 System.out.println(Arrays.toString(object)); // �迭�϶��� Arrays.toString() ��� 
	 
	 
	 System.out.println("13-1=======================");
	 //13-1 toaRRAR(t[]t) ==> t[] : Inter�� �ٷ� ĳ����
	 Integer[] integer1 = linkedlist3.toArray(new Integer[0]); // ���� �ִ� ���ȣ���� �۰� �Է��ϸ� ��ü �� ��ȣ ���
	 System.out.println(Arrays.toString(integer1));
	 
	 System.out.println("13 -2=======================");
	 //13-1 toaRRAR(t[]t) ==> t[] : Inter�� �ٷ� ĳ����
	 Integer[] integer2 = linkedlist3.toArray(new Integer[5]); // ���� �ִ� �� ��ȣ���� ũ�� �Է��ϸ� �ϴ� ��ü �� ��ȣ ��� + ������ �� ���� null������ ó����
	 System.out.println(Arrays.toString(integer2));
		
	// ������ ��
	}
}
