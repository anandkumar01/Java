package DSA.Collections.Comparator.SortStudent;

public class Student {
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
}
