
/*
 * Santana, Isory 
 * 09/04/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #1
                          
Problem 4. Write a program that reads an investment amount, annual interest rate, and the number
of years, and displays the future investment value using the following formula:

futureInvestmentValue = investmentAmount (1 + (annualInterestRate/12))^numberOfYears*12

For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, 
the future investment value is 1032.98. 

*/

import java.util.Scanner;
	
public class problem_4 { //beginning of the class
	
		public static void main(String[] args) {
			//beginning of a method 
			
			Scanner input = new Scanner(System.in);

			// Request the user to enter the investment amount
			System.out.print("Enter investment amount: ");
			double amount = input.nextDouble();
			
			// Annual interest rate 
			System.out.print("Enter annual interest rate in percentage: ");
			double monthlyInterestRate = input.nextDouble();
			monthlyInterestRate /= 1200;
			
			// Number of years.
			System.out.print("Enter number of years: ");
			int years = input.nextInt();

			// Calculate the value of future investments
			double futureInvestmentValue = amount * Math.pow(1 + monthlyInterestRate, years * 12);
			
			// Show result
			System.out.println("Accumulated value is $" + futureInvestmentValue);
	
		
		} // end of the method 
		
	} // end of the class 






