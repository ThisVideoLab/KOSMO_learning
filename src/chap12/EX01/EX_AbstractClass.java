package chap12.EX01;

abstract class Abc{
	abstract void cry();
	abstract void run();
}

class Cat extends Abc{
	@Override
	void cry(){
		System.out.println("����̴� �߿��ϰ� ��ϴ�");
	}
	void run(){
		System.out.println("����̴� �� ���� �޸��ϴ�");
	}
}
class Eagle extends Abc{
	@Override
	void cry(){
		System.out.println("�������� ±±�ϰ� ��ϴ�");
	}
	void run(){
		System.out.println("�������� �� ���� ���ƿ����ϴ�");
	}
}

public class EX_AbstractClass {

	public static void main(String[] args) {
		// 1. �ڽ� Ŭ���� Cat, Ealge, Ŭ���� ���� �� ���̵�, ũ���� ���
		
		Abc abc1 = new Cat();
		Abc abc2 = new Eagle();
		
		abc1.run();
		abc1.cry();
		System.out.println("==========");
		abc2.run();
		abc2.cry();
		System.out.println("==========");
		
		// 2. �͸� Ŭ���� ���� �� ���
		
		Abc abc3 = new Abc(){
			void cry(){
				System.out.println("����̴� �߿��ϰ� ��ϴ�");
				System.out.println("�� ������ �͸� Ŭ������ �ۼ��� �����Դϴ�");
			}
			void run(){
				System.out.println("����̴� �� ���� �޸��ϴ�");
				System.out.println("�� ������ �͸� Ŭ������ �ۼ��� �����Դϴ�");
			}
		};
		
		Abc abc4 = new Abc(){
			void cry(){
				System.out.println("�������� ±±�ϰ� ��ϴ�");
				System.out.println("�� ������ �͸� Ŭ������ �ۼ��� �����Դϴ�");
			}
			void run(){
				System.out.println("�������� �� ���� ���ƿ����ϴ�");
				System.out.println("�� ������ �͸� Ŭ������ �ۼ��� �����Դϴ�");
			}
		};
		
		abc3.cry();
		abc3.run();
		System.out.println("==========");
		abc4.cry();
		abc4.run();
		
		// ������ ��
	}

}
