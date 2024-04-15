package bank_account_system;

import java.util.Scanner;

public class Bank {
	
	final String BANKNAME = "ICICI BANK";
	private static double interestRate = 0.3;
	Customer customer[];
	Account account[];
	int MAX=10;
	int size=0;
	
public Bank() {
	this.customer= new Customer[MAX];
	this.account= new Account[MAX];
	
}	
//method1
//public void addAccount()
//{
//	if(size<MAX)
//	{
//	System.out.println("Enter your name, contact no,Address , Acc no");
//	Scanner sc = new Scanner(System.in);
//	String name = sc.nextLine();
//	String Address = sc.nextLine();
//	String ContactNo = sc.nextLine();
//	long AcNO = sc.nextLong();
//	account[size]=new Account(AcNO);
//	customer[size]=new Customer(name, Address, ContactNo,account[size]);
//	size++;
//	}
//	else 
//	{
//		System.out.println("Error!! Size full");
//	}
//}

//SECOND METHOD
public void addAccount(long acno,String Name , String ContactNo,String address)
{
	if (size<MAX)
	{
		int i = size;
		account[size]=new Account(acno);
		customer[size]=new Customer(Name, address, ContactNo,account[i]);
		size++;
	}
	else {
		System.out.println("Error!! Size full");
	}
}

public void removeAccount(long no)
{
	for(int i=0;i<size;i++)
	{
		if(account[i].accNo==no)
		{
			for(int j=0;j<size-1;j++)
			{
				account[j]=account[j+1];
				customer[j]=customer[j+1];
				
			}
		}
	}
	account[size]=null;
	customer[size]=null;
	size--;
}

public void display()
{
	for(int i=0;i<size;i++)
	{
		customer[i].display();
	}
}

public void updateDeatils(long accNo,String mobNo)
{
	for(int i=0;i<size;i++)
	{
		if(customer[i].getAcc().accNo==accNo) {
			customer[i].setMoNum(mobNo);
		}
		else
		{
			System.out.println("Account Not Found!!!");
		}
	}
}

public void applyInterest(Account acc1)
{
	double interest = acc1.accBal*interestRate;
	acc1.accBal+=interest;
	
}
}