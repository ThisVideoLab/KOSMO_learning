package chap18.EX10;

interface A{
	B abc(int k);
}
class B{
	B(){
		System.out.println("ù��° ������");
	}
	B(int k){
		System.out.println("�ι�° ������");
	}
}

public class RefOfClassConstructor_2 {
	public static void main(String[] args) {

		//1. �͸� �̳� Ŭ����
		
		A a1 = new A() { 
			@Override
			public B abc(int k) {
				return new B(3);
			}
		};
		
		//2. ���ٽ� ǥ��
		
		A a2 = k ->new B(3);
		
		//3. Ŭ���� ������ ����
		A a4 = B::new;
		
		a1.abc(3);
		a1.abc(3);
		a1.abc(3);
		
		
		
		
	//�����ǳ�
	}
}
