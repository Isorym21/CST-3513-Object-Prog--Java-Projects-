
import java.util.Scanner;


/*
 * Santana, Isory Marbellis
 * 09/15/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #2
                          
Problem 6. (Decimal to binary) Write a program that prompts the user to enter an integer 
(in base 10) and displays its corresponding binary value as a string. Don’t use Java’s 
Integer.toBinaryString(int) in this program. 
 
*/
public class Problem6 {  //beginning of the class
    

    public static void main(String[] strings) { //beginning of a method

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer (in base 10) 
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        //  Displaying the corresponding binary value as a string
        String binaryString = "";
        while (number >= 1) {
            if (number % 2 == 0) {
                binaryString = "0" + binaryString ;
            } else {
                binaryString = "1" + binaryString ;
            }
            number /= 2;
        }
        System.out.println(binaryString);
        
    } // end of the method 
    
} // end of the class 
