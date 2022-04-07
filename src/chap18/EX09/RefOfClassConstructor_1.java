package chap18.EX09;

interface A{
	B abc();
}
class B{
	B(){
		System.out.println("ù��° ������");
	}
	B(int k){
		System.out.println("�ι�° ������");
	}
}

public class RefOfClassConstructor_1 {
	public static void main(String[] args) {

		//1. Ŭ���� ������ �����ϱ� - �͸� �̳� Ŭ����
		//   �ڽ��� �޼��� ���� ������ ������ ���� �ٸ� ��ü�� �����θ� �����ؼ� ȣ����
		A a1 = new A(){
			@Override 
			public B abc() { // abc() �޼��带 ȣ���ϸ� class B�� �⺻ ������ ȣ��
				return new B();
			}
		};
		
		//2. ���ٽ� ǥ��
		A a2 = () -> new B();
		
		//3. Ŭ���� ������ ����
		A a3 = B::new;
		
		a1.abc();
		a2.abc();
		a3.abc();
		
	//�����ǳ�
	}
}
