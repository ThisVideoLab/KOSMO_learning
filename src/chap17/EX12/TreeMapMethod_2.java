package chap17.EX12;

import java.util.Comparator;
import java.util.TreeMap;

class MyClass{
	int data1;
	int data2;
	public MyClass(int data1, int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public String toString() {
		return data1 + "�� ���";
	}
}

class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;
	int data2;
	public MyComparableClass(int data1, int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public String toString() {
		return data1 + "�� ���";
	}
	
	@Override
	public int compareTo(MyComparableClass o) {
		if (this.data1 < data2) {
			return -1;
		}else if(this.data1 == o.data1) {
			return 0;
		}else {
			return 1;
		}
	}
}

public class TreeMapMethod_2 {
	public static void main(String[] args) {

		//1. MyClass�� TreeMap�� key�� ��ǲ�� ��� : ����� ������ �߻���
		/*
		TreeMap<MyClass, String> treeMap1 = new TreeMap();
		
		MyClass m1 = new MyClass(2,5);
		MyClass m2 = new MyClass(2,5);
		
		treeMap1.put(m1, "ù��°"); // Comparable,Comparator �������� �ʾҴµ�, TreeMap�� key�� ����. ����� ������ �߻���. 
		treeMap1.put(m2, "�ι�°");
		
		System.out.println(treeMap1);
		
		<���� ����>
		Exception in thread "main" java.lang.ClassCastException: class chap17.EX12.MyClass 
		 cannot be cast to class java.lang.Comparable (chap17.EX12.MyClass is in unnamed module of loader 'app';
		java.lang.Comparable is in module java.base of loader 'bootstrap')
		 */
		
		//2. Comparable�� ������ Ŭ������ �����.
		System.out.println("=====================");
		System.out.println("2. Comparable�� ������ Ŭ������ �����.");System.out.println();
		
		TreeMap<MyComparableClass, String> treeMap1 = new TreeMap();
		
		MyComparableClass my1 = new MyComparableClass(2, 5);
		MyComparableClass my2 = new MyComparableClass(3, 3);
		MyComparableClass my3 = new MyComparableClass(10, 5);
		
		treeMap1.put(my1, "ù��°");
		treeMap1.put(my2, "�ι�°");
		treeMap1.put(my3, "����°");
		
		System.out.println(treeMap1);
		System.out.println("treeMap1�� ������: " + treeMap1.size());
		
		//3. Comparator�� ����: ������ ��ü�� ���, ��ü�� ������ ���ʿ���.
		System.out.println("=====================");System.out.println();
		TreeMap<MyClass, String> treeM = new TreeMap(new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if(o1.data1 < o2.data1) {
					return -1;
				}else if (o1.data1 == o2.data1) {
				return 0;
				}else {
					return 1;
				}
			}
		});

		
		MyClass my4 = new MyClass(2, 5);
		MyClass my5 = new MyClass(20, 20);
		MyClass my6 = new MyClass(3, 3);
		
		treeM.put(my4, "ù��°");
		treeM.put(my5, "�ι�°");
		treeM.put(my6, "����°");
		
		System.out.println(treeM);
		System.out.println(treeM.size());
		
		
	//������ ��
	}
}
