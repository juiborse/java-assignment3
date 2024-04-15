package java_assignment_3;

public class TestSavingAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Saver 1");
		SavingAccount savingAccount = new SavingAccount(2000, "12345");
		savingAccount.calMonthlyInterest();
		savingAccount.showDetails();
		System.out.println("\n______________________________________________________\n");
		System.out.println("\nSaver 2");
		SavingAccount savingAccount2 = new SavingAccount(3000, "982346");
		savingAccount2.calMonthlyInterest();
		savingAccount2.showDetails();
		
		System.out.println("\n______________________________________________________\n");
		System.out.println("after modifiing interest rate");
		savingAccount.modifyInterestRate(0.04);
		System.out.println("Saver 1");
		SavingAccount savingAccount3 = new SavingAccount(2000, "12345");
		savingAccount3.calMonthlyInterest();
		savingAccount3.showDetails();
		System.out.println("\n______________________________________________________\n");
		System.out.println("\nSaver 2");
		SavingAccount savingAccount4 = new SavingAccount(3000, "982346");
		savingAccount4.calMonthlyInterest();
		savingAccount4.showDetails();
		
		

	}

}
