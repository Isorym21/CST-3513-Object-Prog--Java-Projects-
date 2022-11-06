
/*
 * Santana, Isory 
 * 09/04/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #1
                          
Problem 1. Write a program that prompts the user to enter two points (x1, y1) and 
(x2, y2) and displays the distance between them. The formula for computing the distance 
is  √((x2-x1)^2+〖(y2-y1)〗^2 ). Note that you can use Math.pow(a, 0.5) or Math.sqrt(a)
 to compute the square root of a. 
*/


import java.util.Scanner;

public class problem_1 {
	//beginning of the class
	
public static void main(String[] args){
    //beginning of a method 
	
	   
 Scanner in = new Scanner(System.in) ;

// First points
    System.out.print("Enter x1 and y1: ");
    double x1 =  in.nextDouble();
    double y1 =  in.nextDouble();
    
 // Seconds points
    System.out.print("Enter x2 and y2: ");
    double x2 =  in.nextDouble();
    double y2 =  in.nextDouble();

//The formula to compute the square root of a
    double determinant = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
    double sqrRoot = Math.pow(determinant, 0.5);


    System.out.printf("The distance between two points is %f", sqrRoot);


} // end of the method 

}// end of the class 
