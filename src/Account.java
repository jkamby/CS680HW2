package edu.umb.cs.cs680.account;

public abstract class Account {
	protected float balance;
	
	public Account(float bal) {
		this.balance = bal;
	}
	
	public float getBalance() {
		return this.balance;
	}
	
	public void deposit(float d) {
		this.balance += d;
	}
	
	public abstract void withdraw(float w) throws InsufficientFundsException;
	
	public abstract float computeTax();
		

}
