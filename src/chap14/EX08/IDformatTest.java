package chap14.EX08;

//ID ���� NULL�� ���� ��쿡 Exception�� �߻���.
//userID �� 8�� �̻� 20�� ���ϰ� �ƴ� ��쿡 Exception ó������. �� ����� java���� ���� �����ϴ� ���� �ƴ϶� ������ ��������� ��.

class IDFormatException extends Exception {// 2���� �����ڸ� ����
	public IDFormatException(){
		super();
	}
	public IDFormatException(String message) { // ���� �߻��� String ������ �� ���ܸ޽��� e.message()�� ��µ�.
		super(message);
	}
}

public class IDformatTest {
	private String userID ; // üũ���� : null ���̳� 8�� �̻� 20�ڰ� �ƴ� ��쿡 Exception ó��
		// userID�� private ���������ڷ� ���� ĸ��ȭ �Ǿ��ִ� ���·�, �ܺγ� �ٸ� Ŭ�������� ���� �Ұ���. ���ο����� ���� ������.
		// ������ setter�� ����ؼ� ���� �Ҵ��ؼ� ������ �� �ְ� ��.	
		// private���� ������ ��쿡�� getter�� setter�� ���ؼ� �� ���� �Է��ϰų� �ҷ��� �� ����.
	
	public String getUserID() { // �޼ҵ� ȣ��� �޸��� userID�� ������
		return userID;
	}
	
	public void setUserID (String userID) throws IDFormatException{
		if (userID == null) {
			throw new IDFormatException("���̵�� null �� �� �����ϴ�");
		}else if(userID.length() < 8 || userID.length() >20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ��밡�� �մϴ�");
		}else {
			System.out.println("ID�� �� �ԷµǾ����ϴ�.");
		}
		
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		IDformatTest test = new IDformatTest();
		
		//1. userID�� null�� ���
		String userID = null;
		try {
			test.setUserID(userID);
		}catch (IDFormatException e){
			System.out.println(e.getMessage());
		}
		System.out.println("====================");
		
		//2. userID�� 7�ڸ��� ��� ( ���� ����)
		
		userID = "1234567";
		
		try {
			test.setUserID(userID);
		}catch (IDFormatException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("====================");
		
		//3. userID�� 7�ڸ��̻� 20�ڸ� ������ ��� ( ���� ����)
		
				userID = "12sdf34567";
				
				try {
					test.setUserID(userID);
				}catch (IDFormatException e){
					System.out.println(e.getMessage());
				}
				System.out.println("�Է��Ͻ� ID�� " + test.getUserID() + " �Դϴ�.");
		
		
		// ������ ��
	}

}
