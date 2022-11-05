/*
 * Santana, Isory Marbellis
 * 10/13/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #5
                          
Problem 1. (25%) (The Account class) Design a class named Account that contains:

•	A private int data field named “id” for the account (default 0)
•	A private double data field named “balance” for the account (default 0)
•	A private double data field named “annualInterestRate” that stores the current interest rate (default 0). Assume all accounts have the same interest rate.
•	A private Date (note that Date is a java class in the java.util.* library) data field named “dateCreated” that stores the date when the account was created.
•	A no-arg constructor that creates a default account.
•	A constructor that creates an account with the specified “id” and initial balance.
•	The accessor and mutator methods for “id”, “balance” and “annualInterestRate”.
•	The accessor method for “dateCreated”.
•	A method named getMonthyInterestRate() that returns the monthly interest rate.
•	A method named getMonthlyInterest() that returns the monthly interest.
•	A method named withdraw that withdraws a specified amount of money from the account.
•	A method name deposit that deposits a specified amount of money to the account.

Draw the UML diagram for the class and then implement the class. (Hint: the method getMonthlyInterest() is to return the monthly interest, not the interest rate.
Monthly interest is (balance * monthlyInterestRate). The monthlyInterestRate is annualInterestRate/12.)

Write a test program that creates an Account object with an account ID of 1122, a balance of $20,000, and an annual interest rate of 4.5%.
Use the withdraw method to withdraw $2,500, use the deposit method to deposit $3,000, and print the balance, the monthly interest, 
and the date when this account was created.

*/


import java.util.Date;
class  Account {
    

// Instance variable declaration

private int id;
private double balance;
private double annualInterestRate;
private Date dateCreated;



public  Account() {
    dateCreated = new Date(); 
    id = 0;
    balance = 0;

}


public  Account(int id, double balance) {
    setID(id);
    
    setBalance(balance);
    
    dateCreated = new Date() ;

}

// getters and setters
public int getID()
{
return id;

}
public void setID(int i) 
{
id = i; 

}

public double getBalance()

{
return balance;
}

public void setBalance (double b)

{

balance = b;

}

public double getAnnualInterestRate() {
    return annualInterestRate;
           
}

public void setAnnualInterestRate (double r)
{
    annualInterestRate = r;
}
public Date getDateCreated()
{

return dateCreated;
}

public double getMonthlyInterestRate(){
    return annualInterestRate / 12;
}


public void withdraw(double amount){
    if (amount > balance)
System.out.println("** Low Balance on Your Account **");
    else 
        balance -= amount;
}

public void deposit (double amount) {
    balance += amount; 

}
}


public class  Problem1{

public static void main(String[] args) {

 Account assess = new  Account (1122, 20000) ;


assess. setAnnualInterestRate(0.045);

assess.withdraw(2500) ;

assess.deposit (3000) ;

// Showing the result

System.out.println("Balance is: " + assess.getBalance());

System.out.println("Monthly interest is: " + (assess.getMonthlyInterestRate() * assess.getBalance()));

System.out.println("This account was created at: " + assess.getDateCreated());

}
}

    

