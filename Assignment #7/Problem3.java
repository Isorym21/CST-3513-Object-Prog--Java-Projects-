/*
 * Santana, Isory 
 * 11/30/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #7
                          
Problem 3. (25%) (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:

•	Creates an array with 100 randomly chosen integers.
•	Prompts the user to enter the index of the array, then displays the corresponding element value.
        If the specified index is out of bounds, it should throw an ArrayIndexOutOfBounds Exception 
        and display the message “Out of Bounds.” 

*/
import java.util.*;

public class Problem3 { //beginning of the class
    
    public static void main(String[] args) {//beginning of a method 
        
		
		Scanner input = new Scanner(System.in);// Create a Scanner

		// Invoke getArray method
		int[] array = getArray();

		// Prompt the user to enter the index of the array
		System.out.print("Please enter the array's index: ");
		try {
			// Display the corresponding element value
			System.out.println("The corresponding element value is " + 
				array[input.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}

	// Returns an array containing 100 randomly selected integers.
	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
                
	}// end of the method
        
}// end of the class 
    

