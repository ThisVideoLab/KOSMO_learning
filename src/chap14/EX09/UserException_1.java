package chap14.EX09;

class SeasonException extends Exception{ 
	public SeasonException() {
		super();
	}
	public SeasonException(String message) { 
		super(message);
	}
}
class WeekException extends Exception{ 
	public WeekException() {
		super();
	}
	public WeekException(String message) { 
		super(message);
	}
}
class ScoreKorException extends Exception{ 
	public ScoreKorException() {
		super();
	}
	public ScoreKorException(String message) { 
		super(message);
	}
}
class ScoreEngException extends Exception{ 
	public ScoreEngException() {
		super();
	}
	public ScoreEngException(String message) { 
		super(message);
	}
}

class UserIDException extends Exception{ 
	public UserIDException() {
		super();
	}
	public UserIDException(String message) { 
		super(message);
	}
}



class A{
	private String season; // 봄, 여름, 가을, 겨울만 들어와야 함.
	private String week; // 월, 화, 수, 목, 금, 토, 일만 들어와야 함.
	private int scoreKor; // 0~100까지의 점수만.
	private int scoreEng; // 0~100까지의 점수만.
	private String userID; // 12자 이상 20자 이하의 문자

	void studentInfo(String season, String week, int scoreKor, int scoreEng, String userID )
		throws SeasonException, WeekException, ScoreKorException,ScoreEngException,UserIDException {
		if(season != "봄" && season != "여름" && season != "가을" & season != "겨울" ) {
			this.season = season;
			System.out.println("입력하신 계절은 " + this.season + "입니다.");
			throw new SeasonException("예외 발생: 이 단어는 정확한 계절명이 아닙니다.");
		}else if(week != "월" && week != "화" && week != "수" && week != "목" && week != "금" &&week != "토" &&week != "일") {
			this.week = week;
			System.out.println("입력하신 요일은 " + this.week + "요일입니다.");
			throw new WeekException("예외 발생: 이 단어는 정확한 요일명이 아닙니다.");
		}else if(scoreKor < 0 || scoreKor > 100 ) {
			System.out.println("입력하신 국어 점수는 " + this.scoreKor + "점입니다.");
			throw new ScoreKorException("예외 발생: 획득 점수는 0점부터 100점까지 입니다.");
		}else if(scoreEng < 0 || scoreEng > 100 ) {
			System.out.println("입력하신 영어 점수는 " + this.scoreKor + "점입니다.");
			throw new ScoreEngException("예외 발생: 획득 점수는 0점부터 100점까지 입니다.");
		}else if (userID.length() < 12 || userID.length() >20) {
			throw new UserIDException("아이디는 12자 이상 20자 이하로 사용가능 합니다");
		}
		else {
			System.out.println("정상적으로 잘 입력되었습니다.");
			System.out.println();
			this.season = season;
			this.week = week;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			this.userID = userID;
			System.out.println("입력하신 학생의 정보는 다음과 같습니다.");
			System.out.println();
			System.out.println("계절: " + this.season);
			System.out.println("요일: " + this.week);
			System.out.println("국어 점수: " + this.scoreKor);
			System.out.println("영어 점수: " + this.scoreEng);
			System.out.println("학생 ID: " + this.userID);
			
		}
	}

}



public class UserException_1 {

	public static void main(String[] args) {

		A a1 = new A();
		try {
			a1.studentInfo("봄","월",100,100,"한둘셋넷다여일여아열한둘셋");
		} catch (SeasonException | WeekException | ScoreKorException |ScoreEngException |UserIDException  e) {
			System.out.println(e.getMessage());
		}
		
	}

}
