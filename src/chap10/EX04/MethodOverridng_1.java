package chap10.EX04;

// �޼��� �������̵�

class Animal {
	void cry(){
		System.out.println("�ִϸ� Ŭ������ ũ���̸� ����մϴ�");
	}
}
class Bird extends Animal{
	@Override
	void cry() {
		System.out.println("���� ±±");
	}
}	

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("����̴� �����");
	}
}
class Dog extends Animal{
	@Override
	void cry(){
		System.out.println("���� ����");
	}
}


public class MethodOverridng_1 {

	public static void main(String[] args) {
		
		// 1. ������ Ÿ������ �����ϱ� + ������ Ÿ������ ����
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		
		System.out.println("====================");
		
		// 2. Animal Ÿ������ ���� �� �Ŀ� �ڽ� Ÿ������ ���� : ���� ���ε��� ���ؼ� �θ��� cry()�� ȣ���� ��� �ڽ��� 
		// �����ε��� �޼���� ���ε���.
		
		Animal ab = new Bird(); // ab�� Animal, Bird Ÿ���� ������. Animal�� �ִ� �ʵ�� �޼��常 ���� ������.
		Animal ac = new Cat(); // ac�� Animal, Cat Ÿ���� ������. Animal�� �ִ� �ʵ�� �޼��常 ���� ������.
		Animal ad = new Dog();
		
		ab.cry();  // �ִϸ��� cry�� ȣ����. �׷��� ���� ���ε��� ���ؼ� bird�� �ִ� cry�� ȣ����.
		ac.cry(); // �ִϸ��� cry�� ȣ����. �׷��� ���� ���ε��� ���ؼ� Cat�� �ִ� cry�� ȣ����.
		ad.cry(); // �ִϸ��� cry�� ȣ����. �׷��� ���� ���ε��� ���ؼ� Dogd�� �ִ� cry�� ȣ����.
		
//		System.out.println("====================");
		
		// 3. ��ü �迭�� ����
		
		Animal[] animals = {ab, ac, ad};
	//  ��ü Ÿ�� / �迭�̸� = {��ü, ��ü, ��ä} 
		
		for ( Animal k : animals ) {
			k.cry();
		}
		
		System.out.println("====================");
		
		for (int i = 0; i < animals.length; i ++) {
			animals[i].cry();
		}
		
		System.out.println("====================");
		
		
		
		
		
		// ������ ��
	}

}
