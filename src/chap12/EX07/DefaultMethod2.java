package chap12.EX07;

interface A{ //1. parent interface class ����
	default void abc() { //2. interface�� �����ΰ� �ִ� method�� ����: default�� ���ǵ�
		System.out.println("A interface�� abc()");
	}
}
class B implements A{ //5. ����� ���⿡ extends Object�� ������ ���̾���
	public void abc() { // 3. �������̵����� abc() �޼��带 ���
		A.super.abc(); //4. �ٵ� �׳� super.abc() �� ������ ������. �������ｼ object Ŭ������ abc()�� ȣ���ϱ� ������.
					   //6. ��� A.super.abc() ��� ���༭ class A�� abc()�� Ư������� ��. 
		System.out.println("B Ŭ������ abc()");
	}
}

public class DefaultMethod2 {

	public static void main(String[] args) {

		//7. ��ü ����
		B b = new B();
		b.abc(); //8. �̷��� ȣ���ϸ� ù�ٿ��� default method�� ��ºθ� ���� ȣ���� �ڿ� �������� �ι�° �ٿ� Ŭ���� B�� ��ºθ� ȣ����.
		
		System.out.println("====================");
		
		A a1 = new B(); //9. ��ü ������ �Ұ��������� Ÿ�� ��ȯ(ĳ����)�� ������
	}

}
