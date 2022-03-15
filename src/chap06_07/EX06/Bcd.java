package chap06_07.EX06;

public class Bcd  {
	

	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	public void print1() {
		System.out.println("다른 패키지에서 접근 가능 : public ");
	}
	public void print2() {
		System.out.println("다른 패키지에서 접근 가능 (상속관계가 구성될떄) : protected ");
	}
	public void print3() {
		System.out.println("같은 패키지 에서만 접근 가능 : default ");
	}
	public void print4() {
		System.out.println("같은 크래스 내에서만 접근가능 : private ");
	}

}
