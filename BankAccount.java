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
	
	//method: Default constructor named BankAccount
	//purpose: Take in 2 double type arguments and assign those values to balance and rate variable.
	public BankAccount(double initialBalance, double initialRate)
	{
		balance = initialBalance;
		rate = initialRate;
	}
	
	//method: setBalance
	//purpose: Take in type double argument and assign its value to balance.
	public void setBalance(double newBalance)
	{
		balance = newBalance;
	}
	
	//method: getBalance
	//purpose: return the value held in balance variable;
	public double getBalance()
	{
		return balance;
	}
	
	//method: setDeposit
	//purpose: Take in type double argument and assign its value to newDeposit.
	public void setDeposit(double newDeposit)
	{
		deposit = newDeposit;
	}
	
	//method: getBalance
	//purpose: return the value held in deposit variable;
	public double getDeposits()
	{
		return deposit;
	}
	
	//method: setWithdraw
	//purpose: Take in type double argument and assign its value to withdraw.
	public void setWithdraw(double newWithdraw)
	{
		withdraw = newWithdraw;
	}
	
	//method: getWithdrawl
	//purpose: return the value held in withdraw variable.
	public double getWithdraw()
	{
		return withdraw;
	}
	
	//method: setRate
	//purpose: Take in type double argument and assign its value to rate.
	public void setRate(double newRate)
	{
		rate = newRate;
	}
	
	//method: getBalance
	//purpose: return the value held in rate variable.
	public double getRate()
	{
		return rate;
	}
	
	//method: setCharges
	//purpose: take in type double argument and assign its value to monthlyCharges.
	public void setCharges(double newCharges)
	{
		monthlyCharges = newCharges;
	}
	
	//method: getCharges
	//purpose: return the value held by monthlyCharges variable.
	public double getCharges()
	{
		return monthlyCharges;
	}
	
	//method: setWithdraw
	//purpose: take in type double argument and assign its value to numWithdraw
	public void setNumWithdraws(double newWithdraw)
	{
		numWithdraw = newWithdraw;
	}
	
	//method: getWithdrawl
	//purpose: return the value held by numWithdraw variable
	public double getNumWithdraws()
	{
		return numWithdraw;
	}
	
	//method: setDeposits
	//purpose: take in type double argument and assign its value to numDeposit
	public void setNumDeposits(double newDeposit)
	{
		numDeposit = newDeposit;
	}
	
	//method: getDeposit
	//purpose: return the value held by numDeposit
	public double getNumDeposit()
	{
		return numDeposit;
	}
	
	//method: deposit
	//purpose: Take in type double argument and add its value to current balance
	public void deposit(double newDeposit)
	{
		balance = (balance + newDeposit);
		
		numDeposit++;
	}
	
	//method: withdrawl
	//purpose: Take in type double argument and subtract it from the current balance.
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
	//purpose: Take in type double argument and calculate the monthlyInterestRate, monthlyInterest and balance.
	public void calcInterest(double newInterest)
	{
		monthlyInterestRate = (newInterest / 12);
		monthlyInterest = (balance * monthlyInterestRate);
		balance = (balance + monthlyInterest);
	}
	
	//method: monthlyProcess
	//purpose: assign new balance after subtracting monthlyCharges from the previous balance and calling the calcInterest method
	//that takes in double type argument and assign the new balance based on the monthlyCharges passed in and reset variables to 0.
	public void monthlyProcess()
	{
		balance = (balance - monthlyCharges);
		calcInterest(monthlyCharges);
		numWithdraw = 0;
		numDeposit = 0;
		monthlyCharges = 0;
	}
}
