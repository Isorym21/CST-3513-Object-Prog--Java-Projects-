/*
 * Santana, Isory 
 * 09/23/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #3
                          
Problem 6. (Print distinct numbers) Write a program that reads in ten numbers and displays the
number of distinct numbers and the distinct numbers separated by one space (i.e. if a number
appears multiple times, it is displayed only once). (Hint: Read a number and store it to an
array if it is new. If the number is already in the array, ignore it.) After the input, the
array contains the distinct numbers. Here is an example run of the program:

Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
The number of distinct numbers is 6
The distinct numbers are: 1 2 3 6 4 5

*/
import java.util.Scanner;

public class Problem6 {//beginning of the class
      
// Main Method 
	public static void main(String[]args) {//beginning of a method 
		Scanner input = new Scanner(System.in);

		int[] distinctNumbers = new int[10]; // Array of length 10;
		int num; 				// User input
		int count = 0;			// Number of distinct numbers

		// Prompt the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();

			// Test if num is distinct
			if (isDistinct(distinctNumbers, num)) {
				distinctNumbers[count] = num;
				count++;	// Increment count
			}
		}

		// Displays the number of distinct numbers and the  
		// distinct numbers separated by exactly one space
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are");
		for (int i = 0; i < distinctNumbers.length; i++) {
			if (distinctNumbers[i] > 0)
				System.out.print(" " + distinctNumbers[i]);
		}
		System.out.println();
	}

	// Method isDistinct returns true if number is not in array false otherwise 
	public static boolean isDistinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
                
	} // end of the method 
        
}// end of the class 
