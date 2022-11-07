/*
 * Santana, Isory 
 * 10/03/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #4
                          
Problem 5. (Markov matrix) An n * n matrix is called a positive Markov matrix if each element is positive 
and the sum of the elements in each column is 1. Write the following method to check whether a matrix is 
a Markov matrix. 

public static boolean isMarkovMatrix(double [][] m)

Write a test program (the main method) that prompts the user to enter a 3 x 3 matrix of double values and 
tests whether it is a Markov matrix.

*/
import java.util.Scanner;

public class MarkovMatrix {//beginning of the class
    

	public static void main(String[] args) {//beginning of a method
		
// Create a 3 x 3 user input matrix
		double[][] matrix = getMatrix();

		// checking whether a matrix is a Markov matrix. 
		System.out.println("It is" + (isMarkovMatrix(matrix) ? " " : " not ") +
			"a Markov matrix");
	}

	//getMatrix should return a 3-by-3 matrix containing user input
	public static double[][] getMatrix() {
		
		Scanner input = new Scanner(System.in); // Construct a scanner

		// / Build a 3-by-3 matrix
		double[][] m = new double[3][3];

		// Prompt ther user to enter a 3 x 3 matrix
		System.out.println("Enter a 3-by-3 matrix row by row:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		return m;
	}
        
// If matrix is a positive number, isMarkovMatrix returns true 
	public static boolean isMarkovMatrix(double[][] m) {
		return isElementsPositive(m) && isEachColumnSum1(m);
	}
// If every element in the matrix is positive, the function isElementsPositive returns true
	public static boolean isElementsPositive(double[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] < 0)
					return false;
			}
		}
		return true;
	}

        //If the total sum of the elements in each column is 1, the function isEachColumnSum1 returns true.
	public static boolean isEachColumnSum1(double[][] m) {
		for (int col = 0; col < m.length; col++) {
			double sum = 0; // Sum of each column
			for (int row = 0; row < m.length; row++) {
				sum += m[row][col];
			}
			if (sum != 1)
				return false;
		}
		return true;

   } // end of the method 
    
}// end of the class 
