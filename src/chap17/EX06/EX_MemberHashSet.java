package chap17.EX06;

import java.util.HashSet;

// 멤버 클래스는 그대로 유지
// 내부만 hash set으로 변경. 

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

class Member extends MemberHashSet{ // DTO, VO : 각 계층간에 데이터를 받아서 전달해주는 클래스
	private int memberId;
	private String memberName;
	
	
	public Member(int memberId, String memberName) { // 생성자를 통해서 필드의 값을 할당
		this.memberId = memberId;
		this.memberName = memberName;
	}
	@Override
	public boolean equals(Object obj) { //12. 객체의 주소를 비교하는 것이 기본 설정임. 이것을 객체 내부의 특정 필드값을 비교하도록 설정해줘야 함.
		
		if (obj instanceof Member) {
			if(this.memberName == ((Member)obj).memberName) //13. 주의점: 잘못 다운캐스팅을 할 경우, Exception이 발생할 수 있음. 
										   //14. equals의 통해서 필드를 비교하도록 재정의함. 
			return true;	
		}
		return false;
	}
	@Override
	public int hashCode() { // Obhects.hash(필드명,필드명,필드명)과 같은 형태로 다중 해쉬코드 지정이 가능함.
		return Objects.hash(memberName); 
		// return memberName; // 위에 주석 처리한거랑 편한대로 챙겨쓰면 됨.
	}
	
	
	public int getMemberId() {
		return memberId;
	}

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
	public void addMember(Member member) { // Member 객체를 받아서 맨마지막 방에 값을 추가하는 메서드 
		
		hashSet.add(member);
	}
	public boolean removeMember(int memberId) {
		// Iterator를 사용해서 출력할 것.
		
		Iterator <Member> iterator = hashSet.iterator(); // 클래스 <E> 참조객제 = set객체.itorator(); 
		
		while(iterator.hasNext()) {
			Member list =iterator.next();
			if(list.getMemberId() == memberId){
				hashSet.remove(iterator.next());
				return true;
			}
		}
		return true;
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
		
		memberHashSet.addMember(memberLee); // 각 개체를 어레이 리스트에 저장
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
