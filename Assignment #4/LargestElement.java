/*
 * Santana, Isory 
 * 10/03/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #4
                          
Problem 3. (Locate the largest element) Write the following method that returns the location 
of the largest element in a two-dimensional array:

public static int [] locateLargest(double [][] a)

The return value is a one-dimensional array that contains two elements. These two elements
indicate the row and column indices of the largest element in the two-dimensional array. 
Write a test program (the main method) that prompts the user to enter a two-dimensional 
array and displays the location of the largest element of the array. 

*/ 
import java.util.Scanner;

public class LargestElement { //beginning of the class
    
    public static void main(String[] args) {//beginning of a method
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array's row and column numbers:");
        int row = sc.nextInt();
        int column = sc.nextInt();
        
        double [][] data = new double[row][column];
        
        System.out.println("Enter the array:");
        
        for (int i=0;i<row;i++) {
            System.out.println("Enter the "+(i+1)+" row's data:");
            for (int j=0;j<column;j++) {
                data[i][j] = sc.nextDouble();
            }
        }
        int [] location = locateLargest (data);
        System.out.println("The largest is located at a ("+location[0]+","+location[1]+")");
    }
    
    public static int[] locateLargest (double [][] a) {
           
        int [] location = new int[2];
        double maxValue = 0;
        int maxRow = 0;
        int maxColumn = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                   maxValue = a[i][j];
                   maxRow = i;
                   maxColumn = j;
                }
            }
        }
        location [0] = (maxRow+1);
        location [1] = (maxColumn+1);
        return location;
   
  
  } // end of the method 
    
}// end of the class 

