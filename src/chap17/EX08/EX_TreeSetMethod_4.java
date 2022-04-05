package chap17.EX08;

import java.util.Comparator;
import java.util.TreeSet;

// 이름과 나이를 입력시 오름차순으로 출력하도록 구현할 것. treeSet의 name 컬럼을 이용해서

//1. Comparable<E>의 compareTo() 메서드 재정의
		//기존 객체 수정 필요

//2. Comparable<E> 구현
		// 기존 객체 수정 불필요

class Abc1{
	String name; // << a가 정렬 컬럼 // 가~ 하까지 오름차순 정렬할 것. 홍길동 이순신, 강감찬 등으로 넣어서 강감찬이 먼저 나오도록 정렬
	int age;
	
	public Abc1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		
		return "성명: " + name + " 연령: " + age;
	}
}
class Abc1_T implements Comparable<Abc1_T>{
	String name; 
	int age;
	
	public Abc1_T(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Abc1_T o) { // 객체의 크기 비교 기준을 설정하는 메서드. <TreeSet에서 사용됨>> (음수, 양수, 0 중 하나를 리턴함.) 이 부분을 재정의시켜주지 않으면 에러가 남.  
		int att = this.name.compareToIgnoreCase(o.name) ; // IgnoreCase 추가, 대소문자 무시, 대문자 소문자에 상관 없이 값 비교
		
		// 아래 주석처리 3줄을 활성화 시키면 변수간의 아스키코드 값이 죽 출력됨.
		//System.out.println(this.name);
		//System.out.println(o.name);
		//System.out.println(att);
		  
		return att;
	}
	@Override
	public String toString() {
		return "성명: " + name + " 연령: " + age;
	}
}

public class EX_TreeSetMethod_4 {
	public static void main(String[] args) {
		
		//1. 기존 객체를 수정해서 TreeSet에 저장하는 방법
		TreeSet<Abc1_T> treeSet1 = new TreeSet();
		
		Abc1_T Abc11 = new Abc1_T("강아뭉가나이비", 13); 
		Abc1_T Abc12 = new Abc1_T("강로드리게스알레한드로", 14);
		Abc1_T Abc13 = new Abc1_T("강감찬", 15);
		
		treeSet1.add(Abc11);
		treeSet1.add(Abc12);
		treeSet1.add(Abc13);
		
		System.out.println(treeSet1);
		
		//2. 객체를 수정하지 않고 TreeSet에 저장하는 방법
		TreeSet<Abc1> treeSet2 = new TreeSet<Abc1>(new Comparator<Abc1>() { //for 문 돌리기 삽가능
			public int compare(Abc1 o1, Abc1 o2) {
				int run = 0;
				int i =0;
				try {
					while(i < (o1.name.length())*(o2.name.length())) { // 이름을 얼마 때려넣을지 모르니 아예 이름 길이들 만큼 넉넉하게
						if(o1.name.charAt(i) < o2.name.charAt(i)) {
							run = -1;
							break; //while문 탈출 구문 // 두 값의 선후 차이를 찾았으니 이번 차례 비교는 이제 그만둠
						}else if(o1.name.charAt(i) > o2.name.charAt(i)) {
							run = 1;
							break; //while문 탈출 구문 // 두 값의 선후 차이를 찾았으니 이번 차례 비교는 이제 그만둠
						}else {
							i = i+1; // 다음 비교
						}
					}
				}catch(Exception e){} // outIndex 머시기 예외처리해서 속행시킴
				return run;
				}
			});
		
		Abc1 Abc14 = new Abc1("강로드리게스알레한드로", 15); 
		Abc1 Abc15 = new Abc1("강감찬", 14);
		Abc1 Abc16 = new Abc1("강아뭉가나이비", 13);
		
		treeSet2.add(Abc14);
		treeSet2.add(Abc15);
		treeSet2.add(Abc16);
		
		System.out.println(treeSet2);
		
	//문서의끝
	}
}
