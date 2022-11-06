
/*
 * Santana, Isory 
 * 09/04/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #1
                         
Problem 6. Write a program that reads three edges for a triangle and computes the perimeter if 
the input is valid. Otherwise, display that the input is invalid. The input is valid if the
sum of every pair of two edges is greater than the remaining edge.
*/

import java.util.Scanner;
	
public class problem_6 { //beginning of the class
	
		public static void main(String[] args) {
			//beginning of a method 
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the 3 sides of a triangle.");
			
			// First side of a triangle
			System.out.print("Side 1: ");
			double side1 = input.nextDouble();
			
			// Second side of a triangle
			System.out.print("Side 2: ");
			double side2 = input.nextDouble();
			
			// Third side of a triangle
			System.out.print("Side 3: ");
			double side3 = input.nextDouble();

// The input is valid if the sum of every pair of two edges is greater than the remaining edge.
			if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2) {
				double perimeter = side1 + side2 + side3;
				System.out.println("Perimeter = " + perimeter);
				
			} else
				System.out.println("The input is invalid.");
	
		} // end of the method 
		
	} // end of the class 






