package chap10.EX04;

class Human{ // �θ� Ŭ����
	String name; // �ν��Ͻ� �ʵ� : ��üȭ���Ѿ� ��� ������. �޸𸮴� heap�̶�� ���� �ȿ� ���� ��.
	int age;
	
	void eat() { // �ν��Ͻ� �޼ҵ� : ��üȭ ���Ѿ� ��� ������. heap ������ pointer(�ּ�)�� ������ ����
				 // Ŭ���� ���� ���� �ν��Ͻ� �޼ҵ� ������ ���� �޼ҵ� �ڵ尡 ����Ǿ� ����.
		System.out.println("����� �Խ��ϴ�.");
	}
	
	void sleep() {
		System.out.println("����� ��ϴ�.");
	}
}

class Student extends Human{
	int StudentID;
	void goToSchool() {
		System.out.println("�л��� �б��� ���ϴ�.");
	}
	
}

class Worker extends Human{
	int WorkerID;
	void goToCompany () {
		System.out.println("���忡 ���ϴ�!");
	}
}



public class Test01 {

	public static void main(String[] args) {

		Human h = new Human();
		h.name = "ȫ�浿";
		h.age = 30;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name = "�Ż��Ӵ�";
		s.StudentID = 1111;
		s.eat();
		s.goToSchool();
		
		Worker w = new Worker();
		w.name = "BTS";
		w.WorkerID = 2222;
		w.eat();
		w.goToCompany();
		
		// ������ ��
	}

}
