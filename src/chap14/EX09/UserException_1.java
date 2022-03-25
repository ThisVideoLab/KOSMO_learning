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
	private String season; // ��, ����, ����, �ܿ︸ ���;� ��.
	private String week; // ��, ȭ, ��, ��, ��, ��, �ϸ� ���;� ��.
	private int scoreKor; // 0~100������ ������.
	private int scoreEng; // 0~100������ ������.
	private String userID; // 12�� �̻� 20�� ������ ����

	void studentInfo(String season, String week, int scoreKor, int scoreEng, String userID )
		throws SeasonException, WeekException, ScoreKorException,ScoreEngException,UserIDException {
		if(season != "��" && season != "����" && season != "����" & season != "�ܿ�" ) {
			this.season = season;
			System.out.println("�Է��Ͻ� ������ " + this.season + "�Դϴ�.");
			throw new SeasonException("���� �߻�: �� �ܾ�� ��Ȯ�� �������� �ƴմϴ�.");
		}else if(week != "��" && week != "ȭ" && week != "��" && week != "��" && week != "��" &&week != "��" &&week != "��") {
			this.week = week;
			System.out.println("�Է��Ͻ� ������ " + this.week + "�����Դϴ�.");
			throw new WeekException("���� �߻�: �� �ܾ�� ��Ȯ�� ���ϸ��� �ƴմϴ�.");
		}else if(scoreKor < 0 || scoreKor > 100 ) {
			System.out.println("�Է��Ͻ� ���� ������ " + this.scoreKor + "���Դϴ�.");
			throw new ScoreKorException("���� �߻�: ȹ�� ������ 0������ 100������ �Դϴ�.");
		}else if(scoreEng < 0 || scoreEng > 100 ) {
			System.out.println("�Է��Ͻ� ���� ������ " + this.scoreKor + "���Դϴ�.");
			throw new ScoreEngException("���� �߻�: ȹ�� ������ 0������ 100������ �Դϴ�.");
		}else if (userID.length() < 12 || userID.length() >20) {
			throw new UserIDException("���̵�� 12�� �̻� 20�� ���Ϸ� ��밡�� �մϴ�");
		}
		else {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
			System.out.println();
			this.season = season;
			this.week = week;
			this.scoreKor = scoreKor;
			this.scoreEng = scoreEng;
			this.userID = userID;
			System.out.println("�Է��Ͻ� �л��� ������ ������ �����ϴ�.");
			System.out.println();
			System.out.println("����: " + this.season);
			System.out.println("����: " + this.week);
			System.out.println("���� ����: " + this.scoreKor);
			System.out.println("���� ����: " + this.scoreEng);
			System.out.println("�л� ID: " + this.userID);
			
		}
	}

}



public class UserException_1 {

	public static void main(String[] args) {

		A a1 = new A();
		try {
			a1.studentInfo("��","��",100,100,"�ѵѼ³ݴٿ��Ͽ��ƿ��ѵѼ�");
		} catch (SeasonException | WeekException | ScoreKorException |ScoreEngException |UserIDException  e) {
			System.out.println(e.getMessage());
		}
		
	}

}
