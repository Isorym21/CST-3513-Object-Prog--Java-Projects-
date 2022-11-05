/*
 * Santana, Isory 
 * 09/23/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #3
                          

Problem 5. (Count occurrence of numbers) Write a program that reads integers between 1 and
100 and counts the occurrence of each (you should store the numbers in an array). Output
should be in ascending order. Assume the input ends when the user enters a 0. Here is a 
sample run of the program:

Enter integers between 1 and 100 (enter 0 to stop): 2 5 6 5 4 3 23 43 2 0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time

Note that if the number occurs more than one time, the plural word “times” is used in the output.

*/
import java.util.Scanner;

public class Problem5 { //beginning of the class
      public static void main(String[] args) {//beginning of a method 
        Scanner in = new Scanner(System.in);

        int[] values = new int[100];
        int input;
        int count = 0;
        System.out.print("Enter the integers between 1 and 100: ");
        do
        {
            input = in.nextInt();
            values[count] = input;
            count += 1;
        }
        while (input != 0);

        countOccurence(values);
    }

    public static void countOccurence(int[] list) {
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] == i)
                    count += 1;
            }
            if (count != 0)
                System.out.printf("%d occurs %d %s%n", 
                    i, count, count > 1 ? "times" : "time");
        } 
    
	} // end of the method 
        
}// end of the class 

