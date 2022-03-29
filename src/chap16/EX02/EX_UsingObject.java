package chap16.EX02;




//5���� ��ü�� Object�� ����ؼ� �����ϰ� ĳ�������� �ҷ��� ����غ���.

class Student{
	String name;
	String id;
	int pass;

	
	Student(String name, String id, int pass){
		this.name = name;
		this.id = id;
		this.pass = pass;
	}
	@Override
	public String toString() {  
		return "�̸� : " + name +  " , �л�ID : " + id + " , ��й�ȣ : " + pass;
	}
}

class Proffesor{
	String name;
	String email;
	int year;

	Proffesor(String name, String email, int year){ 
		this.name = name;
		this.email = email;
		this.year = year;
	}
	@Override
	public String toString() {  
		return "�̸� : " + name +  " , e-mail : " + email + " , �ټӳ�� : " + year + "��";
	}
}

class Tiger{
	String name;
	String run;

	Tiger(String name, String run){ 
		this.name = name;
		this.run = run;
	}
	@Override
	public String toString() {  
		return "�̸� : " + name +  " , �޸��� : " + run;
	}
}

class Banana{
	String name;
	String color;
	int price;

	Banana(String name,String color, int price){ 
		this.name = name;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {  
		return "�̸� : " + name +  " , ���� : " + color + " , ���� : " + price;
	}
}

class ObjectInfo{ 
	private Object object = new Object();
	
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) { 
		this.object = object; 
	}
}


public class EX_UsingObject {
	public static void main(String[] args) {

		
		ObjectInfo obInfo1 = new ObjectInfo(); 
		obInfo1.setObject(new Student("���߷��� �ε帮�Խ�","thisvideo",1234));
		System.out.println((Student) obInfo1.getObject());
		
		ObjectInfo obInfo2 = new ObjectInfo(); 
		obInfo2.setObject(new Proffesor("�ٺ�� �ƹ���","moong-ga@gmail.com",89)); 
		System.out.println((Proffesor) obInfo2.getObject());
		
		ObjectInfo obInfo3 = new ObjectInfo(); 
		obInfo3.setObject(new Tiger("ū�߿���","89km/h"));
		System.out.println((Tiger) obInfo3.getObject());
		
		ObjectInfo obInfo4 = new ObjectInfo(); 
		obInfo4.setObject(new Banana("����Ʈ �ٳ���","�ʷϺ��� ���� �����", 3000)); 
		System.out.println((Banana) obInfo4.getObject());
		
		
		
		
		// ������ ��
	}

}
