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
		return data1 + "값 출력";
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
		return data1 + "값 출력";
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

		//1. MyClass를 TreeMap의 key로 인풋할 경우 : 실행시 오류가 발생함
		/*
		TreeMap<MyClass, String> treeMap1 = new TreeMap();
		
		MyClass m1 = new MyClass(2,5);
		MyClass m2 = new MyClass(2,5);
		
		treeMap1.put(m1, "첫번째"); // Comparable,Comparator 구현하지 않았는데, TreeMap의 key로 사용됨. 실행시 오류가 발생함. 
		treeMap1.put(m2, "두번째");
		
		System.out.println(treeMap1);
		
		<오류 사유>
		Exception in thread "main" java.lang.ClassCastException: class chap17.EX12.MyClass 
		 cannot be cast to class java.lang.Comparable (chap17.EX12.MyClass is in unnamed module of loader 'app';
		java.lang.Comparable is in module java.base of loader 'bootstrap')
		 */
		
		//2. Comparable을 구현한 클래스를 사용함.
		System.out.println("=====================");
		System.out.println("2. Comparable을 구현한 클래스를 사용함.");System.out.println();
		
		TreeMap<MyComparableClass, String> treeMap1 = new TreeMap();
		
		MyComparableClass my1 = new MyComparableClass(2, 5);
		MyComparableClass my2 = new MyComparableClass(3, 3);
		MyComparableClass my3 = new MyComparableClass(10, 5);
		
		treeMap1.put(my1, "첫번째");
		treeMap1.put(my2, "두번째");
		treeMap1.put(my3, "세번째");
		
		System.out.println(treeMap1);
		System.out.println("treeMap1의 사이즈: " + treeMap1.size());
		
		//3. Comparator를 구현: 기존의 객체를 사용, 객체의 수정이 불필요함.
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
		
		treeM.put(my4, "첫번째");
		treeM.put(my5, "두번째");
		treeM.put(my6, "세번째");
		
		System.out.println(treeM);
		System.out.println(treeM.size());
		
		
	//문서의 끝
	}
}
