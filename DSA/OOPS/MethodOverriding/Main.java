package DSA.OOPS.MethodOverriding;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Anand", 30000.00);
        Employee manager = new Manager("Sachin", 50000.00, "IT Department");
        
        System.out.println("Employee details :");
        employee.displayDetails();
        
        System.out.println("\nManager details :");
        manager.displayDetails();
    }
}
