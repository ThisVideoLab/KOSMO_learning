package EmployeeInfo;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

class EmployeeInfoHashSet{

	private static TreeSet<EmployeeInfo> employeeInfoHashSet = new TreeSet<>();

	public static TreeSet<EmployeeInfo> getEmployeeInfoHashSet() {
		return employeeInfoHashSet;
	}

	public static void setEmployeeInfoHashSet(TreeSet<EmployeeInfo> employeeInfoHashSet) {
		EmployeeInfoHashSet.employeeInfoHashSet = employeeInfoHashSet;
	}

	public boolean checkEmployeeInfo(int inputID) {
		return false;
	}
}

class EmployeeInfo extends EmployeeInfoHashSet{
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
	public String toString() {
		return empNo + empName + age + depart + rank + phone ;
	}
	
}

public class EmployeeInfoSystem extends EmployeeInfoHashSet{
	
	public static Scanner scan = new Scanner(System.in);
	
	private void createNewEmpInfo() { // 코드 작성: 1. 계좌생성 스캐너로 1.계좌번호2.이름 .초기 통장 금액 입력
		
		System.out.println("Please enter a new employee ID not in use. It must be four digit number.");
		
		new EmployeeInfoHashSet();
		int empNo = 0;
		boolean run = true;
		
		while(run) {
			int inputID = scan.nextInt();
			if (checkEmployeeInfo(inputID)) {
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
		
		EmployeeInfo EmployeeInfoHashSet = new EmployeeInfo(empNo, empName, age, depart, rank, phone);
		 TreeSet <EmployeeInfo> tmep = EmployeeInfoHashSet;

		
	}
	
	public static void main(String[] args) {

		//1. define run() method
				boolean run = true;
				EmployeeInfoSystem empSystem = new EmployeeInfoSystem();
				while (run) {
					
					System.out.println("------------------------------------------------------------------------------------------------");
					System.out.println("| 1. Create Account | 2. Account list | 3. Deposit | 4. withdraw | 5. account search | 6. exit |");
					System.out.println("------------------------------------------------------------------------------------------------");
					
					System.out.println("Please enter the menu number");
					int selectNO = scan.nextInt(); // 메뉴 선택 스캐너
							
					if(selectNO == 1 ) { // 코드 작성
						empSystem.createNewEmpInfo(); // 메서드 명으로 호출
					}
					else if(selectNO == 2 ) {
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
