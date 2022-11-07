
/*
 * Santana, Isory 
 * 09/15/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #2
                          
Problem 3. (Compute π) You can approximate π by using the following series:

π=4 (1-(1/3)+(1/5)-(1/7)+(1/9)-(1/11)+ ⋯ +(-1)^(i+1)/(2i-1))

Write a program that displays the π value for i = 10000, 20000, …, and 100000
using a repetition loop. 
*/
public class Problem3 { //beginning of the class
    
public static void main(String[] args) {  //beginning of a method 
    
		// Compute PI value for i = 10000, 
		double sum = 0;
		double value = 10000.0;
		for (double d = 1; d <= (2 * value - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d; 
		}
		double pi = 4 * sum;

		// Display result
		System.out.println("PI value for i = 10000: " + pi);

		// Compute PI value for i = 20000,
		sum = 0;
		value = 20000.0;
		for (double d = 1; d <= (2 * value - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d; 
		}
		pi = 4 * sum;

		// Display result
		System.out.println("PI value for i = 20000: " + pi);

		// Compute PI value for i = 20000,
		sum = 0;
		value = 100000.0;
		for (double d = 1; d <= (2 * value - 1); d += 2) {
			sum += 1 / d;
			d += 2;
			sum -= 1 / d; 
		}
		pi = 4 * sum;

		// Display result
		System.out.println("PI value for i = 100000: " + pi);
                
	} // end of the method 

} // end of the class 
