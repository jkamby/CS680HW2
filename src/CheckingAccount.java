package edu.umb.cs.cs680.account;

public class CheckingAccount extends Account {
	
	protected SavingsAccount savingsAccnt;

	public CheckingAccount(float bal, SavingsAccount savAccnt) {
		super(bal);
		this.savingsAccnt = savAccnt;
		// TODO Auto-generated constructor stub
	}
	
	public CheckingAccount(float bal) {
		super(bal);
		this.savingsAccnt = null;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float w) throws InsufficientFundsException {
		if((this.balance - w) > 0) 
			this.balance -= w;
		else
			try {
				if(savingsAccnt.getBalance() + this.balance - w > 0)
					this.balance -= w + 50; // $50 penalty charge
				else
					throw new InsufficientFundsException("You're really broke! Not enough in your Savings.");
			} catch(NullPointerException e) {
				System.err.println(e.getMessage());
				throw new InsufficientFundsException(" You're finished! No money in the Checking and you do not even have a Savings Account.", e);
			}
	}

	@Override
	public float computeTax() {
		// TODO Auto-generated method stub
		return 0;
	}

}
