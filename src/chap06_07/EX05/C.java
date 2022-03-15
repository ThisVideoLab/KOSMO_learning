package chap06_07.EX05;

public class C {     //다른 패키지에서 import 능
	
	// 필드에 부여 되는 접근 제어자
	private String company = "현대자동차";   
	String model ;
	protected String color ;
	public int maxSpeed ;
	


	public  void setModel(String a) {
		model = a;
	}


	public void setcolor(String a) {
		color = a;
	}



	public void print() {
		System.out.println("company : " + company );
		System.out.println("model : " + model );
		System.out.println("color : " + color );
		System.out.println("maxSpeed : " + maxSpeed );
	}
	
	

}
