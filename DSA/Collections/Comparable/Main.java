package DSA.Collections.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anand", 27, "Pune"));
        students.add(new Student("Ayush", 25, "Mumbai"));
        students.add(new Student("Abhinav", 24, "Bengluru"));
        students.add(new Student("Pawan", 28, "Delhi"));

        // Sort students
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
