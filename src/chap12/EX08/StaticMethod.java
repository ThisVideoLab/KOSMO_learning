package chap12.EX08;

//1. ���� �޼��忡 �˾ƺ���. ���� �޼���� �������̽� ���ο� static Ű�� �� �޼���� ���� �ڽ� Ŭ�������� ���� ���� �ٷ� ȣ�� ������.
//2. Java 1.8 �̻󿡼� ���Ӱ� �߰��� �����.

interface A{
	static void abc() { //
		System.out.println("interface A�� ���� �޼ҵ� abc()");
	}
}


public class StaticMethod {

	public static void main(String[] args) {

		//3. ����(static) �޼��� ȣ���� �غ���
		
		A.abc(); //4. �������� �ʰ��� �ٷ� interface �̸��� �տ� �־ ȣ���� ������.

		//5. ���뿡�� �������̽��� ���� ������Ҹ� �˾ƺ��� ������ ����
		  // a) �ʵ� : public static final ==> �� ��ü�� ���� ������
		  // b) �޼��� : public abstract ==> �� ��ü�� ���� ������. �߻� �޼���, �����ΰ� ��� �ڽ� Ŭ�������� �����θ� �־��༭ �ϼ��ؾ� ��. 
	      //           public default ==> public�� ���� ������. �����ΰ� �ִ� �޼��� (Java 1.8 ���� �̻��� ���ο� ���)
		  //		   public static ==> public�� ���� ������. �����ΰ� �ְ�, ��ü ���� ���� ȣ�� ������ (Java 1.8 ���� �̻��� ���ο� ���)
		
	}

}
