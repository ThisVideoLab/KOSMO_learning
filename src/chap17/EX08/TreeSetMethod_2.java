package chap17.EX08;

import java.util.TreeSet;

//TreeSet의 장점: 
//           a) 중복저장이 되지 않는다. b) 오름차순으로 정렬되어서 입력됨) c) 마찬가지로 정렬되어서 오름차순으로 출력됨 d) 검색 기능을 지원함.
//			 e) 특정 범위의 값을 추출  f) asc(오름차순 정렬), desc(내림차순정렬)으로 전환 가능함.


// treeSet에 일반 객체를 저장한 경우, 특정 필드를 크기비교할 기준이 되는 필드가 존재해야 함.
//1. comparable<E> 인터페이스의 compareTo() 메서드 : TreeSet에 일반 객체를 저장할 때 일반 객체의 특ㅈ3ㅓㅇ 필드를 재정의해야 한다.
//2. comparable<E> 인터페이스의 compare() 메서드를 재정의 함.
//3. 익명 내부 객체를 사용해서 처리하는 방법.

class MyClass{
	int data1;
	int data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
		
	}
}

//Comparable<E> 인터페이스를 구현한 클래스 생성

class MyComparableClass implements Comparable<MyComparableClass>{
	int data1; // < == 이 필드를 비교 기준으로 설정한 뒤에 compareTo()를 재정의해서 사용해야 함.
	int data2;
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public int compareTo(MyComparableClass o) { // 객체의 크기 비교 기준을 설정하는 메서드. <TreeSet에서 사용됨>> (음수, 양수, 0 중 하나를 리턴함.) 이 부분을 재정의시켜주지 않으면 에러가 남.  
		if(this.data1 < o.data1) { // 이 방법은 오름차순 처리 방식임.
			return -1; // this.data1 기준 값이 작을 경우 : -1(음수)
		}else if(this.data1  == o.data1){
			return 0; // this.data1 기준 값이 같을 경우 : 0
		}else {
			return 1; // this.data1 기준 값이 클 경우 :-1(양수)
		}
	}
}

public class TreeSetMethod_2 {
	public static void main(String[] args) {  

		//1. Integer wrapper 클래스의 크기 비교.
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		Integer intValue1 = new Integer(20); // 큰 값 // 취소선은 곧 바뀔수도 있는 기능이라는 것
		// Integer intValue3 = 3;ㅣ
		Integer intValue2 = new Integer(10); // 작은 값
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1);
		
		//2. String wrapper 클래스의 크기 비교
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("가나"); // 작은 값
		String str2 = "가나";
		String str3 = new String("가나");
		
		treeSet2.add(str1); // treeSet2.add()를 사용해서 객체를 저장할 경우 값의 크기를 비교하는 필드가 정의되어 있어야 함,
		treeSet2.add(str2); // comparableM<E> 인터페이스의 compareTo() 메서드가 재정의 되어야 한다.
		
		System.out.println(treeSet2);
		
//		//3. MyClass가 TreeSet에 저장이 될까? -> 안된다 // Compareable<E> 인터페이스의 cimpareTo() 메서드가 재정의 되어야 TreeSet 컬렉션에 저장 가능
//		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
//		MyClass myclass1 = new MyClass(2,5);
//		MyClass myclass2 = new MyClass(3,3);
//		
//		treeSet3.add(myclass1); // TreeSet에는 Comprable<E> 인터페이스의 compareTo() 메서드를 재정의한 클래스만 넣을 수 있다.
//		treeSet3.add(myclass2); // 실행시 오류 발생함
//		
//		System.out.println(treeSet3);
		
		//4 .MyComparableClass 객체 크기 비교
		TreeSet<MyComparableClass> treeSet4 = new TreeSet();
		MyComparableClass m1 = new MyComparableClass(2,5);
		MyComparableClass m2 = new MyComparableClass(3,3);
		MyComparableClass m3 = new MyComparableClass(4,3);
		
		treeSet4.add(m1);
		treeSet4.add(m2);
		treeSet4.add(m3);
		
		System.out.println(treeSet4);
		 
		마지막 동영상 보고 투스트링 메서드 넣어야 함
		
		
	//문서의끝
	}
}
