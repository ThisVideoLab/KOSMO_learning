package chap12.EX02;

//1. interface�� �����ϴ� Ŭ������
//2. Override: ������ �޼ҵ带 �ڽ� Ŭ������ ���� ���Ӱ� �������ϴ� ��
//3. Implements : �̿ϼ� �޼ҵ带 �ϼ���Ű�� ��.
//4. �θ�Ŭ������ ����� ��ӹ޾Ƽ� �ڽ��� ����� Ȯ���ϴ� ��

interface AA{
	public abstract void cry(); //5. �̰� interface �޼����� ���� ����
	void run(); //6. �̷��� ������ ü�ε� �ν��� ��.
	
class BB implements AA {
	@Override
	public void cry() {
		System.out.println("�߿�");
	}
	@Override
	public void run() {
		System.out.println("�߿��� �޷���");
	} //7. Ŭ���� BB�� A �������̽��� �̿ϼ��� �޼ҵ带 ������ �ϼ���Ų��.
	
}
	
}

public class Interface_2 {

	public static void main(String[] args) {

	}

}
