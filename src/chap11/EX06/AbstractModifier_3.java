package chap11.EX06;

abstract class Animal{ // 추상 클래스 : 추상 메소드가 하나 이상 포험되어 있는 경우
	String name;	   // 추상 클래스는 객체 생성 불가, 타입은 사용가능
	int age;		   // 자식 클래스는 부모 클래스의 메소드를 구현시 오류를 방지함
	abstract void cry();
	abstract void run();
	
	@Override
		public String toString() {
		 return "이름 : " + name + ", 나이: " + age;
	}
}
class Cat extends Animal{
	Cat(String name, int age){
		super.name = name;
		super.age = age;
	}
	@Override
	void cry() {
		System.out.println("야옹");
	}								
	@Override
	void run(){
	System.out.println("야옹이 달려");
	}
}
class Tiger extends Animal{ 
	Tiger(String name, int age){
		super.name = name;
		super.age = age;
	}
	@Override
	void cry() {
		System.out.println("어흥");
	}								
	@Override
	void run(){
	System.out.println("어흥이 뛰어");
	}
}
class Eagle extends Animal{ 
	Eagle(String name, int age){
		super.name = name;
		super.age = age;
	}
	@Override
	void cry() {
		System.out.println("짹짹");
	}								
								  
	@Override
	void run(){
	System.out.println("짹짹이 날아");
	}
}
public class AbstractModifier_3 {
	
	public static void main(String[] args) {
		Animal a1 = new Cat("고양이", 10);
		Animal a2 = new Tiger("호랑이", 5);
		Animal a3 = new Eagle("독수리", 15);
		
		//1. Animal 배열 객체에 저장 후
		
		Animal[] arr1 ={a1, a2,a3};
		
		//2. for 문을 사용해서 객체를 출력시 이름과 나이를 출력함. cry(), run()
	
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			arr1[i].cry(); // 객체에 오버라이딩 된 메소드 출력
			arr1[i].run(); // Animal의 cry() 와 run()을 최초에 호출하지만, 부모의 메서드는 추상 메서드라 자식의 cry()와 run()이 출력됨
			System.out.println("======================");
		}

		//3 enhanced for 문으로도 출력
		for(Animal k: arr1) {
			System.out.println(k);
			k.cry();
			k.run();
			System.out.println("======================");
		}
		
	}

}
