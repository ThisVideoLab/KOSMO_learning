package chap05;

import java.util.Arrays;

public class ReadArrayData_Ex05 {

	public static void main(String[] args) {

		
		// �迭�� ��(index)�� ���̸� ���ϴ� �������� ���
		
		// 1. index�� ���̸� ���ϱ�
		int[] array = new int[] {3,4,5,6,7};
		System.out.println("���� ������ ���: " + array.length);
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		// 2. index�� �� ��ȣ�� ���� �Է��ؼ� ���
		
		System.out.print(array[3] + " " + array[2]);
		// System.out.print(array[5]); // 5�� ��(index)�� �����Ƿ� ���� ��� : Index 5 out of bounds for length 5
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		// 3. for���� Ȱ���Ͽ� Ư�� ������ �����ؼ� ���
		for(int i = 0;i< array.length ; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println();
		System.out.println("=====���=====");
		System.out.println();
		
		// 4. ����ϱ� 3 : ���� for, ó�� ����� ������ �惕 �Ӽ�ȯ�ϸ鼭 ���, ������ �����ؼ� ����� �� ����. ������ for���� ���ؼ� ª��.
		               // ���� �� ���̸� �����ϰ� �ʹٸ�, ���� for���� ����� for�� ���� �ʱ�Ŀ��� ������ ��������, ���ǽ��� �����ϴ� ������� ������ ��.

		for(int k : array) {              // for (�ڷ��� + ���� : �迭����){ ���๮, k�� ���} 
			System.out.print(k + " ");
		}
		
		System.out.println();
		System.out.println("==========");
		System.out.println();
		
		// 5. toString�� Ȱ���Ͽ� ����ϱ� :  array.toString -> �迭 ������ ��� ���� �����
		
		System.out.println(Arrays.toString(array)); // ���ȣ�� ����ؼ� ������ֱ⶧���� ���� �� ������ ����
		
		
	}

}
