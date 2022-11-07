/*
 * Santana, Isory 
 * 10/03/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #4
                          
Problem 1. (Sort students) Write a program that prompts the user to enter the number of students 
to be processed, the students’ names, and their scores, and prints the student names in 
decreasing order of their scores. 
*/  
import java.util.Scanner;

public class numberofstudents {//beginning of the class
     public static void main(String[] args) { //beginning of a method
      
       @SuppressWarnings("resource")
               
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Student Number :");// diplays the number of students
       int numberOfStudent = sc.nextInt();
       
       String[] studentName = new String[numberOfStudent];
       Double[] studentScore = new Double[numberOfStudent];
       
       for (int i=0;i<numberOfStudent;i++) {
           System.out.println("Enter The Student Name:");// the students’ names
           studentName[i] = sc.next();
           
           System.out.println("Enter  The  Student Score:"); // the students’scores
           studentScore[i] = sc.nextDouble();
       }
     
      
       double alumScore;
       String alumName;
      
       //array sorting in ascending order
       for (int i=0;i<numberOfStudent;i++) {
           for (int j = i + 1; j < numberOfStudent; j++)
{
if (studentScore[i] < studentScore[j])
{
   alumScore = studentScore[i];
   alumName = studentName[i];
  
studentScore[i] = studentScore[j];
studentName[i] = studentName[j];


studentScore[j] = alumScore;
studentName [j] = alumName;
}
}
       }
         System.out.print("\n");
       //displaying the ordered array
       for (int i = 0; i <numberOfStudent; i++)
{
System.out.print(studentName[i] + " "+studentScore[i]+"\n");
}


   } // end of the method 
    
}// end of the class 
