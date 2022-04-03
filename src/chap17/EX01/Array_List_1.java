package chap17.EX01;

// java.lang ��Ű���� Ŭ�������� import�� �ʿ� ������ �׿� ģ������ ���� ����Ʈ�� �ʿ���

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
   �÷���:
   �迭: ������ �ڷ����� ����, ���� ũ�Ⱑ �����Ǿ� ����. �迭 ������ ���� ũ�⸦ ����.
   ���� ũ��� ���� �Ұ�����.
   list<E> : �������̽�, ���ʸ� �������̽� : �پ��� ������ Ÿ���� ��� ������.
   : �ε���(index)�� ������ ����.  
   - ArrayList<E> : �̱� ������ ȯ�濡�� �����
   - Vacrtor<E> : ��Ƽ ������ ȯ�濡�� �����
   - LinkedList<E> : �˻��� ��������, ���� �߰��ϰų� �����ϴ� ������ ����
*/

public class Array_List {
	public static void main(String[] args) {
		
		//1. �迭 
		String[]arr = new String[] {"��","��","��","��","��","��","��"};
		System.out.println(arr.length);
		arr[2] = null;
		arr[3] = null;
		System.out.println(arr.length);
		
		System.out.println("=============================");
		//2. Arrays.toString (�迭����)
		System.out.println(Arrays.toString(arr));
		
		//3. for ���� ����� ���
		for(int i = 0; i < arr.length ; i++ ) {
			if (i == 0) { // ù �� �տ� ���ȣ�� �ٿ���
				System.out.print("[" + arr[i]+", ");
			}else if (i == arr.length -1 ) { // ������ ���ȣ������ , ������� ���� ���ȣ�� �ٿ���
				System.out.println(arr[i]+"]");
			}else {
				System.out.print(arr[i] + ", ");	
			}
		}
		
		
		System.out.println("=============================");
		//4 enhanced for ���� ����ؼ� ���
		for(String k: arr) {
			System.out.print(k + ", ");
		}System.out.println();
		
		System.out.println("=============================");
		//5. List : �������̽��̱� ������ ��ü ������ �Ұ���. list 
		
		List<String> aList1 = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();
		List<String> aList3 = new ArrayList();
		
		// List���� ���� ���� ��� : aList.size(); <== List, length(): �迭
		System.out.println(aList1.size()); //
		
		//List�� �� �Ҵ��ϱ� : aList1.add("��"); // ���� �������� ���� �߰���.
		aList1.add("��");aList1.add("��");aList1.add("��");aList1.add("��");aList1.add("��");aList1.add("��");aList1.add("��");
		
		// List�� ����� �������� ���� ���ϱ� : aList1.size();                                                                                                          
		System.out.println("aList1�� ����: " + aList1.size()); // 7
		
		// List�� ����� ���� ���� : aList1.remove("������ ����")
		aList1.remove("��");
		aList1.remove("��");
		System.out.println("aList1�� ����: " + aList1.size()); // 5
		
		//List�� index�� ������ �ִ� (for)
		for (int i = 0; i < aList1.size(); i++) { // aList1.size() ���� ���� ��� 
			System.out.print(aList1.get(i) + ", "); // �渶���� ���� ���� ���
		}System.out.println();
		
		System.out.println("=============================");
		//2. Enhanced for ���� ����ؼ� �����
		
		
		System.out.println("=============================");
		//3. ��ü�� toString()�� �̿��ؼ� ���
		System.out.println(aList1);
		System.out.println(aList1.toString());
		
		
	// ������ ��
	}

}
