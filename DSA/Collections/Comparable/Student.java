package DSA.Collections.Comparable;

public class Student implements Comparable<Student> {
    String name;
    int age;
    String address;

    // Create constructor for Student
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Create toString method for better readable
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    // Write logic to compare age of two student
    public int compareTo(Student that) {
        // Ternary operator
        return this.age > that.age ? 1 : -1;
    }
}
