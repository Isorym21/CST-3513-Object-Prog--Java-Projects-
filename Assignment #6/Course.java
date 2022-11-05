
/*
 * Santana, Isory Marbellis
 * 10/28/2022
 * CST 3513 D312[19866]
 * Prof.Cabo, Candido
                          * Assignment #6
Problem 2. (25%) (The Course class) Revise the Course class in the textbook as follows:

•	The array size is fixed in Listing 10.6 in the textbook. Improve it to automatically increase the array size by creating a new larger array and copying the contents of the current array to it.
•	Implement the dropStudent method.
•	Add a new method named clear() that removes all students from the course.

Write a test program that creates a course, adds three students, removes one, and displays the students in the course.


*/

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students = new ArrayList<String>();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.numberOfStudents = 0;
    }

    public void addStudent(String student) {
        numberOfStudents++;
        students.add(student);

    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.size(); i++) {
            if (student.equalsIgnoreCase(students.get(i))) {
                students.remove(i);
            }
        }
    }
    public void clear() {
        students.clear();
    }
}