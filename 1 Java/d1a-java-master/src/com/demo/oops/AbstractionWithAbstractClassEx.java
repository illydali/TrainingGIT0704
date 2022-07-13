// abstract demo
package com.demo.oops;

public class AbstractionWithAbstractClassEx {
	public static void main(String[] args) {
//	Account account = null;
//	Cannot instantiate the type Account
//	account = new Account();

		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.displayBankDetails();
		savingsAccount.dispalyAccountInfo();
		savingsAccount.withdraw();

		System.out.println("******************");
		
		Account account = null;
		account = new SavingsAccount();
		account.displayBankDetails();
		account.dispalyAccountInfo();
//		The method withdraw() is undefined for the type Account
//		account.withdraw();
	}
}

abstract class Account {
	// Abstract classes represent abstract concepts of ideas.
	// abstract class can have abstract methods and concrete methods (methods with
	// body)
//	abstract method / no body
	public abstract void dispalyAccountInfo();

// concrete methods / with body
	public void displayBankDetails() {
		System.err.println("Bank of Singapore");
	}
}

// inherit the abstract class
// SavingsAccount is a Account
class SavingsAccount extends Account {
//	override the abstract method
	@Override
	public void dispalyAccountInfo() {
		System.err.println("Savings Account");
	}
	public void withdraw() {
		System.err.println("Withdraw money from savings account....");
	}
}