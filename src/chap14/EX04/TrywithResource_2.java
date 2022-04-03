package chap14.EX04;

import java.io.InputStreamReader;

//1. ���� ������ ��ü���� AutoCloseable�� ����غ���
//2. try ( ��ü ���� ����) {} catch {} : �ڵ����� close() �޼��尡 ���Ե� /// try (with resource)
//3. AutoCloseable �������̽��� close() �޼ҵ带 �������̵� �ؾ� �Ѵ�.

//4. java.lang.AutoCloseable => java.lang �� ������ ���� ���� �ܰ��̱� ������ import�� �Ƚᵵ ��.
 // java.lang.object

//10. ���ܸ� ó���ϴ� ���
  // try catch�� ����ؼ� ���� ó��: �ڽ��� ���� ���¿ܸ� ó���ϰڴ�
  // throws�� ���ؼ� ���ܸ� ó��: ���ܸ� ���� ó������ �ʰ� ȣ���ϴ� ������ ���ܸ� ó���ϵ��� �̷�.
	// ������ ����. �޼ҵ��� ���� ������� Ī��. �ٸ� ���ܸ� ������ �߻���Ű�� ��쿡 throw�� ��.	

class A implements AutoCloseable{ //5. # �ʵ�, ������, �������̵� ������ ������ ��Ģ�� �θ� ����.  ������ ����

	String resource;
	
	A (String resource){ //6. �������� �Ű������� String ���� �޾Ƽ� �޸𸮷� �ε���.
		this.resource = resource;
	}
	@Override
	public void close() throws Exception { //7. AutoCloseable �������̽��� ����ϸ� class A ���ο�
										   //close �޼��尡 �ڵ����� ȣ��Ǽ� �������̵��� �ڵ����� �Ͼ.
		if(resource != null) { //8. ���ҽ��� ���� null�� �ƴ϶�� if�� �ߵ�
			resource = null; //9. �ߵ��� �Ŀ� resource�� null���� �־���
			System.out.println("���ҽ��� ���� �Ǿ����ϴ�.");
			System.out.println("class A ���� resource �ʵ��� ��: " + resource);
		}
	}
}


public class TrywithResource_2 {
	public static void main(String[] args) {
		InputStreamReader isr2 = null;
		
		//1. �ڵ� ���ҽ� ���� ���
		try(A a1 = new A("Ư�� ����");){ //10. A("String resource")�� �κ��� ��� class A�� ���� �޼��带 �����.
		}catch (Exception e){ //11. �̹� class A ���ο��� ���ҽ� �����߱� ������ ���� �߻����� ����
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");   
			e.printStackTrace();
		}finally {
			System.out.println("�ڵ� ���ҽ� ���������� �����մϴ�"); //12. finally ���� ���
			
		}
		//finally ����� a.close() �޼ҵ带 �ڵ����� ȣ���.
		
		System.out.println("===================");
		
		//2 ���� ���ҽ� ���� ���
		
		
		
		A a2 = null;
		try {
			a2 = new A("�������ʱⰪ�Ҵ�");
		}catch (Exception e){
		e.printStackTrace();
		System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}finally { // ���� ���ҽ� ���� ���� ����
			if( a2.resource != null) {
				
				try {
					a2.close();
				}catch (Exception e) {
					e.printStackTrace();
				}finally {
					System.out.println("���� ���ҽ� ���������� �����մϴ�");
				}
			}
		}
		
	// ������ ��
	}

}
