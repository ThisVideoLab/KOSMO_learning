package chap17.EX06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//1. Set: �ߺ��� ���� ���� �� ����.
	// equals () �޼���, hashCode() �޼��尡 ���ǵǾ� �־�� �ϳ�, �ȵǾ� �ִ� ���°� �⺻����.
	// String, Integer �� ���� Ŭ�������� equals() �޼���� hashCode() �޼��尡 �̹� ������ �Ǿ��ִ°Ͱ��� ������.
	// Ư�� ��ü�� set�� ������ ��쿡 �ߺ� ������ �������� equals()�� hashCode() �޼��带 �������ؾ� ��.
	// Object Ŭ����(��� Ŭ������ �θ��)�� equals()�� hashCode()�� ������. 
		//object Ŭ������ equals() �޼ҵ�� ==�� ���� ����� ��.


class A{ //2. ������ equals()�� hashCode()�� �����ǵ��� ���� ����
	int data;  
	public A(int data) {
		this.data = data;
	}
}

//11. equals()�� ���������� ����

class B{
	int data; // 14. ���ϴ� �� ��ü�� data �ʵ� ���� ������, �����϶�� �ĺ��ڸ� �־���� �Ѵ�.
		      //     �� �ĺ��� 2���� equals()�� hashCode() �ĺ�����.
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { //12. ��ü�� �ּҸ� ���ϴ� ���� �⺻ ������. �̰��� ��ü ������ Ư�� �ʵ尪�� ���ϵ��� ��������� ��.
		
		if (obj instanceof B) {
			if(this.data == ((B)obj).data) //13. ������: �߸� �ٿ�ĳ������ �� ���, Exception�� �߻��� �� ����. 
										   //14. equals�� ���ؼ� �ʵ带 ���ϵ��� ��������. 
			return true;	
		}
		return false;
	}
}
class C{
	int data; // 14. ���ϴ� �� ��ü�� data �ʵ� ���� ������, �����϶�� �ĺ��ڸ� �־���� �Ѵ�.
		      //     �� �ĺ��� 2���� equals()�� hashCode() �ĺ�����.
	public C(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) { //12. ��ü�� �ּҸ� ���ϴ� ���� �⺻ ������. �̰��� ��ü ������ Ư�� �ʵ尪�� ���ϵ��� ��������� ��.
		
		if (obj instanceof C) {
			if(this.data == ((C)obj).data) //13. ������: �߸� �ٿ�ĳ������ �� ���, Exception�� �߻��� �� ����. 
										   //14. equals�� ���ؼ� �ʵ带 ���ϵ��� ��������. 
			return true;	
		}
		return false;
	}
	@Override
	public int hashCode() { // Obhects.hash(�ʵ��,�ʵ��,�ʵ��)�� ���� ���·� ���� �ؽ��ڵ� ������ ������.
		//return Objects.hash(data); 
		return data; // ���� �ּ� ó���ѰŶ� ���Ѵ�� ì�ܾ��� ��.
	}
}

public class HashSetMachanism {
	public static void main(String[] args) {
		
		//3. equals()�� hashCode() �޼��尡 �����ǵ��� ���� ���·� ����غ���
		System.out.println("=====================");
		System.out.println("1. equals()�� hashCode() �޼��尡 �����ǵ��� ���� ����");System.out.println();
		
		Set<A> hashset1 = new HashSet();
		A a1 = new A(3);
		A a2 = new A(3); 
		System.out.println(a1 == a2 ); //4. false�� ��µ�. == �����ڴ� stack �޸��� ���� ����.
		
		System.out.println(a1); //5. ��ü���� ����ϸ� ��Ű����.Ŭ������@ �ؽ��ڵ�(16����)�� ��µ�.
		System.out.println(a2); //6. a1�� a2�� �ؽ��ڵ尡 �������� �� �� ����.
		
		System.out.println(a1.equals(a2)); //7. false, Object equals()�� ==�� ����.
		System.out.println(a1.hashCode() + " , " + a2.hashCode()); //8. 10������ ǥ����.
		
		hashset1.add(a1);
		hashset1.add(a2);
		System.out.println(hashset1.size()); //9. set<E>�� �ߺ��� ������� �ʴµ� 2�� ��µ�. ��� a1�� a2�� �ٸ� ��ü���� ������.
											 //10. �̴� equals()�� hashCode() �޼��尡 �����ǵǾ� ���� �ʾƼ� �������� ��.
		
		//15. equals()�� ������ �� ���·� ����غ��� : ��ü�� data �ʵ��� ���� ����. hashCode()�� �����ǵ��� �ƴ���.
		System.out.println("=====================");
		System.out.println("15. equals()�� ������ �� ���·� ����غ���");System.out.println();
		Set<B> hashSet2 = new HashSet();
		
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2); //16. stack �޸��� ���� ���� // �ּҰ� ���̱� ������ false ���
		System.out.println(b1.equals(b2)); //17. �ǵ���� data �ʵ尪���� ���� true�� ��µ�.
		
		hashSet2.add(b1);
		hashSet2.add(b2);
		
		System.out.println(hashSet2.size()); //18. ������ 2���� ��µ�. �� ���� �ٸ� ��ü��� �ν��Ѵٴ� ��.
											 //19. �̴� hachCode()�� ���������� �ʾƼ� �׷� ����
		System.out.println(b1.hashCode() + " , " + b2.hashCode());
		
		//20. equals()d�� hashCode() ��� ������ �� ���;
		System.out.println("=====================");
		System.out.println("20. equals()d�� hashCode() ��� ������ �� ���");System.out.println();
		
		Set<C> hashSet3 = new HashSet<>();
		C c1 =new C(3);
		C c2 =new C(3);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode() + " , " + c2.hashCode()); // data �ʵ带 �������� ���̹� ���� �ö󰡿�
		
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size()); //21. ���� 1�� ��µ�. ���� ���� �ߺ��̶�� 1���� �����ϴ� �ܰ���� ��
											 //data �ʵ忡 ���� equals(), hashCode() ��� ������ ������ 
		
		
	// ������ ��
	}
}
