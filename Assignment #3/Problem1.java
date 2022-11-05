/*
 * Santana, Isory 
 * 09/23/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #3
                          
Problem 1. (Palindrome integer) A number is a palindrome if its reversal is the same as itself.
Write a program that prompts the user to enter an integer and reports whether the integer is a palindrome.
The program should use the reverse and isPalindrome methods with the following headers:

//the method returns the reversal of an integer, i.e, reverse(456) should return 654
public static int reverse (int number)

//the method returns true if number is a palindrome
public static boolean  isPalindrome (int number) 
*/  

   import java.util.Scanner;
   
public class Problem1 { //beginning of the class

	/** Main Method */
	public static void main(String[] args) {  //beginning of a method 
		Scanner input = new Scanner(System.in); // Create a Scanner

		// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		// Report whether the integer is a palindrome.
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") +
			"a palindrome.");
	}

	/** Method isPalindrome returns true if number is a palindrome */
	public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}

	/** Method reverse returns the reversal of an integer */
	public static int reverse(int number) {
		String reverse = ""; 	// Holds reversed number
		String n = number + ""; // Convert number to string
		// Reverse string
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse); // Return reversed integer
      
              
	} // end of the method 
        
}// end of the class 