/*
 * Santana, Isory 
 * 09/23/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #3
                          

Problem 3. Write a program that prompts the user to enter a string and a character and displays
the number of occurrences of the character in the string. The program should use the method 
count that finds the number of occurrences of a character in a string using the following header:

public static int count (String str, char a)


*/
import java.util.Scanner;

public class Problem3 {//beginning of the class
 
    public static void main(String[] args) { //beginning of a method 

  
          
          // declarations
          String s;
          char ch;
          Scanner kb = new Scanner (System.in);
          
          
         //input
         
         System.out.print("Enter a string: ");
         s = kb.nextLine();
          
         System.out.print("Enter a character : ");
         ch = kb.nextLine().charAt(0);
         
         

//Processing and output 
         
            System.out.println("The character" + ch + "repeats" + count(s,ch)+ "times");
          
      }
      public static int count (String str, char ch)
      {
          
          int value = 0;
          for (int i = 0; i < str.length(); i++)
          {
            if (str.charAt(i)== ch)  
            {
                value++ ;
            }
            
            }
          return value;
         
   	} // end of the method 
        
}// end of the class


   