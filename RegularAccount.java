/***************************************
*	file:Selva_RegularAccount.java
*	class:CS 141 - Programming and Problem Solving
*	assignment: program 1
*	date last modified: 2/29/2017
*
*	purpose: We create an abstract parent class that is extended with Regular account and Savings accout
*            then we use our driver class to perform operations to those classes.
****************************************/
public class RegularAccount extends BankAccount
{
	//Method: default constructor
	//Purpose: Calls the super class constructor and gives two arguments for balance and rate.
	public RegularAccount(double initialBalance, double initialRate)
	{
		super(initialBalance, initialRate);
	}
}