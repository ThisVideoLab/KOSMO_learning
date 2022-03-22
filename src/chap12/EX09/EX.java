package chap12.EX09;

public class EX {

	public static void main(String[] args) {

		//1. 이제 실행부를 출력해보자
		SamsungPhone g20 = new SamsungPhone(); 
		g20.printLogo(); //2. interface에서 default 메서드가 상속되어 내려오는 부분
		g20.senCall();
		g20.recieveCall();
		g20.news();
		
		System.out.println("===================");
		
		//3 이제는 PhoneInterface로 업캐스팅시켜보자
		
		PhoneInterface g21 = new SamsungPhone();
		g21.printLogo(); //2. interface에서 default 메서드가 상속되어 내려오는 부분
		g21.senCall();
		g21.recieveCall();
		// g21.news(); // 이렇게 치면 오류 발생. 이윤즉슨 news는 PhoneInterface의 자식 클래스인 SamsungPhone의 기능이기 때문임.
		// 그래서 news()를 호출하고 싶다면 다음과 같이 다운캐스팅해야 함.
		SamsungPhone g22 = (SamsungPhone) g21; // 다운 캐스팅 완료
		g22.news(); // 다운캐스팅 후에 호출. 사실 다운캐스팅으로 전환이라기보단 새로이 생성하는거지만
		int[ ]  studnetIDs  =  { 102, 102 } ;
	}

}
