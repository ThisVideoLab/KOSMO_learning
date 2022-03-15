package chap06_07.Ex02;

public class Example_Car {

	public static void main(String[] args) {
		// Car class 를 객체화 해서 5개의 객체를 생성해서 값을 할당 해서 출력 해보세요.
		
		Car sonata = new Car();
		Car mornig = new Car();
		Car canival = new Car();
		Car grandger = new Car();
		Car avantte = new Car();
		
		// 각 변수의 값을 할당하고 출력해 보세요
		
		//변수의 값을 직접 할당 , 권장사항이 아님  메모리에 원하지 않는 값을 직접 할당
		//private 변수명 : 캡슐화 , 직접 변수의 값을 할당하지 못하도록 한다
		//setter 를 통해서 값을 부여 : 변수의 입력되는 값을 제어 할 수 있다 
		sonata.company = "현대";
		sonata.model = "소나타";
		sonata.color = "white";
		sonata.maxSpeed = 100;
		System.out.print(sonata.getCompany() + " ");
		System.out.print(sonata.getModel() + " ");
		System.out.print(sonata.getColor() + " ");
		System.out.print(sonata.getMaxSpeed() + " ");
		System.out.println();
		System.out.println("=================");
		
		mornig.setCompany("기아");
		mornig.setModel("mornig");
		mornig.setColor("black");
		mornig.setMaxSpeed(90);
		System.out.print(mornig.getCompany() + " ");
		System.out.print(mornig.getColor() + " ");
		System.out.print(mornig.getMaxSpeed() + " ");
		System.out.print(mornig.getModel() + " ");
		System.out.println();
		System.out.println("=================");
		
		canival.setCompany("기아");
		canival.setModel("carnival");
		canival.setColor("silver");
		canival.setMaxSpeed(80);
		System.out.print(canival.getCompany() + " ");
		System.out.print(canival.getModel()+ " ");
		System.out.print(canival.getColor() + " ");
		System.out.print(canival.getMaxSpeed() + " ");
		System.out.println();
		System.out.println("=================");
		
		grandger.setCompany("현대");
		grandger.setModel("grandger");
		grandger.setColor("gray");
		grandger.setMaxSpeed(110);
		System.out.print(grandger.getCompany() + " ");
		System.out.print(grandger.getModel() + " ");
		System.out.print(grandger.getColor() + " ");
		System.out.print(grandger.getMaxSpeed() + " ");
		System.out.println();
		System.out.println("=================");
		
		avantte.setCompany("현대");
		avantte.setModel("avantte");
		avantte.setColor("blue");
		avantte.setMaxSpeed(120);
		System.out.print(avantte.getCompany() + " ");
		System.out.print(avantte.getModel() + " ");
		System.out.print(avantte.getColor() + " ");
		System.out.print(avantte.getMaxSpeed() + " ");
		System.out.println();
		System.out.println("=================");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
