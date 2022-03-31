package chap17.EX05;

import java.util.ArrayList;

class Member{ // DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) { // �����ڸ� ���ؼ� �ʵ��� ���� �Ҵ�
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
		return memberName + " ȸ������ ���̵�� " + memberId +"�Դϴ�.";
		
	}
}

class MemberArrayList { // MemberArrayList�� ��üȭ�ϸ� ArrayList�� ������ 
	private ArrayList<Member> arraylist;
private Object memberArrayList;
	public MemberArrayList () { // �Ű������� ���� ���� �⺻ ������.
		arraylist = new ArrayList<Member>();
	}
	public void addMember(Member member) { // Member ��ü�� �޾Ƽ� �Ǹ����� �濡 ���� �߰��ϴ� �޼��� 
	
	}
	public void addMember2(int a, Member member) { // �Ű����� 2���� �޾Ƽ� // Ư�� index �� ��ȣ�� ���� �߰�(����)
		
	}
	//public boolean removeMember (int memberId) {
		
		// arrayList�� �����  memberid�� �˻��ؼ� �ش� ��ü�� ������
	//}
	public void showAllMember() {
		// ��� ����Ʈ�� �ִ� ��� ����� ����Ʈ�� ����ϴ� ������
		 System.out.println(memberArrayList);
	}
}


public class EX_MemberArrayList {
	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		
		Member memberLee = new Member(1001, "�̵���");
		Member memberSon = new Member(1002, "�տ���");
		Member memberPark = new Member(1003, "������");
		Member memberHong = new Member(1004, "ȫ����");
		
		memberArrayList.addMember(memberLee); // �� ��ü�� ��� ����Ʈ�� ����
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		// ��� ����� ���� ���
		memberArrayList.addMember2(0, memberHong);
		memberArrayList.showAllMember(); 
		
		// Ư�� ���̵� ���� ����� ����
		
		//memberArrayList.removeMember(1004);
		
		// Ư�� index�濡 ������߰�
		
		memberArrayList.toString();
		
		
	// ������ ��
	}
}
