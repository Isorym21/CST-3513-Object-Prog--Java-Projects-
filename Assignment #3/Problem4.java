/*
 * Santana, Isory 
 * 09/23/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #3
                          

Problem 4. Write a program that prompts the user to enter the number of milliseconds and 
converts the milliseconds to a string hours:minutes:seconds. The program should use the
convertMillis method with the following header:

public static String convertMillis (long millis)

For example, convertMillis(5500) returns the string 0:0:5, convertMillis(100000) returns
the string 0:1:40, and convertMillis(555550000) returns the string 154:19:10.

*/
import java.util.Scanner;

public class Problem4 {//beginning of the class
 
    public static void main(String[] args) { //beginning of a method 
    Scanner input = new Scanner(System.in); // Create a scanner

		// Prompt the user to enter milliseconds
		System.out.print("Enter milliseconds: ");
		long millis = input.nextLong();

		// Convert milliseconds to hours, minutes, and seconds
		System.out.println("hours:minuties:seconds: " + convertMillis(millis));
	}

	// Method convertMillis converts milliseconds to hours, minuties and seconds 
	public static String convertMillis(long millis) {
		// Obtain total seconds
		millis /= 1000;

		// Obtain current minute and second
		String currentMinuteAndSecond = "";
		for (int i = 0; i < 2; i++) {
			currentMinuteAndSecond = ":" + millis % 60 + currentMinuteAndSecond;
			millis /= 60;
		}
		return millis + currentMinuteAndSecond;

	} // end of the method 
        
}// end of the class 
