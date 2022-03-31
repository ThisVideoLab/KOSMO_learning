package chap17.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod_1 {
	public static void main(String[] args) {
	// list�� ���ӵ� : 13�� ������ �޼���,
		//1 ArrayList
		//2 Vector
		//3 LinkedList
		
	List<Integer> aList1 = new ArrayList<Integer>();
	
	System.out.println("1===========================");
	//1. add(E element) : ������ ���� �� �ϳ��� �� �߰��ϱ�
	aList1.add(3); aList1.add(4); aList1.add(5);
	System.out.println(aList1); // aList1�� �� ���
	System.out.println(aList1.size()); // ���� ����
	
	System.out.println("2===========================");
	//2. add(int index, E element)
	aList1.add(1, 6); // ���ȣ 1���� 6�� �߰��ϴ� �� ==> �� �� �ڿ� ����� ��ĭ�� �� �з���
	System.out.println(aList1);
	
	System.out.println("3===========================");
	//3. add all (�Ǵٸ� ����Ʈ�� ��ü�� �����ؼ� �߰���)
	List <Integer> aList2 = new ArrayList();
	aList2.add(1); // ���� aList2 = {1}
	aList2.add(2); // ���� aList2 ={[1,2}
	
	aList2.addAll(aList1); // aList1 ����� ���� �����ؼ� aList2�� �߰���.
						   //���� aList2 ={[1,2,3, 6, 4, 5}
	System.out.println(aList2);
	
	System.out.println("4===========================");
	//4. addAll(int indes, �� �ٸ� ��ü)
	List<Integer> aList3 = new ArrayList();
	aList3.add(1);
	aList3.add(2);
	
	aList3.addAll(1, aList3); // �ڽ��� ���� �߰��ؼ� �ٸ� ��ü�� �߰���
	System.out.println(aList3);// �� �ڷ� �ڱ� �ڽ��� ������ �߰��ؼ� �þ
	
	System.out.println("5===========================");
	// 5. set (int index, E element) : Ư�� ���ȣ�� ���� ����
	aList3.set(1, 5) ; // 1�� ������� ���� 5�� ������
	aList3.set(3, 6) ; // 
	// aList3.set(4,7)// �����߻� �� ��ȣ�� 3��������...
	System.out.println(aList3);
	
	System.out.println("6===========================");
	//6.remove(int index): Ư�� ���ȣ�� ���� ������.
	aList3.remove(1); // �� ��ȣ 1���濡 �ִ� ���� ������
	System.out.println(aList3); // 
	
	System.out.println("7===========================");
	//7. remove (Object o ) : �� ��ȣ�� �ƴ� ������ �����ϴ� ��ɾ�
	System.out.print(aList3); // ���� aList3�� ����ؼ� 2���� �ִ°� Ȯ�����ְ�
	aList3.remove(new Integer(2)); // 2 ���� ������
	System.out.println(aList3); // 2�� �����
	
	System.out.println("8===========================");
	//8. clear() : ��� ����
	 aList3.clear();
	 System.out.println(aList3);
	 
	 System.out.println("9===========================");
	 //9. isEmpty();  ���� ��� ������ True, ������� ������ false
	 System.out.println(aList3.isEmpty());
     
	 System.out.println("10==========================");
	 //10. size(): ���� ����, ���� ����
	 System.out.println(aList3.size());
	 aList3.add(1); aList3.add(2); aList3.add(3); // �ٽ� �� �߰�
	 System.out.println(aList3 + " = �ٽ� �� �߰�");
	 System.out.println(aList3.size());
	 
	 System.out.println("11==========================");
	 //11. get(int index) : �� ��ȣ�� ���� �����
	 System.out.print(aList3.get(0) + " ");
	 System.out.print(aList3.get(1) + " ");
	 System.out.print(aList3.get(2) + " ");
	 System.out.println();
	 System.out.println(aList3);// List�϶� ��ü�� ����ϸ� ��ü�� ���� �����
	 
	 System.out.println("12==========================");
	 //12. toArray() : List(����Ʈ) ---> Array (�迭)�� ��ȯ
	 
	 Object[] object = aList3.toArray(); // toArrays() �޼���� Object Ÿ������ ������ ��
	 // �ٿ� ĳ������ �ʿ��� ����
	 System.out.println(Arrays.toString(object)); // �迭�϶��� Arrays.toString() ��� 
	 
	 
	 System.out.println("13-1=======================");
	 //13-1 toaRRAR(t[]t) ==> t[] : Inter�� �ٷ� ĳ����
	 Integer[] integer1 = aList3.toArray(new Integer[0]); // ���� �ִ� ���ȣ���� �۰� �Է��ϸ� ��ü �� ��ȣ ���
	 System.out.println(Arrays.toString(integer1));
	 
	 System.out.println("13-2=======================");
	 //13-1 toaRRAR(t[]t) ==> t[] : Inter�� �ٷ� ĳ����
	 Integer[] integer2 = aList3.toArray(new Integer[5]); // ���� �ִ� �� ��ȣ���� ũ�� �Է��ϸ� �ϴ� ��ü �� ��ȣ ��� + ������ �� ���� null������ ó����
	 System.out.println(Arrays.toString(integer2));
		
	// ������ ��
	}
}
