package private_work;

class AA{
	
	private void syso() {
		System.out.println("syso");

	}
	
	void hello(){
		System.out.println("æ»≥Á«œººø‰.");
	}
}

class BB extends AA{
	void hello() {
		System.out.println("π›∞©Ω¿¥œ¥Ÿ.");
	}
} 

public class temp {

	public static void main(String[] args) {

		AA aa1 = new AA();
		BB bb1 = new BB();
		AA bb2 = new BB();
		
	
		aa1.hello();
		bb1.hello();
		bb2.hello();
	}

}
