package chap10.EX06.EX01;

// �ڽ� ��ü�� ������ �� �θ� Ŭ������ �⺻ �����ڸ� ���� ȣ�� �� �ڿ� ������ �Ű������� ��ġ�ϴ� �༮�� ���������� ȣ����. Ư�� �Ű������� �������� �ڽ��� �Ű������� �־� �ҷ��� ��.
// ��� �ڽ� ��ü�� �����ڿ��� super();�� �����Ǿ� ����. �׷��� ������ ���� �ʾƵ�, ()���� �ش��ϴ� �θ� Ŭ������ �⺻ �����ڰ� ��µǴ� ����.
class A{
	A(){
		System.out.println("AŬ������ �⺻ ������");
	}
	A(int a){
		System.out.println("A class�� �Ű����� ���� 1������ : " + a);
	}
	A(int a, int b){
		System.out.println("A class�� �Ű����� ���� 1������ : " + a + "," + b);
	}
}
class B extends A{
	B(){
		System.out.println("BŬ������ �⺻ ������");
	}
	B(String a){
		super(3,5);
		System.out.println("B class�� ���ڿ� 1 �Է� : "  + a);
	}
}
class C extends B{
	C(){
		// super(); �� ������ ����. �׷��� C �����ڸ� ȣ���ϸ� �θ��� B�� �⺻ �����ڸ� ȣ��, B�����ڴ� �ٽ� A�� �⺻ �����ڸ� ȣ���ؼ� ���������� ������.
		// 
		super("C���� ȣ��");
		System.out.println("CŬ������ �⺻ ������");
	}
	C(int a){
		System.out.println("C class�� �Ű����� ���� 1������ : " + a);
	}
}	


public class SuperMethod_2 {

	public static void main(String[] args) {
		C c = new C(); //
		System.out.println("===================");
		C cc = new C(1);
		
		
	}

}
