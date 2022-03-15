package chap10.EX04;

// 메서드 오버라이딩

class Animal {
	void cry(){
		System.out.println("애니멀 클래스의 크라이를 출력합니다");
	}
}
class Bird extends Animal{
	@Override
	void cry() {
		System.out.println("새는 짹짹");
	}
}	

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("고양이는 고양고양");
	}
}
class Dog extends Animal{
	@Override
	void cry(){
		System.out.println("개는 개개");
	}
}


public class MethodOverridng_1 {

	public static void main(String[] args) {
		
		// 1. 각각의 타입으로 선언하기 + 각각의 타입으로 생성
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		
		System.out.println("====================");
		
		// 2. Animal 타입으로 선언 한 후에 자식 타입으로 생성 : 동적 바인딩에 의해서 부모의 cry()를 호출할 경우 자식의 
		// 오버로딩된 메서드로 바인딩됨.
		
		Animal ab = new Bird(); // ab는 Animal, Bird 타입을 내포함. Animal에 있는 필드와 메서드만 접근 가능함.
		Animal ac = new Cat(); // ac는 Animal, Cat 타입을 내포함. Animal에 있는 필드와 메서드만 접근 가능함.
		Animal ad = new Dog();
		
		ab.cry();  // 애니멀의 cry를 호출함. 그런데 동적 바인딩에 의해서 bird에 있는 cry를 호출함.
		ac.cry(); // 애니멀의 cry를 호출함. 그런데 동적 바인딩에 의해서 Cat에 있는 cry를 호출함.
		ad.cry(); // 애니멀의 cry를 호출함. 그런데 동적 바인딩에 의해서 Dogd에 있는 cry를 호출함.
		
//		System.out.println("====================");
		
		// 3. 객체 배열로 관리
		
		Animal[] animals = {ab, ac, ad};
	//  객체 타입 / 배열이름 = {객체, 객체, 객채} 
		
		for ( Animal k : animals ) {
			k.cry();
		}
		
		System.out.println("====================");
		
		for (int i = 0; i < animals.length; i ++) {
			animals[i].cry();
		}
		
		System.out.println("====================");
		
		
		
		
		
		// 문서의 끝
	}

}
