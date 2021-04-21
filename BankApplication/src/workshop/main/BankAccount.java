package workshop.main;

import java.util.Scanner;

public class BankAccount {
	//int amount;
	int balance;
	int lastTransaction;
	String customerName;
	String customerId;
	

	public BankAccount(String customerName, String customerId) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
	}


	void deposit(int amount) {
		if(amount>0) {
			balance = balance + amount;
			lastTransaction = amount;
		}

	}

	void withdraw(int amount) {
		if(amount>0) {
			balance = balance - amount;
			lastTransaction = -amount;
		}

	}

	void getLastTransaction() {
		if(lastTransaction>0) {
			System.out.println("Deposited :"+lastTransaction);
			System.out.println("\n");
		}
		else if(lastTransaction<0) {
			System.out.println("Withdrawn :"+Math.abs(lastTransaction));
			System.out.println("\n");
		}
		else {
			System.out.println("No transactions found to show.");
			System.out.println("\n");
		}

	}
	
	void showMenu() {
		System.out.println("Z Bank");
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome "+customerName);
		System.out.println("Your ID is :"+customerId);
		System.out.println("\n");
		System.out.println("==========================================");
		System.out.println("A. Check balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Check Last Transaction");
		System.out.println("E. Exit");
		System.out.println("==========================================");
		System.out.println("\n");
		
		do {
			System.out.println("Enter and Option");
			option= scanner.next().charAt(0);
			//System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				
				System.out.println("Balance is :"+balance);
				System.out.println("\n");
				System.out.println("******************************************");
				break;
				
			case 'B':
				
				System.out.println("Enter amount to deposit :");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				System.out.println("New Balance is :"+balance);
				System.out.println("******************************************");
				break;
				
			case 'C':
				
				System.out.println("Enter amount to withdraw");
				int amount1 = scanner.nextInt();
				withdraw(amount1);
				System.out.println("\n");
				System.out.println("New Balance is :"+balance);
				System.out.println("******************************************");
				break;
				
			case 'D':
				
				System.out.println("Balance is :"+balance);
				getLastTransaction();
				System.out.println("\n");
				System.out.println("******************************************");
				break;
				
			case 'E':
				System.out.println("******************************************");
				System.exit(option);
				System.out.println("\n");
				break;
			}
			
		}while(option!='E');
		
	}
}

