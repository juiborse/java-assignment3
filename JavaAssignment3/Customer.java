package bank_account_system;

public class Customer {
	
	String name;
	String add;
	String moNum;
	Account acc;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String add, String moNum, Account acc) {
		super();
		this.name = name;
		this.add = add;
		this.moNum = moNum;
		this.acc = acc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getMoNum() {
		return moNum;
	}

	public void setMoNum(String moNum) {
		this.moNum = moNum;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void withdraw(double amt)
	{
		acc.withdraw(amt);
	}
	
	public void deposit(double amt)
	{
		acc.deposit(amt);
	}
	
	public void display()
	{
		System.out.println("Name of Customer :"+name);
		System.out.println("Address : "+add);
		System.out.println("Contact No : "+moNum);
		System.out.println("Account no : "+acc.accNo);
		System.out.println("Account bal : "+acc.accBal);
	}
	
	public void fundTansfer(Account acc1,double amt)
	{
		if(this.acc.getBalance()>amt)
		{
			this.acc.withdraw(amt);
			System.out.println("Amount Withdrwan Successfully!!!");
			acc1.deposit(amt);
			System.out.println("Amount Transfered Successfully!!!");
		}
		
	}
		
	

}
