/*
 * Santana, Isory 
 * 11/30/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #7
                          
Problem 1. (25%) (Remove duplicates) Write a method that removes the duplicate elements 
from an ArrayList of integers using the following header:

public static void removeDuplicates(ArrayList<Integer> list)

Write a test program that prompts the user to enter 10 integers to the list, removes
the duplicates and displays the distinct integers separated by exactly one space.

*/


import java.util.Scanner;
import java.util.ArrayList;

public class Problem1 { //beginning of the class
 
	
	public static void main(String[] args) {  //beginning of a method 
		
		Scanner input = new Scanner(System.in); // Create a scanner

		// Create an ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Prompt ther user to enter 10 integers
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}

		// Invoke removeDuplicate method
		removeDuplicate(list);

		// Display the distinct integers
		System.out.print("The distinct integers are ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

	//Removes the duplicate elements from a list of integer arrays.
	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j))
					list.remove(j);
			}
		}
	}// end of the method
}// end of the class 

