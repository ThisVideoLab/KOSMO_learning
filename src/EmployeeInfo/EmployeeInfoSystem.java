package EmployeeInfo;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

class EmployeeInfoHashSet{
	private TreeSet<EmployeeInfo> employeeInfoHashSet;
	public EmployeeInfoHashSet () { // �Ű������� ���� ���� �⺻ ������.
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
	public boolean checkEmployeeInfo(int empNo) { // memberId�� Member ��ü ���� �ʵ��̹Ƿ� set�� ����� ��ü�� �����;� ��.
		boolean result = false;
		Iterator <EmployeeInfo> iterator = employeeInfoHashSet.iterator(); // Ŭ���� <E> �������� = set��ü.itorator(); 
		while(iterator.hasNext()) {
			EmployeeInfo list =iterator.next();
			System.out.println(list.getEmpNo());
			if(list.getEmpNo() == empNo){
				System.out.println("�ߺ����Գ״�");
				System.out.println("�ܵ� ���̼�");
				result = true;
			}else {
				result = false;
			}
		}
		return result;
	}
	
	private void createNewEmpInfo() { // �ڵ� �ۼ�: 1. ���»��� ��ĳ�ʷ� 1.���¹�ȣ2.�̸� .�ʱ� ���� �ݾ� �Է�
		
		System.out.println("Please enter a new employee ID not in use. It must be four digit number.");
		
		int empNo = 0;
		boolean run = true;
		
		while(run) {
			int inputID = scan.nextInt();
			
			if (super.checkEmployeeInfo(inputID)) {
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
		
		System.out.println("��Ŀ1");
		
		System.out.println("��Ŀ2");
		
		EmployeeInfo newEmp = new EmployeeInfo(empNo, empName, age, depart, rank, phone);
		
		super.addEmployeeInfo(newEmp);
		
		System.out.println("��Ŀ3");
		
		System.out.println(toString());
	}
	
	
	
	



	private static void accountList() { // �ڵ��ۼ�2. �迭�� ����� ��ü�� ������ �� ��������.
		// ���� ��� ��� ���¹�ȣ �̸� �ݾ��� ���� ���
		// �׳� ����Ʈ�� Ȱ���ؼ� �ִ��� �ۼ��غ�����
		
	// empInfoHashSet.toString(); 
	}
	/*
	private static void deposit() {
		// ���¹�ȣ �Է¹ޱ�
			int balNum = 0;
			
			String input = "";
			Boolean run =true;
			int deposit=0;
			int k = 0;
			System.out.println("please enter the account number to deposit.");
			
			// ���¹�ȣ�� ����Ʈ�� �����ϴ��� Ȯ�ΰ� index ��ȣ �ޱ�
			while(run) {
				if(k>0) {
					System.out.println("The enterd account number is incorrect.");
					System.out.println("Please enter correct account number.");
				}
				input = scan.next();
				for (int i = 0; i< accountlist.size(); i++) { // ��� �濡 ���ؼ� �˻� ����
					Account tempList = accountlist.get(i);
					if(tempList.getAnum().equals(input)){
						balNum = i;
						run=false;
					}
				}
				k++;
			}
		//���±ݾ� �ҷ�����
		Account curBal = accountlist.get(balNum);
		curBal.getBalance();
		
		// �ݾ��Է¹ޱ�
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
		
		//�����ϱ�
		curBal.setBalance(curBal.getBalance() + deposit);
		System.out.println("The deposit amount is $" + deposit + ". The balance is $" + curBal.getBalance()+ ".");
		System.out.println();
	}
	private static void withdraw() {
		// ���¹�ȣ �Է¹ޱ�
		int balNum = 0;
		
		String input = "";
		Boolean run =true;
		int debit=0;
		int k = 0;
		System.out.println("please enter the account number to withdraw.");
		
		// ���¹�ȣ�� ����Ʈ�� �����ϴ��� Ȯ�ΰ� index ��ȣ �ޱ�
		while(run) {
			if(k>0) {
				System.out.println("The enterd account number is incorrect.");
				System.out.println("Please enter correct account number.");
			}
			input = scan.next();
			for (int i = 0; i< accountlist.size(); i++) { // ��� �濡 ���ؼ� �˻� ����
				Account tempList = accountlist.get(i);
				if(tempList.getAnum().equals(input)){
					balNum = i;
					run=false;
				}
			}
			k++;
		}
		
		//���±ݾ� �ҷ�����
		Account curBal = accountlist.get(balNum);
		curBal.getBalance();
		
		// �ݾ��Է¹ޱ�
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
		
		//�����ϱ�
		curBal.setBalance(curBal.getBalance() - debit);
		System.out.println("The withdrawal amount is $" + debit + ". The balance is $" + curBal.getBalance()+ ".");
		System.out.println();
	}
	
	// �迭���� Account ��ü ���� ano[���¹�ȣ]�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
	
	private static void findAccount() { // �� ��Ʈ�� ������ �����ļ� �� �κп� �������� .�̹� findAccount ����� �� �κп� �������� ���
										// �� �κ��� �˻�������� �߰��ϱ�� ���� �ٷ� ������ ����� �� �ֵ��� ��ȯ Ÿ���� void�� �ٲ���.
		Account account = null ; 
		//�ڵ� �ۼ� 
		int balNum = 0;
		String input = "";
		Boolean run =true;
		int k = 0;
		System.out.println("please enter the account number to search.");
		
		// ���¹�ȣ�� ����Ʈ�� �����ϴ��� Ȯ�ΰ� index ��ȣ �ޱ�
		while(run) {
			if(k>0) {
				System.out.println("The enterd account number is incorrect.");
				System.out.println("Please enter correct account number.");
			}
			input = scan.next();
			for (int i = 0; i< accountlist.size(); i++) { // ��� �濡 ���ؼ� �˻� ����
				account = accountlist.get(i);
				if(account.getAnum().equals(input)){
					balNum = i;
					run=false;
					
				}
			}
			k++;
		}
		account = accountlist.get(balNum); // ������� ���� ����� ���ϰ����� ����ϸ� ������ �䱸�� ��� ������ �Ϸ��.
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
					int selectNO = scan.nextInt(); // �޴� ���� ��ĳ��
							
					if(selectNO == 1 ) { // �ڵ� �ۼ�
						system.createNewEmpInfo(); // �޼��� ������ ȣ��
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
						run = false; // break ����
					}
					else if(selectNO == 5 ) {
						//findAccount();
					}
				}
	// �����ǳ�
	}
}
