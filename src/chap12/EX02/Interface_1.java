package chap12.EX02;

//1. ���� ���̽� (interface)�� : �ܺο� ���θ� ��������ִ� ����... �ܼ�Ʈ (�ܺ�������ġ >> �ܼ�Ʈ << ���� )ó�� �۵���.
//2. ������ (���, TV), API���� ��ȣ �ۿ��� �� �ֵ��� ��������.
//3. �������̽��� ��� �ʵ�� �ݵ�� public static field�� ������ ü�� ��� ����.
//4. ���� �������̽��� ��� �޼���� public abstract ���� (1.8 ���� ���� ����)�� ü�� ��� ����. �ٸ� default �޼���� ���ܵ�.

interface A{
	public static final int A = 3; //5. Interface �ʵ��� ���� ǥ�� (�� ������ ������ ü�� �޷� �ֱ� ��)
	public abstract void abc(); // 6. Interface �޼����� ���� ǥ��. �߻� �޼���� ���� ������ �� (�� ������ ������ ü�� �޷� �ֱ� ��) 
}
interface B{ //7. ������ ���·� ��� a�� ���� ������ü�� �޷�����.
	int A = 3;
	void abc();
}
class C {
	// void abc(); //8. Interface Ű ���� ������ ���� ������ ���� �ջ� 
}

abstract class D{ // 9. �߻� Ŭ���� abstract �� ������ �Ұ�����. ���� ����.
	abstract void abc();
}

public class Interface_1 {

	public static void main(String[] args) {
		
		//10. �������̽��� ��ü ���� �Ұ���. �߻� �޼���, �� �������� ���� �޼ҵ带 �����ϱ� ������.
		//11. �������̽��� static �ʵ��� ������ �����. 
		
		System.out.println(A.A); // interface A�� �ٷ� �����. �̰��� static�� ����. ��ҹ��ڸ� �������� �ʴ� �͵� �˾Ƶ���.
	    System.out.println(B.A); // ���������� ������ static�� �۵��� �ٷ� �ҷ�����. 
	    
	    //12. final �±׷� ���� ���� ���� �Ұ�����.
	    
	    // A.A =5; // 13. �ٲٷ��� ������
	    // B.A =6; // 14. ���������� final�� �ۿ��ؼ� ���� �ջ� 
	    

	}

}