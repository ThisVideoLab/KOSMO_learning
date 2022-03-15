

package chap10.EX04;



class Animal3 extends Object{ // �θ� Ŭ����, ��� Ŭ������ object Ŭ������ ����Ѵ�.
	String name;
	int age;
	void cry() {
		System.out.println("������ ��ϴ�.");
	}
	@Override // Object.toString �޼���� ��ü�� ��ü�� ����� ��, ȣ���� ��.
	public String toString() { // ��ü�� �ּҸ� ����մϴ�. [��Ű����. Ŭ������@��ü�Ǹ޸��� �ؽ���,]
		return " �̸��� : " + name + " ���̴� : " + age + "�� �Դϴ�."; 
	}
}
class Tiger3 extends Animal3{
	
	Tiger3(){
	}
	Tiger3(String a){
		super.name = a;
	}
	Tiger3(int b){
		super.age = b;
	}
	Tiger3(String a, int b){
		super.name = a;
		super.age = b;
		System.out.println(a + "�� " + b + "���Դϴ�.");
	}
	
	@Override
	void cry() {
		// super.cry(); // super  Ű����� �θ� Ŭ����, super : ��� ������ �� �θ� Ŭ����
					   // �� super.cry() �� �θ� Ŭ������ �ִ� cry �޼��带 ȣ���ϴ� ������ ��.
				     // this Ű����� �ڱ� �ڽ��� ��ü,
		System.out.println("ȣ���̴� �����ϰ� ��ϴ�.");
	
	}
}
class Dog3 extends Animal3{
	
	Dog3(){
	}
	Dog3(String a){
		super.name = a;
	}
	Dog3(int b){
		super.age = b;
	}
	Dog3 (String a, int b){
		super.name = a;
		super.age = b;
		System.out.println(a + "�� " + b + "���Դϴ�.");
	}
	
	@Override
	void cry() {
		// super.cry();
		System.out.println("�������� �۸��ϰ� ��ϴ�.");
	}
	
}

class Cat3 extends Animal3{
	
	Cat3(){
	}
	Cat3(String a){
		super.name = a;
	}
	Cat3(int b){
		super.age = b;
	}
	Cat3 (String a, int b){
		super.name = a;
		super.age = b;
		System.out.println(a + "�� " + b + "���Դϴ�.");
	}
	
	@Override
	void cry() {
		//super.cry(); 
		System.out.println("����̴� �߿��ϰ� ��ϴ�.");
	}
	
}


public class Test02 {

	public static void main(String[] args) {

		Animal3 a3 = new Animal3();
		
		System.out.println(a3); // ��ü ��ü�� ����� ���, Object class�� toString �޼��尡 ȣ���.
								// Object.toString() : ��ü�� �޸� �ּ��� �ؽ� �ڵ带 ���
								// chap10.EX04.Animal3@4517d9a3 < == ����Ű��.��ü��@�ؽ��ڵ尡 ��µ�
		System.out.println(a3.toString());
		
		// ��ü ��ü�� ����ϸ� Object Ŭ������ toStrintg �޼��带 ȣ����
		
		Animal3 t3 = new Tiger3(); // Tiger3�� Animal3�� ��ĳ������.
		Animal3 c3 = new Cat3();
		Animal3 d3 = new Dog3();
		
		t3.cry(); // �θ��� cry()�� ȣ���� ��� �������̵� �� Tiger3�� cry()�� ȣ��
		c3.cry(); // animal3.cry �� ȣ�� ==> �������̵� �� cat3�� cry()�� ȣ��
		d3.cry(); //
		
		System.out.println("==================");
		
		Animal3[] arr = {t3,c3,d3};
		
		for (int i = 1; i < arr.length; i++) {
			arr[i].cry();
		}
		
		System.out.println("==================");
		
		for (Animal3 k : arr) {
			k.cry();;
		}
		
		System.out.println("==================");
		
		Animal3 tt3 = new Tiger3("ȣ����",60);
		Animal3 cc3 = new Cat3("�����",59);
		Animal3 dd3 = new Dog3("��",58);
		
		System.out.println("==================");
		
		System.out.println(tt3); // ��ü ��ü�� ��½�, �⺻�����δ� ��ü�� �Ÿ� �ؽ��ڵ尡 ��µ�.
		System.out.println(cc3); // Object�� toString() �޼ҵ带 ��������.
		System.out.println(dd3);
		
		System.out.println("==================");
		
		Animal3[] arr2 = {tt3, cc3, dd3};
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("==================");
		
		for (Animal3 k : arr2) {
			System.out.println(k);
		}
		
		// ������ ��
	}
}