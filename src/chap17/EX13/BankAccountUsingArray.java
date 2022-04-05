package chap17.EX13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

class Account extends BankAccountArray{
	private String anum; // account number
	private String owner; // owner of account
	private int balance; // amount of money in the account
	
	public Account (String anum, String owner, int balance) {
		this.anum = anum;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAnum() {
		return anum;
	}
	public void setAnum(String anum) {
		this.anum = anum;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString(){
		return " account number: " + anum + " | owner: " + owner + " | blance: " + balance;
	}
}

class BankAccountArray{
	
}

public class BankAccountUsingArray {
	
	private static Account[] actArr = new Account[100];// �迭�� ����ؼ� Account ���� ���
	private static Scanner scan = new Scanner(System.in);
	
	private static ArrayList<Account> accountlist = new ArrayList<Account>();
	private static HashSet<String> anumSet = new HashSet<>();
	
	private static void createAccount() {
		// �ڵ� �ۼ�: 1. ���»��� ��ĳ�ʷ� 1.���¹�ȣ2.�̸� .�ʱ� ���� �ݾ� �Է�
		// �迭 ��ü�� ������
		
		System.out.println("Please enter your new bank account number");
		String input = "";
		Boolean run =true;
		while(run) {
			input = scan.next();
			if(anumSet.contains(input)){
				System.out.println("The enterd account number is incorrect.");
				System.out.println("Please enter correct account number.");
			}else {
				run=false;
			}
        }
		anumSet.add(input);
		
		System.out.println("Please enter the name of account owner");
		String owner = scan.next();
		
		System.out.println("Please set the initial balance of"  + "account");
		int balance = scan.nextInt();
		
		accountlist.add(new Account(input, owner, balance));
		System.out.println("The information you entered is as follows.");
		System.out.println(" account number: " + input + " | owner: " + owner + " | blance: " + balance);
		System.out.println();
	}
	private static void accountList() {
		// �迭�� ����� ��ü�� ������ �� ��������.
		// ���� ��� ��� ���¹�ȣ �̸� �ݾ��� ���� ���
		for(int i = 0; i< accountlist.size(); i++) {
			System.out.println(accountlist.get(i));
		}
		System.out.println();
	}
	private static void deposit() {
		// ���¹�ȣ �Է¹ޱ�
		int balNum = 0;
		
		String input = "";
		Boolean run =true;
		int deposit=0;
		System.out.println("please enter the account number to withdraw.");
		
		// ���¹�ȣ�� ����Ʈ�� �����ϴ��� Ȯ�ΰ� index ��ȣ �ޱ�
		while(run) {
			input = scan.next();
			
			for (int i = 0; i< accountlist.size(); i++) { // ��� �濡 ���ؼ� �˻� ����
				Account tempList = accountlist.get(i);
				if(tempList.getAnum().equals(input)){
					balNum = i;
					run=false;
				}else {
				System.out.println("The enterd account number is incorrect.");
				System.out.println("Please enter correct account number.");
				}
			}
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
		System.out.println("please enter the account number to withdraw.");
		
		// ���¹�ȣ�� ����Ʈ�� �����ϴ��� Ȯ�ΰ� index ��ȣ �ޱ�
		while(run) {
			input = scan.next();
			
			for (int i = 0; i< accountlist.size(); i++) { // ��� �濡 ���ؼ� �˻� ����
				Account tempList = accountlist.get(i);
				if(tempList.getAnum().equals(input)){
					balNum = i;
					run=false;
				}else {
				System.out.println("The enterd account number is incorrect.");
				System.out.println("Please enter correct account number.");
				}
			}
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
	private static Account findAccount(String anb) {
		Account account = null ; 
		//�ڵ� �ۼ� 
		return account; 
	}
	
	
	public static void main(String[] args) {

		//1. define run() method
		boolean run = true;
		while (run) {
			
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("| 1. Create Account | 2. Account list | 3. Deposit | 4. withdraw | 5. exit |");
			System.out.println("----------------------------------------------------------------------------");
			
			System.out.println("Please enter the menu number");
			int selectNO = scan.nextInt(); // �޴� ���� ��ĳ��
					
			if(selectNO == 1 ) {
				createAccount();
			}
			else if(selectNO == 2 ) {
				accountList();
			}
			else if(selectNO == 3 ) {
				deposit();
			}
			else if(selectNO == 4 ) {
				withdraw();
			}
			else if(selectNO == 5 ) {
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("|       Thank you for visiting our banks. Your best bank, KOSMO Bank       |");
				System.out.println("----------------------------------------------------------------------------");
				run = false; // break ����
			}
		}
	//end of document
	}
}
