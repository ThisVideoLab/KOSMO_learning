package chap17.EX06;

import java.util.HashSet;

// ��� Ŭ������ �״�� ����
// ���θ� hash set���� ����. 

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

class Member extends MemberHashSet{ // DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberId;
	private String memberName;
	
	
	public Member(int memberId, String memberName) { // �����ڸ� ���ؼ� �ʵ��� ���� �Ҵ�
		this.memberId = memberId;
		this.memberName = memberName;
	}
	@Override
	public boolean equals(Object obj) { //12. ��ü�� �ּҸ� ���ϴ� ���� �⺻ ������. �̰��� ��ü ������ Ư�� �ʵ尪�� ���ϵ��� ��������� ��.
		
		if (obj instanceof Member) {
			if(this.memberName == ((Member)obj).memberName) //13. ������: �߸� �ٿ�ĳ������ �� ���, Exception�� �߻��� �� ����. 
										   //14. equals�� ���ؼ� �ʵ带 ���ϵ��� ��������. 
			return true;	
		}
		return false;
	}
	@Override
	public int hashCode() { // Obhects.hash(�ʵ��,�ʵ��,�ʵ��)�� ���� ���·� ���� �ؽ��ڵ� ������ ������.
		return Objects.hash(memberName); 
		// return memberName; // ���� �ּ� ó���ѰŶ� ���Ѵ�� ì�ܾ��� ��.
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

	public void setMemberName(String memberName) {  // �������� �ؽ��ڵ� �ؼ� ���� �ɷ�����
		this.memberName = memberName;
	}
	@Override
		public String toString(){
		return memberName + " ȸ������ ���̵�� " + memberId +"�Դϴ�.";
	}
}

class MemberHashSet{ // MemberArrayList�� ��üȭ�ϸ� ArrayList�� ������ 
	private Set<Member> hashSet;
	public MemberHashSet () { // �Ű������� ���� ���� �⺻ ������.
		hashSet = new HashSet<>();
	}
	public void addMember(Member member) { // Member ��ü�� �޾Ƽ� �Ǹ����� �濡 ���� �߰��ϴ� �޼��� 
		
		hashSet.add(member);
	}
	public boolean removeMember(int memberId) {
		// Iterator�� ����ؼ� ����� ��.
		
		Iterator <Member> iterator = hashSet.iterator(); // Ŭ���� <E> �������� = set��ü.itorator(); 
		
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
		// // Iterator�� ����ؼ� ����� ��.
		
		// iterator�� ���� ���
		Iterator<Member> iterator = hashSet.iterator(); // Ŭ���� <E> �������� = set��ü.itorator(); 
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + "  ");
		}
	}
}


public class EX_MemberHashSet {
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "�̵���");
		Member memberSon = new Member(1002, "�տ���");
		Member memberPark = new Member(1003, "������");
		Member memberHong = new Member(1004, "ȫ����");
		Member memberLee2 = new Member(1005, "�̵���");
		
		memberHashSet.addMember(memberLee); // �� ��ü�� ��� ����Ʈ�� ����
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberLee2);
		
		// ��� ����� ���� ���
		System.out.println();
		System.out.println("==========================");
		System.out.println("1. ��� ����� ���� ���"); 
		
		System.out.println();
		
		
		memberHashSet.showSize(); //4���� ��µǾ�� ��. �Է´ܰ���� ���϶� ��
		
		
		// Ư�� ���̵� ���� ����� ����
		System.out.println();
		System.out.println("==========================");
		System.out.println("2. Ư�� ���̵� ���� ����� ����");
		System.out.println();
		
		System.out.println();
		
		memberHashSet.removeMember(1004);
		System.out.println("1004���� �������ϴ�.");
		
		System.out.println();
		System.out.println("==========================");
		System.out.println("3. ���� �� ��� ���");
		System.out.println();
		
		memberHashSet.showSize();
		
	// ������ ��
	}
}
