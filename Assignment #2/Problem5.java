
/*
 * Santana, Isory 
 * 09/15/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #2
                          
Problem 5. (Perfect number) A positive integer is called a perfect number if it is equal to the
sum of all of its positive divisors, excluding itself. For example, 6 is the first perfect number
because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. There are four perfect numbers less 
than 10,000. Write a program to find all these four numbers. 
 
*/
public class Problem5 { //beginning of the class
    
      public static void main(String[] strings) { //beginning of a method 

          // Finding four perfect numbers less than 10,000.
        for (int number = 6; number <= 10000; number++) {
            int total = 0;
            int divisor = number - 1;

            while (divisor > 0) {

                if (number % divisor == 0) {
                    total += divisor;
                }
                divisor--;
            }

            if (number == total) {
                System.out.println(number);
            }

        }
        
    } // end of the method 
      
} // end of the class 
