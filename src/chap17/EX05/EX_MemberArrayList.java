package chap17.EX05;

import java.util.ArrayList;
import java.util.Scanner;

class Member extends MemberArrayList{ // DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberId;
	private String memberName;
	
	
	public Member(int memberId, String memberName) { // �����ڸ� ���ؼ� �ʵ��� ���� �Ҵ�
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
		return memberName + " ȸ������ ���̵�� " + memberId +"�Դϴ�.";
	}
}

class MemberArrayList{ // MemberArrayList�� ��üȭ�ϸ� ArrayList�� ������ 
	private ArrayList<Member> arraylist;
	public int removedNumer;
	public Member removedName;
	public MemberArrayList () { // �Ű������� ���� ���� �⺻ ������.
		 arraylist = new ArrayList<>();
	}
	public void addMember(Member member) { // Member ��ü�� �޾Ƽ� �Ǹ����� �濡 ���� �߰��ϴ� �޼��� 
		
		arraylist.add(member);
	}
	public void addMember2() { // �Ű����� 2���� �޾Ƽ� // Ư�� index �� ��ȣ�� ���� �߰�(����)
		arraylist.add(removedNumer,removedName);
	}
	public boolean removeMember() {
	// arrayList�� �����  memberid�� �˻��ؼ� �ش� ��ü�� ������
		
POS1:	while(true) {
			System.out.println("������ ���ϴ� ȸ���� ID�� �Է��ϼ���. ��� �Է��ߴٸ� 0 �� �Է��ϼ���.");
			Scanner scan = new Scanner(System.in);
			int IdNumberToRemove = scan.nextInt();
			if( 0 == IdNumberToRemove){
				scan.close();
				break;
			}else {
				for (int i = 0; i< arraylist.size(); i++) { // ��� �濡 ���ؼ� �˻� ����
					// ���� �Է¹��� ��� ���̵� ������ �ִ� ��� ���̵�� �����ϴٸ�
					Member list = arraylist.get(i);
					if(list.getMemberId() == IdNumberToRemove){
						// ������ �ִ� ��� ���̵� ������
						 System.out.println("ȸ�� id " + list.getMemberId()+ "�� �����մϴ�");
						 this.removedNumer = i;
						 this.removedName = arraylist.get(i);
						 System.out.println();
						 arraylist.remove(i);
						 System.out.println("�����ִ� ȸ������ ����� ������ �����ϴ�.");
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
		// ��� ����Ʈ�� �ִ� ��� ����� ����Ʈ�� ����ϴ� ����
		for (int i = 0; i< arraylist.size(); i++) {
			System.out.println(this.arraylist.get(i));
		}
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
		System.out.println();
		System.out.println("==========================");
		System.out.println("1. ��� ����� ���� ���"); 
		
		System.out.println();
		
		
		memberArrayList.showAllMember(); 
		
		
		// Ư�� ���̵� ���� ����� ����
		System.out.println();
		System.out.println("==========================");
		System.out.println("2. Ư�� ���̵� ���� ����� ����");
		System.out.println();
		
		memberArrayList.showAllMember(); 
		System.out.println();
		
		memberArrayList.removeMember();
		System.out.println();
		memberArrayList.showAllMember(); 
		
		// Ư�� index�濡 ������߰�
		System.out.println();
		System.out.println("==========================");
		System.out.println("3. Ư�� index�濡 ������߰�");
		System.out.println();
		System.out.println("���������� ���� ȸ���� index�� ��ȣ�� ������ �ҷ��� �ٽ� �Է��մϴ�. ");
		System.out.println();
		
		memberArrayList.addMember2();
		memberArrayList.showAllMember(); // �߰� �� ����Ʈ Ȯ��
		
	// ������ ��
	}
}
