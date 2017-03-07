/***************************************
*	file:RegularAccount.java
*	class:CS 141 - Programming and Problem Solving
*	assignment: program 1
*	date last modified: 2/29/2017
*
*	purpose: We create an abstract parent class that is extended with Regular account and Savings accout
*            then we use our driver class to perform operations to those classes.
****************************************/
import java.util.*;

public class Driver
{	
	//method: main
	//purpose: performs all operations inside.
	public static void main(String args[])
	{
		double balance=0;
		SavingsAccount savingsAccount = new SavingsAccount(15,.7);
		RegularAccount regularAccount = new RegularAccount(0,.7);
		Scanner keyboard = new Scanner (System.in);
		String decision;
		String decision1;
		double input;
		
		while (1>0)
		{
			System.out.print("Which account would you like to access, Regular or Savings?: ");
			decision = keyboard.nextLine();
		
			if (decision.equals("Regular") || decision.equals("regular"))
			{
				System.out.print("What action do you wish to perform (Withdraw, Deposit, Monthly Processing)?: ");
				decision1 = keyboard.nextLine();
			
				if(decision1.equals("Deposit") || decision1.equals("deposit"))
				{
					System.out.print("How much would you like to deposit?: ");
					input = keyboard.nextLine();
					
					regularAccount.deposit(input);
					
					System.out.println("Account balance is $" + regularAccount.getBalance());
					System.out.println("");
				}
				
				else if(decision1.equals("Withdraw") || decision1.equals("withdraw"))
				{
					System.out.print("How much would you like to withdraw?: ");
					input = keyboard.nextDouble();
					regularAccount.withdraw(input);
					
					input=keyboard.nextLine();

					System.out.println("Account balance is $" + regularAccount.getBalance());
					System.out.println("");
				}
				
				else if(decision1.equals("Monthly Processing") || decision1.equals("Monthly processing") || decision1.equals("monthly Processing") || decision1.equals("monthly processing"))
				{
					regularAccount.monthlyProcess();
					System.out.println("");
				}
			}
				
			else if (decision.equals("Savings") || decision.equals("savings"))
			{
				System.out.print("What action do you wish to perform (Withdraw, Deposit, Monthly Processing)?: ");
				decision1 = keyboard.nextLine();
			
				if(decision1.equals("Deposit") || decision1.equals("deposit"))
				{
					System.out.print("How much would you like to deposit?: ");
					input = keyboard.nextDouble();
					
					savingsAccount.deposit(input);
					
					input = keyboard.nextLine();
					
					System.out.println("");
				}
					
				else if(decision1.equals("Withdraw") || decision1.equals("withdraw"))
				{
					System.out.print("How much would you like to withdraw?: ");
					input = keyboard.nextDouble();

					savingsAccount.withdrawl(input);
					System.out.println("");
				}
					
				else if(decision1.equals("Monthly Processing") || decision1.equals("Monthly processing") || decision1.equals("monthly Processing") || decision1.equals("monthly processing"))
				{
					savingsAccount.monthlyProcess();
					System.out.println("");
				}
			}
				
				
			else if (decision.equals("Quit") || decision.equals("quit"))
			{
				System.exit(0);
			}
		}
	}
}