package chap13.EX10;

class Button{
	OnClickListener ocl; //1. �ϴ� ���� ��������.  OnClickListener : ��ü Ÿ��, ocl: ��������
	
	//3. setter�� ���ؼ� OnClickListenerdml ckawhqustn ocl�� ��ü �ּҸ� ��� ��.
	void setOnClickListener (OnClickListener ocl) { //2. ocl�� �⺻���� null ���� ������. this�� �������� �޾Ƽ� �־���.
		this.ocl = ocl;
	}
	
	interface OnClickListener{ // # �̳� �������̽� �տ��� static�� �����Ǿ� ������ ������ ��
		void onClick(); //5. �޼ҵ� ���� �ص�. �������� �������̵����� ����������� ��
		}
	
		void click() { //5.�������� �� ������ onClick �޼��带 ȣ����.
		ocl.onClick(); //10. ocl�̶�� ���������� �⺻�����δ� null���� ������. �̸� Ȱ��ȭ��Ű�� ���ؼ���
					   //11. setOnClickListener�� ���� �޾Ƽ� ocl�� �����ֵ��� ������ ��.
		System.out.println(ocl);
	}
	//6. �������̽��� �����ϰ� ������ �ڽ� Ŭ������ ���������� ����.
	//7. ȣ���ϴ� ������ onClick() �޼��带 �������ؼ� ȣ����.
}


public class buttonAPIExample {
	public static void main(String[] args) {

		//8. ������ 1: Ŭ���� ���� ���
		
		Button button1 = new Button(); //9. button1 ��ü ����. 
		button1.setOnClickListener(new Button.OnClickListener() { //12. OnClickListener ��ü Ÿ������ ��ü�� �����ؼ� �Ű������� ������ �����.
																  // A.B = new A.B(){�̳� �������̽� B�� �޼ҵ带 ������ �ڵ�} �� �ش���.
			@Override
			public void onClick() {
				System.out.println("������ 1: ���� ���");
			}
		}); 
		
		button1.click();
		
		//13. ������ 2: Ŭ���� ���̹� ����
		Button button2 = new Button();
		// setOnClickListener �޼ҵ忡 �Ű������� OnClickListener�� ���� �͸�ü�� ���� �� ������ Ÿ���� OnClickListener�� ������.
		
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("������ 2: ���̹� ����");
			}
		});
		button2.click();
		
		
	}

}
