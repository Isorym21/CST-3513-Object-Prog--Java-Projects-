
/*
 * Santana, Isory Marbellis
 * 09/15/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #2
                          
Problem 4. (Display leap years) Write a program that displays all the leap years, ten per line
(separated by one space), from 101 to 2100, Also display the number of leap years in this period.  
*/

public class Problem4 { //beginning of the class
    
	public static void main(String[] args) { //beginning of a method 
            
		System.out.println("All the leap years from 101 to 2100:");
		int count = 0;
		for (int year = 101; year <= 2100; year++) {
			// Test for leap year
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				count++;
				// Ten results per line separated by exactly one space
				System.out.print(year + (count % 10 == 0 ? "\n" : " "));
			} 
		}
		System.out.println();
                
	} // end of the method 
        
} // end of the class 
