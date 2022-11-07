/*
 * Santana, Isory 
 * 10/03/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #4
                          
Problem 2. Write a sort method that uses the bubble-sort algorithm to sort numbers in ascending order. 
The bubble-sort algorithm makes several passes through the array. On each pass, successive neighboring
pairs are compared. If a pair is not in order, its values are swapped; otherwise, the values remain 
unchanged. The technique is called bubble-sort or sinking sort because the larger values gradually
“bubble” their way to the top and the smaller values “sink” to the bottom.Write also a test program 
that reads in ten numbers, invokes the method, and displays the sorted numbers. 
*/ 
import java.util.Scanner;

public class BubbleSortAlgorithm {//beginning of the class
    
    public static void main(String[] args) {//beginning of a method
       int a, b, c, trade;
       @SuppressWarnings("resource")
       Scanner in = new Scanner(System.in);

       System.out.println("Enter The Number Of Integers To Sort");
       a = in.nextInt();
      
       int array[] = new int[a];
      
       System.out.println("Enter " + a + " Integers");
       for (b = 0; b < a; b++) {
           array[b] = in.nextInt();
       }

       for (b = 0; b < (a - 1); b++) {
           for (c = 0; c < a - b - 1; c++) {
               //for usage in decreasing order
               if (array[c] > array[c + 1]) {
                   trade = array[c];
                   array[c] = array[c + 1];
                   array[c + 1] = trade;
               }
           }
       }
    System.out.println("A List Of Sorted Numbers");

       for (b = 0; b < a; b++) {
           System.out.println(array[b]);
       }

   } // end of the method 
    
}// end of the class 
