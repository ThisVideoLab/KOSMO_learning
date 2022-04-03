package chap17.EX05;

import java.util.ArrayList;
import java.util.Scanner;

class Member extends MemberArrayList{ // DTO, VO : 각 계층간에 데이터를 받아서 전달해주는 클래스
	private int memberId;
	private String memberName;
	
	
	public Member(int memberId, String memberName) { // 생성자를 통해서 필드의 값을 할당
		this.memberId = memberId;
		this.memberName = memberName;
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

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
		public String toString(){
		return memberName + " 회원님의 아이디는 " + memberId +"입니다.";
	}
}

class MemberArrayList{ // MemberArrayList를 객체화하면 ArrayList가 생성됨 
	private ArrayList<Member> arraylist;
	public int removedNumer;
	public Member removedName;
	public MemberArrayList () { // 매개변수의 값이 없는 기본 생성자.
		 arraylist = new ArrayList<>();
	}
	public void addMember(Member member) { // Member 객체를 받아서 맨마지막 방에 값을 추가하는 메서드 
		
		arraylist.add(member);
	}
	public void addMember2() { // 매개변수 2개를 받아서 // 특정 index 방 번호에 값을 추가(삽입)
		arraylist.add(removedNumer,removedName);
	}
	public boolean removeMember() {
	// arrayList에 저장된  memberid를 검색해서 해당 객체를 삭제함
		
POS1:	while(true) {
			System.out.println("삭제를 원하는 회원의 ID를 입력하세요. 모두 입력했다면 0 을 입력하세요.");
			Scanner scan = new Scanner(System.in);
			int IdNumberToRemove = scan.nextInt();
			if( 0 == IdNumberToRemove){
				scan.close();
				break;
			}else {
				for (int i = 0; i< arraylist.size(); i++) { // 모든 방에 대해서 검사 실행
					// 만약 입력받은 멤버 아이디가 가지고 있는 멤버 아이디와 동일하다면
					Member list = arraylist.get(i);
					if(list.getMemberId() == IdNumberToRemove){
						// 가지고 있는 멤버 아이디를 지워라
						 System.out.println("회원 id " + list.getMemberId()+ "를 제거합니다");
						 this.removedNumer = i;
						 this.removedName = arraylist.get(i);
						 System.out.println();
						 arraylist.remove(i);
						 System.out.println("남아있는 회원들의 목록은 다음과 같습니다.");
						 System.out.println();
						 for (int k = 0; k< arraylist.size(); k++) { 
								System.out.println(arraylist.get(k));
							}
						 System.out.println();
						 break;
					}
				}
			}
		}
		return true;
	}

	public void showAllMember() {
		// 어레이 리스트에 있는 모든 멤버의 리스트를 출력하는 파츠
		for (int i = 0; i< arraylist.size(); i++) {
			System.out.println(this.arraylist.get(i));
		}
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
		System.out.println();
		System.out.println("==========================");
		System.out.println("1. 모든 사용자 정보 출력"); 
		
		System.out.println();
		
		
		memberArrayList.showAllMember(); 
		
		
		// 특정 아이디를 가진 사용자 제거
		System.out.println();
		System.out.println("==========================");
		System.out.println("2. 특정 아이디를 가진 사용자 제거");
		System.out.println();
		
		memberArrayList.showAllMember(); 
		System.out.println();
		
		memberArrayList.removeMember();
		System.out.println();
		memberArrayList.showAllMember(); 
		
		// 특정 index방에 사용자추가
		System.out.println();
		System.out.println("==========================");
		System.out.println("3. 특정 index방에 사용자추가");
		System.out.println();
		System.out.println("마지막으로 지운 회원의 index방 번호와 정보를 불러와 다시 입력합니다. ");
		System.out.println();
		
		memberArrayList.addMember2();
		memberArrayList.showAllMember(); // 추가 된 리스트 확인
		
	// 문서의 끝
	}
}
