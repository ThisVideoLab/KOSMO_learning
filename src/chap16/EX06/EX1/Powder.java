package chap16.EX06.EX1;

//GenericPrinter 에 사용될 객체 [재료]


public class Powder extends Meterial {
	public void doPrinting() {
		System.out.println("파우더 재료로 출력합니다");
	}
	@Override
	public String toString() {
		return "재료는 파우더 입니다";
	}
	
}
