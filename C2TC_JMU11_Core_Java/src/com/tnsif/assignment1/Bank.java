package com.tnsif.assignment1;

public class Bank {
static private int totalAccounts = 0;
	
	public Bank() {
		totalAccounts ++;
	}
	
	
	public static int getTotalAccounts() {
		return totalAccounts;
	}
}

class BankExecutor {
	public static void main(String[] args) {
		Bank acc1 = new Bank();
		Bank acc2 = new Bank();
		Bank acc3 = new Bank();
		Bank acc4 = new Bank();
		
		//display total number of bank accounts
		System.out.println("Number of accounts are:" +Bank.getTotalAccounts());

	}
}