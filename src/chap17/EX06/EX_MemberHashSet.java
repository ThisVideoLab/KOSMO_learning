package chap17.EX06;

import java.util.HashSet;

// ��� Ŭ������ �״�� ����
// ���θ� hash set���� ����. 

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

//�߿�: set�� �ߺ��� �� ����.
	//Wrapper Ŭ������ Integer. String, Double, Characto, Charactor, Byte, Short,  Bololean
	//Wrapper Ŭ������ Ŭ������ equals(), hashcode() �޼ҵ尡 �����ǵǾ� ����.
	// Ư�� ��ü ���� �� �� ��ü�� set�� ������ ��� �� ��ü�� Object Ŭ������ equals(), hashcod()��
	// �������آN�� �Ѵ�. ��ü�� Ư�� �ʵ��� ���� ������ �ߺ��� �ĺ��ϴ� �ʵ带 �����Ԥ��� 

class Member extends MemberHashSet{ // DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberId;
	private String memberName;
	
	
	public Member(int memberId, String memberName) { // �����ڸ� ���ؼ� �ʵ��� ���� �Ҵ�
		this.memberId = memberId;
		this.memberName = memberName;
	}
	@Override
	public boolean equals(Object obj) { // ��ü ������ Object�� ��ĳ�����ؼ� ���� �޾ƿ���
		if (obj instanceof Member) {	// ����� �Ǵ� Member �ȿ� obj�� �ִ��� ���� üũ�ؼ� true���
			if(this.memberName == ((Member)obj).memberName) // ���������� ���� ���ϴ� ������ ���۵�. 
			return true;					// �ٸ� ���⼭�� �ƴϰ�, �Ʒ� �������̵� �������� �ĺ���	
		}
		return false; //obj�� member Ÿ���� �������� �ʾ��� ��
	}
	@Override
	public int hashCode() { // Obhects.hash(�ʵ��,�ʵ��,�ʵ��)�� ���� ���·� ���� �ؽ��ڵ� ������ ������.
		return Objects.hash(memberName); // �Ʒ� �ּ�ó�� �� �༮���� �ĺ�����. 
		// return memberName; 
		// return meberid;
		// return this.memberId;  // �̷��� �������� �ʵ带 �������� hashCode�� ������ �� ����.
	}
	                                                                                                                                                                                 
	
	public int getMemberId() { // MemberArrayList�� ��üȭ�ϸ� ArrayList ��ü�� �����ȴ�.
		return memberId;       // set ����" <member>, �ʵ��� private(������, setter)
	}
	
		//Set<Member> hashSet = new HashSet<>(); // �̷��Ե� ������ ������.

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
	public void addMember(Member member) { // Member ��ü�� ��Ǯ�޾� hashSet�� member ��ü�� ����, �ߺ��� ����Ǹ� �ȵ�.
										   //  Member ��ü�� memberId �ʵ��� ���� ������ ���, ������ ��ü��� ������.
										   // equals(), hashCode() �żҵ带 �������� memberId�� ��ġ ���θ� �Ǵ� ��
		hashSet.add(member);
	} 
	public boolean removeMember(int memberId) { // memberId�� Member ��ü ���� �ʵ��̹Ƿ� set�� ����� ��ü�� �����;� ��.
		// Iterator�� ����ؼ� ����� ��. �ٸ� Set<>���� Index�� �������� �����Ƿ� �⺻ for���� ����� �� ����. �ٸ� ���� for���� ����� ������.
		
		Iterator <Member> iterator = hashSet.iterator(); // Ŭ���� <E> �������� = set��ü.itorator(); 
		while(iterator.hasNext()) {
			Member list =iterator.next();
			if(list.getMemberId() == memberId){
				hashSet.remove(iterator.next());
				return true; // true�� ���ѹݺ� while���� Ż�ⱸ���� �Ǳ⵵ ��
			}
		}
		/* ������ ����
		 * 
		Iterator <Member> ir = hashSet.iterator(); // hashSet�̶�� ���� �ٱ��� �ȿ� member��ü��� ���ϵ��� �׵�׵���. �׶� Iterator�� ������.
	 	if(ir.hasNext()) {						   // �� ir�̶�� Iterator�� ���Է�, ��ġ�´�� 1���� ������ ��� ����.
	 		Member member = ir.next();
	 		int tempid = member.getMemberId();
	 	if(tempid == memberid) {
	 		hashSet.remove(member);
	 		return fasle;
	 		}
	 	} 	
		 */
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false; //
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
		
		memberHashSet.addMember(memberLee); // �� ��ü�� �ɹ� �ؽ��¿� ����
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
