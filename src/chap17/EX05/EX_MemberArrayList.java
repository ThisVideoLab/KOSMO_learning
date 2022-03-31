package chap17.EX05;

import java.util.ArrayList;

class Member{ // DTO, VO : 각 계층간에 데이터를 받아서 전달해주는 클래스
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) { // 생성자를 통해서 필드의 값을 할당
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
		public String toString(){
		return memberName + " 회원님의 아이디는 " + memberId +"입니다.";
		
	}
}

class MemberArrayList { // MemberArrayList를 객체화하면 ArrayList가 생성됨 
	private ArrayList<Member> arraylist;
private Object memberArrayList;
	public MemberArrayList () { // 매개변수의 값이 없는 기본 생성자.
		arraylist = new ArrayList<Member>();
	}
	public void addMember(Member member) { // Member 객체를 받아서 맨마지막 방에 값을 추가하는 메서드 
	
	}
	public void addMember2(int a, Member member) { // 매개변수 2개를 받아서 // 특정 index 방 번호에 값을 추가(삽입)
		
	}
	//public boolean removeMember (int memberId) {
		
		// arrayList에 저장된  memberid를 검색해서 해당 객체를 삭제함
	//}
	public void showAllMember() {
		// 어레이 리스트에 있는 모든 멤버의 리스트를 출력하는 차파츠
		 System.out.println(memberArrayList);
	}
}


public class EX_MemberArrayList {
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		
		Member memberLee = new Member(1001, "이동극");
		Member memberSon = new Member(1002, "손웅민");
		Member memberPark = new Member(1003, "박지손");
		Member memberHong = new Member(1004, "홍날두");
		
		memberArrayList.addMember(memberLee); // 각 개체를 어레이 리스트에 저장
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		// 모든 사용자 정보 출력
		memberArrayList.addMember2(0, memberHong);
		memberArrayList.showAllMember(); 
		
		// 특정 아이디를 가진 사용자 제거
		
		//memberArrayList.removeMember(1004);
		
		// 특정 index방에 사용자추가
		
		memberArrayList.toString();
		
		
	// 문서의 끝
	}
}
