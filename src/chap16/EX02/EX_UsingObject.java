package chap16.EX02;




//5개의 객체를 Object를 사용해서 저장하고 캐스팅으로 불러서 출력해봐라.

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
		return "이름 : " + name +  " , 학생ID : " + id + " , 비밀번호 : " + pass;
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
		return "이름 : " + name +  " , e-mail : " + email + " , 근속년수 : " + year + "년";
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
		return "이름 : " + name +  " , 달리기 : " + run;
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
		return "이름 : " + name +  " , 색상 : " + color + " , 가격 : " + price;
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
		obInfo1.setObject(new Student("곤잘레스 로드리게스","thisvideo",1234));
		System.out.println((Student) obInfo1.getObject());
		
		ObjectInfo obInfo2 = new ObjectInfo(); 
		obInfo2.setObject(new Proffesor("다비드 아뭉가","moong-ga@gmail.com",89)); 
		System.out.println((Proffesor) obInfo2.getObject());
		
		ObjectInfo obInfo3 = new ObjectInfo(); 
		obInfo3.setObject(new Tiger("큰야옹이","89km/h"));
		System.out.println((Tiger) obInfo3.getObject());
		
		ObjectInfo obInfo4 = new ObjectInfo(); 
		obInfo4.setObject(new Banana("델몬트 바나나","초록빛이 도는 노란색", 3000)); 
		System.out.println((Banana) obInfo4.getObject());
		
		
		
		
		// 문서의 끝
	}

}
