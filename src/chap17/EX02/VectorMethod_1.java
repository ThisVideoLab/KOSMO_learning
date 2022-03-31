package chap17.EX02;

import java.util.Vector;
import java.util.Arrays;
import java.util.List;

//Vector ArrayList�� �����ϰ� ���.
// Vector�� ��� �޼��尡 ����ȭó���� �Ǿ��ִ�. ��Ƽ ������ ȯ�濡�� ���ǵ��� �Ǿ�����.
// ���ÿ� ���ư��ٴ°� �� ���̰� ���ư��ٴ� ����. ��Ƽ�϶��� ���� ȿ���� �������� �̱� �������϶��� ������ ������ ���ϵ�.
// ��� �̱� ������ ȯ�濡���� ArrayList�� ��� , ��Ƽ ������ ȯ�濡���� Vector�� ����ϱ� �� �ͤ���


public class VectorMethod_1 {
	public static void main(String[] args) {
	// list�� ���ӵ� : 13�� ������ �޼���,
		//1 Vector
		//2 Vector
		//3 LinkedList
		
	List<Integer> vector1 = new Vector<Integer>();
	
	System.out.println("1===========================");
	//1. add(E element) : ������ ���� �� �ϳ��� �� �߰��ϱ�
	vector1.add(3); vector1.add(4); vector1.add(5);
	System.out.println(vector1); // vector1�� �� ���
	System.out.println(vector1.size()); // ���� ����
	
	System.out.println("2===========================");
	//2. add(int index, E element)
	vector1.add(1, 6); // ���ȣ 1���� 6�� �߰��ϴ� �� ==> �� �� �ڿ� ����� ��ĭ�� �� �з���
	System.out.println(vector1);
	
	System.out.println("3===========================");
	//3. add all (�Ǵٸ� ����Ʈ�� ��ü�� �����ؼ� �߰���)
	List <Integer> vector2 = new Vector();
	vector2.add(1); // ���� vector2 = {1}
	vector2.add(2); // ���� vector2 ={[1,2}
	
	vector2.addAll(vector1); // vector1 ����� ���� �����ؼ� vector2�� �߰���.
						   //���� vector2 ={[1,2,3, 6, 4, 5}
	System.out.println(vector2);
	
	System.out.println("4===========================");
	//4. addAll(int indes, �� �ٸ� ��ü)
	List<Integer> vector3 = new Vector();
	vector3.add(1);
	vector3.add(2);
	
	vector3.addAll(1, vector3); // �ڽ��� ���� �߰��ؼ� �ٸ� ��ü�� �߰���
	System.out.println(vector3);// �� �ڷ� �ڱ� �ڽ��� ������ �߰��ؼ� �þ
	
	System.out.println("5===========================");
	// 5. set (int index, E element) : Ư�� ���ȣ�� ���� ����
	vector3.set(1, 5) ; // 1�� ������� ���� 5�� ������
	vector3.set(3, 6) ; // 
	// vector3.set(4,7)// �����߻� �� ��ȣ�� 3��������...
	System.out.println(vector3);
	
	System.out.println("6===========================");
	//6.remove(int index): Ư�� ���ȣ�� ���� ������.
	vector3.remove(1); // �� ��ȣ 1���濡 �ִ� ���� ������
	System.out.println(vector3); // 
	
	System.out.println("7===========================");
	//7. remove (Object o ) : �� ��ȣ�� �ƴ� ������ �����ϴ� ��ɾ�
	System.out.print(vector3); // ���� vector3�� ����ؼ� 2���� �ִ°� Ȯ�����ְ�
	vector3.remove(new Integer(2)); // 2 ���� ������
	System.out.println(vector3); // 2�� �����
	
	System.out.println("8===========================");
	//8. clear() : ��� ����
	 vector3.clear();
	 System.out.println(vector3);
	 
	 System.out.println("9===========================");
	 //9. isEmpty();  ���� ��� ������ True, ������� ������ false
	 System.out.println(vector3.isEmpty());
     
	 System.out.println("10==========================");
	 //10. size(): ���� ����, ���� ����
	 System.out.println(vector3.size());
	 vector3.add(1); vector3.add(2); vector3.add(3); // �ٽ� �� �߰�
	 System.out.println(vector3 + " = �ٽ� �� �߰�");
	 System.out.println(vector3.size());
	 
	 System.out.println("11==========================");
	 //11. get(int index) : �� ��ȣ�� ���� �����
	 System.out.print(vector3.get(0) + " ");
	 System.out.print(vector3.get(1) + " ");
	 System.out.print(vector3.get(2) + " ");
	 System.out.println();
	 System.out.println(vector3);// List�϶� ��ü�� ����ϸ� ��ü�� ���� �����
	 
	 System.out.println("12==========================");
	 //12. toArray() : List(����Ʈ) ---> Array (�迭)�� ��ȯ
	 
	 Object[] object = vector3.toArray(); // toArrays() �޼���� Object Ÿ������ ������ ��
	 // �ٿ� ĳ������ �ʿ��� ����
	 System.out.println(Arrays.toString(object)); // �迭�϶��� Arrays.toString() ��� 
	 
	 
	 System.out.println("13-1=======================");
	 //13-1 toaRRAR(t[]t) ==> t[] : Inter�� �ٷ� ĳ����
	 Integer[] integer1 = vector3.toArray(new Integer[0]); // ���� �ִ� ���ȣ���� �۰� �Է��ϸ� ��ü �� ��ȣ ���
	 System.out.println(Arrays.toString(integer1));
	 
	 System.out.println("13 -2=======================");
	 //13-1 toaRRAR(t[]t) ==> t[] : Inter�� �ٷ� ĳ����
	 Integer[] integer2 = vector3.toArray(new Integer[5]); // ���� �ִ� �� ��ȣ���� ũ�� �Է��ϸ� �ϴ� ��ü �� ��ȣ ��� + ������ �� ���� null������ ó����
	 System.out.println(Arrays.toString(integer2));
		
	// ������ ��
	}
}
