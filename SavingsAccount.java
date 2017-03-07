/***************************************
*	file:Selva_RegularAccount.java
*	class:CS 141 - Programming and Problem Solving
*	assignment: program 1
*	date last modified: 2/29/2017
*
*	purpose: We create an abstract parent class that is extended with Regular account and Savings accout
*            then we use our driver class to perform operations to those classes.
****************************************/
public class SavingsAccount extends BankAccount
{
	boolean status;
	
	//method: SavingsAccount
	//purpose: Default constructors that takes in two arguments
	public SavingsAccount(double initialBalance, double initialRate)
	{
		super(initialBalance, initialRate);
	}

	//method: withdraw
	//purpose: calls the super class withdraw method and pass along an argument.
	public void withdrawl (double newWithdraw)
	{	
		super.withdraw(newWithdraw);
		
		if (super.getBalance() >= 25)
		{
			System.out.println("Your account is now active");
			status = true;
		}
	
		else
		{
			System.out.println("Account balance is " + super.getBalance() + ".");
			System.out.print("Your account is now inactive.");
			status = false;
			System.out.println("");
		}
	}

	//method: deposit
	//purpose: Calls the super class deposit method and pass along an argument and checks to see if the account is active
	//			or inactive.
	public void deposit (double newDeposit)
	{	
		super.deposit(newDeposit);
		
		if (super.getBalance() >= 25)
		{
			System.out.println("Account balance is $" + super.getBalance() + ".");
			System.out.println("Savings acccount is now active.");
			status = true;
		}

		else
		{
			System.out.println("Account balance is $" + super.getBalance() + ".");
			System.out.println("Savings account is now inactive.");
			status = false;
		}
	}

	//method: monthlyProcess
	//purpose: Calls the super class monthlyProcess method and checks to see if the account is active
	//			or inactive.
	public void monthlyProcess()
	{
		super.monthlyProcess();

		if(super.getBalance() >= 25)
		{
			System.out.println("Account balance is $" + super.getBalance() + ".");
			System.out.println("Savings account is now active.");
			status = true;
		}

		else
		{
			System.out.println("Your account balance is $" + super.getBalance() + ".");
			System.out.println("Savings account is now inactive.");
			status = false;
		}
		
		if(super.getWithdraw()>4)
		{
			super.setCharges(super.getNumWithdraws() - 4);
		}
	}
}