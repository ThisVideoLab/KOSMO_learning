package chap17.EX08;

import java.util.TreeSet;
import java.util.Comparator;

// 이름과 나이를 입력시 오름차순으로 출력하도록 구현할 것. treeSet의 name 컬럼을 이용해서

//1. Comparable<E>의 compareTo() 메서드 재정의
//기존 객체 수정 필요

//2. Comparable<E> 구현
// 기존 객체 수정 불필요

// 이 제출본은 처음 제출본으로 이름을 길게 넣는 경우에 리스트가 첫번째만 출력되는 치명적인 결함이 있음.

class Abc{
	String name; // << a가 정렬 컬럼 // 가~ 하까지 오름차순 정렬할 것. 홍길동 이순신, 강감찬 등으로 넣어서 강감찬이 먼저 나오도록 정렬
	int age;
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "성명: " + name + " 연령: " + age;
	}
}
class Abc_T implements Comparable<Abc_T>{
	String name;
	int age;
	
	public Abc_T(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Abc_T o) { // 객체의 크기 비교 기준을 설정하는 메서드. <TreeSet에서 사용됨>> (음수, 양수, 0 중 하나를 리턴함.) 이 부분을 재정의시켜주지 않으면 에러가 남.  
		if(this.name.charAt(0) < o.name.charAt(0)) { // 이 방법은 오름차순 처리 방식임.
			return -1; // this.data1 기준 값이 작을 경우 : -1(음수)
		}else if(this.name.charAt(0)  == o.name.charAt(0)){
			return 0; // this.data1 기준 값이 같을 경우 : 0
		}else {
			return 1; // this.data1 기준 값이 클 경우 :-1(양수)
		}
	}
	@Override
	public String toString() {
		return "성명: " + name + " 연령: " + age;
	}
}

public class EX_TreeSetMethod_3 {
	public static void main(String[] args) {


	//1. 기존 객체를 수정해서 TreeSet에 저장하는 방법
	TreeSet<Abc_T> treeSet1 = new TreeSet();
	
	Abc_T abc1 = new Abc_T("강호드리고게레로주니어", 15);
	Abc_T abc2 = new Abc_T("강호드리고", 14);
	Abc_T abc3 = new Abc_T("강호드리고게레로", 13);
	
	treeSet1.add(abc1);
	treeSet1.add(abc2);
	treeSet1.add(abc3);
	
	System.out.println(treeSet1);
	
	//2. 객체를 수정하지 않고 TreeSet에 저장하는 방법
	TreeSet<Abc> treeSet2 = new TreeSet<Abc>(new Comparator<Abc>() {
		public int compare(Abc o1, Abc o2) {
			System.out.println(o1.name.charAt(0));
			System.out.println(o2.name.charAt(0));
			if(o1.name.charAt(0) < o2.name.charAt(0)) {
				return -1;
			}else if(o1.name.charAt(0) == o2.name.charAt(0)) {
				return 0;
			}else{
				return 1;
			}
		}
	});
	
	Abc abc4 = new Abc("강호드리고게레로주니어", 15);
	Abc abc5 = new Abc("강호드리고게레로", 14);
	Abc abc6 = new Abc("강호드리고", 13);
	
	treeSet2.add(abc4);
	treeSet2.add(abc5);
	treeSet2.add(abc6);
	
	System.out.println(treeSet2);
	
	//문서의끝
	}
}