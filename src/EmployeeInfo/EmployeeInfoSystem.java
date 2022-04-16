package EmployeeInfo;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

class EmployeeInfoHashSet{
	private TreeSet<EmployeeInfo> employeeInfoHashSet;
	public EmployeeInfoHashSet () { // 매개변수의 값이 없는 기본 생성자.
		employeeInfoHashSet = new TreeSet<EmployeeInfo>();
	}
	public void addEmployeeInfo(EmployeeInfo employeeInfo) {
		employeeInfoHashSet.add(employeeInfo);
	} 
	
	public TreeSet<EmployeeInfo> getEmployeeInfoHashSet() {
		return employeeInfoHashSet;
	}
	
	public void setEmployeeInfoHashSet(TreeSet<EmployeeInfo> employeeInfoHashSet) {
		this.employeeInfoHashSet = employeeInfoHashSet;
	}
	public boolean checkEmployeeInfo(int inputID) {
		// TODO Auto-generated method stub
		return false;
	}
}

class EmployeeInfo extends EmployeeInfoHashSet implements Comparable<EmployeeInfo>{
	private int empNo; // 사원번호
	private String empName; // 사원이름
	private int age; // 연령
	private String depart; // 부서
	private String rank; // 직급
	private int phone; // 전화번호
	
	public EmployeeInfo(int empNo, String empName, int age, String depart, String rank, int phone) { // 생성자를 통해서 필드의 값을 할당
		this.empNo = empNo; this.empName = empName; this.age = age; this.depart = depart; this.rank = rank; this.phone = phone;
	}

	public int getEmpNo() {return empNo;}
	public void setEmpNo(int empNo) {this.empNo = empNo;}
	
	public String getEmpName() {return empName;}
	public void setEmpName(String empName) {this.empName = empName;}

	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}

	public String getDepart() {return depart;}
	public void setDepart(String depart) {this.depart = depart;}

	public String getRank() {return rank;}
	public void setRank(String rank) {this.rank = rank;}

	public int getPhone() {return phone;}
	public void setPhone(int phone) {this.phone = phone;}

	@Override
	public int compareTo(EmployeeInfo o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class EmployeeInfoSystem extends EmployeeInfoHashSet{
	
	TreeSet<EmployeeInfo> employeeInfoHashSet = new TreeSet<EmployeeInfo>(); 
	private static Scanner scan = new Scanner(System.in);

	/*
	@Override
	public boolean checkEmployeeInfo(int empNo) {
		return super.checkEmployeeInfo(empNo);
	}
	*/
	public boolean checkEmployeeInfo(int empNo) { // memberId는 Member 객체 내의 필드이므로 set에 저장된 객체를 가져와야 함.
		boolean result = false;
		Iterator <EmployeeInfo> iterator = employeeInfoHashSet.iterator(); // 클래스 <E> 참조객제 = set객체.itorator(); 
		while(iterator.hasNext()) {
			EmployeeInfo list =iterator.next();
			System.out.println(list.getEmpNo());
			if(list.getEmpNo() == empNo){
				System.out.println("중복ㄷ입네다");
				System.out.println("단디 하이소");
				result = true;
			}else {
				result = false;
			}
		}
		return result;
	}
	
	private void createNewEmpInfo() { // 코드 작성: 1. 계좌생성 스캐너로 1.계좌번호2.이름 .초기 통장 금액 입력
		
		System.out.println("Please enter a new employee ID not in use. It must be four digit number.");
		
		int empNo = 0;
		boolean run = true;
		
		while(run) {
			int inputID = scan.nextInt();
			
			if (super.checkEmployeeInfo(inputID)) {
				System.out.println("중복이여");
			}else{
				empNo = inputID;
				break;
			}
		}
		
		System.out.println("Please enter the name of employee.");
		String empName = scan.next();
		
		System.out.println("Please enter the " + empName + " (ID: " + empNo +")'s age."); 
		int age = scan.nextInt();
		
		System.out.println("Please enter the " + empName + " (ID: " + empNo +")'s department."); 
		String depart = scan.next();
		
		System.out.println("Please enter the " + empName + " (ID: " + empNo +")'s rank."); 
		String rank = scan.next();
		
		System.out.println("Please enter the " + empName + " (ID: " + empNo +")'s celphone number without hyphen(-)."); 
		int phone = scan.nextInt();
		
		System.out.println("앵커1");
		
		System.out.println("앵커2");
		
		EmployeeInfo newEmp = new EmployeeInfo(empNo, empName, age, depart, rank, phone);
		
		super.addEmployeeInfo(newEmp);
		
		System.out.println("앵커3");
		
		System.out.println(toString());
	}
	
	
	
	



	private static void accountList() { // 코드작성2. 배열에 저장된 객체를 꺼내서 쭉 나열해줌.
		// 계좌 목록 출력 계좌번호 이름 금액을 쭉쭉 출력
		// 그냥 투스트링 활용해서 최대한 작성해보도록
		
	// empInfoHashSet.toString(); 
	}
	/*
	private static void deposit() {
		// 계좌번호 입력받기
			int balNum = 0;
			
			String input = "";
			Boolean run =true;
			int deposit=0;
			int k = 0;
			System.out.println("please enter the account number to deposit.");
			
			// 계좌번호가 리스트에 존재하는지 확인고 index 번호 받기
			while(run) {
				if(k>0) {
					System.out.println("The enterd account number is incorrect.");
					System.out.println("Please enter correct account number.");
				}
				input = scan.next();
				for (int i = 0; i< accountlist.size(); i++) { // 모든 방에 대해서 검사 실행
					Account tempList = accountlist.get(i);
					if(tempList.getAnum().equals(input)){
						balNum = i;
						run=false;
					}
				}
				k++;
			}
		//계좌금액 불러오기
		Account curBal = accountlist.get(balNum);
		curBal.getBalance();
		
		// 금액입력받기
		System.out.println("Enter the amount to be depositted");
		run = true;
		while(run){
			deposit = scan.nextInt();
			if(deposit < 0){
				System.out.println("The enterd amount is incorrect.");
				System.out.println("Please enter correct account amount.");
			}else {
				run=false;
			}
		}
		
		//정산하기
		curBal.setBalance(curBal.getBalance() + deposit);
		System.out.println("The deposit amount is $" + deposit + ". The balance is $" + curBal.getBalance()+ ".");
		System.out.println();
	}
	private static void withdraw() {
		// 계좌번호 입력받기
		int balNum = 0;
		
		String input = "";
		Boolean run =true;
		int debit=0;
		int k = 0;
		System.out.println("please enter the account number to withdraw.");
		
		// 계좌번호가 리스트에 존재하는지 확인고 index 번호 받기
		while(run) {
			if(k>0) {
				System.out.println("The enterd account number is incorrect.");
				System.out.println("Please enter correct account number.");
			}
			input = scan.next();
			for (int i = 0; i< accountlist.size(); i++) { // 모든 방에 대해서 검사 실행
				Account tempList = accountlist.get(i);
				if(tempList.getAnum().equals(input)){
					balNum = i;
					run=false;
				}
			}
			k++;
		}
		
		//계좌금액 불러오기
		Account curBal = accountlist.get(balNum);
		curBal.getBalance();
		
		// 금액입력받기
		System.out.println("Enter the amount to be withdrawn");
		run = true;
		while(run){
			debit = scan.nextInt();
			if(debit < 0){
				System.out.println("The enterd amount is incorrect.");
				System.out.println("Please enter correct account amount.");
			}else {
				run=false;
			}
		}
		
		//정산하기
		curBal.setBalance(curBal.getBalance() - debit);
		System.out.println("The withdrawal amount is $" + debit + ". The balance is $" + curBal.getBalance()+ ".");
		System.out.println();
	}
	
	// 배열에서 Account 객체 내의 ano[계좌번호]와 동일한 계좌를 찾아서 찾은 객체를 리턴으로 돌려줌.
	
	private static void findAccount() { // 이 파트를 못보고 지나쳐서 각 부분에 구현해줌 .이미 findAccount 기능이 각 부분에 구현되이 었어서
										// 이 부분을 검색기능으로 추가하기로 변경 바로 문구를 출력할 수 있도록 반환 타입을 void로 바꿔줌.
		Account account = null ; 
		//코드 작성 
		int balNum = 0;
		String input = "";
		Boolean run =true;
		int k = 0;
		System.out.println("please enter the account number to search.");
		
		// 계좌번호가 리스트에 존재하는지 확인고 index 번호 받기
		while(run) {
			if(k>0) {
				System.out.println("The enterd account number is incorrect.");
				System.out.println("Please enter correct account number.");
			}
			input = scan.next();
			for (int i = 0; i< accountlist.size(); i++) { // 모든 방에 대해서 검사 실행
				account = accountlist.get(i);
				if(account.getAnum().equals(input)){
					balNum = i;
					run=false;
					
				}
			}
			k++;
		}
		account = accountlist.get(balNum); // 여기까지 얻은 결과를 리턴값으로 출력하면 기존에 요구한 기능 구현이 완료됨.
		System.out.println();
		System.out.println(account);
		System.out.println();
		
	} 

*/
	
	public static void main(String[] args) {

		//1. define run() method
				boolean run = true;
				EmployeeInfoSystem system = new EmployeeInfoSystem();
				
				while (run) {
					
					System.out.println("------------------------------------------------------------------------------------------------");
					System.out.println("| 1. Create Account | 2. Account list | 3. Deposit | 4. withdraw | 5. account search | 6. exit |");
					System.out.println("------------------------------------------------------------------------------------------------");
					
					System.out.println("Please enter the menu number");
					int selectNO = scan.nextInt(); // 메뉴 선택 스캐너
							
					if(selectNO == 1 ) { // 코드 작성
						system.createNewEmpInfo(); // 메서드 명으로 호출
					}
					else if(selectNO == 2 ) {
						system.accountList();
					}
					else if(selectNO == 3 ) {
						//deposit();
					}
					else if(selectNO == 4 ) {
						//withdraw();
					}
					else if(selectNO == 6 ) {
						System.out.println("------------------------------------------------------------------------------------------------");
						System.out.println("|                 Thank you for visiting our banks. Your best bank, KOSMO Bank                 |");
						System.out.println("------------------------------------------------------------------------------------------------");
						run = false; // break 구문
					}
					else if(selectNO == 5 ) {
						//findAccount();
					}
				}
	// 문서의끝
	}
}
