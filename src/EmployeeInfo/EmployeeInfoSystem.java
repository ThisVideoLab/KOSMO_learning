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
	private int empNo; // �����ȣ
	private String empName; // ����̸�
	private int age; // ����
	private String depart; // �μ�
	private String rank; // ����
	private int phone; // ��ȭ��ȣ
	
	public EmployeeInfo(int empNo, String empName, int age, String depart, String rank, int phone) { // �����ڸ� ���ؼ� �ʵ��� ���� �Ҵ�
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
	
	private void createNewEmpInfo() { // �ڵ� �ۼ�: 1. ���»��� ��ĳ�ʷ� 1.���¹�ȣ2.�̸� .�ʱ� ���� �ݾ� �Է�
		
		System.out.println("Please enter a new employee ID not in use. It must be four digit number.");
		
		new EmployeeInfoHashSet();
		int empNo = 0;
		boolean run = true;
		
		while(run) {
			int inputID = scan.nextInt();
			if (checkEmployeeInfo(inputID)) {
				System.out.println("�ߺ��̿�");
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
					int selectNO = scan.nextInt(); // �޴� ���� ��ĳ��
							
					if(selectNO == 1 ) { // �ڵ� �ۼ�
						empSystem.createNewEmpInfo(); // �޼��� ������ ȣ��
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
						run = false; // break ����
					}
					else if(selectNO == 5 ) {
						//findAccount();
					}
				}
	// �����ǳ�
	}
}
