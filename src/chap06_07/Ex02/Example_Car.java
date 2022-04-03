package chap06_07.Ex02;

public class Example_Car {

	public static void main(String[] args) {
		//1. Car class 를 객체화 해서 5개의 객체를 생성해서 값을 할당 해서 출력 해보세요.
		//2. 같은 클래스 내의 public 패키지인 Car를 생성자를 활용해 객체로 생성해줌.
		
		Car sonata = new Car(); // 3.sonata라는 이름의 Car 클래스 객체를 새로이 생성함
		Car mornig = new Car();
		Car canival = new Car();
		Car grandger = new Car();
		Car avantte = new Car();
		
		//4. 각 변수의 값을 할당하고 출력하는 법을 익혀보자
		
		//5. 변수의 값을 직접 할당 , 권장사항이 아님  메모리에 원하지 않는 값을 직접 할당
		//6 . 다만 직접할당은  private같은 캡슐화에 의해 직접 변수의 값을 할당하지 못하는 경우가 발생할 수 있음.
		//    이럴 경우에는 setter 를 통해서 값을 부여 가능함. 고로 setter 메서드를 추가로 생성하고
		//    외부에서도 입력이 가능하게 하는 것이 일반적임. 이 경우에 getter 메서드를 함께 생성해두면
		//    데이터가 있는 클래스 외부에서도 자료를 받을 수 있게 됨.
		
		sonata.company = "현대"; //7. 참조변수로 부른 뒤, 해당 필드의 값을 = 등호로 입력하는 것이 앞서 말한
		sonata.model = "소나타"; //   직접할당에 해당됨. 직관적이지만 데이터 보호에 취약하다는 점으로 인해
		sonata.color = "white"; //   잘 사용하지 아니함. 이것은 출력도 마찬가지임. 아래를 보도록하자.
		sonata.maxSpeed = 100;
		System.out.print(sonata.company + " "); //8. 직접입력법, 그러나 외부에서 접근이 불가능한 경우엔
												//   정보를 받아올 수 없어서 실무에선 잘 안씀.
		System.out.print(sonata.getModel()+ " ");  // 9. 미리 외부에서도 접근할 수 있도록 getter를
											  //    만들어 놓으면 이렇게 정보 획득이 가능함.
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
