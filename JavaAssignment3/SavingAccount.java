package java_assignment_3;

public class SavingAccount {
	
	private static double annualInterest = 0.03;
	private double bal,newBal;
	private String acNo;
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(double bal, String acNo) {
		super();
		this.bal = bal;
		this.acNo = acNo;
		newBal=bal+calMonthlyInterest(); 
	}
	
	public double calMonthlyInterest()
	{
		
		return ((bal*annualInterest)/12);
	}
	
	public static void modifyInterestRate(double IntersestRate)
	{
		SavingAccount.annualInterest=IntersestRate;
	}
	
	public void showDetails()
	{
		System.out.println("\n*******Account Details*******");
		System.out.println("Ac no :"+acNo);
		System.out.println("Initial Bal : "+bal);
		System.out.println("Annual Interest Rate : "+annualInterest);
		System.out.println("Total Interest Rate : "+calMonthlyInterest());
		System.out.println("Updated Account bal : "+newBal);
	}


	
	
	
	

}
