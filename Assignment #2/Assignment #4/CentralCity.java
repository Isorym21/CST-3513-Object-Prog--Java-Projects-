/*
 * Santana, Isory Marbellis
 * 10/03/2022
 * CST 3513 D312[19866]`
 * Prof.Cabo, Candido
                          * Assignment #4
                          
Problem 4. (Central city) Given a set of cities, the central city is the city that has the shortest distance
to all other cities. Write a program that prompts the user to enter the number of cities and the locations
of the cities (the coordinates are two decimal numbers), and finds the central city and its total
distance to all other cities.
*/

import java.util.Scanner;

public class CentralCity {//beginning of the class
    
    // index info: 0 = x | 1 = y | 2 = complete distance between all other cities
    static final int X = 0;
    static final int Y = 1;
    static final int DISTANCE = 2;

    public static void main(String[] args) { //beginning of a method

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int numOfCities = input.nextInt();
        double[][] points = new double[numOfCities][3];

        System.out.print("Enter the coordinates of the cities:\n");
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length - 1; j++)
                points[i][j] = input.nextDouble();

        double[] central = getCentralPoint(points);

        System.out.printf("The central city is located at (%.1f, %.1f)\n", central[X], central[Y]);
        System.out.printf("Complete distance between all other citiesis %.2f", central[DISTANCE]);
    }

    // Compute the distance between two points (x1, y1) and (x2, y2)
    public static double distance(
            double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static double[] getCentralPoint(double[][] points) {

        for (int i = 0; i < points.length; i++) {

            for (int j = 0; j < points.length; j++) {

                if (j != i) {
                    points[i][DISTANCE] += distance(points[i][X], points[i][Y], points[j][X],points[j][Y]);
                }

            }
        }

        // find the location with the shortest distance
        // and return central point
        double[] central = points[0];
        for (int i = 1; i < points.length; i++) {

            if (points[i][DISTANCE] < central[DISTANCE]) {
                central = points[i];
            }
        }

        return central;
        
   } // end of the method 
    
}// end of the class 
