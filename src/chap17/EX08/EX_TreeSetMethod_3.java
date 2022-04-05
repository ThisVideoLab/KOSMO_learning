package chap17.EX08;

import java.util.TreeSet;
import java.util.Comparator;

// �̸��� ���̸� �Է½� ������������ ����ϵ��� ������ ��. treeSet�� name �÷��� �̿��ؼ�

//1. Comparable<E>�� compareTo() �޼��� ������
//���� ��ü ���� �ʿ�

//2. Comparable<E> ����
// ���� ��ü ���� ���ʿ�

// �� ���⺻�� ó�� ���⺻���� �̸��� ��� �ִ� ��쿡 ����Ʈ�� ù��°�� ��µǴ� ġ������ ������ ����.

class Abc{
	String name; // << a�� ���� �÷� // ��~ �ϱ��� �������� ������ ��. ȫ�浿 �̼���, ������ ������ �־ �������� ���� �������� ����
	int age;
	
	public Abc(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "����: " + name + " ����: " + age;
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
	public int compareTo(Abc_T o) { // ��ü�� ũ�� �� ������ �����ϴ� �޼���. <TreeSet���� ����>> (����, ���, 0 �� �ϳ��� ������.) �� �κ��� �����ǽ������� ������ ������ ��.  
		if(this.name.charAt(0) < o.name.charAt(0)) { // �� ����� �������� ó�� �����.
			return -1; // this.data1 ���� ���� ���� ��� : -1(����)
		}else if(this.name.charAt(0)  == o.name.charAt(0)){
			return 0; // this.data1 ���� ���� ���� ��� : 0
		}else {
			return 1; // this.data1 ���� ���� Ŭ ��� :-1(���)
		}
	}
	@Override
	public String toString() {
		return "����: " + name + " ����: " + age;
	}
}

public class EX_TreeSetMethod_3 {
	public static void main(String[] args) {


	//1. ���� ��ü�� �����ؼ� TreeSet�� �����ϴ� ���
	TreeSet<Abc_T> treeSet1 = new TreeSet();
	
	Abc_T abc1 = new Abc_T("��ȣ�帮��Է����ִϾ�", 15);
	Abc_T abc2 = new Abc_T("��ȣ�帮��", 14);
	Abc_T abc3 = new Abc_T("��ȣ�帮��Է���", 13);
	
	treeSet1.add(abc1);
	treeSet1.add(abc2);
	treeSet1.add(abc3);
	
	System.out.println(treeSet1);
	
	//2. ��ü�� �������� �ʰ� TreeSet�� �����ϴ� ���
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
	
	Abc abc4 = new Abc("��ȣ�帮��Է����ִϾ�", 15);
	Abc abc5 = new Abc("��ȣ�帮��Է���", 14);
	Abc abc6 = new Abc("��ȣ�帮��", 13);
	
	treeSet2.add(abc4);
	treeSet2.add(abc5);
	treeSet2.add(abc6);
	
	System.out.println(treeSet2);
	
	//�����ǳ�
	}
}