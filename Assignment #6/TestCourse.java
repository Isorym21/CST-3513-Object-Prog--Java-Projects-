
// Problem 2 * PART 2
import java.util.ArrayList;
import java.util.Scanner;

public class TestCourse {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        Course c = new Course("CST 3513");
        c.addStudent("Isory");
        c.addStudent("Sobeida");
        c.addStudent("Riki");

        ArrayList<String> students = c.getStudents();
        System.out.println("List of Students: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out
                .println("Please enter the name of the student you wish to drop: ");
        name = input.next();
        c.dropStudent(name);

        System.out.println("List of Students Following Expulsion: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
