package chap16.EX05;

//5���� ��ü�� Object�� ����ؼ� �����ϰ� ĳ�������� �ҷ��� ����غ���.

class Student<N,I,P>{
	private N name;
	private I id;
	private P pass;
	
	public N getName() {
		return name;
	}
	public void setName(N name) {
		this.name = name;
	}
	public I getId() {
		return id;
	}
	public void setId(I id) {
		this.id = id;
	}
	public P getPass() {
		return pass;
	}
	
	public void setPass(P pass) {
		this.pass = pass;
	}
}	

public class EX_UsingObject {
	public static void main(String[] args) {
		
		Student<String, String, Integer> stu1 = new Student<String, String, Integer>();
		stu1.setName("ȫ�浿");
		stu1.setId("MrHONG");
		stu1.setPass(1234);
		
		System.out.println(stu1.getName());  
		System.out.println(stu1.getId());
		System.out.println(stu1.getPass());
	}
}


