package edu.umb.cs.cs680.account;

public class SavingsAccount extends Account {

	public SavingsAccount(float bal) {
		super(bal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float w) throws InsufficientFundsException {
		if((this.balance - w) > 0) 
			this.balance -= w;
		else
			throw new InsufficientFundsException("You do not have enough money in your Savings.");
	}

	@Override
	public float computeTax() {
		// TODO Auto-generated method stub
		return 0;
	}

}
