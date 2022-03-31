package chap17.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
	public static void main(String[] args) {

		//1. list ���� Ŭ������ �����ڸ� ����Ͽ� ��ü�� ������. list�� �������̽��̹Ƿ� new ������ �� �� ����.
		//   �׷��� �ڽ�Ŭ������ ���ؼ� Ÿ���� ������ ������. ArrayList, Vactor, LinkedList
		//capacity: �޸� ���� ũ���� �Ҵ�, �⺻���� 10, �̰� �׳� ���� �� �߿���
		//size()": �濡�� ����� ���� ���� << =====
		
		List<Integer> aList1 = new ArrayList<>(); // capacity
		List<Integer> aList2 = new ArrayList<>(30); // capacity : 30; �޸� ���� Ȯ��
		
		List<Integer> aList3 = new Vector();
		List<Integer> aList4 = new Vector(30);
		
		List<Integer> aList5 = new LinkedList();
		// List<Integer> aList6 = new LinkedList(30); // LinkedList ������� �Ҵ� �Ұ�
		
		//2. Arrays Ŭ������ ���� �޼��带 �̿��ϴ� ���: ����Ʈ ũ�⸦ �ٲ� �� ����.
				// ����, ����, �Ϸ� 24. <== ������ ���� ������ �� �����.
		
		List<Integer> aList7= Arrays.asList(1,2,3,4);
		List<String> aList8 = Arrays.asList("��","ȭ","��","��","��","��","��");
		aList7.set(0, 7); // set(): ������ ���� ���� �Ǵ� �߰��� �� �����. set(1,7)�� �ε��� 1������ ���� 7�� �����ϰڴٶ�� ��. 
		// aList7.add(5);// ���� �߻�, add() ���������� ���� �� �߰��� �� �����.
		System.out.println(aList7);
		
		aList8.set(0, "��");
		// aList8.add(8); // �߰��� ������ �߻���
		
		
	// ������ ��
	}
}
