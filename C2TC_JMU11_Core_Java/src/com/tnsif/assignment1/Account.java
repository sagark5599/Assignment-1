package com.tnsif.assignment1;

public abstract class Account {
	public double balance;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	abstract void deposit(double balance);
	
	abstract void withdraw(double balance);
	
	abstract double getBalance();
	
	void display() {
		System.out.println("Your account balance is:"+getBalance());
	}
}

class SavingsAcc extends Account{
	public SavingsAcc(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void deposit(double amt) {
		balance += amt;
		System.out.println("Your amount has been deposited....");
		
	}

	@Override
	void withdraw(double amt) {
		if (amt<=balance){
			balance -= amt;
			System.out.println("Withdrawal successful");
		}
		if (amt>balance) {
			System.out.println("Invalid Operation");
		}
	}

	@Override
	double getBalance() {
		return balance;
	}

}
class CheckingAcc extends Account{

	public CheckingAcc(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void deposit(double amt) {
		balance += amt;
		System.out.println("Amount deposited");
		
	}

	@Override
	void withdraw(double amt) {
		if (amt<=balance){
			balance -= amt;
			System.out.println("Withdrawal successful");
		}
		if (amt>balance) {
			System.out.println("Invalid withdrawal amount");
		}
	}

	@Override
	double getBalance() {
		return balance;
	}
	
}

class AccountAbstractDemo {
	public static void main(String[] args)
	{
		SavingsAcc sa = new SavingsAcc(10000.000);
		CheckingAcc ca = new CheckingAcc(500.000);
		
		sa.deposit(40000.00);
		sa.withdraw(4000.00);
		
		
		ca.deposit(12000.00);
		ca.withdraw(100.00);
		
		
		ca.display();
		sa.display();
	}
}