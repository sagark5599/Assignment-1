package com.tnsif.assignment1;

public class Transaction {
	
	final static float transactionFee = 3.00f;
	
	public final void performtransac() {
		System.out.println("Ongoing transaction.....");
		System.out.println("Transaction Completed!");
	}
	
	public static void main(String[] args) {
		Transaction t1 = new Transaction();
		t1.performtransac();
		System.out.println("Your free transactions are over so your transaction fee is:"+transactionFee);
	}
}