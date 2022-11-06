
/*
 * Santana, Isory 
 * 09/04/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #1
                          
Problem 2. How cold is outside? The temperature alone is not enough to provide the answer.
Other factors including the wind speed, relative humidity, and sunshine play an important
role in determining coldness outside. In 2001, the National Weather Service (NWS) implemented 
the new wind-chill temperature to measure coldness using temperature and wind speed, 
the formula is:

tWC = 35.74 + 0.6215 t – 35.75 w^0.16 + 0.4275 t w^0.16

where t is the outside temperature in degrees Fahrenheit and w is the wind speed measured in miles
per hour. tWC is the wind-chilled temperature. The formula cannot be used for wind speeds below 2 mph 
or temperatures below -58oF or above 41oF. Write a program that prompts the user to enter a temperature
between -58oF and 41oF and a wind speed greater than or equal to 2 mph and displays the wind-chill 
temperature. Use Math.pow(a, b) to compute a^b 

*/

import java.util.Scanner;

public class problem_2 {
	//beginning of the class

	public static void main(String[] args) {
		//beginning of a method 

Scanner input = new Scanner(System.in);

// Request that the user enter a temperature between -58oF and 41oF 
System.out.print("Enter the temperature in degrees Fahrenheit " + "between -58oF and 41oF: ");
double temperature = input.nextDouble();

// 41oF and a wind speed greater than or equal to 2 mph.
System.out.print("Enter the wind speed measured (>= 2) in miles per hour: ");
double speed = input.nextDouble();

// Compute the wind-chill index
double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);

// Show result
System.out.println("The wind chill index is " + windChill);

} // end of the method 

}// end of the class 


