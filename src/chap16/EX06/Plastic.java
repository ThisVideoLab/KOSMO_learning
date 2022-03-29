package chap16.EX06;

//GeniricPrinter에 사용될 객체 [재료]

public class Plastic{
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력 합니다.");
	}
	@Override
	public String toString(){
		return "재료는 플라스틱입니다";
	}

}
