
/*
 * Santana, Isory 
 * 10/28/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #6

Problem 4. (25%) (Approximate e) Approximate e using the following series:

e= (1+(1/1!)+(1/2!)+(1/3!)+(1/4!)+(1/5!)+⋯+ 1/i!  )


In order to get better precision, use BigDecimal with 25 digits of precision in the computation.
Write a program that displays the e value for i = 100, 200, …, 1000.



*/

import java.math.BigDecimal;

public class Approximatee {
    
    public static void main(String[] args) {
		// Shows the e value for i = 100, 200, . . . , and 1000.
		System.out.println("The e value for i = 100 to 1000:  ");
		System.out.println("-----------------------------------");
		System.out.println(" i                e");
		System.out.println("-----------------------------------");
		for (BigDecimal i = new BigDecimal("100"); 
			i.compareTo(new BigDecimal("1000")) <= 0; 
			i = i.add(new BigDecimal("100"))) {
			System.out.println(i + "    " + getE(i));
		}
	}

	// Give back e value for i.
	public static BigDecimal getE(BigDecimal v) {
		BigDecimal one = new BigDecimal("1");
		BigDecimal e = new BigDecimal("0.0");
		for (BigDecimal i = one; i.compareTo(v) <= 0; i = i.add(one)) {
			BigDecimal denominator = i;
			for (BigDecimal k = i.subtract(one); 
				k.compareTo(one) >= 1; 
				k = k.subtract(one)) {
				denominator = denominator.multiply(k);
			}
			// Use a precision of 25 digits.
			e = e.add(one.divide(denominator, 25, BigDecimal.ROUND_UP));  
		}
		return e;
	}
}
    

