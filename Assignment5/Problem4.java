
/*
 * Santana, Isory
 * 10/13/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #5


Problem 4. (25%) (The Location class) Design a class named Location for locating a maximal value and its location in a two-dimensional array.
The class contains public data int fields “row”, “column” and double field “maxValue” that store the maximal
value and its indices in a two-dimensional array.

Write the following method that returns the location of the largest element in a two-dimensional array: 

public static Location locateLargest(double [][] a)

The return value is an instance of Location. Write a test program that prompts the user to enter a
two-dimensional array and displays the location of the largest element in the array. Here is a sample run:

Enter the number of rows and columns in the array: 3 4
Enter the array:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6
The largest element is 45, and it is located at (1, 2)


*/
   import java.util.Scanner;
public class Problem4 {
    
     public static void main(String[] args){
         
         Scanner kb = new Scanner(System.in);
         
         System.out.print("Enter the number of rows and colums in the array: ");
         int numberOfRows = kb.nextInt();
         int numberOfColumns = kb.nextInt();
        
        double [][] a = new double [numberOfRows][numberOfColumns];
        
         System.out.print("Enter the  array: ");
         
         for (int i = 0; i < a.length; i++)
         {
             for (int j = 0; j < a[i].length; j++)
             {
                 a[i][j] = kb.nextDouble();
                 
             }
         }
        Location location = locateLargest(a);
        
        
         System.out.print(location.toString());
         
        
         
     }
     
   public static Location locateLargest(double[][]a)
   {
       Location location = new Location();
       
       location.maxValue = a[0][0];
       
       for (int i = 0; i < a.length; i++)
       {
           for (int j = 0; j < a[i].length; j++)
           {
            if (a[i][j] > location.maxValue )   
            {
                location.maxValue = a[i][j];
                location.row = i;
                location.column = j;
                
            }
           }
       }
       return location;
     
   }
}

class Location
{
    int row;
    int column;
    double maxValue;
     
    
    public String toString()
    {
        return "row: " + row + "; column: "+ column +"; maximum value: " + maxValue;
    }
}
    
