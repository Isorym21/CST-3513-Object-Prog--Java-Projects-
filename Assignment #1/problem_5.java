
/*
 * Santana, Isory
 * 09/04/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #1
                         
Problem 5. The two roots of a quadratic equation ax^2 + bx + c = 0 can be obtained using 
the following formula:

                     x=(-b±√(b^2-4ac))/2a
                     
b2 – 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two
real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.
Write a program that prompts the user to enter values for a, b and c and displays the result 
based on the discriminant. If the discriminant is positive, display two roots. 
If the discriminant is zero, display one root. Otherwise, display “The equation has no real roots.”

*/
import java.util.Scanner;
	
public class problem_5 { //beginning of the class
	
		public static void main(String[] args) {
			//beginning of a method 
			
			Scanner input = new Scanner(System.in);

			// Request the user to enter values for a, b and c.
			System.out.print("Enter a, b, c: ");
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();


		
			// Compute the discriminant of the quadriatic equation.
			double discriminant = Math.pow(b, 2) - 4 * a * c;

			// Calculate the discriminant of the quadratic equation, if any exist.
			System.out.print("The equation has ");
			if (discriminant > 0)
			{
				double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);  
				double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);  
				System.out.println("two roots " + root1 + " and " + root2); // If the discriminant is positive, display two roots. 
			}
			else if (discriminant == 0) 
			{
				double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
				System.out.println("one root " + root1); // If the discriminant is zero, display one root.
			}
			else 
				System.out.println("no real roots"); // Otherwise, display “The equation has no real roots.”
		
		} // end of the method 
		
	} // end of the class 






