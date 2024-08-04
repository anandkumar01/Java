package DSA.Collections.Comparator.SortStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create a Comparator to sort based on their age
        Comparator<Student> comparator = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.age > j.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        // Alternative ways using Lambda expression
        // Comparator<Student> comparator = (i, j) -> i.age > j.age ? 1 : -1;

        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anand", 27, "Pune"));
        students.add(new Student("Ayush", 25, "Mumbai"));
        students.add(new Student("Abhinav", 24, "Bengluru"));
        students.add(new Student("Pawan", 28, "Delhi"));

        // Sort students
        Collections.sort(students, comparator);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
