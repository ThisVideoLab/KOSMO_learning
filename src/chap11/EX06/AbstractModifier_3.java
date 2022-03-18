package chap11.EX06;

abstract class Animal{ // �߻� Ŭ���� : �߻� �޼ҵ尡 �ϳ� �̻� ����Ǿ� �ִ� ���
	String name;	   // �߻� Ŭ������ ��ü ���� �Ұ�, Ÿ���� ��밡��
	int age;		   // �ڽ� Ŭ������ �θ� Ŭ������ �޼ҵ带 ������ ������ ������
	abstract void cry();
	abstract void run();
	
	@Override
		public String toString() {
		 return "�̸� : " + name + ", ����: " + age;
	}
}
class Cat extends Animal{
	Cat(String name, int age){
		super.name = name;
		super.age = age;
	}
	@Override
	void cry() {
		System.out.println("�߿�");
	}								
	@Override
	void run(){
	System.out.println("�߿��� �޷�");
	}
}
class Tiger extends Animal{ 
	Tiger(String name, int age){
		super.name = name;
		super.age = age;
	}
	@Override
	void cry() {
		System.out.println("����");
	}								
	@Override
	void run(){
	System.out.println("������ �پ�");
	}
}
class Eagle extends Animal{ 
	Eagle(String name, int age){
		super.name = name;
		super.age = age;
	}
	@Override
	void cry() {
		System.out.println("±±");
	}								
								  
	@Override
	void run(){
	System.out.println("±±�� ����");
	}
}
public class AbstractModifier_3 {
	
	public static void main(String[] args) {
		Animal a1 = new Cat("�����", 10);
		Animal a2 = new Tiger("ȣ����", 5);
		Animal a3 = new Eagle("������", 15);
		
		//1. Animal �迭 ��ü�� ���� ��
		
		Animal[] arr1 ={a1, a2,a3};
		
		//2. for ���� ����ؼ� ��ü�� ��½� �̸��� ���̸� �����. cry(), run()
	
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			arr1[i].cry(); // ��ü�� �������̵� �� �޼ҵ� ���
			arr1[i].run(); // Animal�� cry() �� run()�� ���ʿ� ȣ��������, �θ��� �޼���� �߻� �޼���� �ڽ��� cry()�� run()�� ��µ�
			System.out.println("======================");
		}

		//3 enhanced for �����ε� ���
		for(Animal k: arr1) {
			System.out.println(k);
			k.cry();
			k.run();
			System.out.println("======================");
		}
		
	}

}
