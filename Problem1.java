

/*
 * Santana, Isory Marbellis
 * 09/15/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #2
                          
Problem 1. Write a program that prompts the user to enter a year and the first three letters
of the month (with the first letter in uppercase) and displays the number of days in the month.
You should take into account if the year is a leap year or not. 
*/

import java.util.Scanner;

public class Problem1 { //beginning of the class
	public static void main(String[] args) {   //beginning of a method 
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a year 
		System.out.print("Enter a year: ");
		int year = input.nextInt();
                
                // the first three letter of a month name
		System.out.print("Enter a month: ");
		String month = input.next();

		// Test for leap year
		boolean leapYear = 
			((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

		// Display the number of day in the month
		System.out.print(month + " " + year + " has ");
		
		if ( month.equals("Jan") || month.equals("Mar") || 
			  month.equals("May") || month.equals("Jul") ||
			  month.equals("Aug") || month.equals("Oct") ||
			  month.equals("Dec"))
			System.out.println(31 + " days");
		else if (month.equals("Apr") || month.equals("Jun") || 
			month.equals("Sep") || month.equals("Nov"))
			System.out.println(30 + " days");
		else
			System.out.println(((leapYear) ? 29 : 28) + " days");	
	
        } // end of the method 
        
} // end of the class 