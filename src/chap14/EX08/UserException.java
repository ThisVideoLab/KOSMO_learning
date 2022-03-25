package chap14.EX08;

//1. Exception을 상속받는 사용자 예외 - 일반예외처리
	//1-1. 점수가 음수인 경우 예외처리
	//1-2. 점수에 100점을 초과하는 경우 예외처리

class MinusException extends Exception{ // 음수가 입력되는 경우에 강제 예외처리 실행
	
	public MinusException(){
		super();
	}
	public MinusException(String message){ // 예외 메시지 출력, e.getMessage();
		super(message);
	}
}

class OverException extends Exception{ // 100 이상의 값이 들어오면 호출함
	public OverException() {
		super();
	}
	public OverException(String message) { // 예외 메시지 출력, e.getMessage();
		super(message);
	}
}

class AAA{
	
	int score;
	String name;
	
	void checkScore(int score,String name) throws MinusException, OverException {
		if(score < 0 ) {
			this.score = score;
			System.out.println("입력하신 점수는 " + this.score + "점입니다.");
			throw new MinusException("예외 발생: 음수는 넣을 수 없습니다.");
		}else if(score > 100) {
			this.score = score;
			System.out.println("입력하신 점수는 " + this.score + "점입니다.");
			throw new OverException("예외 발생: 획득 점수는 100점을 넘을 수 없습니다.");
		}else if(name == "짱구") {
			System.out.println("된다");
		
		}else {
			System.out.println("정상적으로 잘 입력되었습니다.");
			this.score = score;
			System.out.println("입력하신 점수는 " + this.score + "점입니다.");
			System.out.println(this.name);
		}
	}
}

public class UserException {

	public static void main(String[] args) {
		
		AAA aaa1 = new AAA();
		try {
			aaa1.checkScore(-100,"짱구");
		} catch (MinusException | OverException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("=========================");
		
		try {
			aaa1.checkScore(200,"맹구");
		} catch (MinusException | OverException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("=========================");
		
		try {
			aaa1.checkScore(80,"짱구");
		} catch (MinusException | OverException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	// 문서의 끝
	}

}
