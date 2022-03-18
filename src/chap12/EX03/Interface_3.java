package chap12.EX03;

interface A{}
interface B{}

//1. 단일 인터페이스 상속
class C implements A{}

//2. 다중 인터페이스 상속

class D implements A,B{}

//3. 클래스와 인터페이스를 한번에 상속 ( 이때 extends와 implements의 순서는 변경이 불가능함)
class E extends C implements A,B{}

public class Interface_3 {

	public static void main(String[] args) {

	}

}
