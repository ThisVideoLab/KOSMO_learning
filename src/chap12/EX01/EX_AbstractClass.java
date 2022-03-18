package chap12.EX01;

abstract class Abc{
	abstract void cry();
	abstract void run();
}

class Cat extends Abc{
	@Override
	void cry(){
		System.out.println("고양이는 야옹하고 웁니다");
	}
	void run(){
		System.out.println("고양이는 땅 위를 달립니다");
	}
}
class Eagle extends Abc{
	@Override
	void cry(){
		System.out.println("독수리는 짹짹하고 웁니다");
	}
	void run(){
		System.out.println("독수리는 땅 위로 날아오릅니다");
	}
}

public class EX_AbstractClass {

	public static void main(String[] args) {
		// 1. 자식 클래스 Cat, Ealge, 클래스 생성 후 보이드, 크라이 출력
		
		Abc abc1 = new Cat();
		Abc abc2 = new Eagle();
		
		abc1.run();
		abc1.cry();
		System.out.println("==========");
		abc2.run();
		abc2.cry();
		System.out.println("==========");
		
		// 2. 익명 클래스 생성 후 출력
		
		Abc abc3 = new Abc(){
			void cry(){
				System.out.println("고양이는 야옹하고 웁니다");
				System.out.println("윗 문장은 익명 클래스로 작성된 문장입니다");
			}
			void run(){
				System.out.println("고양이는 땅 위를 달립니다");
				System.out.println("윗 문장은 익명 클래스로 작성된 문장입니다");
			}
		};
		
		Abc abc4 = new Abc(){
			void cry(){
				System.out.println("독수리는 짹짹하고 웁니다");
				System.out.println("윗 문장은 익명 클래스로 작성된 문장입니다");
			}
			void run(){
				System.out.println("독수리는 땅 위로 날아오릅니다");
				System.out.println("윗 문장은 익명 클래스로 작성된 문장입니다");
			}
		};
		
		abc3.cry();
		abc3.run();
		System.out.println("==========");
		abc4.cry();
		abc4.run();
		
		// 문서의 끝
	}

}
