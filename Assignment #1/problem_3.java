
/*
 * Santana, Isory 
 * 09/04/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #1
                          
Problem 3. Write a program that prompts the user to enter the vertices of a triangle (x1, y1),
(x2, y2), (x3, y3) and displays its area. The formula for computing the area of a triangle is:

s = (side1 + side2 + side3) / 2

area = √(s(s-side1)(s-side2)(s-side3))
*/

import java.util.Scanner;
	
public class problem_3 { //beginning of the class
	
		public static void main(String[] args) {
			//beginning of a method 
			
			Scanner input = new Scanner(System.in);
	
			
			// Prompt the user to enter three points
			System.out.print("Enter three points for a triangle: ");
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			double x3 = input.nextDouble();
			double y3 = input.nextDouble();
	

			// Compute the area of a triangle
			double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
			double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
			double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
			double s = (side1 + side2 + side3) / 2;
			double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
	

			// Show result
			System.out.println("The area of the triangle is " + area);
		
		} // end of the method 
		
	} // end of the class 






