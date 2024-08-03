package DSA.OOPS.Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Creating an object of the class
        Employee anand = new Employee("Anand", 12345, 450399.0, "Software Developer");
        
        // Using methods to get the values from the variables
        System.out.println("Employee name: " + anand.getName());
        System.out.println("Employee ID: " + anand.getEmpID());
        System.out.println("Employee salary: " + anand.getSalary());
        System.out.println("Employee designation: " + anand.getDesignation());
    }
}
