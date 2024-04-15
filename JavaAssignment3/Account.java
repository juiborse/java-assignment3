package bank_account_system;

public class Account {

	long accNo;
	double accBal;
	
	public Account(long accNo) {
		this.accNo=accNo;
		this.accBal=0;
}
	
	public void withdraw(double amt)
	{
		if(accBal>amt)
		{
			accBal-=amt;
			System.out.println("Amount Withdrwad Successfully");
		}
		else
			System.out.println("Insufficient bal");
	}
	
	public void deposit(double amt){
		if(amt>0)
		{
			accBal+=amt;
			System.out.println("Amount Deposited Successfully");
		}
		else
			System.out.println("Amount cannot be negative");
	}
	
	public void display()
	{
		System.out.println("Account No = "+accNo);
		System.out.println("Account bal = "+accBal);
	}
	 
	public double getBalance()
	{
		return accBal;
	}
}
