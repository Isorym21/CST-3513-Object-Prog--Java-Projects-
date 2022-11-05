
// Problem 1 * PART 2

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

