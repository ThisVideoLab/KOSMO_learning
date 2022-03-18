package chap12.EX06;

//1. interface�� default �޼ҵ� : �������̽� ������ �����ΰ� �ִ� �޼��带 ������ �� �����.
//2. default Ű�� �־���� ��. default�� ���� �����ڰ� �ƴ϶� ���� ������ ��.
//3. java 1.8 �̻󿡼� ���Ӱ� �߰��� ���
//4. public default void bcd() {} �� ���� ������� �����. ���� �տ� public�� ������ó�� ���� �����ڴ� ���� ����.

interface A{
	void abc(); //4. 2005�� ���� �޼���, public abstract�� ������. �����ΰ� ���� �߻� �޼ҵ�
				//   �ϴ� �̰ɷ� Ŭ������ ���� ���ø� �ѰŶ�� �����غ���.
	default void bcd() { //5. �� ������ 2020�⿡ default�� �߰�����. ����� �߰��� �ʿ䰡 �־�������.
		System.out.println("A �������̽��� bdc()");
	}
	// void ttt(); //6. �θ� Ŭ���� interface A���� �ڽ� Ŭ�����鿡�Դ� ������ �� ���� �޼��带 �־ ��ӽ��ѹ�����
				   //   ������ �ִ� ��� �ڽ� Ŭ�����鿡�� ������ �Ѻκ� ��
}
class B implements A{ //7. �� �༮�� 2005�⿡ ������ Ŭ������� ������ ���� 5���� ���� ������, ���ο� ����� �߰��ϱⰡ ����
					  // �������ｼ �߻� �޼���� ���ڱ� �ٲٸ� �� ������ �������ٴ°���. �ٵ� default �޼���� Ż ���� �۵��Ѵٴ°Ű�.
					  // ������ �ʿ���� �ٷ� �̾ƾ��°� �ٷ� default �޼����� �����̶�°���
	public void abc() {
		System.out.println("B Ŭ������ abc()");
	}
}
class C implements A{
	public void abc() {
		System.out.println("C Ŭ������ abc()");
	}
	public void bcd() { //6. default �޼��嵵 �������̵��� ������.
		System.out.println("C Ŭ������ bcd()");
	}
}
public class DefaultMethod {
	public static void main(String[] args) {
		//8. ��ü ����
		A a1 = new B();
		A a2 = new C();
		
		//9. �޼��� ȣ��
		a1.abc();// 
		a1.bcd();
		
		a2.abc();
		a2.bcd();
		
		
		//������ ��
	}

}
