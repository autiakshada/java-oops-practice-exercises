/*
Write the java code for the following classes and interface:

An abstract class Account that represents a bank account with a balance and an account number.
The class should have a constructor that takes the account number as a parameter and getter method for account number.

The class should also have an abstract method getBalance()
that returns the current balance of the account,and abstarct methid deposit(double amount)
that update the balance according to the amount given.

A subclass SavingsAccount that inherits from Account and represents a saving account that earns interest.
The class should have the constructor that takes the account number and the interest rate as parameters and a getter method for the interest rate.
The class should override the getBalance() method to return the balance plus the interest earned,and the deposit() method to update the balance accordingly.

Input Format-
		First line represents the account number
		Second line represents the interest rate 
		Third line reperesents the balance

Sample Input-
		123456789
		0.05
		1000

Sample Output-
		Savings Account created with account number 123456789
		Interest Rate of savings account: 0.05
		Balance in savings account: 1000.0 
*/
class BankDetails 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
