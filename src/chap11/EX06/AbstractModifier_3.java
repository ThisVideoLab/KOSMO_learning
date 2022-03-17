package chap11.EX06;

abstract class Animal{
	String name;
	int age;
	abstract void info(String a, int b);
	abstract void cry();
	abstract void run();
}

class Cat extends Animal{
	void Cat(String a, int b) {
		System.out.println(name + age);
	}
	@Override
	void cry() {
		System.out.println("야옹이야옹");
	}
	@Override
	void run(){
		System.out.println("야옹이 달려");
	}
}
class Tiger extends Animal{
	void info(String a, int b) {
		System.out.println(name + age);
	}
	@Override
	void cry() {
		System.out.println("호랑이어흥");
	}
	@Override
	void run(){
		System.out.println("어흥이 달려");
	}
}
/*
class Eagle extends Animal{
	@Override
	void (String a, int b) {
		System.out.println(name + age);
	}
	@Override
	void cry() {
		System.out.println("짹짹이짹짹");
	}
	@Override
	void run(){
		System.out.println("짹짹이 날아");
	}
}
*/
public class AbstractModifier_3 {
	
	public static void main(String[] args) {
		Animal a1 = new Cat("고양이", 10);
		Animal a2 = new Tiger("호랑이", 5);
		Animal a3 = new Eagle("독수리", 15);
		
		//1. Animal 배열 객체에 저장 후
		
		Object[] arr1 ={a1, a2,a3};
		
		//2. for 문을 사용해서 객체를 출력시 이름과 나이를 출력함. cry(), run()
	
		for (int i = 0; i < arr1.length; i++) {
			System.out.println();
		}
		
		a1.cry();
		a1.run();
		//3 enhanced for 문으로도 출력
			
		
	}

}
