package chap17.EX09;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//Map: key�� �ߺ����� �ʾƾ� ��. equals(), hashCode()�� ������ ���Ѿ� �ߺ��� ���� �� ����.
	// �ٸ� value�� �ߺ��Ǿ ��.

//equals(), hascode()�� ���������� �ʴ� Ŭ����

class A{
	int data;
	public A(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return data + " " ;
	}
	
}

//equals() �� ��������
class B {
	int data;
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { // obj�� Object Ÿ������ ĳ����
		if(obj instanceof B){	// obj�� BŸ���� ������ �� true�� ���ǹ� �ߵ�
			if(this.data == ((B) obj).data) { // �� Ŭ������ data �ʵ� == �Է¹��� obj�� BŸ���� ������ data Ŭ���� 
				return true;	
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return data + " " ;
	}
}

//equals(), hashCode() ��� ��������
class C {
	int data;
	public C(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { // obj�� Object Ÿ������ ĳ����
		if(obj instanceof C){
			if(this.data == ((C) obj).data) {
				return true;	
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(data); // �����ϴ� ���
	}
	@Override
	public String toString() {
		return data + " " ;
	}
}

public class HashMapMechanism {
	public static void main(String[] args) {
		
		
		//1. �� �޼��� ��� �������̵����� �ʴ� ���
		System.out.println("=====================");
		System.out.println("1. �� �޼��� ��� �������̵����� �ʴ� ���");System.out.println();
		Map<A, String> hashMap1 = new HashMap();
		
		A a1 = new A(3);
		A a2 = new A(3);
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		hashMap1.put(a1,  "ù��°");
		hashMap1.put(a2,  "�ι�°");
		
		System.out.println(hashMap1.size());
		System.out.println(hashMap1);
		

		//2. equals() �޼��常 �������̵�
		System.out.println("=====================");
		System.out.println("2. equals() �޼��常 �������̵�");System.out.println();
		
		Map<B, String> hashMap2 = new HashMap<>();
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2); //false
		System.out.println(b1.equals(b2)); // true
		
		hashMap2.put(b1,  "ù��°");
		hashMap2.put(b2,  "�ι�°");
		
		System.out.println(hashMap2.size()); // 2
		System.out.println(hashMap2);
		
		//3. equals(), hashCode() ��� �������̵�
		System.out.println("=====================");
		System.out.println("3. equals(), hashCode() ��� �������̵�");System.out.println();
		
		Map<C, String> hashMap3 = new HashMap<>();
		C c1 = new C(3);
		C c2 = new C(3);
		
		System.out.println(c1 == c2); //false
		System.out.println(c1.equals(c2)); // true
		
		hashMap3.put(c1,  "ù��°");
		hashMap3.put(c2,  "�ι�°");
		
		System.out.println(hashMap3.size()); // 2
		System.out.println(hashMap3);
		
		
		
	// �����ǳ�
	}
}
