package chap17.EX06;

import java.util.HashSet;

// 멤버 클래스는 그대로 유지
// 내부만 hash set으로 변경. 

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

//중요: set은 중복될 수 없다.
	//Wrapper 클래스는 Integer. String, Double, Characto, Charactor, Byte, Short,  Bololean
	//Wrapper 클래스는 클래스는 equals(), hashcode() 메소드가 재정의되어 있음.
	// 특별 개체 생성 후 그 객체를 set에 저장할 경우 그 객체의 Object 클래스의 equals(), hashcod()를
	// 재정의해줟야 한다. 객체의 특정 필드의 값이 같을때 중복을 식별하는 필드를 생성함ㅇㅇ 

class Member extends MemberHashSet{ // DTO, VO : 각 계층간에 데이터를 받아서 전달해주는 클래스
	private int memberId;
	private String memberName;
	
	
	public Member(int memberId, String memberName) { // 생성자를 통해서 필드의 값을 할당
		this.memberId = memberId;
		this.memberName = memberName;
	}
	@Override
	public boolean equals(Object obj) { // 객체 정보가 Object로 업캐스팅해서 값을 받아오면
		if (obj instanceof Member) {	// 대상이 되는 Member 안에 obj가 있는지 부터 체크해서 true라면
			if(this.memberName == ((Member)obj).memberName) // 본격적으로 값을 비교하는 구문이 시작됨. 
			return true;					// 다만 여기서는 아니고, 아래 오버라이딩 파츠에서 식별함	
		}
		return false; //obj가 member 타입을 내포하지 않았을 때
	}
	@Override
	public int hashCode() { // Obhects.hash(필드명,필드명,필드명)과 같은 형태로 다중 해쉬코드 지정이 가능함.
		return Objects.hash(memberName); // 아래 주석처리 한 녀석들이 후보군임. 
		// return memberName; 
		// return meberid;
		// return this.memberId;  // 이렇게 여러개의 필드를 조건으로 hashCode를 생성할 수 있음.
	}
	                                                                                                                                                                                 
	
	public int getMemberId() { // MemberArrayList를 객체화하면 ArrayList 객체가 생성된다.
		return memberId;       // set 선언" <member>, 필드의 private(생성자, setter)
	}
	
		//Set<Member> hashSet = new HashSet<>(); // 이렇게도 선언이 가능함.

	public void setMemberId() {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {  // 이퀄스랑 해쉬코드 해서 동명 걸러내기
		this.memberName = memberName;
	}
	@Override
		public String toString(){
		return memberName + " 회원님의 아이디는 " + memberId +"입니다.";
	}
}

class MemberHashSet{ // MemberArrayList를 객체화하면 ArrayList가 생성됨 
	private Set<Member> hashSet;
	public MemberHashSet () { // 매개변수의 값이 없는 기본 생성자.
		hashSet = new HashSet<>();
	}
	public void addMember(Member member) { // Member 객체를 인풀받아 hashSet에 member 객체를 저장, 중복이 저장되면 안됨.
										   //  Member 객체의 memberId 필드의 값이 동일할 경우, 동일한 객체라고 정의함.
										   // equals(), hashCode() 매소드를 재정의해 memberId의 일치 여부를 판단 함
		hashSet.add(member);
	} 
	public boolean removeMember(int memberId) { // memberId는 Member 객체 내의 필드이므로 set에 저장된 객체를 가져와야 함.
		// Iterator를 사용해서 출력할 것. 다만 Set<>에는 Index가 존재하지 않으므로 기본 for문은 사용할 수 없음. 다만 향상된 for문은 사용이 가능함.
		
		Iterator <Member> iterator = hashSet.iterator(); // 클래스 <E> 참조객제 = set객체.itorator(); 
		while(iterator.hasNext()) {
			Member list =iterator.next();
			if(list.getMemberId() == memberId){
				hashSet.remove(iterator.next());
				return true; // true는 무한반복 while문의 탈출구문이 되기도 함
			}
		}
		/* 선생님 버전
		 * 
		Iterator <Member> ir = hashSet.iterator(); // hashSet이라는 과일 바구니 안에 member객체라는 과일들이 그득그득함. 그때 Iterator를 장착함.
	 	if(ir.hasNext()) {						   // 이 ir이라는 Iterator는 집게로, 닥치는대로 1개의 과일을 잡아 꺼냄.
	 		Member member = ir.next();
	 		int tempid = member.getMemberId();
	 	if(tempid == memberid) {
	 		hashSet.remove(member);
	 		return fasle;
	 		}
	 	} 	
		 */
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false; //
	}
	public void showSize() {
		// // Iterator를 사용해서 출력할 것.
		
		// iterator를 통한 출력
		Iterator<Member> iterator = hashSet.iterator(); // 클래스 <E> 참조객제 = set객체.itorator(); 
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + "  ");
		}
	}
}

public class EX_MemberHashSet {
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이동극");
		Member memberSon = new Member(1002, "손웅민");
		Member memberPark = new Member(1003, "박지손");
		Member memberHong = new Member(1004, "홍날두");
		Member memberLee2 = new Member(1005, "이동극");
		
		memberHashSet.addMember(memberLee); // 각 개체를 맴버 해쉬셋에 저장
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee2);
		
		// 모든 사용자 정보 출력
		System.out.println();
		System.out.println("==========================");
		System.out.println("1. 모든 사용자 정보 출력"); 
		
		System.out.println();
		
		
		memberHashSet.showSize(); //4명이 출력되어야 함. 입력단계부터 컷하란 말
		
		
		// 특정 아이디를 가진 사용자 제거
		System.out.println();
		System.out.println("==========================");
		System.out.println("2. 특정 아이디를 가진 사용자 제거");
		System.out.println();
		
		System.out.println();
		
		memberHashSet.removeMember(1004);
		System.out.println("1004번을 제거힙니다.");
		
		System.out.println();
		System.out.println("==========================");
		System.out.println("3. 제거 후 명단 출력");
		System.out.println();
		
		memberHashSet.showSize();
		
	// 문서의 끝
	}
}
