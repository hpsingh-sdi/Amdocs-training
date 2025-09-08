package amdocs_pkg;

abstract class BankAccount{
	String accountNumber;
	double balance;
	
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	abstract void displayAccountInfo();
	
	double getBalance() {
		return balance;
	}
}

class SavingAccount extends BankAccount{
	SavingAccount(String accountNumber){
		this.accountNumber = accountNumber;
	}
	void deposit(double amount) {
		balance += amount;
	}
	void deposit(double amount, String note) {
		balance += amount;
		System.out.println(note);
	}
	
	void withdraw(double amount) {
		if(balance-amount<500) {
			System.out.println("Insufficient balance!");
		}
		else {
			balance -= amount;
		}
	}
	void displayAccountInfo() {
		System.out.println("A/C No: "+accountNumber);
		System.out.println("Current Balance : "+balance);
	}
}

class CurrentAccount extends BankAccount{
	CurrentAccount(String accountNumber){
		this.accountNumber = accountNumber;
	}
	void deposit(double amount) {
		balance += amount;
	}
	
	void withdraw(double amount) {
		if(balance-amount<500) {
			System.out.println("Insufficient balance!");
		}
		else {
			balance -= amount;
		}
	}
	void displayAccountInfo() {
		System.out.println("A/C No: "+accountNumber);
		System.out.println("Current Balance : "+balance);
	}
}

public class Bank {
	static void printAccountDetails(BankAccount account) {
		account.displayAccountInfo();
	}
	
	public static void main (String args[]) {
		BankAccount sa = new SavingAccount("1234");
		BankAccount ca = new CurrentAccount("4321");
		
		sa.deposit(2000);
		ca.deposit(3000);
		
		sa.withdraw(200);
		
		printAccountDetails(sa);
		printAccountDetails(ca);
	}
}
