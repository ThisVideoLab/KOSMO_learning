package chap17.EX07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//1.LinkedHashSet�� hashSet�� ��
	//a) ������: ��� �޼��尡 ������. �ߺ��� ���� �������� ����. ���ȣ(index)���� ������ ����.
	//		   ��½ÿ�
	//b) ������: hashSet�� �Է´�� ��µ��� ����. linkedHashSet�� �Է´�� ��µ�.
	//         �̷� ������ ����� ���� hashSet�� ������ ����� ������.


//set<E> " �������̽��� ���¿� ���״� Ÿ������ ������. ���ȣ(index)�� ����. �ߺ��� ���� ���� �� ����.
	// HashSet : �ߺ��� ���� ���� �� ����. ���� ������ ������� �������� �ʴ´�. �������� ��µ�.
  // LinkedHashSet : �ߺ��� ���� ���� �� ����. ��½ô� ������� ��µ�. HashSet�� ������ �ణ ������ �����ΰ�?
				      // �ణ ������� �̶�� �� ������ ��ҿ��� ������ִ� ������� ��µǸ鼭 index ��ȣ�� �޴µ� ��
  // TreeSet : ����Ǵ� ������ ���ĵǾ �����. ascending(�������� ����) 0 �� 9, a �� z, �� �� �� (descending: ��������)

	

public class LinkedHashSetMethod {
	public static void main(String[] args) {


		//1. add(E element): ���ȣ�� ���� ������, Ŀ�ٶ� ������ �����ϸ� ����.
				System.out.println("=====================");
				System.out.println("1. add(E element)");System.out.println();
				
				Set<String> linkedSet1 = new HashSet();
				linkedSet1.add("��");linkedSet1.add("��");linkedSet1.add("��"); // 3���� �־�����, ���� �ߺ� �Է���
				System.out.println(linkedSet1); // ��� ������ ����. �ߺ��Է��� "��"�� ���� 1���� �Էµǰ� 1���� ������. 
				System.out.println(linkedSet1.toString() ); // toString �޼��尡 �⺻������ �����ǵǾ� ����.
				System.out.println();
				
				//2. addAll(�ٸ� set ��ü) : �ڽ��� Set���� �ٸ� set�� ������ ���� �߰���, �ٸ� �ߺ��� ���� ������
				System.out.println("=====================");
				System.out.println("2. addAll(�ٸ� set ��ü)");System.out.println();
				
				
				Set<String> linkedSet2 = new HashSet();
				linkedSet2.add("��"); linkedSet2.add("��"); // �⺻������ 2�� ���� �߰��� �� ��
				linkedSet2.addAll(linkedSet1); // linkedSet1�� �״�� linkedSet2����
				System.out.println(linkedSet2);
				System.out.println();
				
				//3. remove (Object o) : ������ ���� ������, list�� index ��ȣ�� �����ϴ� ���� ������
				System.out.println("=====================");
				System.out.println("3. remove (Object o)");System.out.println();
				
				
				linkedSet2.remove("��");
				System.out.println(linkedSet2);
				System.out.println();
				
				//4. clear() : ��� ����
				System.out.println("=====================");
				System.out.println("4. clear() : ��� ����");System.out.println();
				
				
				linkedSet2.clear();
				System.out.println(linkedSet2);
				System.out.println();
				
				//5. isEmpty() : ��������� true, �������� false
				System.out.println("=====================");
				System.out.println("5. isEmpty()");System.out.println();
				
				
				System.out.println(linkedSet2.isEmpty()); // ��������Ƿ� true
				System.out.println();

				//6. contains(Object o) : �Է��� object ���� set �ȿ� �����ϸ� true; ������ false 
				System.out.println("=====================");
				System.out.println("6. contains(Object o)");System.out.println();
				
				Set<String> linkedSet3 = new HashSet<>();
				linkedSet3.add("��");linkedSet3.add("��");linkedSet3.add("��");
				System.out.println(linkedSet3); // ��� ������ ���׹���
				System.out.println(linkedSet3.contains("��"));// true
				System.out.println(linkedSet3.contains("���̶����������߾߾߾�")); // false 
				
				//7. size() : Set�� ���Ե� ���� ���� 
				System.out.println("=====================");
				System.out.println("7. size() : Set�� ���Ե� ���� ����");System.out.println();
				
				System.out.println(linkedSet3.size());
				
				
				
				//8. iterator() : set�� index ��ȣ�� ����. �嵥 for���� index ��ȣ�� �ʿ�� �ϹǷ� ��� �Ұ���. �׷��� ���� for���� ����� ������.
				//                ��ȸ�ڶ�� �Ҹ�. ��ȸ�ϸ鼭 set ������ ������ ���� �����.
				//                hasNext() : set�� ���� �����ϸ� true, �������� ������ false
				//                next() : ���� ���� ����ϰ� ���������� �̵���.
				System.out.println("=====================");
				System.out.println("8. iterator()");System.out.println();

				Iterator<String> iterator = linkedSet3.iterator(); // Ŭ���� <E> �������� = set��ü.itorator(); 
				while(iterator.hasNext()) {
					System.out.print(iterator.next() + "  ");
				}
				System.out.println();System.out.println();
				
				System.out.println("enhanced for���� ���� ���");System.out.println();
				for(String k : linkedSet3) {
					System.out.print(k + "  ");
				}
				System.out.println();System.out.println();
				
				//9. toArray() : Set�� ������ �迭�� ������. object Ÿ������ ����, �ٿ� ĳ������ �ʿ���.
				System.out.println("=====================");
				System.out.println("9. toArray()");System.out.println();
				
				Object [] obArr = linkedSet3.toArray();
				for(int i = 0; i < obArr.length; i++) {
					System.out.print(obArr[i] + " ");
				}
				System.out.println();
				for(Object k : obArr) { // �ٸ� �ڷ������� �������� �ٿ� ĳ������ ������ �ʿ���
					System.out.print(k + " ");
				}
				System.out.println();
				
				//10. toArray(T[]t) : �ٷ� �ٿ� ĳ������ �� �Ŀ� ����ϴ� ���
				System.out.println("=====================");
				System.out.println("9. toArray()");System.out.println();
				
				String[] strArr1 = linkedSet3.toArray(new String[0]); // 0: ���� ũ�⸦ ��Ÿ��. �۾Ƶ� �ڵ����� �����Ϸ��� �ʿ��Ѹ�ŭ �������༭ ������.
				System.out.println(Arrays.toString(strArr1));
				
				
				//11. ���� set ���ΰ��� �������� ���� ũ�⸦ ũ�� �� ���: null�� �� �� ����.
				System.out.println("=====================");
				System.out.println("11. ���� set ���ΰ��� �������� ���� ũ�⸦ ũ�� �� ���");System.out.println();
				
				String[] strArr2 = linkedSet3.toArray(new String[5]); // ũ�� ����� �� �渶�� null���� ������.
				System.out.println(Arrays.toString(strArr2)); 
				
				
		
	// ������ ��
	}
}
