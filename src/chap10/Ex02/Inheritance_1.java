package chap10.Ex02;

class Aa{
	int m;
	void abc(){
		System.out.println("�� �޽����� Ŭ���� Aa�� abc �޼��忡�� ��µ˴ϴ�.");
	}
}
class Bb extends Aa{
	int n;
	void bcd(){
		System.out.println("�� �޽����� Ŭ���� Bb�� bcd �޼��忡�� ��µ˴ϴ�.");
	}
	
}

public class Inheritance_1 {

	public void main(String[] args) {
		
		// Ÿ�� ĳ������ ���� �ʴ� ���
		Bb b = new Bb(); // ��ü b�� Ŭ���� Aa, Bb ��� �����ϰ� ����. �ｼ Aa, Bb�� �ʵ�� �޼ҵ带 ��� ��� ������ ���Դϴ�.
		b.m = 10;
		b.n = 20;
		b.abc();
		b.bcd();
		
		//��ĳ����: �ڽ� => �θ�
		Aa a = new Bb(); 
		a.m = 100;
		// a.n =200;
		
		System.out.println("What did I do wrong?");
	}
	
}
