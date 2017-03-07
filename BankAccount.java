/***************************************
*	file:Selva_RegularAccount.java
*	class:CS 141 - Programming and Problem Solving
*	assignment: program 1
*	date last modified: 2/29/2017
*
*	purpose: We create an abstract parent class that is extended with Regular account and Savings accout
*            then we use our driver class to perform operations to those classes.
****************************************/
public abstract class BankAccount
{
	private double balance;
	private double deposit;
	private double withdraw;
	private double rate;
	private double monthlyCharges;
	private double numWithdraw;
	private double numDeposit;
	private double monthlyInterest;
	private double monthlyInterestRate;
	
	//method: Default constructor
	//purpose: Instantiate default values
	public BankAccount(double initialBalance, double initialRate)
	{
		balance = initialBalance;
		rate = initialRate;
	}
	
	//method: setBalance
	//purpose: pass along the value, newBalance, to balance variable.
	public void setBalance(double newBalance)
	{
		balance = newBalance;
	}
	
	//method: getBalance
	//purpose: return the value of balance;
	public double getBalance()
	{
		return balance;
	}
	
	//method: setDeposit
	//purpose: pass along the value, newDeposit, to deposit variable.
	public void setDeposit(double newDeposit)
	{
		deposit = newDeposit;
	}
	
	//method: getBalance
	//purpose: return the value of deposit;
	public double getDeposits()
	{
		return deposit;
	}
	
	//method: setWithdraw
	//purpose: pass along the value, newWithdraw, to withdrawl variable.
	public void setWithdraw(double newWithdraw)
	{
		withdraw = newWithdraw;
	}
	
	//method: getWithdrawl
	//purpose: return the value of withdrawl;
	public double getWithdraw()
	{
		return withdraw;
	}
	
	//method: setRate
	//purpose: pass along the value, newRate, to rate variable.
	public void setRate(double newRate)
	{
		rate = newRate;
	}
	
	//method: getBalance
	//purpose: return the value of rate;
	public double getRate()
	{
		return rate;
	}
	
	//method: setCharges
	//purpose: pass along the value, newCharges, to charges variable.
	public void setCharges(double newCharges)
	{
		monthlyCharges = newCharges;
	}
	
	//method: getCharges
	//purpose: return the value of charges;
	public double getCharges()
	{
		return monthlyCharges;
	}
	
	//method: setWithdraw
	//purpose: pass along the value, newWithdraw, to withdraw variable.
	public void setNumWithdraws(double newWithdraw)
	{
		numWithdraw = newWithdraw;
	}
	
	//method: getWithdrawl
	//purpose: return the value of withdraw;
	public double getNumWithdraws()
	{
		return numWithdraw;
	}
	
	//method: setDeposits
	//purpose: pass along the value, newDeposit, to deposit variable.
	public void setNumDeposits(double newDeposit)
	{
		numDeposit = newDeposit;
	}
	
	//method: getDeposit
	//purpose: return the value of deposit;
	public double getNumDeposit()
	{
		return numDeposit;
	}
	
	//method: deposit
	//purpose: Take in the deposit amount and add it to the current balance.
	public void deposit(double newDeposit)
	{
		balance = (balance + newDeposit);
		
		numDeposit++;
	}
	
	//method: withdrawl
	//purpose: Subtract the withdraw amount from the current balance.
	public void withdraw(double newWithdraw)
	{
		if(newWithdraw <= balance)
		{
			balance = (balance - newWithdraw);
		}
			
		else
		{
			System.out.println("Error: Not enough funds.");
		}
		
		numWithdraw++;
	}
	
	//method: calcInterest
	//purpose: Perform the interest rate calculations and returns the balance with interest incurred.
	public void calcInterest(double newInterest)
	{
		monthlyInterestRate = (newInterest / 12);
		monthlyInterest = (balance * monthlyInterestRate);
		balance = (balance + monthlyInterest);
	}
	
	//method: monthlyProcess
	//purpose: Perform the monthlyProcess operations that returns the balance with the difference from charges and
	//set the count for withdraw, deposits, and charges back to 0.
	public void monthlyProcess()
	{
		balance = (balance - monthlyCharges);
		calcInterest(monthlyCharges);
		numWithdraw=0;
		numDeposit=0;
		monthlyCharges = 0;
	}
	
	
}