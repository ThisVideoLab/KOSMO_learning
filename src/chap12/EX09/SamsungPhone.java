package chap12.EX09;



public class SamsungPhone implements PhoneInterface {//1. 처음에 딱 PhoneInterface만 쓰면 삼성폰에 오류가 뜸. 이유는 PhoneInterface에 있는 abstract가 넘어와서 그럼.
	
	//2. 인터페이스에서 정의만 해둔 메서드를 오버라이드로 재정의 : 시작
	@Override
	public void senCall() {
		System.out.println("따르르릉~");
	}
	
	@Override
	public void recieveCall() {
		System.out.println("전화받으세요!");
	} 
	//3. 재정의 끝.
	
	//4. 추가적인 SamsungPhone 만의 기능을 추가해보자
	public void news() {
		System.out.println("GOC로 몰래 핸드폰의 기능을 제한합니다");
		System.out.println("전세계에 이 사실이 까발려집니다");
		System.out.println("긱벤치에서 퇴출당합니다");
		System.out.println("주가가 떡락합니다");
	}
}
