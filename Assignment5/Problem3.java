
/*
 * Santana, Isory 
 * 10/13/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #5

Problem 3. (25%) (The LinearEquation class) Design a class named LinearEquation for a 2x2 system of linear equations:

a x + b y = e
c x + d y = f

with solution x = (ed – bf) / (ad – bc) and y = (af – ec) / (ad – bc).

The class contains:

•	Private data fields a, b, c, d, e, and f.
•	A constructor with arguments for a, b, c, d, e, and f.
•	Six getter methods for a, b, c, d, e, and f.
•	A method isSolvable() that returns true if (ad – bc) is not 0.
•	Methods getX() and getY() that return the solution for the equation.

Draw the UML diagram for the class and then implement the class. Write a test program that prompts the user to enter a, b, c, d, e, and f and displays the result. If (ad – bc) is 0, report that “The equation has no solution.”


*/

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);

	System.out.print("Add a value in for a: ");
        double a = input.nextDouble();
      
	System.out.print("Add a value in for b: ");
        double b = input.nextDouble();

	System.out.print("Add a value in for c: ");
        double c = input.nextDouble();
        
	System.out.print("Add a value in for d: ");
        double d = input.nextDouble();
      
	System.out.print("Add a value in for e: ");
        double e = input.nextDouble();
       
	System.out.print("Add a value in for f: ");
        double f = input.nextDouble();
        System.out.println();
        
        LinearEquation lin = new LinearEquation (a, b, c, d, e, f);
        
        if (lin.isSolvable())
        {
            System.out.println("The equation has solution");
            
            System.out.println("The value of x: " + lin.getX());
            
             System.out.println("The value of y: " + lin.getY());
        }
        else 
           System.out.println("The equation has no solution");  
        
        }	
	}
