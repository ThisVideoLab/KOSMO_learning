package chap14.EX04;

import java.io.InputStreamReader;

//1. ���� ������ ��ü���� AutoCloseable�� ����غ���
//2. try ( ��ü ���� ����) {} catch {} : �ڵ����� close() �� /// try (with resource)
//3. AutoCloseable �������̽��� close() �޼ҵ带 �������̵� �ؾ� �Ѵ�.

//4. java.lang.AutoCloseable => java.lang �� ������ ���� ���� �ܰ��̱� ������ import�� �Ƚᵵ ��.
 // java.lang.object

//10. ���ܸ� ó���ϴ� ���
  // try catch�� ����ؼ� ���� ó��: �ڽ��� ���� ���¿ܸ� ó���ϰڴ�
  // throws�� ���ؼ� ���ܸ� ó��: ���ܸ� ���� ó������ �ʰ� ȣ���ϴ� ������ ���ܸ� ó���ϵ��� �̷�.
	// ������ ����. �޼ҵ��� ���� ������� Ī��. �ٸ� ���ܸ� ������ �߻���Ű�� ��쿡 throw�� ��.	

class A implements AutoCloseable{ //5. # �ʵ�, ������, �������̵� ������ ������ ��Ģ�� �θ� ����.

	String resource;
	
	A (String resource){ //6. �������� �Ű������� String ���� �޾Ƽ� �޸𸮷� �ε���.
		this.resource = resource;
	}
	
	@Override
	public void close() throws Exception { //7. close �޼��尡 �ڵ����� ȣ���.
		if(resource != null) { //8. ���ҽ��� ���� null�� �ƴ϶�� if�� �ߵ�
			resource = null; //9. �ߵ��� �Ŀ� resource�� null���� �־���
			System.out.println("���ҽ��� ���� �Ǿ����ϴ�.");
		}
	}

	
}


public class TrywithResource_2 {

	public static void main(String[] args) {
		
		InputStreamReader isr2 = null;
		
		//1. �ڵ� ���ҽ� ���� ���
		try(A a1 = new A("Ư�� ����");){
		}catch (Exception e){
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}//finally ����� a.close() �޼ҵ带 �ڵ����� ȣ���.
		
		System.out.println("===================");
		
		//2 ���� ���ҽ� ���� ���
		
		A a2 = null;
		try {
			a2 = new A("�������ʱⰪ�Ҵ�");
		}catch (Exception e){
			
		}finally {
			if( a2.resource != null) {
				
				try {
					a2.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	// ������ ��
	}

}
