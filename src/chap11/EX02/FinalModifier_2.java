

package chap11.EX02;

// final �޼���� final class�� Ư¡
// final �޼��� : �������̵��� �Ұ�����. ��� ���� �߿��� �޼��忡 fnial�� �޾� �ڽ��� ������ ���ϵ��� ������.
// final Ŭ����: ����� �Ұ����� Ŭ����. ������ ������

class A {
	void abc() {}
	final void bcd() {} // Ȳ�ݹ��� final ����
}
class B extends A {
	void abc() {} // �޼��� �������̵�: �θ��� �޼ҵ� ����� �ڽĿ��� ���Ӱ� ��� ����
	// void bcd() {} // final ������ �޼��� �������̵� �Ұ���
}

public class FinalModifier_2 {

	public static void main(String[] args) {

	}

}
