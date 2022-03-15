

package chap10.EX04;



class Animal3 extends Object{ // 부모 클래스, 모든 클래스는 object 클래스를 상속한다.
	String name;
	int age;
	void cry() {
		System.out.println("동물은 웁니다.");
	}
	@Override // Object.toString 메서드는 객체를 자체를 출력할 때, 호출이 됨.
	public String toString() { // 객체의 주소를 출력합니다. [패키지명. 클래스명@객체의메모리의 해쉬콛,]
		return " 이름은 : " + name + " 나이는 : " + age + "살 입니다."; 
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
		System.out.println(a + "는 " + b + "살입니다.");
	}
	
	@Override
	void cry() {
		// super.cry(); // super  키워드는 부모 클래스, super : 상속 관계일 때 부모 클래스
					   // 즉 super.cry() 는 부모 클래스에 있는 cry 메서드를 호출하는 구문이 됨.
				     // this 키워드는 자기 자신의 객체,
		System.out.println("호랑이는 어흥하고 웁니다.");
	
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
		System.out.println(a + "는 " + b + "살입니다.");
	}
	
	@Override
	void cry() {
		// super.cry();
		System.out.println("강아지는 멍멍하고 웁니다.");
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
		System.out.println(a + "는 " + b + "살입니다.");
	}
	
	@Override
	void cry() {
		//super.cry(); 
		System.out.println("고양이는 야옹하고 웁니다.");
	}
	
}


public class Test02 {

	public static void main(String[] args) {

		Animal3 a3 = new Animal3();
		
		System.out.println(a3); // 객체 자체를 출력할 경우, Object class의 toString 메서드가 호출됨.
								// Object.toString() : 객체의 메모리 주소의 해쉬 코드를 출력
								// chap10.EX04.Animal3@4517d9a3 < == 패지키명.객체명@해쉬코드가 출력됨
		System.out.println(a3.toString());
		
		// 객체 자체를 출력하면 Object 클래스의 toStrintg 메서드를 호출함
		
		Animal3 t3 = new Tiger3(); // Tiger3를 Animal3로 업캐스팅함.
		Animal3 c3 = new Cat3();
		Animal3 d3 = new Dog3();
		
		t3.cry(); // 부모의 cry()를 호출할 경우 오버라이딩 된 Tiger3의 cry()를 호출
		c3.cry(); // animal3.cry 를 호출 ==> 오버라이딩 된 cat3의 cry()를 호출
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
		
		Animal3 tt3 = new Tiger3("호랑이",60);
		Animal3 cc3 = new Cat3("고양이",59);
		Animal3 dd3 = new Dog3("개",58);
		
		System.out.println("==================");
		
		System.out.println(tt3); // 객체 자체를 출력시, 기본적으로는 객체의 매모리 해쉬코드가 출력됨.
		System.out.println(cc3); // Object의 toString() 메소드를 재정의함.
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
		
		// 문서의 끝
	}
}