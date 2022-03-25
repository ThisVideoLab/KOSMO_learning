package chap14.EX08;

//ID 값을 NULL을 넣을 경우에 Exception이 발생함.
//userID 가 8자 이상 20자 이하가 아닌 경우에 Exception 처리해줌. 이 기능은 java에서 직접 제공하는 것이 아니라 유저가 구현해줘야 함.

class IDFormatException extends Exception {// 2개의 생성자만 구성
	public IDFormatException(){
		super();
	}
	public IDFormatException(String message) { // 예외 발생시 String 값으로 된 예외메시지 e.message()가 출력됨.
		super(message);
	}
}

public class IDformatTest {
	private String userID ; // 체크사항 : null 값이나 8자 이상 20자가 아닌 경우에 Exception 처리
		// userID는 private 접근제어자로 인해 캡슐화 되어있는 상태로, 외부나 다른 클래스에서 접근 불가능. 내부에서만 접근 가능함.
		// 생성자 setter를 사용해서 값을 할당해서 제어할 수 있게 됨.	
		// private으로 설정된 경우에는 getter나 setter를 통해서 그 값을 입력하거나 불러올 수 있음.
	
	public String getUserID() { // 메소드 호출시 메모리의 userID를 던져줌
		return userID;
	}
	
	public void setUserID (String userID) throws IDFormatException{
		if (userID == null) {
			throw new IDFormatException("아이디는 null 일 수 없습니다");
		}else if(userID.length() < 8 || userID.length() >20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 사용가능 합니다");
		}else {
			System.out.println("ID가 잘 입력되었습니다.");
		}
		
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		IDformatTest test = new IDformatTest();
		
		//1. userID가 null인 경우
		String userID = null;
		try {
			test.setUserID(userID);
		}catch (IDFormatException e){
			System.out.println(e.getMessage());
		}
		System.out.println("====================");
		
		//2. userID가 7자리인 경우 ( 기준 이하)
		
		userID = "1234567";
		
		try {
			test.setUserID(userID);
		}catch (IDFormatException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("====================");
		
		//3. userID가 7자리이상 20자리 이하인 경우 ( 기준 충족)
		
				userID = "12sdf34567";
				
				try {
					test.setUserID(userID);
				}catch (IDFormatException e){
					System.out.println(e.getMessage());
				}
				System.out.println("입력하신 ID는 " + test.getUserID() + " 입니다.");
		
		
		// 문서의 끝
	}

}
