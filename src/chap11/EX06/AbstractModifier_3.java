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
		System.out.println("�߿��̾߿�");
	}
	@Override
	void run(){
		System.out.println("�߿��� �޷�");
	}
}
class Tiger extends Animal{
	void info(String a, int b) {
		System.out.println(name + age);
	}
	@Override
	void cry() {
		System.out.println("ȣ���̾���");
	}
	@Override
	void run(){
		System.out.println("������ �޷�");
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
		System.out.println("±±��±±");
	}
	@Override
	void run(){
		System.out.println("±±�� ����");
	}
}
*/
public class AbstractModifier_3 {
	
	public static void main(String[] args) {
		Animal a1 = new Cat("�����", 10);
		Animal a2 = new Tiger("ȣ����", 5);
		Animal a3 = new Eagle("������", 15);
		
		//1. Animal �迭 ��ü�� ���� ��
		
		Object[] arr1 ={a1, a2,a3};
		
		//2. for ���� ����ؼ� ��ü�� ��½� �̸��� ���̸� �����. cry(), run()
	
		for (int i = 0; i < arr1.length; i++) {
			System.out.println();
		}
		
		a1.cry();
		a1.run();
		//3 enhanced for �����ε� ���
			
		
	}

}
