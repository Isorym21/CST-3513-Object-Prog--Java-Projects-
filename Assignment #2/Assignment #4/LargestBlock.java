/*
 * Santana, Isory Marbellis
 * 10/03/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #4
                          
Problem 6. (Largest block) Given a square matrix (i.e. a two-dimensional array with the same numbers of rows and 
columns) with elements 0 or 1, write a program to find the maximum square submatrix whose elements are all 1s.
Your program should prompt the user to enter the number of rows in the matrix. The program then displays the 
location of the first element in the maximum square submatrix and the number of rows in the submatrix.
For example, given the following 5 x 5 matrix:
1	0	1	0	1
1	1	1	0	1
1	0	1	1	1
1	0	1	1	1
1	0	1	1	1


the maximum square submatrix is shaded and the location of the first element (in red) is row 2 and column 2.
Therefore, the program should produce the following output:

The maximum square submatrix is at (2, 2) with size 3.


*/
import java.util.*;    
import java.lang.*;


public class LargestBlock {//beginning of the class
    
 public static void main(String []args)//beginning of a method
    {
        int rows;   //a variable to store the matrix's row number
        Scanner sc=new Scanner(System.in);  //scanner to take user input
        System.out.println("Enter the number of rows : ");
        rows=sc.nextInt();  //enter the number of rows as input
        int [][]mat=new int[rows][rows];    //create square matrix
        System.out.println("Enter the elements in matrix : ");
        
        //input the elements of matrix
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<rows;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        
        //Determine the greatest square submatrix.
        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<rows;j++)
            {
                //the current maximal square submatrix if the current element is 1
                // will be the previous(current row-1 , current column-1) square submatrix +1;
                if(mat[i][j]==1)
                {
                    mat[i][j]=Math.min(mat[i][j-1],Math.min(mat[i-1][j],mat[i-1][j-1])) + 1;
                }
                
                //Otherwise, we must begin at 0
                else
                    mat[i][j]=0;
            }
        }
        //find the largest possible square submatrix and indices
        int max_row=0,max_col=0,max_size=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<rows;j++)
            {
                if(mat[i][j]>max_size)
                {
                    max_size=mat[i][j];
                    max_row=i;
                    max_col=j;
                }
            }
        }
        //print result
        System.out.println("The maximum square submatrix is at ("+(max_row-max_size+1)+", "+(max_col-max_size+1)+") with size "+max_size );
  
    } // end of the method 
    
}// end of the class 


