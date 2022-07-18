package com.demo.oops;

public class AbstractionWithInterfaceEx {
	public static void main(String[] args) {
//	Account account = null;
//	Cannot instantiate the type Account
//	account = new Account();

		SavingsAccount1 savingsAccount1 = new SavingsAccount1();
		savingsAccount1.dispalyAccountInfo();
		savingsAccount1.withdraw();
		savingsAccount1.transferAmount();
		savingsAccount1.checkAccountBalance();

		System.out.println("******************");
		
		Account account = null;
		account = new SavingsAccount();
		account.displayBankDetails();
		account.dispalyAccountInfo();
//		The method withdraw() is undefined for the type Account
//		account.withdraw();
		
		System.out.println("******************");
//		NetBanking netBanking = new NetBanking();
		NetBanking netBanking = new SavingsAccount1();
		netBanking.checkAccountBalance();
		netBanking.transferAmount();
		netBanking.dispalyAccountInfo();
//		The method withdraw() is undefined for the type NetBanking
//		netBanking.withdraw();
		
		System.out.println("******************");
		DebitCard1 debitCard1 = new SavingsAccount1();
		debitCard1.checkAccountBalance();
		debitCard1.withdraw();
//		The method transferAmount() is undefined for the type DebitCard1
//		debitCard1.transferAmount();
	}
}

interface NetBanking {
	public abstract void dispalyAccountInfo();
	abstract void transferAmount();
	public void checkAccountBalance();
}

interface DebitCard1 {

	public void checkAccountBalance();
	public void withdraw();
}
// inherit the abstract class
// SavingsAccount is a Account
class SavingsAccount1 implements NetBanking, DebitCard1{
	public void withdraw() {
		System.err.println("Withdraw money from savings account....");
	}
	@Override
//	override the abstract method
	public void dispalyAccountInfo() {
		System.err.println("Savings Account");
	}
	@Override
	public void transferAmount() {
		System.out.println("Transfer amount from Savings Bank Account using NetBanking");
	}
	@Override
	public void checkAccountBalance() {
		System.out.println("Check balance amount from Savings Bank Account");
	}
}