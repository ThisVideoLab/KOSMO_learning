package chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

//TreeSet�� ����: 
//           a) �ߺ������� ���� �ʴ´�. b) ������������ ���ĵǾ �Էµ�) c) ���������� ���ĵǾ ������������ ��µ� d) �˻� ����� ������.
//			 e) Ư�� ������ ���� ����  f) asc(�������� ����), desc(������������)���� ��ȯ ������.


// treeSet�� �Ϲ� ��ü�� ������ ���, Ư�� �ʵ带 ũ����� ������ �Ǵ� �ʵ尡 �����ؾ� ��.
//1. comparable<E> �������̽��� compareTo() �޼��� : TreeSet�� �Ϲ� ��ü�� ������ �� �Ϲ� ��ü�� Ư�� �ʵ带 �������ؾ� �Ѵ�.
     // �� �� ������ Ŭ������ �����ؼ� �����. comparable<E> �������̽��� ��� �Ŀ� compareTo() �޼��带 ��������.
//2. comparable<E> �������̽��� compare() �޼��带 ������ ��. �̶� �͸� ���� ��ü�� �����.
     //�� �� ������ ��ü�� �������� �ʰ� ����ϴ� ������ ����.
//3. �͸� ���� ��ü�� ����ؼ� ó���ϴ� ���.

class MyClass{
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
		
	}
	@Override
	public String toString() {
		
		return data1 + " " + data2;
	}
}

//Comparable<E> �������̽��� ������ Ŭ���� ����

class MyComparableClass implements Comparable<MyComparableClass>{
	int data1; // < == �� �ʵ带 �� �������� ������ �ڿ� compareTo()�� �������ؼ� ����ؾ� ��.
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public int compareTo(MyComparableClass o) { // ��ü�� ũ�� �� ������ �����ϴ� �޼���. <TreeSet���� ����>> (����, ���, 0 �� �ϳ��� ������.) �� �κ��� �����ǽ������� ������ ������ ��.  
		if(this.data1 < o.data1) { // �� ����� �������� ó�� �����.
			return -1; // this.data1 ���� ���� ���� ��� : -1(����)
		}else if(this.data1  == o.data1){
			return 0; // this.data1 ���� ���� ���� ��� : 0
		}else {
			return 1; // this.data1 ���� ���� Ŭ ��� :-1(���)
		}
	}
	@Override
	public String toString() {
		
		return data1 + " " + data2;
	}
}

public class TreeSetMethod_2 {
	public static void main(String[] args) {  

		//1. Integer wrapper Ŭ������ ũ�� ��.
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = new Integer(20); // ū �� // ��Ҽ��� �� �ٲ���� �ִ� ����̶�� ��
		// Integer intValue3 = 3;��
		Integer intValue2 = new Integer(10); // ���� ��
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1);
		
		//2. String wrapper Ŭ������ ũ�� ��
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("����"); // ���� ��
		String str2 = "����";
		String str3 = new String("����");
		
		treeSet2.add(str1); // treeSet2.add()�� ����ؼ� ��ü�� ������ ��� ���� ũ�⸦ ���ϴ� �ʵ尡 ���ǵǾ� �־�� ��,
		treeSet2.add(str2); // comparableM<E> �������̽��� compareTo() �޼��尡 ������ �Ǿ�� �Ѵ�.
		
		System.out.println(treeSet2);
		
//		//3. MyClass�� TreeSet�� ������ �ɱ�? -> �ȵȴ� // Compareable<E> �������̽��� cimpareTo() �޼��尡 ������ �Ǿ�� TreeSet �÷��ǿ� ���� ����
//		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
//		MyClass myclass1 = new MyClass(2,5);
//		MyClass myclass2 = new MyClass(3,3);
//		
//		treeSet3.add(myclass1); // TreeSet���� Comprable<E> �������̽��� compareTo() �޼��带 �������� Ŭ������ ���� �� �ִ�.
//		treeSet3.add(myclass2); // ����� ���� �߻���
//		
//		System.out.println(treeSet3);
		
		//TreeSet�� �Ϲ� ��ü�� ������ ���
		//4. ���� ��ü�� �����ؼ� TreeSet�� �����ϴ� ���
		// .MyComparableClass ��ü ũ�� �� //  Comparable<E> �������̚��� ComapeTo() �ż��带 ������
		TreeSet<MyComparableClass> treeSet4 = new TreeSet();
		MyComparableClass m1 = new MyComparableClass(2,5); // TreeSet�� ����� �� Comparable<E> �������̚��� ComapeTo() �ż��带 ������
		MyComparableClass m2 = new MyComparableClass(3,3);
		MyComparableClass m3 = new MyComparableClass(4,3);
		
		treeSet4.add(m1);
		treeSet4.add(m2); // ���� �ڿ� Ʈ������ ���� ������� ���ĵ�
		treeSet4.add(m3); // ���� �ڿ� Ʈ������ ���� ������� ���ĵ�
		
		System.out.println(treeSet4); // �����ͼ³��� ������ ��µǴ� ��� ���� ������
		
		//5. ���2. ������ ��ü�� �������� �ʰ� TreeSet�� �����ϴ� ���
		// TreeSet ������ ���ο� Comparable<E> �������̽��� �����ؼ� �͸� ��ü�� ����
		TreeSet<MyClass> treeSet5 = new TreeSet<MyClass>(new Comparator<MyClass>() {
			//Comparator<MyClass>�� ������ �͸� �ڽ� Ŭ���� ��
			public int compare(MyClass o1, MyClass o2) {
				if(o1.data1 < o2.data1) {
					return -1;	
				}else if(o1.data1 == o2.data1) {
					return 0;	
				}else{
					return 1;	
				}
			}
		});
		
		MyClass myClass1 = new MyClass(2,5);
		MyClass myClass2 = new MyClass(3,3);
		
		treeSet5.add(myClass1);
		treeSet5.add(myClass2);
		
		System.out.println(treeSet5);
		
	//�����ǳ�
	}
}
