package chap12.EX04;

//1. �������̽� ��� �� �ڽ� Ŭ���� ���� ������ ���� �ڸšڿ���ߡڿ� ��

interface A{
	public abstract void abc();
}
interface B{
	void abc(); // �̶� interface�� �޼��忡�� public abstract�� �����Ǿ��ִٴ� ���� ����ϸ鼭
}

class C implements A {
	// void abc() {} //3. interface A�� abc()�� Override �ؼ� ������ method�ε� ������ �߻���.
			     //4. �������ｼ �ڽ��� �θ𺸴� ���� �����ڰ� ���ų� �� �о�� �ϴµ� �տ� abc() �տ��� public�� �پ� �ִٴ� ��.
	public void abc() { //4. �׷��� ���� ������ public�� �ٿ��༭ ¥���� ������ 
	}
}

class D implements B{
	public void abc() { // 5. interface�� method�� ������ ���� �ݵ�� public ���� �����ڸ� �ٿ���� ���� ���� ����.
	}
}

class E implements B{
	public void abc() {
	}
}

class F implements A{
	
	@Override
	public void abc() { //6. �������̵嵵 ����������ٰ� �ۺ��� �ٿ���� ��.
	}
}
	
public class Interface_4 {

	public static void main(String[] args) {

	}

}
